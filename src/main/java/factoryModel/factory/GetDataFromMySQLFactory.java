package factoryModel.factory;

import factoryModel.factoryInterface.DataReader;
import factoryModel.impl.ReadDataFromMySQL;
import factoryModel.factoryInterface.DataReaderFactory;

public class GetDataFromMySQLFactory implements DataReaderFactory {
    @Override
    public DataReader getDataReader() {
        return new ReadDataFromMySQL();
    }
}
