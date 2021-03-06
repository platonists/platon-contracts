package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class TimeComplexity extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610101806100206000396000f3fe6080604052348015600f57600080fd5b5060043610603c5760003560e01c80637003f6c2146041578063d25f264014606c578063e65284be146097575b600080fd5b606a60048036036020811015605557600080fd5b810190808035906020019092919050505060c2565b005b609560048036036020811015608057600080fd5b810190808035906020019092919050505060c5565b005b60c06004803603602081101560ab57600080fd5b810190808035906020019092919050505060c8565b005b50565b50565b5056fea26469706673582212205bc5d78f9aadf1266ee4044da3f6f0c20954906b248b9f7bfd6e69017892c45164736f6c634300060c0033";

    public static final String FUNC_LOGNTEST = "logNTest";

    public static final String FUNC_NSQUARETEST = "nSquareTest";

    public static final String FUNC_NTEST = "nTest";

    protected TimeComplexity(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected TimeComplexity(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> logNTest(BigInteger n) {
        final Function function = new Function(
                FUNC_LOGNTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> nSquareTest(BigInteger n) {
        final Function function = new Function(
                FUNC_NSQUARETEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> nTest(BigInteger n) {
        final Function function = new Function(
                FUNC_NTEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<TimeComplexity> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(TimeComplexity.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<TimeComplexity> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(TimeComplexity.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static TimeComplexity load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new TimeComplexity(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TimeComplexity load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new TimeComplexity(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
