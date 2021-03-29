package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Bool;
import com.platon.abi.solidity.datatypes.Event;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.DefaultBlockParameter;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.request.PlatonFilter;
import com.platon.protocol.core.methods.response.Log;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class LibraryStaticUsing extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610182806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063f207564e14610030575b600080fd5b61005c6004803603602081101561004657600080fd5b8101908080359060200190929190505050610076565b604051808215151515815260200191505060405180910390f35b600073965f40c8c3d5582408b7ee53ba3b6a92f59ade1e63f360234c607b846040518363ffffffff1660e01b8152600401808381526020018281526020019250505060206040518083038186803b1580156100d057600080fd5b505af41580156100e4573d6000803e3d6000fd5b505050506040513d60208110156100fa57600080fd5b810190808051906020019092919050505090507f0b3bdb70bcb1393d4319be3261bd6ab95e2ea1665e718029d24cecca39e84ccc81604051808215151515815260200191505060405180910390a191905056fea265627a7a723158208d97371f6257cba01176ac6ab126ca0d62a4008761bf3987b141d6f0b06fec1a64736f6c63430005110032";

    public static final String FUNC_REGISTER = "register";

    public static final Event RESULT_EVENT = new Event("Result", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    ;

    protected LibraryStaticUsing(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected LibraryStaticUsing(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<ResultEventResponse> getResultEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(RESULT_EVENT, transactionReceipt);
        ArrayList<ResultEventResponse> responses = new ArrayList<ResultEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ResultEventResponse typedResponse = new ResultEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ResultEventResponse> resultEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, ResultEventResponse>() {
            @Override
            public ResultEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(RESULT_EVENT, log);
                ResultEventResponse typedResponse = new ResultEventResponse();
                typedResponse.log = log;
                typedResponse.result = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<ResultEventResponse> resultEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(RESULT_EVENT));
        return resultEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> register(BigInteger value) {
        final Function function = new Function(
                FUNC_REGISTER, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<LibraryStaticUsing> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryStaticUsing.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<LibraryStaticUsing> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(LibraryStaticUsing.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static LibraryStaticUsing load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new LibraryStaticUsing(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LibraryStaticUsing load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new LibraryStaticUsing(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ResultEventResponse {
        public Log log;

        public Boolean result;
    }
}
