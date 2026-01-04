package com.example.controller;

import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.entity.User;
import com.example.service.IUserService;

/**
 * 用户表Controller
 * @author CodeGenerator
 * @date 2026-01-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询用户表列表
     */
    @GetMapping("/list")
    public List<User> list(User user) {
        return userService.list();
    }

    /**
     * 查询用户表分页列表
     */
    @GetMapping("/page")
    public Page<User> page(Page<User> page, User user) {
        return userService.page(page);
    }

    /**
     * 获取用户表详细信息
     */
    @GetMapping("/{id}")
    public User getInfo(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    /**
     * 新增用户表
     */
    @PostMapping
    public boolean add(@RequestBody User user) {
        return userService.save(user);
    }

    /**
     * 修改用户表
     */
    @PutMapping
    public boolean edit(@RequestBody User user) {
        return userService.updateById(user);
    }

    /**
     * 删除用户表
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return userService.removeById(id);
    }

}
