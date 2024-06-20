package com.pluralsight.northwindtradersapi.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class DbConfiguration {
    private static BasicDataSource basicDataSource;

//    @Bean
//    public DataSource dataSource(){
//        return basicDataSource;
//    }

    @Bean
    public static Connection getConnection() {
        try {
            return basicDataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Autowired
    public DbConfiguration(@Value("${datasource.url}") String url,
                           @Value("${datasource.username}") String username,
                           @Value("${datasource.password}") String password
    ) {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

    }
}
