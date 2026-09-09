package com.interview.api.config;

/** Reads configuration from JVM properties first, then environment variables. */
public final class ApiConfig {
    private ApiConfig() {}

    public static String baseUrl() {
        String value = System.getProperty("api.base.url");
        if (value == null || value.isBlank()) {
            value = System.getenv("API_BASE_URL");
        }
        if (value == null || value.isBlank()) {
            throw new IllegalStateException("Set API_BASE_URL or -Dapi.base.url before running API tests.");
        }
        return value.replaceAll("/+$", "");
    }
}
