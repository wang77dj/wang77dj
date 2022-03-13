package com.zyq.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author WangDZz
 * @Description：
 * @date 2022/3/13 - 20:03
 */
@ApiModel("WorkList")
@ToString
public class WorkList implements Serializable {
    @ApiModelProperty("都只仅包含id、img、conten、url")
    public List<SubWorks> Vue;
    public List<SubWorks> JQuery;
    public List<SubWorks> Game;

    public WorkList() {
    }

    public WorkList(List<SubWorks> vue, List<SubWorks> JQuery, List<SubWorks> game) {
        Vue = vue;
        this.JQuery = JQuery;
        Game = game;
    }
}
