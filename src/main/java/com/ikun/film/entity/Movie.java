package com.ikun.film.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@TableName("movie")
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 电影ID
     */
    @TableId(value = "movie_id", type = IdType.AUTO)
    private Integer movieId;

    /**
     * 电影名称
     */
    private String name;

    /**
     * 电影主演
     */
    private String staring;

    /**
     * 电影详情
     */
    private String detail;

    /**
     * 电影时长
     */
    private String duration;

    /**
     * 电影类型
     */
    private String type;

    /**
     * 评分
     */
    private String score;

    /**
     * 海报
     */
    private String picture;

    /**
     * 累计票房
     */
    private Double boxOffice;

    /**
     * 参评人数
     */
    private String commentsCount;

    /**
     * 上映时间
     */
    private LocalDate releaseDate;

    /**
     * 票房单位
     */
    private Integer boxOfficeUnit;

    /**
     * 电影的外国名
     */
    private String foreignName;

    /**
     * 上映地点
     */
    private String releasePoint;

    private Integer commentsUnit;


}
