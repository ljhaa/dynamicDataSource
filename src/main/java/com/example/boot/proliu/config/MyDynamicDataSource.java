package com.example.boot.proliu.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * 继承AbstractRoutingDataSource重写determineCurrentLookupKey
 * 自己定义需要那个数据源
 */
public class MyDynamicDataSource extends AbstractRoutingDataSource {


    //线程独有数据源切换    使用 ThreadLocal
     private final static   ThreadLocal<String > databasekey = new ThreadLocal<>();


    /**
     * 配置DataSource, defaultTargetDataSource为主数据库  TargetDataSources为数据源集合
     */
    public MyDynamicDataSource(DataSource defaultTargetDataSource, Map<Object, Object> targetDataSources) {
        super.setDefaultTargetDataSource(defaultTargetDataSource);
        super.setTargetDataSources(targetDataSources);
        super.afterPropertiesSet();
    }

    public static void setDatabasekey(String key) {
        databasekey.set(key);
    }

    public static String getDatabasekey() {
       return databasekey.get();
    }

    public static void removeDatabasekey() {
         databasekey.remove();
    }


    @Override
    protected Object determineCurrentLookupKey() {
        return databasekey.get();
    }
}
