package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple4;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
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
public class ReferenceDataTypeStructContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5061033d806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630b1a6855146100465780638e5f3b9c146100a9578063cdd9acc11461010c575b600080fd5b61004e61016f565b604051808581526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018381526020018215151515815260200194505050505060405180910390f35b6100b16101ea565b604051808581526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018381526020018215151515815260200194505050505060405180910390f35b610114610259565b604051808581526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018381526020018215151515815260200194505050505060405180910390f35b60008060008061017d6102c8565b6101856102c8565b6040518060800160405280600281526020013373ffffffffffffffffffffffffffffffffffffffff1681526020016019815260200160011515815250905080915081600001518260200151836040015184606001519550955095509550505090919293565b6000806000806101f86102c8565b6040518060800160405280600281526020013373ffffffffffffffffffffffffffffffffffffffff16815260200160198152602001600115158152509050806000015181602001518260400151836060015194509450945094505090919293565b6000806000806102676102c8565b6040518060800160405280600281526020013373ffffffffffffffffffffffffffffffffffffffff16815260200160198152602001600115158152509050806000015181602001518260400151836060015194509450945094505090919293565b604051806080016040528060008152602001600073ffffffffffffffffffffffffffffffffffffffff16815260200160008152602001600015158152509056fea265627a7a72315820202e2650a2565e56913235b8fe72aa9ebc7e5354c6c74c602ff11a70d15796c264736f6c63430005110032";

    public static final String FUNC_INITDATASTRUCTA = "initDataStructA";

    public static final String FUNC_INITDATASTRUCTB = "initDataStructB";

    public static final String FUNC_INITDATASTRUCTC = "initDataStructC";

    protected ReferenceDataTypeStructContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeStructContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>> initDataStructA() {
        final Function function = new Function(FUNC_INITDATASTRUCTA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>>(
                new Callable<Tuple4<BigInteger, String, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>> initDataStructB() {
        final Function function = new Function(FUNC_INITDATASTRUCTB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>>(
                new Callable<Tuple4<BigInteger, String, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>> initDataStructC() {
        final Function function = new Function(FUNC_INITDATASTRUCTC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteCall<Tuple4<BigInteger, String, BigInteger, Boolean>>(
                new Callable<Tuple4<BigInteger, String, BigInteger, Boolean>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (Boolean) results.get(3).getValue());
                    }
                });
    }

    public static RemoteCall<ReferenceDataTypeStructContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeStructContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static ReferenceDataTypeStructContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
