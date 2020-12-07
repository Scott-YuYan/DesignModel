package factoryModel;

import factoryModel.factory.GetDataFromMyBatisFactory;
import factoryModel.factory.GetDataFromRedisFactory;
import factoryModel.inreface.DataReader;
import factoryModel.inreface.DataReaderFactory;

public class Main {
    public static void main(String[] args) {
        DataReaderFactory dataReaderFactory1 = new GetDataFromMyBatisFactory();
        DataReader dataReader1 = dataReaderFactory1.getDataReader();
        dataReader1.getData();

        DataReaderFactory dataReaderFactory2 = new GetDataFromMyBatisFactory();
        DataReader dataReader2 = dataReaderFactory2.getDataReader();
        dataReader2.getData();

        DataReaderFactory dataReaderFactory3 = new GetDataFromRedisFactory();
        DataReader dataReader3 = dataReaderFactory3.getDataReader();
        dataReader3.getData();


    }
}
