package com.springboot.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.demo.entity.Item;
import com.springboot.demo.entity.Order;
import com.springboot.demo.mapper.ItemMapper;
import com.springboot.demo.mapper.OrderMapper;
import com.springboot.demo.service.IItemService;
import com.springboot.demo.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ldb
 * @since 2019-04-29
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {

}
