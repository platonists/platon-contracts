package network.platon.contracts.evm.v0_6_12;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.DynamicArray;
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
public class RecursiveStorageMemoryComplex extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060426000800181905550614200600060010160008154811061002f57fe5b906000526020600020906002020160000181905550614201600060010160018154811061005857fe5b90600052602060002090600202016000018190555060005b60038110156100ce57806242000001600060010160008154811061009057fe5b906000526020600020906002020160010182815481106100ac57fe5b9060005260206000209060020201600001819055508080600101915050610070565b5060005b60048110156101305780624201000160006001016001815481106100f257fe5b9060005260206000209060020201600101828154811061010e57fe5b90600052602060002090600202016000018190555080806001019150506100d2565b50610424806101406000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063a9be8c391461003b578063c04062261461009a575b600080fd5b6100436100f9565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b8381101561008657808201518184015260208101905061006b565b505050509050019250505060405180910390f35b6100a2610151565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156100e55780820151818401526020810190506100ca565b505050509050019250505060405180910390f35b6060600280548060200260200160405190810160405280929190818152602001828054801561014757602002820191906000526020600020905b815481526020019060010190808311610133575b5050505050905090565b606061015b6102f5565b60006101669061030f565b9050600061017382610236565b90508067ffffffffffffffff8111801561018c57600080fd5b506040519080825280602002602001820160405280156101bb5781602001602082028036833780820191505090505b50600290805190602001906101d1929190610384565b506101dd826000610283565b50600280548060200260200160405190810160405280929190818152602001828054801561022a57602002820191906000526020600020905b815481526020019060010190808311610216575b50505050509250505090565b60006001905060005b82602001515181101561027d5761026c8360200151828151811061025f57fe5b6020026020010151610236565b82019150808060010191505061023f565b50919050565b600082600001516002838060010194508154811061029d57fe5b906000526020600020018190555060005b8360200151518110156102eb576102dc846020015182815181106102ce57fe5b602002602001015184610283565b925080806001019150506102ae565b5081905092915050565b604051806040016040528060008152602001606081525090565b6040518060400160405290816000820154815260200160018201805480602002602001604051908101604052809291908181526020016000905b82821015610379578382906000526020600020906002020161036a9061030f565b81526020019060010190610349565b505050508152505090565b8280548282559060005260206000209081019282156103c0579160200282015b828111156103bf5782518255916020019190600101906103a4565b5b5090506103cd91906103d1565b5090565b5b808211156103ea5760008160009055506001016103d2565b509056fea264697066735822122030e561c804539fce28df688c7f0a1b17fe16838c5016a73f599cd2aab28feb7164736f6c634300060c0033";

    public static final String FUNC_GETRUNRESULT = "getRunResult";

    public static final String FUNC_RUN = "run";

    protected RecursiveStorageMemoryComplex(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RecursiveStorageMemoryComplex(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<RecursiveStorageMemoryComplex> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RecursiveStorageMemoryComplex.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RecursiveStorageMemoryComplex> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RecursiveStorageMemoryComplex.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public RemoteCall<List> getRunResult() {
        final Function function = new Function(FUNC_GETRUNRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<TransactionReceipt> run() {
        final Function function = new Function(
                FUNC_RUN, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RecursiveStorageMemoryComplex load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RecursiveStorageMemoryComplex(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RecursiveStorageMemoryComplex load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RecursiveStorageMemoryComplex(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
