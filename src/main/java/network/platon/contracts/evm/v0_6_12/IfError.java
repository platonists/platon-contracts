package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class IfError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610132806100206000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c806349b9d30f146037578063c77beeb6146055575b600080fd5b603d6073565b60405180821515815260200191505060405180910390f35b605b6098565b60405180821515815260200191505060405180910390f35b600080607e600160bd565b90508060000160009054906101000a900460ff1691505090565b60008060a3600160d6565b90508060000160009054906101000a900460ff1691505090565b6000811560cc576000905060d1565b600090505b919050565b6000811560e5576000905060f7565b8160f1576000905060f6565b600090505b5b91905056fea26469706673582212201ecb56db97accb401d8a98070feab32d57434aa56d6b697db27eacfda8a27ad364736f6c634300060c0033";

    public static final String FUNC_GETIFCONTROLRES = "getIfControlRes";

    public static final String FUNC_GETIFCONTROLRES1 = "getIfControlRes1";

    protected IfError(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected IfError(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getIfControlRes() {
        final Function function = new Function(FUNC_GETIFCONTROLRES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> getIfControlRes1() {
        final Function function = new Function(FUNC_GETIFCONTROLRES1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<IfError> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(IfError.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<IfError> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(IfError.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static IfError load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new IfError(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IfError load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new IfError(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
