package com.test.com.test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
import org.apache.commons.lang3.RandomStringUtils;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateRequest {
	    int SKU =4513211;
	    String serialnumber;
	    
	    public void randomNumberGenerator() {
	    	String randomdata = RandomStringUtils.randomAlphanumeric(7);
	        serialnumber=SKU+randomdata;
	        System.out.println(serialnumber);
	        customerRequest(serialnumber);
	    }

	    public void customerRequest(String num) {
    	 num=serialnumber;
    	 RestAssured.baseURI = "https://qa-rims-api-k8s.blubirch.com/api/v1/warehouse/return_initiation";
         String requestBody = "{\n" +
                 "    \"return_item_ticket\": {\n" +
                 "        \"client_crm_ticket_no\": \"2402071011119\",\n" +
                 "        \"request_creation_date\": \"12-08-2024\",\n" +
                 "        \"crm_request_id\": \"2402071011119\",\n" +
                 "        \"return_type\": \"Customer\",\n" +
                 "        \"customer_type\": \"End customer\",\n" +
                 "        \"customer_entity_code\": \"\",\n" +
                 "        \"item_location\": \"66/21,3rd cross ,ITI  layout, Mumbai - 515499\",\n" +
                 "        \"quantity\": \"1\",\n" +
                 "        \"sku_code\": \"4513211\",\n" +
                 "        \"serial_number\":\""+ serialnumber +"\",\n" +
                 "        \"split_serial_number\": \"\",\n" +
                 "        \"issue_reported\": \"Deffective Item\",\n" +
                 "        \"customer_name\": \"Dava Gajendra\",\n" +
                 "        \"contact_number\": \"7569376877\",\n" +
                 "        \"alternate_contact_number\": \"9502562418\",\n" +
                 "        \"customer_email\": \"davagajendra@blubirch.com\",\n" +
                 "        \"location\": \"UPBG Mumbai\",\n" +
                 "        \"branch\": \"UPBG Mumbai\",\n" +
                 "        \"service_hierachy\": \"US-083\",\n" +
                 "        \"service_partner_id\": \"4356789\",\n" +
                 "        \"service_technician_id\": \"U-07318\",\n" +
                 "        \"repairable_status\": \"Repairable\",\n" +
                 "        \"repair_cost\": \"3500\",\n" +
                 "        \"validation_status\": \"\",\n" +
                 "        \"customer_resolution_decision\": \"\",\n" +
                 "        \"item_decision\": \"\",\n" +
                 "        \"return_order_number\": \"\",\n" +
                 "        \"return_processing_location\": \"\",\n" +
                 "        \"item_type\": \"Voltas UPBG\",\n" +
                 "        \"purchase_date\": \"19-03-2024\"\n" +
                 "    }\n" +
                 "}";

         // Send POST request and validate the response
         Response response = given()
                 .header("Content-Type", "application/json")  // Set Content-Type to JSON
                 .body(requestBody)  // Attach the JSON payload
                 .post("/return_creations/create_ticket")  // Specify the endpoint
                 .then()
                 .statusCode(200)  // Assert the status code (adjust as needed)
                 .extract().response();

         // Print the response for debugging
         System.out.println("Response Body: " + response.asString());
     }
    }
