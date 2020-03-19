package com.springboot.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.demo.common.ResponseWrapper;
import com.springboot.demo.entity.ReqData;
import com.springboot.demo.entity.User;
import com.springboot.demo.entity.emums.ColorType;
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
import java.util.List;

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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @ApiOperation("分页查询用户")
    @GetMapping("/findByPage")
    public IPage<User> findByPage(long current, long size) {
        return iUserService.page(new Page<>(current, size), null);
    }

    @ApiOperation("添加或者修改用户")
    @PostMapping("/save")
    public ResponseWrapper<String> addOrUpdate(@RequestBody User user) {
        iUserService.saveOrUpdate(user);
        return ResponseWrapper.markSuccess("");
    }

    @ApiOperation("上传文件")
    @PostMapping("/upload")
    public ResponseWrapper<String> upload(@RequestParam("file") MultipartFile file, String name) {
        log.info("file:{},name:{}", file, name);
        return ResponseWrapper.markSuccess("");
    }


    /**
     * Date birth 默认不支持接收，报string 转 date 错误
     * example
     * {
     * "birth": "2020-03-19 12:12:12",
     * "colorType": "1001",
     * "createTime": "2020-03-19",
     * "desc": "desc",
     * "id": 1,
     * "ids": [
     * 1,2,3
     * ],
     * "map": {
     * "1": "1001",
     * "2": "1002",
     * "3": "1001"
     * },
     * "updateTime": "2020-03-19 14:12:10"
     * }
     */
    @ApiOperation("支持各种数据类型接收")
    @PostMapping("/testData1")
    public ResponseWrapper<String> testManyTypeData(@RequestBody ReqData reqData) {

        log.info("接收数据：{}", reqData);
        return ResponseWrapper.markSuccess("");
    }

    @ApiOperation("接收枚举作为参数")
    @GetMapping(value = "/testData2")
    public ResponseWrapper<String> testData(String name, ColorType colorType, @RequestParam Date date) {

        log.info("接收数据,name:{},colorType:{},date:{}", name, colorType, date);
        return ResponseWrapper.markSuccess(name);
    }


    @ApiOperation("接收数组和Map")
    @PostMapping("/testData3")
    public ResponseWrapper<String> testData(Integer[] ids, @RequestBody HashMap<Integer, ColorType> map) {

        log.info("接收数据,ids:{},map:{}", ids, map);
        return ResponseWrapper.markSuccess("");
    }


    @ApiOperation("查询接收日期")
    @GetMapping("/testData4")
    public ResponseWrapper<String> getData(String name, Date start, @RequestParam LocalDate end,
                                           @RequestParam LocalDateTime mid) {
        log.info("接收数据,start:{},end:{},mid:{}", start, end, mid);
        return ResponseWrapper.markSuccess("");
    }

}
