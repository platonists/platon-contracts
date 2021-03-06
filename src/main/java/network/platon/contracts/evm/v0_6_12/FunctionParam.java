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
public class FunctionParam extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060d18061001f6000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c806326121ff014603757806392d0d153146053575b600080fd5b603d606f565b6040518082815260200191505060405180910390f35b6059607e565b6040518082815260200191505060405180910390f35b60006079607e6087565b905090565b60006007905090565b600060948263ffffffff16565b905091905056fea2646970667358221220d958c41f854ae7fad4f3d336f4c6eed4852ffd0c889b7c17edfe8dc803f2908e64736f6c634300060c0033";

    public static final String FUNC_F = "f";

    public static final String FUNC_T = "t";

    protected FunctionParam(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected FunctionParam(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> f() {
        final Function function = new Function(
                FUNC_F, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> t() {
        final Function function = new Function(FUNC_T, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<FunctionParam> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(FunctionParam.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<FunctionParam> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(FunctionParam.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static FunctionParam load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new FunctionParam(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static FunctionParam load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new FunctionParam(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
