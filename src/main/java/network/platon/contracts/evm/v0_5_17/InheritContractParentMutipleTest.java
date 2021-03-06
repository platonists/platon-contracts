package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
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
public class InheritContractParentMutipleTest extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101a6806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80631416d347146100515780636c3364ea1461009b578063853255cc146100e55780638da5cb5b146100ef575b600080fd5b610059610139565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6100a3610141565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6100ed610149565b005b6100f761014b565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b600033905090565b600033905090565b565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168156fea265627a7a7231582026d8110ba801d3028650b06219b34246fdb0966aa91c9b1d3641c23a7df3879164736f6c63430005110032";

    public static final String FUNC_GETADDRESSA = "getAddressA";

    public static final String FUNC_GETADDRESSB = "getAddressB";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_SUM = "sum";

    protected InheritContractParentMutipleTest(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritContractParentMutipleTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getAddressA() {
        final Function function = new Function(FUNC_GETADDRESSA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getAddressB() {
        final Function function = new Function(FUNC_GETADDRESSB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public void sum() {
        throw new RuntimeException("cannot call constant function with void return type");
    }

    public static RemoteCall<InheritContractParentMutipleTest> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractParentMutipleTest.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritContractParentMutipleTest> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritContractParentMutipleTest.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InheritContractParentMutipleTest load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritContractParentMutipleTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritContractParentMutipleTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritContractParentMutipleTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
