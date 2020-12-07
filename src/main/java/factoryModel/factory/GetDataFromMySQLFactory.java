package factoryModel.factory;

import factoryModel.impl.ReadDataFromMySQL;
import factoryModel.inreface.DataReader;
import factoryModel.inreface.DataReaderFactory;

public class GetDataFromMySQLFactory implements DataReaderFactory {
    @Override
    public DataReader getDataReader() {
        return new ReadDataFromMySQL();
    }
}
