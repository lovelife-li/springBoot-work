package com.springboot.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.demo.entity.Order;
import com.springboot.demo.entity.User;
import com.springboot.demo.mapper.OrderMapper;
import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.service.IOrderService;
import com.springboot.demo.service.IUserService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
