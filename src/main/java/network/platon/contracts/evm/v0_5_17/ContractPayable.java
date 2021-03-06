package network.platon.contracts.evm.v0_5_17;

import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class ContractPayable extends Contract {
    private static final String BINARY = "6080604052348015600f57600080fd5b50603b80601d6000396000f3fe608060405200fea265627a7a72315820690426074f02299ce9a20092c484d47b51c9e4ff86055b84e1983ef16afec7bc64736f6c63430005110032";

    protected ContractPayable(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractPayable(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ContractPayable> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ContractPayable.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ContractPayable> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ContractPayable.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ContractPayable load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractPayable(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractPayable load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractPayable(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
