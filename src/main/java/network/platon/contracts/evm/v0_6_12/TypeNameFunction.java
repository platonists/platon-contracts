package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
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
public class TypeNameFunction extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061011e806100206000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c806326121ff014602d575b600080fd5b603360ab565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101560715780820151818401526020810190506058565b50505050905090810190601f168015609d5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b60606040518060400160405260108152806020017f547970654e616d6546756e6374696f6e0000000000000000000000000000000081525090509056fea26469706673582212201c21572b6711de1006ad3508db033b5b5e0034c11147381d8054916de9effd4864736f6c634300060c0033";

    public static final String FUNC_F = "f";

    protected TypeNameFunction(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected TypeNameFunction(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> f() {
        final Function function = new Function(FUNC_F, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<TypeNameFunction> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(TypeNameFunction.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<TypeNameFunction> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(TypeNameFunction.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static TypeNameFunction load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new TypeNameFunction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TypeNameFunction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new TypeNameFunction(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
