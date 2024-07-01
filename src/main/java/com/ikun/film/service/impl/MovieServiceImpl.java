package com.ikun.film.service.impl;

import com.ikun.film.entity.Movie;
import com.ikun.film.mapper.MovieMapper;
import com.ikun.film.service.IMovieService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 三水番
 * @since 2024-07-01
 */
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements IMovieService {

}
