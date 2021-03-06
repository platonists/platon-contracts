package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
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
public class MsgSenderBelongToPayable extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610111806100206000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c8063485a584b1460375780639e45593914607f575b600080fd5b603d60c7565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b608560cf565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b600033905090565b600080339050309150509056fea265627a7a723158207c209337b93d92cbedb8f51f6a1c7966cc72557222c3e49b677e85dc46f9404064736f6c63430005110032";

    public static final String FUNC_GETCONTRACTADDR = "getContractAddr";

    public static final String FUNC_GETMSGSENDERADDR = "getMsgSenderAddr";

    protected MsgSenderBelongToPayable(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MsgSenderBelongToPayable(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getContractAddr() {
        final Function function = new Function(FUNC_GETCONTRACTADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getMsgSenderAddr() {
        final Function function = new Function(FUNC_GETMSGSENDERADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<MsgSenderBelongToPayable> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(MsgSenderBelongToPayable.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<MsgSenderBelongToPayable> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(MsgSenderBelongToPayable.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static MsgSenderBelongToPayable load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MsgSenderBelongToPayable(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MsgSenderBelongToPayable load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MsgSenderBelongToPayable(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
