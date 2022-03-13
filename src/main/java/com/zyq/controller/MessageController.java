package com.zyq.controller;


import com.zyq.entity.Message;
import com.zyq.service.impl.MessageServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangDZz
 * @since 2022-03-13
 */

@Api(tags = "Message接口")
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageServiceImpl service;

    @ApiOperation("获取所有")
    @GetMapping("/all")
    public List<Message> getAllMsg() {
        return service.list();
    }

    @ApiOperation("用id删除")
    @GetMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.removeById(id);
    }

    @ApiOperation("保存记录")
    @PostMapping("/save")
    public boolean save(Message message) {
        return service.save(message);
    }
}
