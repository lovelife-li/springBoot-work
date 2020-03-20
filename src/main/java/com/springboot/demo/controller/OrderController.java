package com.springboot.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.demo.common.ResponseWrapper;
import com.springboot.demo.entity.Order;
import com.springboot.demo.entity.ReqData;
import com.springboot.demo.entity.User;
import com.springboot.demo.entity.emums.ColorType;
import com.springboot.demo.service.IOrderService;
import com.springboot.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

/**
 * <p>
 * 用户管理
 * </p>
 *
 * @author ldb
 * @since 2019-04-29
 */
@Slf4j
@Api(tags = "用户管理")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;

    @ApiOperation("分页查询订单")
    @GetMapping("/findByPage")
    public IPage<Order> findByPage(long current, long size) {
        return iOrderService.page(new Page<>(current, size), null);
    }

    @ApiOperation("添加一个订单")
    @PostMapping("/add")
    public String add(@RequestBody Order order){
        iOrderService.save(order);
        return "OK";
    }



}
