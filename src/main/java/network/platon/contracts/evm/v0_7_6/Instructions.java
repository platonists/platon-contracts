package network.platon.contracts.evm.v0_7_6;

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
public class Instructions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610203806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c8063048a5fed1461005c578063165c4a161461007a5780633408e470146100c65780635a0db89e146100e4578063eb8ac92114610130575b600080fd5b61006461017c565b6040518082815260200191505060405180910390f35b6100b06004803603604081101561009057600080fd5b810190808035906020019092919080359060200190929190505050610189565b6040518082815260200191505060405180910390f35b6100ce610196565b6040518082815260200191505060405180910390f35b61011a600480360360408110156100fa57600080fd5b8101908080359060200190929190803590602001909291905050506101a3565b6040518082815260200191505060405180910390f35b6101666004803603604081101561014657600080fd5b8101908080359060200190929190803590602001909291905050506101b7565b6040518082815260200191505060405180910390f35b6000804790508091505090565b6000818302905092915050565b6000804690508091505090565b60006101af8383610189565b905092915050565b60006101c5600260036101a3565b90509291505056fea2646970667358221220c1d4be9c518060697287d8173040f599806dae7557e950333d06010ad25239fe64736f6c63430007060033";

    public static final String FUNC_GETCHAINID = "getChainId";

    public static final String FUNC_GETSELFBALANCE = "getSelfBalance";

    public static final String FUNC_MULTIPLY = "multiply";

    public static final String FUNC_TEST = "test";

    public static final String FUNC_TEST_MUL = "test_mul";

    protected Instructions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Instructions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getChainId() {
        final Function function = new Function(FUNC_GETCHAINID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getSelfBalance() {
        final Function function = new Function(FUNC_GETSELFBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> multiply(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_MULTIPLY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(y)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> test(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_TEST, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(y)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> test_mul(BigInteger x, BigInteger y) {
        final Function function = new Function(
                FUNC_TEST_MUL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(y)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Instructions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Instructions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Instructions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Instructions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Instructions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Instructions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Instructions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Instructions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
