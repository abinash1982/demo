package com.sql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255))");

        // Insert test data
        jdbcTemplate.update("INSERT INTO users (name, email) VALUES (?, ?)", "Alice", "alice@example.com");
        jdbcTemplate.update("INSERT INTO users (name, email) VALUES (?, ?)", "Bob", "bob@example.com");
        jdbcTemplate.update("INSERT INTO users (name, email) VALUES (?, ?)", "Charlie", "charlie@example.com");
    }
}
