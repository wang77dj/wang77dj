package com.zyq.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyq.entity.WxWork;
import com.zyq.service.impl.WxWorkServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangDZz
 * @since 2022-09-22
 */

@Api(tags = "企业微信")
@RestController
@RequestMapping("/wx-work")
public class WxWorkController {

    private final WxWorkServiceImpl service;
    private final QueryWrapper<WxWork> queryWrapper = new QueryWrapper<>();
    @Autowired
    public WxWorkController(WxWorkServiceImpl service) {
        this.service = service;
    }

    @ApiOperation("添加")
    @PostMapping("/add")
    public boolean add(WxWork work) {
        return service.save(work);
    }

    @ApiOperation("根据uid获取记录")
    @GetMapping("/getAll")
    public List<WxWork> getAll(Integer uid) {
        List<WxWork> list = service.list(queryWrapper.eq("uid", uid));
        queryWrapper.clear();
        return list;
    }
}
