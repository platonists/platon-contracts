package network.platon.contracts.evm.v0_6_12;

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
public class Overload extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101b2806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806313d1aa2e1461005c57806315d55b28146100a8578063587dcf18146100c6578063b3de648b146100e4578063e2179b8e14610126575b600080fd5b6100926004803603604081101561007257600080fd5b810190808035906020019092919080359060200190929190505050610130565b6040518082815260200191505060405180910390f35b6100b061013d565b6040518082815260200191505060405180910390f35b6100ce610143565b6040518082815260200191505060405180910390f35b610110600480360360208110156100fa57600080fd5b810190808035906020019092919050505061014c565b6040518082815260200191505060405180910390f35b61012e610156565b005b6000818301905092915050565b60005481565b60008054905090565b6000819050919050565b600061016460026003610130565b9050610170600261014c565b9050806000819055505056fea2646970667358221220e34a68b0de1e4d91f48cf6ce10b7b8ca9894856916f783f336f46152f657016a64736f6c634300060c0033";

    public static final String FUNC_F = "f";

    public static final String FUNC_G = "g";

    public static final String FUNC_GETRE = "getRe";

    public static final String FUNC_RE = "re";

    protected Overload(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Overload(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> f(BigInteger a, BigInteger b) {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(b)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> f(BigInteger a) {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> g() {
        final Function function = new Function(
                FUNC_G, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getRe() {
        final Function function = new Function(FUNC_GETRE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> re() {
        final Function function = new Function(FUNC_RE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Overload> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Overload.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Overload> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Overload.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Overload load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Overload(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Overload load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Overload(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
