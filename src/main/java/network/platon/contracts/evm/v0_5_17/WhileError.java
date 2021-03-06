package network.platon.contracts.evm.v0_5_17;

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
public class WhileError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060c98061001f6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c8063ed6f916c14602d575b600080fd5b6033604d565b604051808215151515815260200191505060405180910390f35b60008060566070565b90508060000160009054906101000a900460ff1691505090565b60005b600090508060000160009054906101000a900460ff16156091576073565b9056fea265627a7a723158209f04f492adf1c0a65b5967d975c8f08d21c601272a0062d3df69d2cd2c208f1764736f6c63430005110032";

    public static final String FUNC_GETWHILECONTROLRES = "getWhileControlRes";

    protected WhileError(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected WhileError(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Boolean> getWhileControlRes() {
        final Function function = new Function(FUNC_GETWHILECONTROLRES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<WhileError> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(WhileError.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<WhileError> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(WhileError.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static WhileError load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new WhileError(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static WhileError load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new WhileError(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
