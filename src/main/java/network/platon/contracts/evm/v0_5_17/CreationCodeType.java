package network.platon.contracts.evm.v0_5_17;

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
public class CreationCodeType extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061011d806100206000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80632096525514602d575b600080fd5b603360ab565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101560715780820151818401526020810190506058565b50505050905090810190601f168015609d5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b60606040518060400160405280600581526020017f68656c6c6f00000000000000000000000000000000000000000000000000000081525090509056fea265627a7a72315820de8d9781f0f6914d32c0cc2b61fb6f29f77673f007cb8f90e8f9f8d85b8417b464736f6c63430005110032";

    public static final String FUNC_GETVALUE = "getValue";

    protected CreationCodeType(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CreationCodeType(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> getValue() {
        final Function function = new Function(
                FUNC_GETVALUE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<CreationCodeType> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(CreationCodeType.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<CreationCodeType> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(CreationCodeType.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static CreationCodeType load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CreationCodeType(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CreationCodeType load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CreationCodeType(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
