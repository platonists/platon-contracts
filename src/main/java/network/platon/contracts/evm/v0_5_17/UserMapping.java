package network.platon.contracts.evm.v0_5_17;

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
public class UserMapping extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101b7806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806316fa21101461003b578063ff7ac36d14610073575b600080fd5b6100716004803603604081101561005157600080fd5b8101908080359060200190929190803590602001909291905050506100b5565b005b61009f6004803603602081101561008957600080fd5b8101908080359060200190929190505050610166565b6040518082815260200191505060405180910390f35b8160008083815260200190815260200160002081905550600073143f2b41c991414d06e7ea59d64137cdb51486ea6312c487069091836040518363ffffffff1660e01b8152600401808381526020018281526020019250505060206040518083038186803b15801561012657600080fd5b505af415801561013a573d6000803e3d6000fd5b505050506040513d602081101561015057600080fd5b8101908080519060200190929190505050505050565b600080600083815260200190815260200160002054905091905056fea265627a7a723158206043cc8d5c462f62ae2ad8950a04b97ad453816dba5720465d917726d9b5e60864736f6c63430005110032";

    public static final String FUNC_GETOUTUSER = "getOutUser";

    public static final String FUNC_SETOUTUSER = "setOutUser";

    protected UserMapping(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected UserMapping(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getOutUser(BigInteger _id) {
        final Function function = new Function(FUNC_GETOUTUSER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setOutUser(BigInteger _age, BigInteger _id) {
        final Function function = new Function(
                FUNC_SETOUTUSER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(_age), 
                new com.platon.abi.solidity.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<UserMapping> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(UserMapping.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<UserMapping> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(UserMapping.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static UserMapping load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new UserMapping(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static UserMapping load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new UserMapping(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
