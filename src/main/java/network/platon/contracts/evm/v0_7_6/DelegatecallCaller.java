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
public class DelegatecallCaller extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610200806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630c55699c146100465780637b8ed01814610064578063a7126c2d14610082575b600080fd5b61004e6100c6565b6040518082815260200191505060405180910390f35b61006c6100cc565b6040518082815260200191505060405180910390f35b6100c46004803603602081101561009857600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506100d5565b005b60005481565b60008054905090565b8073ffffffffffffffffffffffffffffffffffffffff167f371303c051bff726100ad13871cababf50c20dd920fca137e519f98f089a74b4604051602001808281526020019150506040516020818303038152906040526040518082805190602001908083835b6020831061015f578051825260208201915060208101905060208303925061013c565b6001836020036101000a038019825116818451168082178552505050505050905001915050600060405180830381855af49150503d80600081146101bf576040519150601f19603f3d011682016040523d82523d6000602084013e6101c4565b606091505b5050505056fea2646970667358221220f3bc8ce3718ebd35d054d6ce5293b6f700997a2506768d419f5d86b7e2c8059a64736f6c63430007060033";

    public static final String FUNC_GETCALLERX = "getCallerX";

    public static final String FUNC_INC_DELEGATECALL = "inc_delegatecall";

    public static final String FUNC_X = "x";

    protected DelegatecallCaller(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DelegatecallCaller(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getCallerX() {
        final Function function = new Function(FUNC_GETCALLERX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> inc_delegatecall(String _contractAddress) {
        final Function function = new Function(
                FUNC_INC_DELEGATECALL, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Address(_contractAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> x() {
        final Function function = new Function(FUNC_X, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<DelegatecallCaller> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DelegatecallCaller.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DelegatecallCaller> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DelegatecallCaller.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DelegatecallCaller load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DelegatecallCaller(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DelegatecallCaller load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DelegatecallCaller(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
