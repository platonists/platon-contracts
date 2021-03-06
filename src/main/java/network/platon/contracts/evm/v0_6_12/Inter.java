package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
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
public class Inter extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610158806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063b8b1feb414610046578063ca77156f14610088578063e2179b8e146100ca575b600080fd5b6100726004803603602081101561005c57600080fd5b81019080803590602001909291905050506100e8565b6040518082815260200191505060405180910390f35b6100b46004803603602081101561009e57600080fd5b81019080803590602001909291905050506100f5565b6040518082815260200191505060405180910390f35b6100d2610102565b6040518082815260200191505060405180910390f35b6000600382019050919050565b6000600282019050919050565b600061011060016002610115565b905090565b600081830190509291505056fea26469706673582212201bfeb1c18bf9798a31b7255c9264e551a664c351bbf3fe62c369d4295a4ae60064736f6c634300060c0033";

    public static final String FUNC_FE = "fe";

    public static final String FUNC_FPUB = "fpub";

    public static final String FUNC_G = "g";

    protected Inter(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Inter(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> fe(BigInteger a) {
        final Function function = new Function(FUNC_FE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> fpub(BigInteger a) {
        final Function function = new Function(FUNC_FPUB, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> g() {
        final Function function = new Function(FUNC_G, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Inter> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Inter.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Inter> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Inter.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Inter load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Inter(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Inter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Inter(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
