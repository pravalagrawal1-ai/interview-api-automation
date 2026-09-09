package com.interview.api.helpers;

import com.interview.api.base.ServiceHelper;
import com.interview.api.endpoints.CandidateEndpoints;
import com.interview.api.requestbuilder.CandidateRequestBuilder;
import com.interview.api.validator.CandidateApiValidator;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Orchestrates a single API scenario. Keep setup, execution, and assertions separate by
 * completing each lifecycle method rather than putting all logic in the TestNG test.
 */
public final class CandidateApiHelper implements ServiceHelper {
    private Map<String, String> headers;
    private Map<String, Object> requestBody;
    private Response response;

    @Override
    public CandidateApiHelper init() {
        headers = new LinkedHashMap<>();
        headers.put("Accept", ContentType.JSON.toString());
        requestBody = CandidateRequestBuilder.build();
        return this;
    }

    @Override
    public CandidateApiHelper process() {
        // TODO Choose the HTTP verb and add query/path parameters required by the exercise.
        response = RestAssured.given()
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(CandidateEndpoints.API_UNDER_TEST.url());
        return this;
    }

    @Override
    public CandidateApiHelper validate() {
        CandidateApiValidator.validate(response);
        return this;
    }

    @Override
    public CandidateApiHelper test() {
        return init().process().validate();
    }
}
