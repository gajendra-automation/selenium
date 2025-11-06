package com.test.com.test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class SampleTest {
	
	  public static void main(String[] args) {
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        given().
	            header("Content-Type", "application/json").
	        when().
	            get("/posts/1").
	        then().
	            assertThat().statusCode(200).
	            body("userId", equalTo(1)).
	            body("id", equalTo(1));
	    }
}
