package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.DynamicBytes;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.Utf8String;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.abi.solidity.datatypes.generated.Uint8;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tuples.generated.Tuple2;
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
public class DeleteDemo extends Contract {
    private static final String BINARY = "608060405260016000806101000a81548160ff0219169083151502179055506001805533600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506040518060400160405280600381526020017f313233000000000000000000000000000000000000000000000000000000000081525060039080519060200190620000b092919062000138565b506040518060400160405280600381526020017f616263000000000000000000000000000000000000000000000000000000000081525060049080519060200190620000fe929190620001cf565b506001600560006101000a81548160ff021916908360028111156200011f57fe5b02179055503480156200013157600080fd5b5062000285565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282620001705760008555620001bc565b82601f106200018b57805160ff1916838001178555620001bc565b82800160010185558215620001bc579182015b82811115620001bb5782518255916020019190600101906200019e565b5b509050620001cb919062000266565b5090565b828054600181600116156101000203166002900490600052602060002090601f01602090048101928262000207576000855562000253565b82601f106200022257805160ff191683800117855562000253565b8280016001018555821562000253579182015b828111156200025257825182559160200191906001019062000235565b5b50905062000262919062000266565b5090565b5b808211156200028157600081600090555060010162000267565b5090565b610e1680620002956000396000f3fe6080604052600436106101095760003560e01c8063767800de11610095578063c15bae8411610064578063c15bae84146104e3578063cf08fed514610573578063d1bdda41146105a9578063e5aa3d5814610633578063f02997491461065e57610109565b8063767800de1461035757806393e1ed8314610398578063a1a984e514610428578063ab5170b21461045357610109565b806327c58232116100dc57806327c582321461024e57806332d057c9146102655780633ab0698c1461026f5780634df7e3d01461029a5780635d743b5d146102c757610109565b806305be2c121461010e57806313a5a8af146101a55780631acddabe146101db578063252bd4d31461020d575b600080fd5b34801561011a57600080fd5b5061012361068b565b6040518083815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561016957808201518184015260208101905061014e565b50505050905090810190601f1680156101965780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b3480156101b157600080fd5b506101ba61073e565b604051808260028111156101ca57fe5b815260200191505060405180910390f35b3480156101e757600080fd5b506101f0610755565b604051808381526020018281526020019250505060405180910390f35b34801561021957600080fd5b506102226107a9565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561025a57600080fd5b506102636107d3565b005b61026d61083f565b005b34801561027b57600080fd5b50610284610898565b6040518082815260200191505060405180910390f35b3480156102a657600080fd5b506102af610927565b60405180821515815260200191505060405180910390f35b3480156102d357600080fd5b506102dc610938565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561031c578082015181840152602081019050610301565b50505050905090810190601f1680156103495780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561036357600080fd5b5061036c6109da565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b3480156103a457600080fd5b506103ad610a00565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156103ed5780820151818401526020810190506103d2565b50505050905090810190601f16801561041a5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561043457600080fd5b5061043d610a9e565b6040518082815260200191505060405180910390f35b34801561045f57600080fd5b50610468610aa8565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156104a857808201518184015260208101905061048d565b50505050905090810190601f1680156104d55780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156104ef57600080fd5b506104f8610b4a565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561053857808201518184015260208101905061051d565b50505050905090810190601f1680156105655780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561057f57600080fd5b50610588610be8565b6040518082600281111561059857fe5b815260200191505060405180910390f35b6105b1610bfb565b6040518083815260200180602001828103825283818151815260200191508051906020019080838360005b838110156105f75780820151818401526020810190506105dc565b50505050905090810190601f1680156106245780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b34801561063f57600080fd5b50610648610d17565b6040518082815260200191505060405180910390f35b34801561066a57600080fd5b50610673610d1d565b60405180821515815260200191505060405180910390f35b600060606006600001546006600101808054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561072f5780601f106107045761010080835404028352916020019161072f565b820191906000526020600020905b81548152906001019060200180831161071257829003601f168201915b50505050509050915091509091565b6000600560009054906101000a900460ff16905090565b600080600860000160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054600860010154915091509091565b6000600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905090565b6000806101000a81549060ff0219169055600160009055600260006101000a81549073ffffffffffffffffffffffffffffffffffffffff02191690556003600061081d9190610d33565b6004600061082b9190610d7b565b600560006101000a81549060ff0219169055565b6107d0600860000160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055506008600060018201600090555050565b600080600767ffffffffffffffff811180156108b357600080fd5b506040519080825280602002602001820160405280156108e25781602001602082028036833780820191505090505b5090506064816000815181106108f457fe5b60200260200101818152505060c88160018151811061090f57fe5b60200260200101818152505060609050805191505090565b60008054906101000a900460ff1681565b606060038054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156109d05780601f106109a5576101008083540402835291602001916109d0565b820191906000526020600020905b8154815290600101906020018083116109b357829003601f168201915b5050505050905090565b600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60038054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610a965780601f10610a6b57610100808354040283529160200191610a96565b820191906000526020600020905b815481529060010190602001808311610a7957829003601f168201915b505050505081565b6000600154905090565b606060048054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610b405780601f10610b1557610100808354040283529160200191610b40565b820191906000526020600020905b815481529060010190602001808311610b2357829003601f168201915b5050505050905090565b60048054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610be05780601f10610bb557610100808354040283529160200191610be0565b820191906000526020600020905b815481529060010190602001808311610bc357829003601f168201915b505050505081565b600560009054906101000a900460ff1681565b600060606040518060400160405280600a81526020016040518060400160405280600381526020017f6162630000000000000000000000000000000000000000000000000000000000815250815250506006600080820160009055600182016000610c669190610d7b565b50506006600001546006600101808054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610d085780601f10610cdd57610100808354040283529160200191610d08565b820191906000526020600020905b815481529060010190602001808311610ceb57829003601f168201915b50505050509050915091509091565b60015481565b60008060009054906101000a900460ff16905090565b50805460018160011615610100020316600290046000825580601f10610d595750610d78565b601f016020900490600052602060002090810190610d779190610dc3565b5b50565b50805460018160011615610100020316600290046000825580601f10610da15750610dc0565b601f016020900490600052602060002090810190610dbf9190610dc3565b5b50565b5b80821115610ddc576000816000905550600101610dc4565b509056fea26469706673582212202180fa8266a6bf586ccf3b489a1b792ba2d7b35562191f2d2e3911ac9fc39ca964736f6c63430007060033";

    public static final String FUNC_ADDR = "addr";

    public static final String FUNC_B = "b";

    public static final String FUNC_COLOR = "color";

    public static final String FUNC_DELDYNAMICARRAY = "delDynamicArray";

    public static final String FUNC_DELMAPPING = "delMapping";

    public static final String FUNC_DELSTRUCT = "delStruct";

    public static final String FUNC_DELETEATTR = "deleteAttr";

    public static final String FUNC_GETADDRESS = "getaddress";

    public static final String FUNC_GETBOOL = "getbool";

    public static final String FUNC_GETBYTES = "getbytes";

    public static final String FUNC_GETDELMAPPING = "getdelMapping";

    public static final String FUNC_GETENUM = "getenum";

    public static final String FUNC_GETSTR = "getstr";

    public static final String FUNC_GETSTRUCT = "getstruct";

    public static final String FUNC_GETUNIT = "getunit";

    public static final String FUNC_I = "i";

    public static final String FUNC_STR = "str";

    public static final String FUNC_VARBYTE = "varByte";

    protected DeleteDemo(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected DeleteDemo(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> addr() {
        final Function function = new Function(FUNC_ADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> b() {
        final Function function = new Function(FUNC_B, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> color() {
        final Function function = new Function(FUNC_COLOR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> delDynamicArray() {
        final Function function = new Function(FUNC_DELDYNAMICARRAY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> delMapping(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_DELMAPPING, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> delStruct(BigInteger vonValue) {
        final Function function = new Function(
                FUNC_DELSTRUCT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<TransactionReceipt> deleteAttr() {
        final Function function = new Function(
                FUNC_DELETEATTR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getaddress() {
        final Function function = new Function(FUNC_GETADDRESS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> getbool() {
        final Function function = new Function(FUNC_GETBOOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<byte[]> getbytes() {
        final Function function = new Function(FUNC_GETBYTES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<Tuple2<BigInteger, BigInteger>> getdelMapping() {
        final Function function = new Function(FUNC_GETDELMAPPING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple2<BigInteger, BigInteger>>(
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getenum() {
        final Function function = new Function(FUNC_GETENUM, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getstr() {
        final Function function = new Function(FUNC_GETSTR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Tuple2<BigInteger, String>> getstruct() {
        final Function function = new Function(FUNC_GETSTRUCT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple2<BigInteger, String>>(
                new Callable<Tuple2<BigInteger, String>>() {
                    @Override
                    public Tuple2<BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> getunit() {
        final Function function = new Function(FUNC_GETUNIT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> i() {
        final Function function = new Function(FUNC_I, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> str() {
        final Function function = new Function(FUNC_STR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> varByte() {
        final Function function = new Function(FUNC_VARBYTE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicBytes>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<DeleteDemo> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(DeleteDemo.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<DeleteDemo> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(DeleteDemo.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static DeleteDemo load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new DeleteDemo(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DeleteDemo load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new DeleteDemo(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
