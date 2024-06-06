## Resources

Below are list of the used resources for this project:

- Dump SQL: `db/microservice_auth_db`

## How to Test
--------------

Please make sure you have setup your db ready before following the steps below. You can find the db as listed in the [Resources](#resources) tab above.

### Run the service project

1. Clone this repository and open the `auth` springboot project in your IDE.

2. Build and run the `auth` project. You can use the following command to run it from terminal:

   ```bash
   ./gradlew bootRun
   ```

3. Wait until the progress reach about 80% EXECUTING or above.

4. Your service should be ready by now. Try accessing `http://localhost:8081` from your browser.

### Test the running service

If you only want to try the login feature, you can use the provided account:

- username: `userdef`
- password: `defpassuser`

1. From your POSTMAN, try sending a POST request to register a new user as the following:

    ```
    HTTP Method: POST 
    URL link: http://localhost:8081/api/register
    Body (JSON):
        {
            "username": "<YOUR_USERNAME>",
            "password": "<YOUR_PASSWORD>"
        } 
    ```

2. To test login with your registered user, send another POST request with the following detail:

    ```
    HTTP Method: POST 
    URL link: http://localhost:8081/api/login
    Body (JSON):
        {
            "username": "<YOUR_USERNAME>",
            "password": "<YOUR_PASSWORD>"
        } 
    ```