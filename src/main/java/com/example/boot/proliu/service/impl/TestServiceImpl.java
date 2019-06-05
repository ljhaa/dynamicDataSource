package com.example.boot.proliu.service.impl;

import com.example.boot.proliu.aspect.DynamicDateSource;
import com.example.boot.proliu.config.DataSourceKey;
import com.example.boot.proliu.entity.EstimateDish;
import com.example.boot.proliu.entity.InvRetailConfig;
import com.example.boot.proliu.map.EstimateDishMapper;
import com.example.boot.proliu.map.InvRetailConfigMapper;
import com.example.boot.proliu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    EstimateDishMapper estimateDishMapper;

    @Autowired
    InvRetailConfigMapper invRetailConfigMapper;

    @Override
    public List<EstimateDish> testliuliuliu() {

//        MyDynamicDataSource.setDatabasekey(DataSourceKey.TWO);
//        return "test";
        return estimateDishMapper.fundAll();
    }

    @Override
    @DynamicDateSource("save")
    public List<InvRetailConfig> fundInv() {
//        MyDynamicDataSource.setDatabasekey(DataSourceKey.TWO);
        List<InvRetailConfig> list =  invRetailConfigMapper.fundAll();
//        MyDynamicDataSource.removeDatabasekey();
        return list;
    }
}
