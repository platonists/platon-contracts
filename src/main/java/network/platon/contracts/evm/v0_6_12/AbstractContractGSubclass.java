package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Int256;
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
public class AbstractContractGSubclass extends Contract {
    private static final String BINARY = "60806040526000805534801561001457600080fd5b5060f3806100236000396000f3fe6080604052348015600f57600080fd5b5060043610603c5760003560e01c8063262a9dff14604157806335f99d4814605d578063d1eef376146088575b600080fd5b604760a4565b6040518082815260200191505060405180910390f35b608660048036036020811015607157600080fd5b810190808035906020019092919050505060aa565b005b608e60b4565b6040518082815260200191505060405180910390f35b60005481565b8060008190555050565b6000805490509056fea264697066735822122038b9c47094e872d55175ab7c284cbee491549f98636c18d44e806dd7507d1f1f64736f6c634300060c0033";

    public static final String FUNC_AINTERAGE = "aInterAge";

    public static final String FUNC_AGE = "age";

    public static final String FUNC_SETINTERAGE = "setInterAge";

    protected AbstractContractGSubclass(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected AbstractContractGSubclass(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> aInterAge() {
        final Function function = new Function(FUNC_AINTERAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> age() {
        final Function function = new Function(FUNC_AGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setInterAge(BigInteger v) {
        final Function function = new Function(
                FUNC_SETINTERAGE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Int256(v)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<AbstractContractGSubclass> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractGSubclass.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<AbstractContractGSubclass> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(AbstractContractGSubclass.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static AbstractContractGSubclass load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new AbstractContractGSubclass(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AbstractContractGSubclass load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new AbstractContractGSubclass(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
