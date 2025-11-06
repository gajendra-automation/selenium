package com.test.com.test;



import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class ReturnCreation {
	
	void getResponse() {
		final String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
		int statusCode=given().queryParam("CUSTOMER_ID","68195")
        .queryParam("PASSWORD","1234!")
        .queryParam("Account_No","1").
		given().
		when().
		get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").getStatusCode();
		System.out.println("status code is "+statusCode);
		given().when().get(url).then().assertThat().statusCode(200);
		
		    	
	}		  
		
	}
