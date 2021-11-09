package FirstTests;

import Utils.PropReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Post {

    public static void main(String [] args){
        RestAssured.baseURI= PropReader.getProperty("baseuri");
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/api/users?page=2");
        System.out.println("Response Body is =>  " + response.asString());


    }

}
