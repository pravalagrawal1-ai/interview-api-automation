# API Automation Interview Framework

This repository is a small, standalone API automation framework for an interview exercise. It deliberately contains only generic code and no company systems, credentials, URLs, or test data.

## Exercise

Automate the API supplied by your interviewer using the existing architecture. Implement one happy-path test and the validations requested in the interview.

Set the service URL before executing tests:

```bash
export API_BASE_URL="https://api.example.test"
mvn test
```

`API_BASE_URL` can also be passed as a JVM property:

```bash
mvn test -Dapi.base.url="https://api.example.test"
```

The supplied test is disabled so this repository runs safely without an interview API. Enable it after implementing the exercise.

## Architecture

```
src/main/java/com/interview/api/
├── base/             # Common helper lifecycle contract
├── config/           # Environment-driven configuration
├── endpoints/        # Central endpoint definitions
├── helpers/          # init → process → validate → test orchestration
├── requestbuilder/   # Request payload construction
└── validator/        # Response assertions

src/test/java/com/interview/api/tests/ # Thin TestNG test entry points
```

Keep test classes thin: configuration and test data are prepared there, while the API call and assertions belong in the helper and validator layers respectively.

## Suggested workflow

1. Add the interviewer-provided route and HTTP method to `CandidateEndpoints`.
2. Build its body in `CandidateRequestBuilder` when the API requires one.
3. Complete `CandidateApiHelper.process()`.
4. Add meaningful assertions in `CandidateApiValidator`.
5. Enable and complete `CandidateApiTest`.

Do not commit real credentials. Use environment variables or JVM properties for any secrets supplied during the interview.
