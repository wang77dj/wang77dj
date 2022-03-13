package com.zyq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyq.entity.Works;
import com.zyq.mapper.WorksMapper;
import com.zyq.service.IWorksService;
import com.zyq.vo.SubWorks;
import com.zyq.vo.WorkList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WangDZz
 * @since 2022-03-13
 */
@Service
public class WorksServiceImpl extends ServiceImpl<WorksMapper, Works> implements IWorksService {
    @Autowired
    WorksMapper worksMapper;

    @Override
    public WorkList getWorkList() {
        List<Works> list = this.list();
        ArrayList<SubWorks> vue = new ArrayList<>();
        ArrayList<SubWorks> jquery = new ArrayList<>();
        ArrayList<SubWorks> game = new ArrayList<>();

        for (Works works : list) {
            switch (works.getKind()) {
                case 0:
                    vue.add(new SubWorks(works));
                    break;
                case 1:
                    jquery.add(new SubWorks(works));
                    break;
                default:
                    game.add(new SubWorks(works));

            }
        }
        return new WorkList(vue, jquery, game);
    }
}
