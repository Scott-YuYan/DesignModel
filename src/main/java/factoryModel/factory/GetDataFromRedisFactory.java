package factoryModel.factory;

import factoryModel.impl.ReadDataFromRedis;
import factoryModel.inreface.DataReader;
import factoryModel.inreface.DataReaderFactory;

public class GetDataFromRedisFactory implements DataReaderFactory {
    @Override
    public DataReader getDataReader() {
        return new ReadDataFromRedis();
    }
}
