package network.platon.test.evm.v0_8_2.regreetest;

import com.platon.bech32.Bech32;
import com.platon.crypto.Credentials;
import com.platon.parameters.NetworkParameters;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.DefaultBlockParameterName;
import com.platon.protocol.core.methods.response.PlatonGetTransactionCount;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.protocol.http.HttpService;
import com.platon.tx.RawTransactionManager;
import com.platon.tx.TransactionManager;
import com.platon.tx.Transfer;
import com.platon.utils.Convert;
import network.platon.autotest.junit.annotations.DataSource;
import network.platon.autotest.junit.enums.DataSourceType;
import network.platon.autotest.junit.rules.AssertCollector;
import network.platon.autotest.junit.rules.DriverService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;


/**
 * @title PlatON普通有回执转账交易
 * @description: 步骤：账户A向账户B转账amount，预期1：账户A的余额减少amount，预期2：账户B的余额增加amount
 * @author: qcxiao
 * @create: 2019/12/16 11:03
 **/
public class PlatONTransferTest {

    @Rule
    public DriverService driverService = new DriverService();

    @Rule
    public AssertCollector collector = new AssertCollector();

    // 底层链ID
    private long chainId;
    // 发行代币的地址
    private String transferFrom;
    // 接收代币的地址
    private String transferTo;
    private Web3j web3j;
    // 转账的金额
    private String amount;

    @Before
    public void before() {
        chainId = Integer.valueOf(driverService.param.get("chainId"));
        //transferFrom = driverService.param.get("transferFrom");
        transferFrom = driverService.param.get("address");
        transferTo = "lat10eycqggu2yawpadtmn7d2zdw0vnmsckltks0ff"; //driverService.param.get("transferTo");
        amount = "1"; //driverService.param.get("amount");
    }

    @Test
    @DataSource(type = DataSourceType.EXCEL, file = "test.xls", sheetName = "Sheet1",
            author = "qcxiao", showName = "network.platon.test.evm.PlatonTransferTest-普通有回执转账交易", sourcePrefix = "evm/0.7.6")
    public void testTransfer() {
        Credentials credentials = null;
        BigInteger nonce = null;
        try {
            web3j = Web3j.build(new HttpService(driverService.param.get("nodeUrl")));
            //credentials = Credentials.create(driverService.param.get("privateKeyOfTransferFrom"));
            credentials = Credentials.create(driverService.param.get("privateKey"));
            collector.logStepPass("currentBlockNumber:" + web3j.platonBlockNumber().send().getBlockNumber());
            //获取nonce，交易笔数
            transferFrom = Bech32.addressEncode(NetworkParameters.getHrp(),transferFrom);
            nonce = getNonce(transferFrom);
            collector.logStepPass("nonce:" + nonce);
            //transferTo = Bech32.addressEncode(NetworkParameters.getHrp(),transferTo);
            BigInteger initialBalance = web3j.platonGetBalance(transferTo, DefaultBlockParameterName.LATEST).send().getBalance();
            collector.logStepPass("initialBalance:" + initialBalance);

            /*
            //创建RawTransaction交易对象
            RawTransaction rawTransaction = RawTransaction.createEtherTransaction(nonce, new BigInteger("50000000000"), new BigInteger("3000000"),
                    transferTo, new BigInteger(amount));
            //签名Transaction，这里要对交易做签名
            byte[] signMessage = TransactionEncoder.signMessage(rawTransaction, chainId, credentials);
            String hexValue = Numeric.toHexString(signMessage);

            //发送交易
            PlatonSendTransaction ethSendTransaction = web3j.platonSendRawTransaction(hexValue).send();
            //String hash = ethSendTransaction.getTransactionHash();
             */
            //RawTransactionManager transactionManager = new RawTransactionManager(web3j, credentials);
            //Transfer transfer = new Transfer(web3j, transactionManager);
            //TransactionReceipt transactionReceipt = transfer.sendFunds(transferTo, new BigDecimal(amount), Convert.Unit.VON).send();

            //TransactionReceipt transactionReceipt = Transfer.sendFunds(web3j, credentials, transferTo, new BigDecimal("1"), Convert.Unit.VON).send();


            TransactionManager transactionManager = new RawTransactionManager(web3j, credentials);
            Transfer transfer = new Transfer(web3j,transactionManager);

            TransactionReceipt transactionReceipt = transfer.sendFunds(transferTo, new BigDecimal(amount), Convert.Unit.VON).send();


            BigInteger endBalance = web3j.platonGetBalance(transferTo, DefaultBlockParameterName.LATEST).send().getBalance();
            collector.logStepPass("endBalance:" + endBalance);
            collector.logStepPass("txHash:" + transactionReceipt.getTransactionHash());
            collector.assertEqual(endBalance.subtract(initialBalance).toString(), amount, "compare the balance after transfer");
        } catch (Exception e) {
            collector.logStepFail("transfer fail.", e.toString());
            e.printStackTrace();
        }

    }

    /**
     * 获取nonce，交易笔数
     *
     * @param from
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private BigInteger getNonce(String from) throws ExecutionException, InterruptedException {
        PlatonGetTransactionCount transactionCount = web3j.platonGetTransactionCount(from, DefaultBlockParameterName.LATEST).sendAsync().get();
        BigInteger nonce = transactionCount.getTransactionCount();
        return nonce;
    }
}
