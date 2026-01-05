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
 * 产品表
 * @author CodeGenerator
 * @date 2026-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

@TableName("product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    
    @TableId("id")
    
    private Long id;

    
    @TableField("product_name")
    
    private String productName;

    
    @TableField("price")
    
    private BigDecimal price;

    
    @TableField("description")
    
    private String description;

    
    @TableField("status")
    
    private Integer status;

    
}
