package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple2;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class Getter extends Contract {
    private static final String BINARY = "6080604052600a60005534801561001557600080fd5b50610149806100256000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806326121ff01461003b57806373d4a13a14610060575b600080fd5b61004361007e565b604051808381526020018281526020019250505060405180910390f35b61006861010d565b6040518082815260200191505060405180910390f35b6000806000543073ffffffffffffffffffffffffffffffffffffffff166373d4a13a6040518163ffffffff1660e01b815260040160206040518083038186803b1580156100ca57600080fd5b505afa1580156100de573d6000803e3d6000fd5b505050506040513d60208110156100f457600080fd5b8101908080519060200190929190505050915091509091565b6000548156fea26469706673582212207bf0f8bb243e507ddebc6a1ffe4c1ee63456bfb8eff4bc6c53f2164dcca2b66764736f6c63430007060033";

    public static final String FUNC_DATA = "data";

    public static final String FUNC_F = "f";

    protected Getter(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Getter(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> data() {
        final Function function = new Function(FUNC_DATA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> f() {
        final Function function = new Function(FUNC_F, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public static RemoteCall<Getter> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Getter.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Getter> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Getter.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Getter load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Getter(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Getter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Getter(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
