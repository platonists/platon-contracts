package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes1;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class HexLiteralsChangeByte extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101c8806100206000396000f3fe6080604052600436106100345760003560e01c80630b7f166514610039578063420343a414610086578063ee495002146100c6575b600080fd5b34801561004557600080fd5b5061004e610113565b60405180827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b61008e610129565b60405180827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b3480156100d257600080fd5b506100db610181565b60405180827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200191505060405180910390f35b60008060009054906101000a900460f81b905090565b6000807f6162000000000000000000000000000000000000000000000000000000000000905060f160f81b6000806101000a81548160ff021916908360f81c021790555060008054906101000a900460f81b91505090565b60008054906101000a900460f81b8156fea2646970667358221220df28f707c5393ea1b453d743c07bbbd8eb99a9830141db46c52ea1fc6438f71c64736f6c63430007060033";

    public static final String FUNC_B1 = "b1";

    public static final String FUNC_GETY = "getY";

    public static final String FUNC_TESTCHANGE = "testChange";

    protected HexLiteralsChangeByte(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected HexLiteralsChangeByte(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> b1() {
        final Function function = new Function(FUNC_B1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getY() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes1>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> testChange(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TESTCHANGE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<HexLiteralsChangeByte> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(HexLiteralsChangeByte.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<HexLiteralsChangeByte> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(HexLiteralsChangeByte.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static HexLiteralsChangeByte load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new HexLiteralsChangeByte(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HexLiteralsChangeByte load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new HexLiteralsChangeByte(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
