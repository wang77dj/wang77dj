package com.zyq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyq.entity.Works;
import com.zyq.vo.WorkList;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WangDZz
 * @since 2022-03-13
 */
public interface IWorksService extends IService<Works> {

    WorkList getWorkList();
}
