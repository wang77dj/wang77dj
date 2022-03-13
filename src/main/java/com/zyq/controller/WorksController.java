package com.zyq.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.zyq.entity.Works;
import com.zyq.service.impl.WorksServiceImpl;
import com.zyq.vo.WorkList;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangDZz
 * @since 2022-03-13
 */
@RestController
@RequestMapping("/works")
public class WorksController {
    @Autowired
    WorksServiceImpl service;

    @SneakyThrows
    @ApiOperation("获取所有")
    @GetMapping("/all")
    public WorkList getWorkList(){
        WorkList workList = service.getWorkList();
        ObjectMapper mapper = new ObjectMapper();
        return workList;
    }

    @ApiOperation("用id删除")
    @GetMapping("/delete/{id}")
    public boolean deleteById(@PathVariable int id){
        return service.removeById(id);
    }

    @ApiOperation("保存Works")
    @PostMapping("/save")
    public boolean save(Works works) {
        return service.save(works);
    }
}
