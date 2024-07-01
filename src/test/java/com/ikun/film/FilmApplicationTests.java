package com.ikun.film;

import com.ikun.film.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootTest
class FilmApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void delete() {
        userService.removeById(15); //删除14号用户
    }

}
