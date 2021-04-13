/*
 * @Description:
 * @Date: 2021/4/13
 */
package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.example.demo.mappers"})
public class MybatisConfig {
}
