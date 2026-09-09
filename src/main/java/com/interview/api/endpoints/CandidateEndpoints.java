package com.interview.api.endpoints;

import com.interview.api.config.ApiConfig;

/** Register interview endpoints here instead of scattering route strings through tests. */
public enum CandidateEndpoints {
    API_UNDER_TEST("/replace-with-interview-route");

    private final String path;

    CandidateEndpoints(String path) {
        this.path = path;
    }

    public String url() {
        return ApiConfig.baseUrl() + path;
    }
}
