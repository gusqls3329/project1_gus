package com.green.demo;

import com.green.demo.movies.MovieService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@Import({MovieService.class})
public class test1 {

}
