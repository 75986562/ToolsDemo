package com.hfi.web01.mybatisPlus.impl;

import com.hfi.web01.mybatisPlus.entity.Product;
import com.hfi.web01.mybatisPlus.mapper.ProductMapper;
import com.hfi.web01.mybatisPlus.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NZH
 * @since 2019-04-20
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
