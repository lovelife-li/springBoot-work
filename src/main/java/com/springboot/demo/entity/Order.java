package com.springboot.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author ldb
 * @date 2020-03-19 17:59
 * @description ??
 */
@Data
@TableName("s_order")
public class Order {

    @TableId(type = IdType.AUTO)
    private Long orderId ;
    private String orderName;
    private String orderDesc;
    private Long userId;
}
