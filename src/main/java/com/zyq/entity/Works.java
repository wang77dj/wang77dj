package com.zyq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WangDZz
 * @since 2022-03-13
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Works implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer kind;

    private String img;

    private String conten;

    private String url;

    public Works() {
    }
}
