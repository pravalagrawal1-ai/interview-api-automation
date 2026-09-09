package com.interview.api.tests;

import com.interview.api.helpers.CandidateApiHelper;
import org.testng.annotations.Test;

public class CandidateApiTest {
    @Test(enabled = true, description = "Automate the interviewer-provided API using the framework layers")
    public void automateInterviewApi() {
        new CandidateApiHelper().test();
    }
}
