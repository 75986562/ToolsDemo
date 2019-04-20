package com.hfi.web01.mybatisPlus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hfi.web01.mybatisPlus.entity.Product;
import com.hfi.web01.mybatisPlus.entity.TUser;
import com.hfi.web01.mybatisPlus.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author NZH
 * @since 2019-04-20
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductMapper productMapper;
    @RequestMapping(value = "/curd01")
    public String curd01()
    {
        Product product = new Product();
        product.setPNo("435465").setPName("sdfaf").setPrice(new BigDecimal(11));
        System.out.println(product);
        TUser user = new TUser();
        user.setUserId("2153").setPhoneNum("26656").setUsername("fasdfaafsd");
        System.out.println(user);
        List<Product> list = productMapper.selectList(
                new QueryWrapper<Product>().lambda().eq(Product::getPName,"商品2")
        );
        list.forEach(in-> System.out.println(in));

        return "ok";
    }


}

