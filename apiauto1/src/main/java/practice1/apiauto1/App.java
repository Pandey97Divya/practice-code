package practice1.apiauto1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class App 
{
    public static void main( String[] args )
    {
        RestAssured.baseURI= "https://reqres.in/";
        Response r= RestAssured.given().get();
        int statuscode= r.getStatusCode();
        System.out.println(statuscode);
        Response r1= RestAssured.given().get("/api/users/2");
        System.out.println(r1.asPrettyString());
        String s= "{\r\n"
        		+ "    \"name\": \"morpheus\",\r\n"
        		+ "    \"job\": \"leader\"\r\n"
        		+ "}";
        Response r2= RestAssured.given().header("Content-Type","application/json").body(s).post("/api/users");
        System.out.println(r2.asPrettyString());
        statuscode= r2.getStatusCode();
        System.out.println(statuscode);
        System.out.println(r2.path("id"));
        Response r3= RestAssured.given().header("Content-Type","application/json").body(s).put("/api/users/2");
        System.out.println(r3.asPrettyString());
        statuscode= r3.getStatusCode();
        System.out.println(statuscode);
        System.out.println(r3.path("name"));
        System.out.println(r3.path("job"));
        Response r4= RestAssured.given().delete("/api/users/2");
        System.out.println(r4.asPrettyString());
        statuscode= r4.getStatusCode();
        System.out.println(statuscode);
    }
}