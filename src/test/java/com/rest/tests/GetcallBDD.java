package com.rest.tests;


import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class GetcallBDD {
	@Test
	public void test_numberofcorcuitsfor2018()
	{
//	given().
//	when().
//	then().
//	assert()
		
		
		given().
		
		when().
		
		get("http://ergast.com/api/f1/2017/circuits.json").
		
		then().
		
		assertThat().
		
		statusCode(200).
		
		and().
		
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
		
		and().
		
		header("Content-Length", equalTo("4551"));
	}

}
