package factoryModel.factory;

import factoryModel.impl.ReadDataFromRedis;
import factoryModel.factoryInterface.DataReaderFactory;
import factoryModel.factoryInterface.DataReader;

public class GetDataFromRedisFactory implements DataReaderFactory {
    @Override
    public DataReader getDataReader() {
        return new ReadDataFromRedis();
    }
}
