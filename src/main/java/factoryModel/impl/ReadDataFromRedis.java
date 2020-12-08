package factoryModel.impl;

import factoryModel.factoryInterface.DataReader;

public class ReadDataFromRedis implements DataReader {
    @Override
    public void getData() {
        System.out.println("get data from redis!");
    }
}
