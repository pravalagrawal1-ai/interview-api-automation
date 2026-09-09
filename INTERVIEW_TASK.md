# Candidate task

Automate one API endpoint provided by the interviewer using this framework.

Your solution should:

- follow the `init() → process() → validate() → test()` helper lifecycle;
- place the endpoint, request construction, API invocation, and assertions in their respective layers;
- validate the HTTP response code and at least two relevant response details;
- keep secrets out of source control; and
- be executable with `mvn test` after setting `API_BASE_URL`.

You may add small request/response models or utilities where they improve clarity. Explain any assumptions in your pull request or submission notes.
