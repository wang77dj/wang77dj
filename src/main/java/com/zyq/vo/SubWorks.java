package com.zyq.vo;

import com.zyq.entity.Works;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


/**
 * @author WangDZz
 * @Description：
 * @date 2022/3/13 - 20:03
 */

@ToString
@AllArgsConstructor
public class SubWorks implements Serializable {
    public Integer id;

    public String img;

    public String conten;

    public String url;

    public SubWorks() {
    }

    public SubWorks(Works works) {
        this.id = works.getId();
        this.img = works.getImg();
        this.conten = works.getConten();
        this.url = works.getUrl();
    }
}

