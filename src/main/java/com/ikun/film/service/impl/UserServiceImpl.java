package com.ikun.film.service.impl;

import com.ikun.film.entity.User;
import com.ikun.film.mapper.UserMapper;
import com.ikun.film.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
