package network.platon.contracts.evm.v0_8_2;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
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
public class ReferenceDataTypeStructDeleteContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506005600081905550600a600160020181905550600180600301600060018152602001908152602001600020819055506002600160030160006002815260200190815260200160002081905550600360016000016000018190555060018060000160010160006001815260200190815260200160002060006101000a81548160ff02191690831515021790555060018060000160010160006002815260200190815260200160002060006101000a81548160ff0219169083151502179055506001600080820160008082016000905550506002820160009055505060008055610206806100fe6000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806311977c5c1461005c5780631268893e1461007a5780635ff76c8a1461009857806379e44a38146100b6578063d587919c146100d4575b600080fd5b6100646100f2565b604051610071919061019f565b60405180910390f35b6100826100fb565b60405161008f919061019f565b60405180910390f35b6100a061011a565b6040516100ad919061019f565b60405180910390f35b6100be61012a565b6040516100cb919061019f565b60405180910390f35b6100dc610137565b6040516100e99190610184565b60405180910390f35b60008054905090565b6000600160030160006001815260200190815260200160002054905090565b6000600160000160000154905090565b6000600160020154905090565b6000600160000160010160006001815260200190815260200160002060009054906101000a900460ff16905090565b61016f816101ba565b82525050565b61017e816101c6565b82525050565b60006020820190506101996000830184610166565b92915050565b60006020820190506101b46000830184610175565b92915050565b60008115159050919050565b600081905091905056fea264697066735822122015e06127ac4951c3689e15e5537de4d02bd8cb2d54ed4307e0ad115699c94b9e64736f6c63430008020033";

    public static final String FUNC_GETNESTEDMAPPING = "getNestedMapping";

    public static final String FUNC_GETNESTEDVALUE = "getNestedValue";

    public static final String FUNC_GETTODELETEINT = "getToDeleteInt";

    public static final String FUNC_GETTOPMAPPING = "getTopMapping";

    public static final String FUNC_GETTOPVALUE = "getTopValue";

    protected ReferenceDataTypeStructDeleteContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeStructDeleteContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ReferenceDataTypeStructDeleteContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructDeleteContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeStructDeleteContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructDeleteContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<Boolean> getNestedMapping() {
        final Function function = new Function(FUNC_GETNESTEDMAPPING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> getNestedValue() {
        final Function function = new Function(FUNC_GETNESTEDVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getToDeleteInt() {
        final Function function = new Function(FUNC_GETTODELETEINT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTopMapping() {
        final Function function = new Function(FUNC_GETTOPMAPPING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTopValue() {
        final Function function = new Function(FUNC_GETTOPVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static ReferenceDataTypeStructDeleteContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructDeleteContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructDeleteContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructDeleteContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
