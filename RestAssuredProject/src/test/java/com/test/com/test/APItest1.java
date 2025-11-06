package com.test.com.test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class APItest1 {
	@Test
	public void validateAPIResponse() {
        // Define the API base URL
        RestAssured.baseURI = "https://qa-rims-api-k8s.blubirch.com/api/v1/warehouse/return_initiation/return_creations/create_ticket"; // Replace with actual API URL

        // Create JSON payload
        JSONObject returnItemTicket = new JSONObject();
        returnItemTicket.put("request_creation_date", "25-03-2025");
        returnItemTicket.put("crm_request_id", "800854609112");
        returnItemTicket.put("return_type", "Dealer");
        returnItemTicket.put("customer_entity_code", "115479");
        returnItemTicket.put("item_location", "67/21,4th cross ,ASN layout, Mumbai - 515499");
        returnItemTicket.put("quantity", "1");
        returnItemTicket.put("sku_code", "4510937");
        returnItemTicket.put("serial_number", "4510937A0765411204");
        returnItemTicket.put("customer_name", "DELTA AIRCOOL");
        returnItemTicket.put("contact_number", "7569376877");
        returnItemTicket.put("alternate_contact_number", "9502562418");
        returnItemTicket.put("customer_email", "davagajendra@blubirch.com");
        returnItemTicket.put("location", "UPBG Mumbai");
        returnItemTicket.put("branch", "UPBG Mumbai");
        returnItemTicket.put("service_hierachy", "VL0133058");
        returnItemTicket.put("service_partner_id", "150716");
        returnItemTicket.put("service_technician_id", "1-70GAK3");
        returnItemTicket.put("repairable_status", "Repairable");
        returnItemTicket.put("repair_cost", "10900");
        returnItemTicket.put("item_type", "Voltas UPBG");

        JSONObject requestPayload = new JSONObject();
        requestPayload.put("return_item_ticket", returnItemTicket);  // Correct way

        // Send API request and validate response
        Response response = given()
            .contentType(ContentType.JSON)
            .body(requestPayload.toString())  // Convert JSON to String
        .when()
            .post("/return-item")  // Replace with actual API endpoint
        .then()
            .statusCode(200) // Ensure response status is 200 OK
            .body("success_count", equalTo(1)) // Validate JSON response fields
            .body("failure_count", equalTo(0))
            .body("status", equalTo("SUCCESS"))
            .body("BB Request ID", notNullValue())
            .extract().response();

        // Print response for debugging
        System.out.println("Response: " + response.asPrettyString());
    
        
    }
}
