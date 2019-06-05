package com.example.boot.proliu.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MyDataSourse {


    @Autowired
    Environment env;





    @Bean("oneDateSource")
    @ConfigurationProperties("spring.datasource.master")
    public DataSource oneDateSource(){

        DruidDataSource oneDateSource = DruidDataSourceBuilder.create().build();
       return oneDateSource;
    }


    @Bean("twoDateSource")
    @ConfigurationProperties("spring.datasource.save")
    public DataSource twoDateSource(){
        DruidDataSource twoDateSource = DruidDataSourceBuilder.create().build();
        return twoDateSource;
    }


    @Bean
    @Primary
//    public MyDynamicDataSource dataSource(@Qualifier("oneDateSource")DataSource oneDataSource, @Qualifier("twoDateSource")DataSource twoDataSource) {
    public MyDynamicDataSource dataSource() {
        Map<Object, Object> targetDataSources = getdate();
//        targetDataSources.put(DataSourceKey.ONE, oneDataSource);
//        targetDataSources.put(DataSourceKey.TWO, twoDataSource);
        // 还有数据源,在targetDataSources中继续添加
        return new MyDynamicDataSource((DataSource)targetDataSources.get("default"), targetDataSources);
    }

    private Map<Object,Object> getdate(){

        List<String> listTest = env.getProperty("spring.listTest", List.class);

        Map<Object,Object> dataSourceMap = new HashMap<>();

        for (String s : listTest) {

            DruidDataSource oneDateSource = new DruidDataSource();
            oneDateSource.setDriverClassName(env.getProperty("spring.datasource."+s+".driverClassCame"));
            oneDateSource.setUrl(env.getProperty("spring.datasource."+s+".url"));
            oneDateSource.setUsername(env.getProperty("spring.datasource."+s+".username"));
            oneDateSource.setPassword(env.getProperty("spring.datasource."+s+".password"));
            dataSourceMap.put(s,oneDateSource);


        }

        dataSourceMap.put("default",dataSourceMap.get(listTest.get(0)));

        return dataSourceMap;

    }

}
