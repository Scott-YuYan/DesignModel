package factoryModel.factory;

import factoryModel.impl.ReadDataFromMyBatis;
import factoryModel.factoryInterface.DataReader;
import factoryModel.factoryInterface.DataReaderFactory;

public class GetDataFromMyBatisFactory implements DataReaderFactory {
    @Override
    public DataReader getDataReader() {
        return new ReadDataFromMyBatis();
    }
}
