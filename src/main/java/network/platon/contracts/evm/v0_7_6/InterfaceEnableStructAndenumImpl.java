package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class InterfaceEnableStructAndenumImpl extends Contract {
    private static final String BINARY = "6080604052348015600f57600080fd5b5060b28061001e6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80636ff6560314602d575b600080fd5b60336053565b60405180826001811115604257fe5b815260200191505060405180910390f35b6000806040518060200160405280600180811115606c57fe5b815250905080600001519150509056fea2646970667358221220ed7d70e5d10cbde64129b9cfd5109178bff68dc2dc1ea2ae2702a7146561d43564736f6c63430007060033";

    public static final String FUNC_GETPRODUCTCONDITION = "getProductCondition";

    protected InterfaceEnableStructAndenumImpl(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InterfaceEnableStructAndenumImpl(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getProductCondition() {
        final Function function = new Function(FUNC_GETPRODUCTCONDITION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<InterfaceEnableStructAndenumImpl> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceEnableStructAndenumImpl.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<InterfaceEnableStructAndenumImpl> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(InterfaceEnableStructAndenumImpl.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static InterfaceEnableStructAndenumImpl load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InterfaceEnableStructAndenumImpl(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InterfaceEnableStructAndenumImpl load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InterfaceEnableStructAndenumImpl(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
