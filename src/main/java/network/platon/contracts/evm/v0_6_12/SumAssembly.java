package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
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
public class SumAssembly extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50600060019080600181540180825580915050600190039060005260206000200160009091909190915055600060029080600181540180825580915050600190039060005260206000200160009091909190915055600060039080600181540180825580915050600190039060005260206000200160009091909190915055600060049080600181540180825580915050600190039060005260206000200160009091909190915055600060059080600181540180825580915050600190039060005260206000200160009091909190915055610154806100f26000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063853255cc14610030575b600080fd5b61003861004e565b6040518082815260200191505060405180910390f35b6000738886107f19a4fd9829ed1f755da498d6ed55cdef6387fbcc7760006040518263ffffffff1660e01b8152600401808060200182810382528381815481526020019150805480156100c057602002820191906000526020600020905b8154815260200190600101908083116100ac575b50509250505060206040518083038186803b1580156100de57600080fd5b505af41580156100f2573d6000803e3d6000fd5b505050506040513d602081101561010857600080fd5b810190808051906020019092919050505090509056fea2646970667358221220e9ba483a1c513029497f37c41dfa101903b7c717ffd5ecfc0eb1a4b1e280415264736f6c634300060c0033";

    public static final String FUNC_SUM = "sum";

    protected SumAssembly(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected SumAssembly(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SumAssembly> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(SumAssembly.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<SumAssembly> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(SumAssembly.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<BigInteger> sum() {
        final Function function = new Function(FUNC_SUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static SumAssembly load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new SumAssembly(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SumAssembly load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new SumAssembly(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
