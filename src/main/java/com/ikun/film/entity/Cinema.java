package com.ikun.film.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 三水番
 * @since 2024-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cinema")
public class Cinema implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 影院ID
     */
    @TableId(value = "cinema_id", type = IdType.AUTO)
    private Integer cinemaId;

    /**
     * 影院名称
     */
    private String name;

    /**
     * 影院地址
     */
    private String address;


}
