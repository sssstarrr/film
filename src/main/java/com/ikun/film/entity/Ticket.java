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
@TableName("ticket")
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 电影票ID
     */
    @TableId(value = "ticket_id", type = IdType.AUTO)
    private Integer ticketId;

    /**
     * 所属用户
     */
    private Integer userId;

    /**
     * 场次ID
     */
    private Integer sessionId;

    /**
     * 场厅ID
     */
    private Integer hallId;

    /**
     * 座位号
     */
    private String seat;


}
