package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
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
public class DisallowYears extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101d3806100206000396000f3fe60806040526004361061004a5760003560e01c80630bb2b6961461004f57806320de797e1461007a57806325b29d84146100bc578063c6d8d657146100e7578063c6f8a3b714610112575b600080fd5b34801561005b57600080fd5b5061006461013d565b6040518082815260200191505060405180910390f35b6100a66004803603602081101561009057600080fd5b8101908080359060200190929190505050610147565b6040518082815260200191505060405180910390f35b3480156100c857600080fd5b506100d1610181565b6040518082815260200191505060405180910390f35b3480156100f357600080fd5b506100fc61018b565b6040518082815260200191505060405180910390f35b34801561011e57600080fd5b50610127610194565b6040518082815260200191505060405180910390f35b6000600254905090565b60006301e13380600081905550680dd2d5fcf3bc9c000060018190555060ff600281905550680dd2d5fcf3bc9c0000600381905550919050565b6000600154905090565b60008054905090565b600060035490509056fea265627a7a723158200697662ec25ab9539101bc9a720eeba3e5b257b12bee97f9d634b2a7d59c340464736f6c63430005110032";

    public static final String FUNC_GETETHERVALUE = "getEtherValue";

    public static final String FUNC_GETHEXCOMVALUE = "getHexComValue";

    public static final String FUNC_GETHEXVALUE = "getHexValue";

    public static final String FUNC_GETTIME1 = "getTime1";

    public static final String FUNC_TESTYEAR = "testyear";

    protected DisallowYears(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DisallowYears(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getEtherValue() {
        final Function function = new Function(FUNC_GETETHERVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getHexComValue() {
        final Function function = new Function(FUNC_GETHEXCOMVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getHexValue() {
        final Function function = new Function(FUNC_GETHEXVALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTime1() {
        final Function function = new Function(FUNC_GETTIME1, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> testyear(BigInteger a, BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TESTYEAR, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<DisallowYears> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowYears.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DisallowYears> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowYears.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DisallowYears load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DisallowYears(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DisallowYears load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DisallowYears(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
