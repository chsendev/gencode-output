package com.example.controller;

import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.entity.Product;
import com.example.service.IProductService;

/**
 * 产品表Controller
 * @author CodeGenerator
 * @date 2026-01-05
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    /**
     * 查询产品表列表
     */
    @GetMapping("/list")
    public List<Product> list(Product product) {
        return productService.list();
    }

    /**
     * 查询产品表分页列表
     */
    @GetMapping("/page")
    public Page<Product> page(Page<Product> page, Product product) {
        return productService.page(page);
    }

    /**
     * 获取产品表详细信息
     */
    @GetMapping("/{id}")
    public Product getInfo(@PathVariable("id") Long id) {
        return productService.getById(id);
    }

    /**
     * 新增产品表
     */
    @PostMapping
    public boolean add(@RequestBody Product product) {
        return productService.save(product);
    }

    /**
     * 修改产品表
     */
    @PutMapping
    public boolean edit(@RequestBody Product product) {
        return productService.updateById(product);
    }

    /**
     * 删除产品表
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return productService.removeById(id);
    }

}
