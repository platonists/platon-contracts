package network.platon.contracts.evm.v0_4_26;

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
public class Caller0425 extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506103dd806100206000396000f30060806040526004361061006d576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680630c55699c146100725780637811c6c11461009d5780637b8ed018146100e0578063a7126c2d1461010b578063a94216191461014e575b600080fd5b34801561007e57600080fd5b50610087610191565b6040518082815260200191505060405180910390f35b3480156100a957600080fd5b506100de600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610197565b005b3480156100ec57600080fd5b506100f5610248565b6040518082815260200191505060405180910390f35b34801561011757600080fd5b5061014c600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610251565b005b34801561015a57600080fd5b5061018f600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610300565b005b60005481565b8073ffffffffffffffffffffffffffffffffffffffff1660405180807f696e632829000000000000000000000000000000000000000000000000000000815250600501905060405180910390207c010000000000000000000000000000000000000000000000000000000090046040518163ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016000604051808303816000875af2925050505050565b60008054905090565b8073ffffffffffffffffffffffffffffffffffffffff1660405180807f696e632829000000000000000000000000000000000000000000000000000000815250600501905060405180910390207c010000000000000000000000000000000000000000000000000000000090046040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401600060405180830381865af4925050505050565b8073ffffffffffffffffffffffffffffffffffffffff1660405180807f696e632829000000000000000000000000000000000000000000000000000000815250600501905060405180910390207c010000000000000000000000000000000000000000000000000000000090046040518163ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016000604051808303816000875af19250505050505600a165627a7a723058204ac8777c5e27dbae27a801cbc657006690a29b1ce7a0d37e3673e04798916a0b0029";

    public static final String FUNC_X = "x";

    public static final String FUNC_INC_CALLCODE = "inc_callcode";

    public static final String FUNC_GETCALLERX = "getCallerX";

    public static final String FUNC_INC_DELEGATECALL = "inc_delegatecall";

    public static final String FUNC_INC_CALL = "inc_call";

    protected Caller0425(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Caller0425(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inc_callcode(String _contractAddress) {
        final Function function = new Function(
                FUNC_INC_CALLCODE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_contractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getCallerX() {
        final Function function = new Function(FUNC_GETCALLERX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inc_delegatecall(String _contractAddress) {
        final Function function = new Function(
                FUNC_INC_DELEGATECALL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_contractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> inc_call(String _contractAddress) {
        final Function function = new Function(
                FUNC_INC_CALL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_contractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Caller0425> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Caller0425.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Caller0425> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Caller0425.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Caller0425 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Caller0425(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Caller0425 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Caller0425(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
