package apitesting.api1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RestAssured.baseURI="https://reqres.in";
        Response res=RestAssured.given().get("/api/users/1");
        System.out.println(res.asPrettyString());
        String str=res.path("data.email");
        System.out.println(str);
    }
}
