package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tuples.generated.Tuple4;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class MappingArrayDataTypeContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610343806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80631175c0491461003b5780638e7f79f6146100a0575b600080fd5b61009e600480360360a081101561005157600080fd5b81019080803560ff169060200190929190803560ff169060200190929190803560ff169060200190929190803560ff169060200190929190803560ff169060200190929190505050610106565b005b6100cf600480360360208110156100b657600080fd5b81019080803560ff16906020019092919050505061012b565b604051808560ff1681526020018460ff1681526020018360ff1681526020018260ff16815260200194505050505060405180910390f35b610113600086868661020f565b5050610122600286848461020f565b50505050505050565b6000806000806000806002811061013e57fe5b0160008660ff1660ff16815260200190815260200160002060009054906101000a900460ff16600060016002811061017257fe5b0160008760ff1660ff16815260200190815260200160002060009054906101000a900460ff1660026000600281106101a657fe5b0160008860ff1660ff16815260200190815260200160002060009054906101000a900460ff1660026001600281106101da57fe5b0160008960ff1660ff16815260200190815260200160002060009054906101000a900460ff1693509350935093509193509193565b60008060008660006002811061022157fe5b0160008760ff1660ff16815260200190815260200160002060009054906101000a900460ff16905060008760016002811061025857fe5b0160008860ff1660ff16815260200190815260200160002060009054906101000a900460ff169050858860006002811061028e57fe5b0160008960ff1660ff16815260200190815260200160002060006101000a81548160ff021916908360ff16021790555084886001600281106102cc57fe5b0160008960ff1660ff16815260200190815260200160002060006101000a81548160ff021916908360ff16021790555081819350935050509450949250505056fea2646970667358221220ea647e43198d3475526e55c3a9aa388f6b38e31bedb8f509aae1d990d2f1c22b64736f6c63430007060033";

    public static final String FUNC_GETVALUEBYKEY = "getValueByKey";

    public static final String FUNC_SET = "set";

    protected MappingArrayDataTypeContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MappingArrayDataTypeContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>> getValueByKey(BigInteger key) {
        final Function function = new Function(FUNC_GETVALUEBYKEY, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(key)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}));
        return new RemoteCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> set(BigInteger key, BigInteger value_a1, BigInteger value_a2, BigInteger value_b1, BigInteger value_b2) {
        final Function function = new Function(
                FUNC_SET, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint8(key), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_a1), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_a2), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_b1), 
                new com.platon.abi.solidity.datatypes.generated.Uint8(value_b2)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<MappingArrayDataTypeContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(MappingArrayDataTypeContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<MappingArrayDataTypeContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(MappingArrayDataTypeContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static MappingArrayDataTypeContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MappingArrayDataTypeContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MappingArrayDataTypeContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MappingArrayDataTypeContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
