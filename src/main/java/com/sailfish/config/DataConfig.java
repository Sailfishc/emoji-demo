package com.sailfish.config;

import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author sailfish
 * @create 2017-04-01-下午4:14
 */
@Configuration
public class DataConfig {

    @Bean
    public DataSource druidDataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/sailfish");
        druidDataSource.setMaxActive(100);
        druidDataSource.setFilters("stat,wall");
        druidDataSource.setInitialSize(10);
        return druidDataSource;
    }
}
