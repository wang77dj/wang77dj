package com.zyq.vo;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
/**
 * @author WangDZz
 * @Description：
 * @date 2022/3/13 - 19:41
 */
@Getter
@ToString
public class JsonResult<E> implements Serializable {
    public Integer success;
    public E data;

    public JsonResult() {
    }

    public JsonResult(Integer code, E data) {
        this.success = code;
        this.data = data;
    }
}
