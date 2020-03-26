package com.bridgelabz.spotify;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RestAPIAssuredDemo {
		
	// user id : fknzgyywczm8ihd1ne5rzbdc4
	
	/**
	 * Description : to get user Profile . 
	 */
//	@Test
	public void GetUserProfile()	//GET
	{
		// specify the  base URI to Restful service 
		RestAssured.baseURI = "https://api.spotify.com/v1/users";
		System.out.println("1."+RestAssured.baseURI);
		
		// get the specification of a request that i going to sent to the server
		RequestSpecification httpRequest = RestAssured.given();
		System.out.println("3."+httpRequest);
		
		// pass the header
		httpRequest.header("Authorization","Bearer BQAQvp6b7-Ft5iHLdVVFQswc_2L_rc66ie3dZC8v8oCtJT8-9cBhqLhUst9iznwOQq7wZ3GRYEHwRWnPIliXi3o-QC1XjYOyrSb7tLGgHykI4FtW18t7nlqswjC8o275PCgW3ShBMfxBcxP-D-hqs9DT-6LfeuzocYoPmdNxPurm90y9U452-eYchaaaMyDTuwiZKtZxI_gsEYIHNaqrSQjt7yM9C5p8u_ucTE3f2H3uST6dchuD5RKlSnlwYQ-ki1aMJbKyPsWeWpn6lKjYzsb1JDEqLQ");
		
		// get the response by making request to the  server by using  httpRequest
		Response response = httpRequest.request(Method.GET, "/fknzgyywczm8ihd1ne5rzbdc4");
		
		// here we get response 
		String responseBody = response.getBody().asString();lic 
		System.out.println("Success...........")	;
		
		System.out.println("Response Body is =>  " + responseBody);

	}
	

	
	
	
	public void getPlayList()
	{
		
	}
	
	
	
	
//	@Test
	public void createPlaylist()		//POST
	{
		System.out.println("1."+RestAssured.baseURI);
		
		RestAssured.baseURI = "https://api.spotify.com/v1/users";
		System.out.println("2."+RestAssured.baseURI);
		
		RequestSpecification httpRequest = RestAssured.given();
		System.out.println("3."+httpRequest);
		
		// create JSONObject and pass the parameter 
		JSONObject requestParam = new JSONObject();
		requestParam.put("name","Narayan");
		requestParam.put("description","Narayan Playlist");
		requestParam.put("public","true");
	
		
		// add the header to request
		httpRequest.header("Content-Type","application/json");
		httpRequest.header("Authorization","Bearer BQC7iEYRVYR9MUhoVUz3B66TYIYjaw6hS4aZC4hDD8_2m9nmrZs16X24wsZ0VuKc3cgEXgceJfkujOV_lczpigd1DZOhv8v4fK85vv_VZgp1vDPV0VzcbvRxbcELgvVJ5_xiyIQMn3m0gqShsrNOT0C81v35jVQjUvCdmsazVOi0W2evobHlJFc1ojvkh3Hd8zxWpwKb51EuI25SYu71bMQLeYmYpQjZBZYJS_e_ZV0RPsmeSgpqTfa9K2N20khAOJrW-NBOV-NA62bEJfi6FLfzoPEuEA");
		
		
		// add the json to to body of request
		httpRequest.body(requestParam.toJSONString());
		
		// post request and check response 
		Response response = httpRequest.post("/fknzgyywczm8ihd1ne5rzbdc4/playlists");
		
		
		// we validate the Response 
		response.getBody().prettyPrint();
		int statusCode = response.getStatusCode();
		System.out.println("Satus code :"+statusCode);
		//		Assert.assertEquals(statusCode, 201);
//			
	}
	
	@Test
	public void updatePlayList()
	{
		String playlist_Id = "4yJkHzLrt8kEIKSUbHVLqo";
		
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists";
		
		RequestSpecification request = RestAssured.given();
		
		// create JSONObject and pass the parameter 
		JSONObject requestParam = new JSONObject();
		requestParam.put("name","chetan100");
		requestParam.put("description","chetan Playlist....");
		requestParam.put("public","true");
		
	
		// Add a header stating the Request body is a JSON
		request.header("Content-Type", "application/json"); 
		 
		// Add the Json to the body of the request
		request.body(requestParam.toJSONString());
		
		
		Response response = request.put("/"+playlist_Id);
		
	}
	
	
}		
//RestAssured.baseURI = "https://api.spotify.com/v1/users";

