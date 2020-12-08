package factoryModel.impl;

import factoryModel.factoryInterface.DataReader;

public class ReadDataFromMyBatis implements DataReader{

    @Override
    public void getData() {
        System.out.println("get data from mybatis");
    }




}
