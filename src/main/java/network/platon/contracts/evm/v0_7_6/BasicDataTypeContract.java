package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Int8;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
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
public class BasicDataTypeContract extends Contract {
    private static final String BINARY = "60806040527fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff60005560018055600280556001600360006101000a81548160ff021916908360ff16021790555060ff600360016101000a81548160ff021916908360ff1602179055506001600360026101000a81548161ffff021916908361ffff16021790555061ffff600360046101000a81548161ffff021916908361ffff1602179055506001600360066101000a81548160ff021916908360000b60ff160217905550607f600360076101000a81548160ff021916908360000b60ff1602179055507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff600360086101000a81548160ff021916908360000b60ff1602179055507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff80600360096101000a81548160ff021916908360000b60ff16021790555060016003600a6101000a81548160ff02191690831515021790555060006003600b6101000a81548160ff0219169083151502179055507f61000000000000000000000000000000000000000000000000000000000000006003600c6101000a81548160ff021916908360f81c0217905550600160f81b6003600d6101000a81548160ff021916908360f81c02179055507f61620000000000000000000000000000000000000000000000000000000000006003600e6101000a81548161ffff021916908360f01c02179055507f6162630000000000000000000000000000000000000000000000000000000000600360106101000a81548162ffffff021916908360e81c02179055506040518060400160405280600181526020017f6100000000000000000000000000000000000000000000000000000000000000815250600490805190602001906102b392919061035e565b506040518060400160405280600281526020017f6162000000000000000000000000000000000000000000000000000000000000815250600590805190602001906102ff92919061035e565b506040518060400160405280600381526020017f61626300000000000000000000000000000000000000000000000000000000008152506006908051906020019061034b92919061035e565b5034801561035857600080fd5b50610409565b828054600181600116156101000203166002900490600052602060002090601f01602090048101928261039457600085556103db565b82601f106103ad57805160ff19168380011785556103db565b828001600101855582156103db579182015b828111156103da5782518255916020019190600101906103bf565b5b5090506103e891906103ec565b5090565b5b808211156104055760008160009055506001016103ed565b5090565b6101a5806104186000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c806307da3eae146100515780633d9ceb371461006f5780635c5c8419146100b7578063d29f1598146100d5575b600080fd5b61005961011d565b6040518082815260200191505060405180910390f35b61009e6004803603602081101561008557600080fd5b81019080803560000b906020019092919050505061013b565b604051808260000b815260200191505060405180910390f35b6100bf610148565b6040518082815260200191505060405180910390f35b610104600480360360208110156100eb57600080fd5b81019080803560ff169060200190929190505050610162565b604051808260ff16815260200191505060405180910390f35b60006006805460018160011615610100020316600290049050905090565b6000600182019050919050565b60006003600e9054906101000a905050600260ff16905090565b600060018201905091905056fea2646970667358221220cbcc066bddb701d8c40a72b40c79cf5685dd22bf470a569ae4b8ae0ce3d503e664736f6c63430007060033";

    public static final String FUNC_ADDINTOVERFLOW = "addIntOverflow";

    public static final String FUNC_ADDUINTOVERFLOW = "addUintOverflow";

    public static final String FUNC_GETBYTES1LENGTH = "getBytes1Length";

    public static final String FUNC_GETBYTESLENGTH = "getBytesLength";

    protected BasicDataTypeContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected BasicDataTypeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> addIntOverflow(BigInteger a) {
        final Function function = new Function(FUNC_ADDINTOVERFLOW, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int8(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> addUintOverflow(BigInteger a) {
        final Function function = new Function(FUNC_ADDUINTOVERFLOW, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBytes1Length() {
        final Function function = new Function(FUNC_GETBYTES1LENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBytesLength() {
        final Function function = new Function(FUNC_GETBYTESLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<BasicDataTypeContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<BasicDataTypeContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(BasicDataTypeContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static BasicDataTypeContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new BasicDataTypeContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BasicDataTypeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new BasicDataTypeContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
