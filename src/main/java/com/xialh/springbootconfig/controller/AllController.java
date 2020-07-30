package com.xialh.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by  肖橙橙
 * CreateTime 2020-07-30  15:20
 */
public class AllController {
    /**
     *   1.replace配置类
     *   2.在调用时，借助 EL 表达式的 split() 函数进行切分即可。
     *         @Value("#{'${test.list:}'.split(',')}")
     *         private List<String> testList;
     *  但是这样有个问题，当不配置该 key 值，默认值会为空串，它的 length = 1（不同于数组，length = 0），这样解析出来 list 的元素个数就不是空了。Version 1.0
     *   解决办法是：在 split() 之前判断下是否为空即可。 Version 2.0
     *
     * 3.解析Set
     *    解析 Set 和解析 List 本质上是相同的，唯一的区别是 Set 会做去重操作。
     *        @Value("#{'${test.set:}'.empty ? null : '${test.set:}'.split(',')}")
     *        private Set<Integer> testSet;
     *
     * 4.解析 Map
     *       value 为该 map 的 JSON 格式，注意这里使用的引号：整个 JSON 串使用引号包裹，value 值使用引号包裹。
     *
     */
//   Version 1.0 解析 list，此写法不可行
//    @Value("#{'${test.list:}'.split(',')}")
//    private List<String> testList;


//   Version 2.0 解析 list
    @Value("#{'${test.list:}'.empty ? null : '${test.list:}'.split(',')}")
    private List<String> testList;

    //解析set
    @Value("#{'${setdemo.set:}'.empty ? null : '${test.set:}'.split(',')}")
    private Set<Integer> testSet;

    //解析map
    @Value("#{'mapdemo.map1'}")
    private Map<String,String> map1;

    @Value("#{'mapdemo.map2'}")
    private Map<String,Integer> map2;


}
