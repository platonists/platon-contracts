package network.platon.contracts.evm.v0_7_6;

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
public class WithBackCallee extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506103fa806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063688755701461003b578063ae49cd9c1461007d575b600080fd5b6100676004803603602081101561005157600080fd5b8101908080359060200190929190505050610248565b6040518082815260200191505060405180910390f35b6101cd6004803603604081101561009357600080fd5b81019080803590602001906401000000008111156100b057600080fd5b8201836020820111156100c257600080fd5b803590602001918460018302840111640100000000831117156100e457600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019064010000000081111561014757600080fd5b82018360208201111561015957600080fd5b8035906020019184600183028401116401000000008311171561017b57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610259565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561020d5780820151818401526020810190506101f2565b50505050905090810190601f16801561023a5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b600080828301905080915050919050565b6060610265838361026d565b905092915050565b6060600083905060008390506000815183510167ffffffffffffffff8111801561029657600080fd5b506040519080825280601f01601f1916602001820160405280156102c95781602001600182028036833780820191505090505b50905060008190506000805b8551811015610343578581815181106102ea57fe5b602001015160f81c60f81b83838060010194508151811061030757fe5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a90535080806001019150506102d5565b5060005b84518110156103b55784818151811061035c57fe5b602001015160f81c60f81b83838060010194508151811061037957fe5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508080600101915050610347565b5082955050505050509291505056fea2646970667358221220a38b1d9e26eeb3b86465e4551d4ed2fabc95a6232d49cead2b7b91f7ebb6c43864736f6c63430007060033";

    public static final String FUNC_GETDOUBLE = "getDouble";

    public static final String FUNC_GETNAME = "getName";

    protected WithBackCallee(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected WithBackCallee(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> getDouble(BigInteger a) {
        final Function function = new Function(
                FUNC_GETDOUBLE, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(a)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> getName(String option, String name) {
        final Function function = new Function(
                FUNC_GETNAME, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(option), 
                new com.platon.abi.solidity.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<WithBackCallee> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(WithBackCallee.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<WithBackCallee> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(WithBackCallee.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static WithBackCallee load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new WithBackCallee(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static WithBackCallee load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new WithBackCallee(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
