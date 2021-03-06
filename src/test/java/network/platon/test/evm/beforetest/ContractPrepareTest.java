package network.platon.test.evm.beforetest;

import com.platon.crypto.Credentials;
import com.platon.parameters.NetworkParameters;
import com.platon.protocol.Web3j;
import com.platon.tx.RawTransactionManager;
import com.platon.tx.gas.ContractGasProvider;
import network.platon.test.BaseTest;
import com.platon.protocol.http.HttpService;

import java.math.BigInteger;

/**
 * @title 所有合约部署前相关准备工作，需要初始化gas值
 * @author: albedo
 * @create: 2019/12/26 11:27
 **/
public class ContractPrepareTest extends BaseTest {

    protected Web3j web3j = null;
    protected Credentials credentials = null;
    protected RawTransactionManager transactionManager;
    protected ContractGasProvider provider;
    protected String walletAddress;
    protected String gasLimit = "9424776";
    protected String gasPrice = "3000000000000000";

    /**
     * 合约部署相关准备工作
     * @param gasPrice
     * @param gasLimit
     */
    protected void prepare(String gasPrice,String gasLimit){
        chainId = Integer.valueOf(driverService.param.get("chainId"));
        String hrp =  driverService.param.get("hrp");
        try {
            NetworkParameters.init(chainId, hrp);
            web3j = Web3j.build(new HttpService(driverService.param.get("nodeUrl")));
            credentials = Credentials.create(driverService.param.get("privateKey"));
            collector.logStepPass("currentBlockNumber:" + web3j.platonBlockNumber().send().getBlockNumber());
            walletAddress = driverService.param.get("address");
        } catch (Exception e) {
            collector.logStepFail("The node is unable to connect", e.toString());
            e.printStackTrace();
        }
        provider = new ContractGasProvider(new BigInteger(gasPrice), new BigInteger(gasLimit));
        transactionManager = new RawTransactionManager(web3j, credentials);
    }

    /**
     * 合约部署相关准备工作
     */
    protected void prepare(){
        this.prepare(gasPrice,gasLimit);
    }
}
