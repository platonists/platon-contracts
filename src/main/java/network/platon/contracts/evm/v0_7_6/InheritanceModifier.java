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
public class InheritanceModifier extends Contract {
    private static final String BINARY = "6080604052600a60005534801561001557600080fd5b5060d3806100246000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c80632e2619a3146037578063d46300fd146062575b600080fd5b606060048036036020811015604b57600080fd5b8101908080359060200190929190505050607e565b005b60686094565b6040518082815260200191505060405180910390f35b80600054811060905760016000819055505b5050565b6000805490509056fea2646970667358221220fff2d666fa2f4fafad4f46ae44f13317fafab4a4bc3815229e6eea4c12c52d3964736f6c63430007060033";

    public static final String FUNC_GETA = "getA";

    public static final String FUNC_INHERITANCE = "inheritance";

    protected InheritanceModifier(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritanceModifier(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getA() {
        final Function function = new Function(FUNC_GETA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inheritance(BigInteger c) {
        final Function function = new Function(
                FUNC_INHERITANCE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(c)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<InheritanceModifier> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritanceModifier.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InheritanceModifier> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InheritanceModifier.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InheritanceModifier load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritanceModifier(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritanceModifier load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritanceModifier(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
