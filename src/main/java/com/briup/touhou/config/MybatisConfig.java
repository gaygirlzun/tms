package com.briup.touhou.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.touhou.Dao")
public class MybatisConfig {

}
