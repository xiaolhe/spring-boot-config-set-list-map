package com.xialh.springbootconfig.controller;

import com.xialh.springbootconfig.testConfig.TestListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by  xiaolhe
 * CreateTime 2020-07-30  14:40
 */
public class TestController {

    /**
     *  1.存储 List 或是 Map 这种类型的数据,以配置 List 类型为例，对于 .yml 文件配置如：application.yml
     *    在程序中使用时候，想当然的使用 @Value 注解去读取这个值
     *               @Value("${array.array1}")
     *               private String[] testArray1;
     *
     *    在程序其他地方使用时候。采用自动注入的方式，去获取值：
     *               @Autowired
     *               private TestListConfig testListConfig;
     *
     * 上述方式，代码耦合度太高，增加一个配置，还需要对配置类做增减改动
     *
     *  2.数组实现这种方式的优缺点
     *   优秀：不需要写配置类 ; 使用逗号分割，一行配置，即可完成多个数值的注入，配置文件更加精简;
     *   不足：业务代码中数组使用很少，基本需要将其转换为 List，去做 contains、foreach 等操作。
     *
     */

    @Autowired
    private TestListConfig testListConfig;

    @Value("${array.array1}")
    private String[] testArray1;


    @Value("${array.array2}")
    private int[] testArray2;


    @Value("${array.array3}")
    private double[] testArray3;
}
