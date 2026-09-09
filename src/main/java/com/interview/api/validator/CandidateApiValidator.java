package com.interview.api.validator;

import io.restassured.response.Response;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

/** Holds response assertions so tests remain focused on the scenario. */
public final class CandidateApiValidator {
    private CandidateApiValidator() {}

    public static void validate(Response response) {
        assertNotNull(response, "The API response must not be null");
        assertTrue(response.getStatusCode() >= 200 && response.getStatusCode() < 300,
                "Expected a successful response but received " + response.getStatusCode());
        // TODO Add at least two endpoint-specific response assertions.
    }
}
