package network.platon.contracts.evm.v0_6_12;

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
    private static final String BINARY = "608060405234801561001057600080fd5b50610165806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80631416d347146100515780636c3364ea14610085578063853255cc146100b95780638da5cb5b146100c3575b600080fd5b6100596100f7565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b61008d6100ff565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6100c1610107565b005b6100cb610109565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b600033905090565b600033905090565b565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff168156fea2646970667358221220e43e466b7e56285240d23cf4dbf10ff9e1b7829e991cbce4ae1fd740a04c5ab464736f6c634300060c0033";

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
