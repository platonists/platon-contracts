package network.platon.contracts.evm.v0_6_12;

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
    private static final String BINARY = "6080604052348015600f57600080fd5b50604e80601d6000396000f3fe608060405236600a57005b348015601557600080fd5b5000fea264697066735822122018b72d82543830f865bc42f4d17805c23cbc776729e8af3637a0988512121e6f64736f6c634300060c0033";

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
