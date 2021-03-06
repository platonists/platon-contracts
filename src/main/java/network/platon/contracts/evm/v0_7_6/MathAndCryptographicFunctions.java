package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Bytes32;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
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
public class MathAndCryptographicFunctions extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061035a806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806301c740441461006757806301f56b78146100855780635b4aa3ee146100fe578063aa4e87441461011c578063cc98f30e1461013a578063f9b4169114610158575b600080fd5b61006f610176565b6040518082815260200191505060405180910390f35b6100d26004803603608081101561009b57600080fd5b8101908080359060200190929190803560ff16906020019092919080359060200190929190803590602001909291905050506101f0565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b610106610265565b6040518082815260200191505060405180910390f35b61012461028d565b6040518082815260200191505060405180910390f35b6101426102a2565b6040518082815260200191505060405180910390f35b61016061030f565b6040518082815260200191505060405180910390f35b6000600260405180807f41424300000000000000000000000000000000000000000000000000000000008152506003019050602060405180830381855afa1580156101c5573d6000803e3d6000fd5b5050506040513d60208110156101da57600080fd5b8101908080519060200190929190505050905090565b60008060018686868660405160008152602001604052604051808581526020018460ff1681526020018381526020018281526020019450505050506020604051602081039080840390855afa15801561024d573d6000803e3d6000fd5b50505060206040510351905080915050949350505050565b60007fe1629b9dda060bb30c7908346f6af189c16773fa148d3366701fbaa35d54f3c8905090565b600060038061029857fe5b6003600209905090565b6000600360405180807f41424300000000000000000000000000000000000000000000000000000000008152506003019050602060405180830381855afa1580156102f1573d6000803e3d6000fd5b5050506040515160601b6bffffffffffffffffffffffff1916905090565b600060038061031a57fe5b600360020890509056fea264697066735822122050b7872afe97f133c3b1e747df0d560bdcd5d10a797ec0aeb68ad7cba294bef664736f6c63430007060033";

    public static final String FUNC_CALLADDMOD = "callAddMod";

    public static final String FUNC_CALLECRECOVER = "callEcrecover";

    public static final String FUNC_CALLKECCAK256 = "callKeccak256";

    public static final String FUNC_CALLMULMOD = "callMulMod";

    public static final String FUNC_CALLRIPEMD160 = "callRipemd160";

    public static final String FUNC_CALLSHA256 = "callSha256";

    protected MathAndCryptographicFunctions(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MathAndCryptographicFunctions(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> callAddMod() {
        final Function function = new Function(FUNC_CALLADDMOD, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> callEcrecover(byte[] hash, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(FUNC_CALLECRECOVER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Bytes32(hash), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(v), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(r), 
                new com.platon.abi.solidity.datatypes.generated.Bytes32(s)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> callKeccak256() {
        final Function function = new Function(FUNC_CALLKECCAK256, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> callMulMod() {
        final Function function = new Function(FUNC_CALLMULMOD, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> callRipemd160() {
        final Function function = new Function(FUNC_CALLRIPEMD160, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> callSha256() {
        final Function function = new Function(FUNC_CALLSHA256, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<MathAndCryptographicFunctions> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(MathAndCryptographicFunctions.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<MathAndCryptographicFunctions> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(MathAndCryptographicFunctions.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static MathAndCryptographicFunctions load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MathAndCryptographicFunctions(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MathAndCryptographicFunctions load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MathAndCryptographicFunctions(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
