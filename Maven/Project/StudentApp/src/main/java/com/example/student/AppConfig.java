package com.example.student;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    public static String getEnvironment() {
        Properties properties = new Properties();

        try (InputStream input =
                 AppConfig.class.getClassLoader()
                     .getResourceAsStream("application.properties")) {

            if (input == null) {
                throw new IllegalStateException(
                    "application.properties was not found"
                );
            }

            properties.load(input);
            return properties.getProperty("app.environment", "unknown");

        } catch (IOException e) {
            throw new IllegalStateException(
                "Could not load application configuration", e
            );
        }
    }
}