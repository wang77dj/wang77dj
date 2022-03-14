package com.zyq.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyq.entity.User;
import com.zyq.service.impl.UserServiceImpl;
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
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl service;

    @ApiOperation("保存用户")
    @PostMapping("/save")
    public boolean save(User user) {
        return service.save(user);
    }

    @ApiOperation("用id删除用户")
    @GetMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.removeById(id);
    }

    @ApiOperation("检查账号密码是否存在")
    @GetMapping("/check/{username}/{password}")
    public boolean check(@PathVariable("username") String name,
                         @PathVariable("password") String pwd) {
        User one = service.getOne(new QueryWrapper<User>()
                .eq("username", name)
                .eq("password", pwd));
        return one != null;
    }

    @ApiOperation("获取所有用户")
    @GetMapping("/all")
    public List<User> getAll(){
        return service.list();
    }
}
