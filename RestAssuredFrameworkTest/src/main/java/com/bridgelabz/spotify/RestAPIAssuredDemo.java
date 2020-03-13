package com.bridgelabz.spotify;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RestAPIAssuredDemo {
		
	//@Test
	public void GetUserProfile()	//GET
	{
		// specify the  base URI to Restful service 
		RestAssured.baseURI ="https://api.spotify.com/v1/users/";
		System.out.println("1."+RestAssured.baseURI);
		
		// get the specification of a request that i going to sent to the server
		RequestSpecification httpRequest = RestAssured.given();
		System.out.println("3."+httpRequest);
		
		// pass the header
		httpRequest.header("Authorization","Authorization: Bearer BQDL5FnVZvq8umqswjKxa3315wuiUEn53VTEV9KsVo1iKyCqTapH5XSqsu06LHjK8gwGROuVuslyMQ-Pf5F2nCG4y5LO9O2MKB4NptrYGYz330rhKvg3LkkHwUfYbBYrzlJjLd44bcFW-GdLRQsqEo2pxLQzJ4hhfljB27a6RdtrVm136uUULjABX-kRXwVEyCJUwV-fKscmSlxXd53IYoWCwvu55_pYeQB59TJEXtN2mjFp9IM6hf-G1RTespZInLlDSsydMQqEsxHlhVOsWjnAWRStsg");
		
		// get the response by making request to the  server by using  httpRequest
		Response response = httpRequest.request(Method.GET, "/lbio38a051b0sgxuiiupx3lly");
	
		// here we get response 
		String responseBody = response.getBody().asString();

		System.out.println("Response Body is =>  " + responseBody);

	}
		
	//@Test
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
		httpRequest.header("Authorization","Bearer BQDhZKuNfKhJs8fV-VFuaJci_g3d-9IYgCQwuOJ6cBjR2IAwvSS64nzHgIZKjB4bW_lT9k6EOOA59am7R184XIBR-wnklMO5eGI4N3YKVNbK2G1NwVv0hPc5f7PpPL7rMuTgJ4LBbjLW75Y-kKV1uk7kLuCR8jvOVfnLG_NbamMVXUWTGpXT8VHEyDU2yVgqTu862tcBFggPO94F-gezXoDZhMsQpksxxVWr-XDeY5_njMfar6uIUpcmosv9cZUdfuNmOrUYz5ITsFbIOeqUD9khhzcHaw");
		
		
		// add the json to to body of request
		httpRequest.body(requestParam.toJSONString());
		
		// post request and check response 
		Response response = httpRequest.post("/lbio38a051b0sgxuiiupx3lly/playlists");
		
		
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
		String playlist_Id = "58j8F8hlNVRW6PR8WwbLSc";
		
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists";
		
		RequestSpecification request = RestAssured.given();
		
		// create JSONObject and pass the parameter 
		JSONObject requestParam = new JSONObject();
		requestParam.put("name","Hindi100");
		requestParam.put("description","Hindi Playlist....");
		requestParam.put("public","true");
		
	
		// Add a header stating the Request body is a JSON
		request.header("Content-Type", "application/json"); 
		 
		// Add the Json to the body of the request
		request.body(requestParam.toJSONString());
		
		
		Response response = request.put("/"+playlist_Id);
		
	}
	
	
}
