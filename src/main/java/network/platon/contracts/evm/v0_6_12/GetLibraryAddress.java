package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
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
public class GetLibraryAddress extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610126806100206000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c80636e7c1504146037578063750c193514603f575b600080fd5b603d6071565b005b604560c7565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b73dfa93fd6926bf99d9ea85d8d8d7912b56d8055596000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690509056fea2646970667358221220c92986a0777b6b31034e81ca1f74ca9bcfbe868f7365516a122137b182aa366b64736f6c634300060c0033";

    public static final String FUNC_GETUSERLIBADDRESS = "getUserLibAddress";

    public static final String FUNC_SETUSERLIBADDRESS = "setUserLibAddress";

    protected GetLibraryAddress(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected GetLibraryAddress(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getUserLibAddress() {
        final Function function = new Function(FUNC_GETUSERLIBADDRESS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setUserLibAddress() {
        final Function function = new Function(
                FUNC_SETUSERLIBADDRESS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<GetLibraryAddress> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(GetLibraryAddress.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<GetLibraryAddress> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(GetLibraryAddress.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static GetLibraryAddress load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new GetLibraryAddress(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static GetLibraryAddress load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new GetLibraryAddress(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
