package com.springboot.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author ldb
 * @date 2020-03-19 17:58
 * @description ??
 */
@Data
@TableName("s_item")
public class Item {
    @TableId(type = IdType.AUTO)
    private Long itemId;
    private String itemName;
    private String itemPrice;
    private Long orderId;


}
