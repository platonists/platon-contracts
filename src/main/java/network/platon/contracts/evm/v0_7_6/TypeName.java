package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class TypeName extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101ed806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806306fdde031461003b578063f5f5ba72146100be575b600080fd5b610043610141565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610083578082015181840152602081019050610068565b50505050905090810190601f1680156100b05780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6100c661017a565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101065780820151818401526020810190506100eb565b50505050905090810190601f1680156101335780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6040518060400160405260088152806020017f547970654e616d6500000000000000000000000000000000000000000000000081525081565b60606040518060400160405260088152806020017f547970654e616d6500000000000000000000000000000000000000000000000081525090509056fea2646970667358221220e55328234bd58688610bc780b33ab45d83ea4dd5125af725004e47941bcbe4ee64736f6c63430007060033";

    public static final String FUNC_GETCONTRACTNAME = "getContractName";

    public static final String FUNC_NAME = "name";

    protected TypeName(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected TypeName(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> getContractName() {
        final Function function = new Function(
                FUNC_GETCONTRACTNAME, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<TypeName> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(TypeName.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<TypeName> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(TypeName.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static TypeName load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new TypeName(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TypeName load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new TypeName(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
