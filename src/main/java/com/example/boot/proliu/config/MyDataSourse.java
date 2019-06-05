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




//
//    @Bean("oneDateSource")
//    @ConfigurationProperties("spring.datasource.master")
//    public DataSource oneDateSource(){
//
//        DruidDataSource oneDateSource = DruidDataSourceBuilder.create().build();
//       return oneDateSource;
//    }
//
//
//    @Bean("twoDateSource")
//    @ConfigurationProperties("spring.datasource.save")
//    public DataSource twoDateSource(){
//        DruidDataSource twoDateSource = DruidDataSourceBuilder.create().build();
//        return twoDateSource;
//    }


    /**
     * 将获取的数据源配置注册到MyDynamicDataSource  或者说 AbstractRoutingDataSource 中
     * @return
     */
    @Bean
    @Primary
    public MyDynamicDataSource dataSource() {
        Map<Object, Object> targetDataSources = getdate();
        return new MyDynamicDataSource((DataSource)targetDataSources.get("default"), targetDataSources);
    }


    /**
     * 加载数据源时需要读取数据配配置到DruidDataSource类里 我这里用阿里的驱动
     * 默认数据源我这使用default做为key
     * 这里用到了Environment来读取配置
     * 我和看的资料里就这有分歧  我认为这样更加简单清晰
     * @return
     */
    private Map<Object,Object> getdate(){

        List<String> listTest = env.getProperty("spring.list", List.class);

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
