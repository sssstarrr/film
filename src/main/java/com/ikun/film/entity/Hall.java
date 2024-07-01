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
@TableName("hall")
public class Hall implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 放映厅ID
     */
    @TableId(value = "hall_id", type = IdType.AUTO)
    private Integer hallId;

    /**
     * 放映厅名字
     */
    private String name;

    /**
     * 影院ID
     */
    private Integer cinemaId;

    /**
     * 放映厅容量
     */
    private Integer capacity;


}
