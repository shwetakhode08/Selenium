package apitesting;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class firstapicript {
	
	int id;
	
	@Test
	public void getRecords()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.request(Method.GET);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
		
	}

	@Test
	public void createUser()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "salman terrekhan");
		requestParams.put("salary", "3244353");
		requestParams.put("age", "2456");
		
		request.body(requestParams.toJSONString());
		
		Response response = request.request(Method.POST);
		int statusCode = response.getStatusCode();
		System.out.println(response.asString());
		System.out.println(statusCode);
		
		JsonPath var = response.jsonPath();
		id=var.get("data.id");
		
//		JsonPath jsonPathEvaluator = response.jsonPath();
//	    id = jsonPathEvaluator.get("id");
	}
	
	@Test(dependsOnMethods={"createUser"})
	public void updateRecord()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "salman terrekhan");
		requestParams.put("salary", "3244353");
		requestParams.put("age", "2456");
		
		request.body(requestParams.toJSONString());
		
		Response response = request.request(Method.PUT);
		int statusCode = response.getStatusCode();
		System.out.println(response.asString());
		System.out.println(statusCode);
		
		
		
	}
	
	@Test
	public void deleteRecord()
	{
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/delete";
	RequestSpecification request = RestAssured.given();
	
	JSONObject requestParams = new JSONObject();
	requestParams.put("name", "salman terrekhan");
	requestParams.put("salary", "3244353");
	requestParams.put("age", "2456");
	
	request.body(requestParams.toJSONString());
	
	Response response = request.request(Method.DELETE);
	int statusCode = response.getStatusCode();
	System.out.println(response.asString());
	System.out.println(statusCode);
	
	}
	
	
}
