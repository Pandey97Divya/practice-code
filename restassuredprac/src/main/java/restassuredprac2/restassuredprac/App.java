package restassuredprac2.restassuredprac;

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
        RestAssured.baseURI= "https://reqres.in/";
        Response r= RestAssured.given().get();
        int statusCode= r.getStatusCode();
        System.out.println(statusCode);
        Response r1= RestAssured.given().get("/api/users/2");
        System.out.println(r1.asPrettyString());
        String s= "{\r\n"
        		+ "    \"name\": \"morpheus\",\r\n"
        		+ "    \"job\": \"leader\"\r\n"
        		+ "}";
        Response r2= RestAssured.given().header("Content-Type","application/json").body(s).post("/api/users");
        System.out.println(r2.asPrettyString());
        Response r3= RestAssured.given().header("Content-Type","application/json").body(s).put("/api/users/2");
        System.out.println(r3.asPrettyString());
        System.out.println(r3.path("name"));
        Response r4= RestAssured.given().delete("/api/users/2");
        System.out.println(r4.asPrettyString());
        statusCode = r4.getStatusCode();
       System.out.println(statusCode);
       for(int i=1;i<=12;i++) {
    	   Response r5= RestAssured.given().get("/api/users/"+i);
    	   System.out.println(r5.asPrettyString());
    	   System.out.println(r5.path("data.id")+" "+r5.path("data.email")+" "+r5.path("data.first_name")+" "+r5.path("data.last_name"));
       }
    }
}
