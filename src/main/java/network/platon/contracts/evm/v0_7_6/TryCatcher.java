package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.EventEncoder;
import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Address;
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
public class TryCatcher extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161001d9061007e565b604051809103906000f080158015610039573d6000803e3d6000fd5b506000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555061008a565b608d8061024783390190565b6101ae806100996000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063614619541461003b578063d895540f14610045575b600080fd5b610043610079565b005b61004d610154565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166335b09a6e6040518163ffffffff1660e01b815260040160006040518083038186803b1580156100df57600080fd5b505afa9250505080156100f0575060015b610125577f135475a7dd80871d9a7daccb556f4d9d3bd9593a0987c88f27057bc25cf91c3960405160405180910390a1610152565b7ffd76336752e93f2cc77cf13a41be8b6c156731030376354d634d28a9a87b916260405160405180910390a15b565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff168156fea2646970667358221220cc7d719af2411b8d26ac8d3e3e120a780ed51c169e24166e42d0ed9d0a5afed264736f6c634300070600336080604052348015600f57600080fd5b50607080601d6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c806335b09a6e14602d575b600080fd5b60336035565b005b600080fdfea2646970667358221220dec2c960b819c053dca4f5bc311bfe4e7f3ca1d244d11341cb1d5e8a0fc740ac64736f6c63430007060033";

    public static final String FUNC_EXECUTE = "execute";

    public static final String FUNC_EXTERNALCONTRACT = "externalContract";

    public static final Event CATCHEVENT_EVENT = new Event("CatchEvent", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event SUCCESSEVENT_EVENT = new Event("SuccessEvent", 
            Arrays.<TypeReference<?>>asList());
    ;

    protected TryCatcher(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected TryCatcher(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TryCatcher> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(TryCatcher.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<TryCatcher> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(TryCatcher.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public List<CatchEventEventResponse> getCatchEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CATCHEVENT_EVENT, transactionReceipt);
        ArrayList<CatchEventEventResponse> responses = new ArrayList<CatchEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CatchEventEventResponse typedResponse = new CatchEventEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<CatchEventEventResponse> catchEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, CatchEventEventResponse>() {
            @Override
            public CatchEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CATCHEVENT_EVENT, log);
                CatchEventEventResponse typedResponse = new CatchEventEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Observable<CatchEventEventResponse> catchEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CATCHEVENT_EVENT));
        return catchEventEventObservable(filter);
    }

    public List<SuccessEventEventResponse> getSuccessEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(SUCCESSEVENT_EVENT, transactionReceipt);
        ArrayList<SuccessEventEventResponse> responses = new ArrayList<SuccessEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            SuccessEventEventResponse typedResponse = new SuccessEventEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<SuccessEventEventResponse> successEventEventObservable(PlatonFilter filter) {
        return web3j.platonLogObservable(filter).map(new Func1<Log, SuccessEventEventResponse>() {
            @Override
            public SuccessEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(SUCCESSEVENT_EVENT, log);
                SuccessEventEventResponse typedResponse = new SuccessEventEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Observable<SuccessEventEventResponse> successEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        PlatonFilter filter = new PlatonFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(SUCCESSEVENT_EVENT));
        return successEventEventObservable(filter);
    }

    public RemoteCall<TransactionReceipt> execute() {
        final Function function = new Function(
                FUNC_EXECUTE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> externalContract() {
        final Function function = new Function(FUNC_EXTERNALCONTRACT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static TryCatcher load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new TryCatcher(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TryCatcher load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new TryCatcher(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class CatchEventEventResponse {
        public Log log;
    }

    public static class SuccessEventEventResponse {
        public Log log;
    }
}
