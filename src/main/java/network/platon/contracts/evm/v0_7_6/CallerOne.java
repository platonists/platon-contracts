package network.platon.contracts.evm.v0_7_6;

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
public class CallerOne extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506105c7806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630c55699c146100465780637b8ed01814610064578063f88bef8c14610082575b600080fd5b61004e61008c565b6040518082815260200191505060405180910390f35b61006c610092565b6040518082815260200191505060405180910390f35b61008a61009b565b005b60005481565b60008054905090565b60006040516100a9906101bd565b604051809103906000f0801580156100c5573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff167f371303c051bff726100ad13871cababf50c20dd920fca137e519f98f089a74b4604051602001808281526020019150506040516020818303038152906040526040518082805190602001908083835b60208310610152578051825260208201915060208101905060208303925061012f565b6001836020036101000a038019825116818451168082178552505050505050905001915050600060405180830381855af49150503d80600081146101b2576040519150601f19603f3d011682016040523d82523d6000602084013e6101b7565b606091505b50505050565b6103c7806101cb8339019056fe608060405234801561001057600080fd5b506103a7806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630c55699c14610046578063371303c0146100645780635a3617561461006e575b600080fd5b61004e61008c565b6040518082815260200191505060405180910390f35b61006c610092565b005b61007661020b565b6040518082815260200191505060405180910390f35b60005481565b60006040516100a090610214565b604051809103906000f0801580156100bc573d6000803e3d6000fd5b5090508073ffffffffffffffffffffffffffffffffffffffff167f371303c051bff726100ad13871cababf50c20dd920fca137e519f98f089a74b4604051602001808281526020019150506040516020818303038152906040526040518082805190602001908083835b602083106101495780518252602082019150602081019050602083039250610126565b6001836020036101000a038019825116818451168082178552505050505050905001915050600060405180830381855af49150503d80600081146101a9576040519150601f19603f3d011682016040523d82523d6000602084013e6101ae565b606091505b5050507fb0333e0e3a6b99318e4e2e0d7e5e5f93646f9cbf62da1587955a4092bf7df6e733600054604051808373ffffffffffffffffffffffffffffffffffffffff1681526020018281526020019250505060405180910390a150565b60008054905090565b610150806102228339019056fe608060405234801561001057600080fd5b50610130806100206000396000f3fe6080604052348015600f57600080fd5b5060043610603c5760003560e01c80630c55699c14604157806317f936fb14605d578063371303c0146079575b600080fd5b60476081565b6040518082815260200191505060405180910390f35b60636087565b6040518082815260200191505060405180910390f35b607f6090565b005b60005481565b60008054905090565b60008081548092919060010191905055507fb0333e0e3a6b99318e4e2e0d7e5e5f93646f9cbf62da1587955a4092bf7df6e733600054604051808373ffffffffffffffffffffffffffffffffffffffff1681526020018281526020019250505060405180910390a156fea2646970667358221220a1acd5a6be43cc2088eb5fa3dd5c208dc896c61dc078e544f3f194965b188f8864736f6c63430007060033a2646970667358221220d8000d6d7c6188881fa069907c542b14037c8aea43ca7b7b02a9f3ce609112cf64736f6c63430007060033a2646970667358221220495dab90388ec1f708e276553bd5390496de722a6b3dfe4a1f2e1897d308764464736f6c63430007060033";

    public static final String FUNC_GETCALLERX = "getCallerX";

    public static final String FUNC_INC_DELEGATECALL = "inc_delegatecall";

    public static final String FUNC_X = "x";

    protected CallerOne(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected CallerOne(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getCallerX() {
        final Function function = new Function(FUNC_GETCALLERX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inc_delegatecall() {
        final Function function = new Function(
                FUNC_INC_DELEGATECALL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<CallerOne> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(CallerOne.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<CallerOne> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(CallerOne.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static CallerOne load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new CallerOne(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CallerOne load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new CallerOne(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
