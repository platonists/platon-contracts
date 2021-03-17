package network.platon.contracts.evm.v0_8_2;

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
    private static final String BINARY = "6080604052600a60005534801561001557600080fd5b50610154806100256000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80632e2619a31461003b578063d46300fd14610057575b600080fd5b610055600480360381019061005091906100aa565b610075565b005b61005f61008c565b60405161006c91906100e2565b60405180910390f35b8060005481106100885760016000819055505b5050565b60008054905090565b6000813590506100a481610107565b92915050565b6000602082840312156100bc57600080fd5b60006100ca84828501610095565b91505092915050565b6100dc816100fd565b82525050565b60006020820190506100f760008301846100d3565b92915050565b6000819050919050565b610110816100fd565b811461011b57600080fd5b5056fea2646970667358221220e1b74f83aac9870e7b349842f4b8007128137cb4a6c9c7ed8069e5caabe95dad64736f6c63430008020033";

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
