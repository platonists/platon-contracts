package network.platon.contracts.evm.v0_5_17;

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
public class LibraryUsingForAll extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101b0806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063e81cf24c14610030575b600080fd5b6100666004803603604081101561004657600080fd5b810190808035906020019092919080359060200190929190505050610068565b005b60008073d75f83663bed408e2044e8d81e6ecb9ec2a88a0f6324fef5c89091856040518363ffffffff1660e01b8152600401808381526020018281526020019250505060206040518083038186803b1580156100c357600080fd5b505af41580156100d7573d6000803e3d6000fd5b505050506040513d60208110156100ed57600080fd5b810190808051906020019092919050505090507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff811415610159576000829080600181540180825580915050906001820390600052602060002001600090919290919091505550610176565b816000828154811061016757fe5b90600052602060002001819055505b50505056fea265627a7a72315820be19fa160be354193d5525946a9d53db886f4b83e33f3a1d3b7c6cf4a46e15b764736f6c63430005110032";

    public static final String FUNC_REPLACE = "replace";

    protected LibraryUsingForAll(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected LibraryUsingForAll(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> replace(BigInteger _old, BigInteger _new) {
        final Function function = new Function(
                FUNC_REPLACE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_old), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_new)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<LibraryUsingForAll> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryUsingForAll.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<LibraryUsingForAll> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryUsingForAll.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static LibraryUsingForAll load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new LibraryUsingForAll(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LibraryUsingForAll load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new LibraryUsingForAll(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
