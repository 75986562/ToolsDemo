package com.hfi.web01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MerchantTestController
 * @Auther VCC
 * @Date 2019/3/30 14:28
 * @Description
 * @Version
 */
@RestController
@RequestMapping("/merchant/test")
public class MerchantTestController {

//    private static Map<String,Merchant>  merchantMap = new HashMap(4);


//    @Autowired
//    MerchantMapper merchantMapper;
    @RequestMapping(value = "/get")
    public String getMerchant(){
//        Merchant merchant = merchantMapper.selectByPrimaryKey("2019033001");
//        System.out.println(merchant.toString());

//        MerchantExample example = new MerchantExample();
//        MerchantExample.Criteria criteria = example.createCriteria();
//        criteria.andAppidIsNotNull();
//        List<Merchant> list = merchantMapper.selectByExample(example);
//        list.stream().forEach(merchant ->{
//            merchantMap.put(merchant.getAppid(),merchant);
//            System.out.println(merchant.toString());
//        });

        return "ok";
    }
//
//    @RequestMapping(value = "/getbyAppid")
//    public String getMerchantByAppid(){
//        String appid = "2019033001";
//        System.out.println(AutoConfiguration.merchantMap.get("2019033001"));
//        return AutoConfiguration.merchantMap.get("2019033001").toString();
//    }
//
//    @RequestMapping(value = "/refreshMerchantMap")
//    public String refreshMerchantMap(){
//        MerchantExample example = new MerchantExample();
//        MerchantExample.Criteria criteria = example.createCriteria();
//        criteria.andAppidIsNotNull();
//        List<Merchant> list = merchantMapper.selectByExample(example);
//        list.stream().forEach(merchant ->{
//            AutoConfiguration.merchantMap.put(merchant.getAppid(),merchant);
//            System.out.println(merchant.toString());
//        });
//        return "ok";
//    }



}
