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
public class IfError extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610147806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806349b9d30f1461003b578063c77beeb61461005d575b600080fd5b61004361007f565b604051808215151515815260200191505060405180910390f35b6100656100a6565b604051808215151515815260200191505060405180910390f35b60008061008c60016100cd565b90508060000160009054906101000a900460ff1691505090565b6000806100b360016100e8565b90508060000160009054906101000a900460ff1691505090565b600081156100de57600090506100e3565b600090505b919050565b600081156100f9576000905061010d565b81610107576000905061010c565b600090505b5b91905056fea265627a7a72315820fe51017cbb0bc8fda9399adb417366c9d6a1030af085983abe71a9c66a7deac764736f6c63430005110032";

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
