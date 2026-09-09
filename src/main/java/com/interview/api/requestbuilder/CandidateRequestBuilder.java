package com.interview.api.requestbuilder;

import java.util.LinkedHashMap;
import java.util.Map;

/** Builds request bodies independently from the HTTP execution layer. */
public final class CandidateRequestBuilder {
    private CandidateRequestBuilder() {}

    public static Map<String, Object> build() {
        Map<String, Object> request = new LinkedHashMap<>();
        // TODO Add only the fields required by the interviewer-provided API.
        return request;
    }
}
