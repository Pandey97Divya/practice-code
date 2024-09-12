package apiautomationpractice.apipractice1;

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
//        RestAssured.baseURI= "https://reqres.in/";
//        Response r= RestAssured.given().get();
//        int statusCode= r.getStatusCode();
//        System.out.println(statusCode);
//        RestAssured.baseURI= "https://reqres.in/";
//        Response r= RestAssured.given().get("api/users/2");
//        System.out.println(r.asPrettyString());
    	RestAssured.baseURI= "https://reqres.in/";
    	String jsonBody="{\n    \"name\": \"Harsh\",\n    \"job\": \"IT\"\n}";
    	Response r= RestAssured.given().header("Content-Type","application/json").body(jsonBody).post("/api/users");
    	System.out.println(r.asPrettyString());
    	String str= r.path("id");
    	System.out.println(str);
//    	RestAssured.baseURI= "https://reqres.in/";
//    	String jsonBody="{\n    \"name\": \"Harsh\",\n    \"job\": \"IT\"\n}";
//    	Response r= RestAssured.given().header("Content-Type","application/json").body(jsonBody).put("/api/users/2");
//        System.out.println(r.asPrettyString());
//        String str= r.path("name");
//        System.out.println(str);
//    	RestAssured.baseURI= "https://reqres.in/";
//    	Response r= RestAssured.given().delete("/api/users/2");
//    	System.out.println(r.asPrettyString());
//    	int statusCode= r.getStatusCode();
//    	System.out.println(statusCode);
    }
}
