package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户表
 * @author CodeGenerator
 * @date 2026-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    
    @TableId("id")
    
    private Long id;

    
    @TableField("username")
    
    private String username;

    
    @TableField("email")
    
    private String email;

    
    @TableField("age")
    
    private Integer age;

    
    @TableField("created_time")
    
    private Date createdTime;

    
    @TableField("updated_time")
    
    private Date updatedTime;

    
}
