package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tuples.generated.Tuple3;
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
public class ReferenceDataTypeStructRecursiveContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060026000800181610022919061007e565b50600a6000800160008154811061003557fe5b906000526020600020016000018161004d919061007e565b5060146000800160018154811061006057fe5b9060005260206000200160000181610078919061007e565b506100fa565b8154818355818111156100a5578183600052602060002091820191016100a491906100aa565b5b505050565b6100d691905b808211156100d257600080820160006100c991906100d9565b506001016100b0565b5090565b90565b50805460008255906000526020600020908101906100f791906100aa565b50565b6101da806101096000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c806397b93b1a14610030575b600080fd5b61003861005c565b60405180848152602001838152602001828152602001935050505060405180910390f35b60008060006100696100c4565b6000610074906100d7565b9050806000015151816000015160008151811061008d57fe5b6020026020010151600001515182600001516001815181106100ab57fe5b6020026020010151600001515193509350935050909192565b6040518060200160405280606081525090565b60405180602001604052908160008201805480602002602001604051908101604052809291908181526020016000905b82821015610133578382906000526020600020016101249061013e565b81526020019060010190610107565b505050508152505090565b60405180602001604052908160008201805480602002602001604051908101604052809291908181526020016000905b8282101561019a5783829060005260206000200161018b9061013e565b8152602001906001019061016e565b50505050815250509056fea265627a7a723158209cfe30df96bb4fc37e4349fe267242721bf9541c5b846707a7f9116fbfc4d51d64736f6c63430005110032";

    public static final String FUNC_GETSTRUCTPERSONLENGTH = "getStructPersonLength";

    protected ReferenceDataTypeStructRecursiveContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ReferenceDataTypeStructRecursiveContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ReferenceDataTypeStructRecursiveContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructRecursiveContract.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<ReferenceDataTypeStructRecursiveContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeStructRecursiveContract.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>> getStructPersonLength() {
        final Function function = new Function(FUNC_GETSTRUCTPERSONLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple3<BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple3<BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public static ReferenceDataTypeStructRecursiveContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructRecursiveContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeStructRecursiveContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeStructRecursiveContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
