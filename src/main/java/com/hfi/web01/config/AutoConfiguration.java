package com.hfi.web01.config;

import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AutoConfiguration
 * @Auther VCC
 * @Date 2019/3/30 12:33
 * @Description
 * @Version
 */
@Configuration
public class AutoConfiguration {
//    @Autowired
//    MerchantMapper merchantMapper;
//    public static Map<String,Merchant> merchantMap = new HashMap(4);//
//
//    @Bean
//    public void init(){
//        initMerchantMap();
//    }

//    public void initMerchantMap(){
//        MerchantExample example = new MerchantExample();
//        MerchantExample.Criteria criteria = example.createCriteria();
//        criteria.andAppidIsNotNull();
//        List<Merchant> list = merchantMapper.selectByExample(example);
//        list.stream().forEach(merchant ->{
//            merchantMap.put(merchant.getAppid(),merchant);
//            System.out.println(merchant.toString());
//        });
//    }

}
