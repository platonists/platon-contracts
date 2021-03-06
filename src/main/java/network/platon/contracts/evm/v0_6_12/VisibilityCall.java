package network.platon.contracts.evm.v0_6_12;

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
public class VisibilityCall extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610303806100206000396000f3fe60806040526004361061001e5760003560e01c8063bef55ef314610023575b600080fd5b61002b610048565b604051808381526020018281526020019250505060405180910390f35b60008060006040516100599061019b565b604051809103906000f080158015610075573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff1663ca77156f60016040518263ffffffff1660e01b81526004018082815260200191505060206040518083038186803b1580156100ca57600080fd5b505afa1580156100de573d6000803e3d6000fd5b505050506040513d60208110156100f457600080fd5b810190808051906020019092919050505092508073ffffffffffffffffffffffffffffffffffffffff1663b8b1feb460016040518263ffffffff1660e01b81526004018082815260200191505060206040518083038186803b15801561015957600080fd5b505afa15801561016d573d6000803e3d6000fd5b505050506040513d602081101561018357600080fd5b81019080805190602001909291905050509150509091565b610125806101a98339019056fe608060405234801561001057600080fd5b50610105806100206000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c8063b8b1feb4146037578063ca77156f146076575b600080fd5b606060048036036020811015604b57600080fd5b810190808035906020019092919050505060b5565b6040518082815260200191505060405180910390f35b609f60048036036020811015608a57600080fd5b810190808035906020019092919050505060c2565b6040518082815260200191505060405180910390f35b6000600382019050919050565b600060028201905091905056fea264697066735822122076fd2066b7f77b580a87c20af3dc61c0b78fbe897023f32e78a66cc8d6a960a264736f6c634300060c0033a2646970667358221220dad10b8cddab4bff9c792000ab8cf2a0a95984ef0ed42f29f79edd26b1cc0d3864736f6c634300060c0033";

    public static final String FUNC_READDATA = "readData";

    protected VisibilityCall(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected VisibilityCall(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> readData(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_READDATA, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<VisibilityCall> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(VisibilityCall.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<VisibilityCall> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(VisibilityCall.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static VisibilityCall load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new VisibilityCall(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static VisibilityCall load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new VisibilityCall(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
