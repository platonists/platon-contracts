package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicBytes;
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
public class RuntimeCode extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506102f4806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063d489e0041461003b578063f5f5ba72146100be575b600080fd5b610043610141565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610083578082015181840152602081019050610068565b50505050905090810190601f1680156100b05780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6100c6610168565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101065780820151818401526020810190506100eb565b50505050905090810190601f1680156101335780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6040518060200161015190610193565b6020820181038252601f19601f8201166040525081565b60606040518060200161017a90610193565b6020820181038252601f19601f82011660405250905090565b61011e806101a18339019056fe6080604052348015600f57600080fd5b506004361060285760003560e01c80632096525514602d575b600080fd5b603360ab565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101560715780820151818401526020810190506058565b50505050905090810190601f168015609d5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b60606040518060400160405280600581526020017f68656c6c6f00000000000000000000000000000000000000000000000000000081525090509056fea264697066735822122057fc67ab604c46d6b0dcb67f7ea26bbedce843aa055c2dccee28540d6eb86ba364736f6c63430007060033a26469706673582212209824bb86b3d759ee0c9f5ad65f1a4df8a43cdb488cfb054989385c17338e6c9964736f6c63430007060033";

    public static final String FUNC_GETCONTRACTNAME = "getContractName";

    public static final String FUNC_RUNTIMECODEINFO = "runtimeCodeInfo";

    protected RuntimeCode(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RuntimeCode(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> getContractName() {
        final Function function = new Function(FUNC_GETCONTRACTNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> runtimeCodeInfo() {
        final Function function = new Function(FUNC_RUNTIMECODEINFO, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<RuntimeCode> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RuntimeCode.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RuntimeCode> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RuntimeCode.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static RuntimeCode load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RuntimeCode(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RuntimeCode load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RuntimeCode(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
