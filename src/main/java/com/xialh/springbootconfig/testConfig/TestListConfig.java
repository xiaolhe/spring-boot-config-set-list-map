package com.xialh.springbootconfig.testConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by  xiaolhe
 * CreateTime 2020-07-30  14:37
 */
@Configuration
@ConfigurationProperties("test")
public class TestListConfig {
    private List<String> list;

    public List<String> getList(){
        return list;
    }

    public void setList(List<String> list){
        this.list = list;
    }
}
