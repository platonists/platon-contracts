package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint32;
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
public class DisallowTypeChange extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610159806100206000396000f3fe6080604052600436106100345760003560e01c80630b7f166514610039578063420343a41461006a578063a56dfe4a14610074575b600080fd5b34801561004557600080fd5b5061004e6100a5565b604051808263ffffffff16815260200191505060405180910390f35b6100726100be565b005b34801561008057600080fd5b5061008961010f565b604051808263ffffffff16815260200191505060405180910390f35b60008060009054906101000a900463ffffffff16905090565b60007faaaa000000000000000000000000000000000000000000000000000000000000905060008190508060e01c6000806101000a81548163ffffffff021916908363ffffffff1602179055505050565b60008054906101000a900463ffffffff168156fea26469706673582212201582bcc2e1dfa03a38dab2a575ca3462289a18c93c68e4ca3c2492900ede1f5764736f6c634300060c0033";

    public static final String FUNC_GETY = "getY";

    public static final String FUNC_TESTCHANGE = "testChange";

    public static final String FUNC_Y = "y";

    protected DisallowTypeChange(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DisallowTypeChange(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getY() {
        final Function function = new Function(FUNC_GETY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> testChange(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_TESTCHANGE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<BigInteger> y() {
        final Function function = new Function(FUNC_Y, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<DisallowTypeChange> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowTypeChange.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DisallowTypeChange> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DisallowTypeChange.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DisallowTypeChange load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DisallowTypeChange(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DisallowTypeChange load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DisallowTypeChange(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
