package com.test.com.test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class SampleRequest {
	public static void main(String[] args) {
        given()
            .baseUri("https://qa-rims-api-k8s.blubirch.com//api/v1/warehouse/return_initiation/return_creations/create_ticket")
        .when()
            .get("/posts/1")
        .then()
            .statusCode(200)  // Validate response code
            .body("id", equalTo(1))  // Validate JSON response
            .log().all();  // Print response
}
}
