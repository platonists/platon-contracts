package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.FunctionEncoder;
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
public class ErrorParamConstructor extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516102253803806102258339818101604052602081101561003357600080fd5b8101908080519060200190929190505050600a806000819055505080600181905550506101c0806100656000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630dbe671f1461005c5780634df7e3d01461007a57806382ab890a14610098578063a1c519151461010d578063d46300fd1461012b575b600080fd5b610064610149565b6040518082815260200191505060405180910390f35b61008261014f565b6040518082815260200191505060405180910390f35b6100c4600480360360208110156100ae57600080fd5b8101908080359060200190929190505050610155565b604051808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018281526020019250505060405180910390f35b610115610178565b6040518082815260200191505060405180910390f35b610133610182565b6040518082815260200191505060405180910390f35b60005481565b60015481565b600080826001600082825401925050819055503360015481915091509150915091565b6000600154905090565b6000805490509056fea265627a7a72315820ecd189c5ec0388aef120a878f44c422b59f2d53950bb4e30f951477e71a18c2464736f6c63430005110032";

    public static final String FUNC_A = "a";

    public static final String FUNC_B = "b";

    public static final String FUNC_GETA = "getA";

    public static final String FUNC_GETB = "getB";

    public static final String FUNC_UPDATE = "update";

    protected ErrorParamConstructor(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ErrorParamConstructor(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ErrorParamConstructor> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger _b) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_b)));
        return deployRemoteCall(ErrorParamConstructor.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<ErrorParamConstructor> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger _b) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_b)));
        return deployRemoteCall(ErrorParamConstructor.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public RemoteCall<BigInteger> a() {
        final Function function = new Function(FUNC_A, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> b() {
        final Function function = new Function(FUNC_B, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getA() {
        final Function function = new Function(FUNC_GETA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getB() {
        final Function function = new Function(FUNC_GETB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> update(BigInteger amount) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static ErrorParamConstructor load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ErrorParamConstructor(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ErrorParamConstructor load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ErrorParamConstructor(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
