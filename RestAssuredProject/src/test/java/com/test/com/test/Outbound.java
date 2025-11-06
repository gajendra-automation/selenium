package com.test.com.test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
	import io.restassured.response.Response;


	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;
public class Outbound {
	    public void testPostDealerInvoices() {
	        // Set the Base URI
	        RestAssured.baseURI = "https://qa-rims-api-k8s.blubirch.com/api/v1/external/items";

	        // Create the JSON payload
	        String requestBody = "{\n" +
	                "    \"serial_number\": \"4513211D23CK9900026\",\n" +
	                "    \"sku_code\": \"4513211\",\n" +
	                "    \"dealer_purchase_invoice_number\": \"39911000511504\",\n" +
	                "    \"dealer_purchase_invoice_date\": \"01-04-2024\",\n" +
	                "    \"dealer_purchase_invoice_line_item_number\": \"12\",\n" +
	                "    \"dealer_purchase_value\": \"9900\"\n" +
	                "}";

	        // Send POST request and validate the response
	        Response response = given()
	                .header("Content-Type", "application/json")  // Set Content-Type to JSON
	                .body(requestBody)  // Attach the JSON payload
	                .post("/get_dealer_invoices")  // Specify the endpoint
	                .then()
	                .statusCode(200)  // Assert the status code (change if different expected status)
	                .body("dealer_purchase_value", equalTo("9900"))  // Replace with actual assertions
	                .extract().response();

	        // Print the response for debugging
	        System.out.println("Response Body: " + response.asString());
	}

	}
