package com.ikun.film.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalTime;
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
@TableName("session")
public class Session implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场次ID
     */
    @TableId(value = "session_id", type = IdType.AUTO)
    private Integer sessionId;

    /**
     * 场厅ID
     */
    private Integer hallId;

    /**
     * 电影院ID
     */
    private Integer cinemaId;

    /**
     * 电影ID
     */
    private Integer movieId;

    /**
     * 放映日期
     */
    private LocalDate date;

    /**
     * 开场时间
     */
    private LocalTime startTime;

    private Double price;

    /**
     * 剩余座位数
     */
    private Integer remain;


}
