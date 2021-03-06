package network.platon.contracts.evm.v0_4_26;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class Owned extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550610243806100606000396000f30060806040526004361061004c576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806313af4035146100515780638da5cb5b14610094575b600080fd5b34801561005d57600080fd5b50610092600480360381019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506100eb565b005b3480156100a057600080fd5b506100a96101f2565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156101af576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260178152602001807f4f312d204f776e6572206f6e6c792066756e6374696f6e00000000000000000081525060200191505060405180910390fd5b806000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff16815600a165627a7a72305820987d38e1b263c9e0a41eafabea2c798af8539ba94a439f1234cafa71713245ab0029";

    public static final String FUNC_SETOWNER = "setOwner";

    public static final String FUNC_OWNER = "owner";

    protected Owned(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Owned(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> setOwner(String newOwner) {
        final Function function = new Function(
                FUNC_SETOWNER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(newOwner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<Owned> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Owned.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Owned> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Owned.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Owned load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Owned(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Owned load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Owned(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
