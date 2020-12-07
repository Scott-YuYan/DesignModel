package factoryModel.factory;

import factoryModel.impl.ReadDataFromMyBatis;
import factoryModel.inreface.DataReader;
import factoryModel.inreface.DataReaderFactory;

public class GetDataFromMyBatisFactory implements DataReaderFactory {
    @Override
    public DataReader getDataReader() {
        return new ReadDataFromMyBatis();
    }
}
