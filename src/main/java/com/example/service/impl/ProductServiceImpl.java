package com.example.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Product;
import com.example.mapper.ProductMapper;
import com.example.service.IProductService;

/**
 * 产品表Service实现类
 * @author CodeGenerator
 * @date 2026-01-05
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
