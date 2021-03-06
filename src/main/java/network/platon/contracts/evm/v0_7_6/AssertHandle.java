package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class AssertHandle extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610170806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80638c671e0a14610067578063ad92212f14610071578063afcd320e1461007b578063cda0a5eb146100a9578063f25e0471146100f9578063f81cf6db14610103575b600080fd5b61006f61010d565b005b61007961010f565b005b6100a76004803603602081101561009157600080fd5b8101908080359060200190929190505050610111565b005b6100d8600480360360208110156100bf57600080fd5b81019080803560000b906020019092919050505061011e565b604051808260038111156100e857fe5b815260200191505060405180910390f35b610101610136565b005b61010b610138565b005b565b565b600a811061011b57fe5b50565b60008160000b600381111561012f57fe5b9050919050565b565b56fea264697066735822122021e4a65d232afff995546263f5911ccda43557893da698aa38f78a099ae26f4a64736f6c63430007060033";

    public static final String FUNC_BINARYMOVEMINUSEXCEPTION = "binaryMoveMinusException";

    public static final String FUNC_DIVIDENDZEROEXCEPTION = "dividendZeroException";

    public static final String FUNC_INTCHANGEEXCEPTION = "intChangeException";

    public static final String FUNC_NOOUTOFBOUNDSEXCEPTION = "noOutOfBoundsException";

    public static final String FUNC_OUTOFBOUNDSEXCEPTION = "outOfBoundsException";

    public static final String FUNC_PARAMEXCEPTION = "paramException";

    protected AssertHandle(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AssertHandle(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> binaryMoveMinusException() {
        final Function function = new Function(
                FUNC_BINARYMOVEMINUSEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> dividendZeroException() {
        final Function function = new Function(
                FUNC_DIVIDENDZEROEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> intChangeException(BigInteger param) {
        final Function function = new Function(
                FUNC_INTCHANGEEXCEPTION, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int8(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> noOutOfBoundsException() {
        final Function function = new Function(
                FUNC_NOOUTOFBOUNDSEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> outOfBoundsException() {
        final Function function = new Function(
                FUNC_OUTOFBOUNDSEXCEPTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> paramException(BigInteger param) {
        final Function function = new Function(
                FUNC_PARAMEXCEPTION, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<AssertHandle> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AssertHandle.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AssertHandle> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AssertHandle.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AssertHandle load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AssertHandle(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AssertHandle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AssertHandle(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
