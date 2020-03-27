package com.bridgelabz.spotify;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RestAPIAssuredDemo {
		
	// user id : fknzgyywczm8ihd1ne5rzbdc4 / fknzgyywczm8ihd1ne5rzbdc4
	
	
	//----------------------------------User Profiles API----------------------------------------------// 
	
	
	/**
	 * Description : to get current user Profile . 
	 */
//	@Test
	public void  getCurrentUserProfile()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/me";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization","Bearer BQBl489J6wPO4ibux22rwSIpIdHK8ZVnlOt8hXhiQCfvd6j7HA0fd1TTY-flna_Cl7OK26xyR_3yipWVTPNfiBIKSOoUu-E_3pQLfAmf0Xzy2u0g5XW4MvK3yITFrdfEie_vnjTYG9aQHVbPqK7GpBUoGgi5pVKqAbAr-_oryAVBpqGsojFwTg2KKmTDOvPEjPt825-qsnBAxNQaVAFl1dCEn_lwcrnZsLWe7j-HqRK03AXlw7buiAAdmTG26kieLp_zg3oilchptPpkPp5qF9LEIiik3A");

		Response response = httpRequest.request(Method.GET);

		
		String responseBody = response.getBody().asString();

		System.out.println("Response Body is =>  " + responseBody);

	}
	
	
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
		String responseBody = response.getBody().asString();
		System.out.println("Success...........")	;
		
		System.out.println("Response Body is =>  " + responseBody);

	}
	

	
	//----------------------------- Playlist API ----------------------------------------------------//
	/**
	 * Description : to get all Playlist List . 
	 */
//	@Test
	public void getAllPlayList()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/me/playlists";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Authorization: Bearer BQDJAeatEveYMqBBPoFiyUKbD3THMsAI649gzMerY2d6-q99wlzUspDXLRqW5yN8bX0PyUy-2B9VtNYkCJIB71v0I_2rWveIWlkraNBfyupmbRPGMQg4uFYOSqUcxvxl5evQ8PpYoYDNo8HXUFnvQ9z0HvVkCnhZc3nXBceaUPDa2Ct3w3lPnsbFI77DHIC3EvKCI5U7T6cSB2LEBx7y1_fkUsnGIfou2Nw1vvlJOetOdjsPM7UAIWEXgNwS9-VuYd89vsYeqIl42kSFc58pKy5WX6nrDg");

		Response response = httpRequest.request(Method.GET);
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
		
	}
	
	
	/**
	 * Description : Get a Playlist . 
	 */
//	@Test
	public void getPlaylist()
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Bearer BQDdtMGDpX8WPIZsDyYzcl_LKlJm9npKqAdMlVG4gFc_VORtIbODPDX-9K418e57iw_49UtP7a18b_ptB15WFLSNBVXteWeqo3xwGNv0ay4-oXSpf9ZjizmnVShkJOhSAj9aBdAX_hP1xlXkC7TYgofWzzBLmRTuUjnjjKdWt3QFlqFAA3nNeUMFgulO1nPQKAbtr09A8YpnRijQC9PrgGpqi6dzkbgEKQj3JQ-nWo_LEGsfNkbv-OecmsgjSEihf_EXBV0RzNuZeIahGPZvG3LI0Dj51w");

		Response response = httpRequest.request(Method.GET,"/4yJkHzLrt8kEIKSUbHVLqo");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
		
	}
	

	
	
	/**
	 * Description : to create playlist . 
	 */
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
		requestParam.put("name","Hindi");
		requestParam.put("description","This is my Hindi Song");
		requestParam.put("public","true");
	
		
		// add the header to request
		httpRequest.header("Content-Type","application/json");
		httpRequest.header("Authorization","Authorization: Bearer BQBVPgEzMfD-OOYzYc4kYB008bBUOIQVWhrdyQkOOviV36l85DxQ2yWjxBuUXWuaDHP3Indvtgo9noGUy6_DSrZXmDd_v3MBlXpRvEJ3ecmeZBSQ-LTI_hzpOyebB_uYKoD4D-qhZTndtdidC5Um8Wgp27QemNEsiNykQEP-xqtEalNdV3j4rndzbQd61FpKs5ZIOAzvrnlwNHnTGXUHRdXgEroRKiqi-1Gy8s4voWF9KKlj0G_8VrCQ90X7_e4UJ9aQGZntLVnYwjfIf7urTSeUIjkR0A");
		
		
		// add the json to to body of request
		httpRequest.body(requestParam.toJSONString());
		
		// post request and check response 
		Response response = httpRequest.post("/fknzgyywczm8ihd1ne5rzbdc4/playlists");
		
		
		// we validate the Response 
		response.getBody().prettyPrint();
		int statusCode = response.getStatusCode();
		System.out.println("Satus code :"+statusCode);
		//		Assert.assertEquals(statusCode, 201);			
	}
	

	

	/**
	 * Description : to update playlist . 
	 */
//	@Test
	public void updatePlayList()
	{
		String playlist_Id = "6JeVGhNk0askg2UEACqvw1";
		
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists";
		
		RequestSpecification request = RestAssured.given();
		
		// create JSONObject and pass the parameter 
		JSONObject requestParam = new JSONObject();
		requestParam.put("name","HindiActionSongs");
		requestParam.put("description","this is my HindiActionSongs Playlist....");
		requestParam.put("public","true");
		
	
		// Add a header stating the Request body is a JSON
		request.header("Content-Type", "application/json"); 
		request.header("Authorization", "Bearer BQBqoSXBaQ8NAedUojTvl7VyragQ7jEMQ5hlsy1SAE2pvUIldi2SecAky55AYHB_5Fflf6sy6IHBnBdGyLg0Yu8lfYUQaXW4S2qQ-qStxc5f_DbLJ0TKWBnkLKnkFpWj9czB2DDJjYYuMcTQIjYYkHIdamUTf6eBzRSoSauvsG46T4yQ6-RMc_VqIyzN3H44dreL5na0auOpZxfUWjASROpyigNwjvwZlpmSTDRP946YkyASaBVaxppNuCxnWPxEJOP0arySpY82xvxSJSmKFYE6juzhIQ");
		 
		// Add the Json to the body of the request
		request.body(requestParam.toJSONString());
		
		
		Response response = request.put("/"+playlist_Id);
		
	}
	

	
	
	
	
	
	
	
	
//----------------------------------------------- Browse API -------------------------------------------------------------//	

	
	
	/**
	 * Description :  Get a List of Browse Categories 
	 */
//	@Test
	public void getListBrowseCategories()	
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/browse/categories";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Bearer BQBsOwxWKWoNTvlIQplKdqar6TI0ng5Q6xGlJ_B6zO4B1sYANbtlxvNjYbUWh-mQ2lzvfBl1KhFbSqU36bxO9NDSG-0HfWUcwjfEIhpknppHs4EhUv8lKomC7Jfl9qT7HBXdBtekF37AZJJ1zYks5wKziU_ihGZCeDC821Rj2Koo1B6dD4QJPp7ICZ6wUSm4C8fZo8b1jlpDzlnK7ZwAh8n4srX0hXtbnlxsJ840pSwpNaKpB5gEijVhmeFWd_rXxT1jnFjoWFEZqgkioTw9JEkLLFGA8w");

		Response response = httpRequest.request(Method.GET);
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
	}
	
	/**
	 * Description :  Get Single Browse Categories 
	 */
//	@Test
	public void getSingleBrowserCategories()	
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/browse/categories";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Bearer BQBsOwxWKWoNTvlIQplKdqar6TI0ng5Q6xGlJ_B6zO4B1sYANbtlxvNjYbUWh-mQ2lzvfBl1KhFbSqU36bxO9NDSG-0HfWUcwjfEIhpknppHs4EhUv8lKomC7Jfl9qT7HBXdBtekF37AZJJ1zYks5wKziU_ihGZCeDC821Rj2Koo1B6dD4QJPp7ICZ6wUSm4C8fZo8b1jlpDzlnK7ZwAh8n4srX0hXtbnlxsJ840pSwpNaKpB5gEijVhmeFWd_rXxT1jnFjoWFEZqgkioTw9JEkLLFGA8w");

		Response response = httpRequest.request(Method.GET,"/toplists");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
	}
	
	
	
	
	/**
	 * Description :  Get a Category's playlists 
	 */
//	@Test
	public void getCategoryplaylists()	
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/browse/categories";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Bearer BQCACb-UKPY0KZqTq8YUl4muuF_ASezU77NHDkRGCS1JinZZ_llfTMvqC7c2zdjhtNCZfskS1gJnzSWuiyl1T-MKGA5O1Y3xO-qh265eDsolUGY_tHzxajQFBTf3IULosthRPYyZTRPANaLHOmvKt_IzgwUVAIq7SLm7C6WLKbAdjbmSHgo7ViAgLJjd-WPYxgJuJ9ijJW5cZ9Q_5cAXp1zRx_Tg83sPXHzi3JsOvybtxYeXPUU8Ra1Dd-6tyxL_311bLwmLosIlMG4oMLt6IRFbcVPzcw");

		Response response = httpRequest.request(Method.GET,"/toplists/playlists");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
	}
		
	
	/**
	 * Description :  Get a List of New Releases	 
	 */
//	@Test
	public void getListofNewReleases()	
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/browse/new-releases";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Bearer BQBqoSXBaQ8NAedUojTvl7VyragQ7jEMQ5hlsy1SAE2pvUIldi2SecAky55AYHB_5Fflf6sy6IHBnBdGyLg0Yu8lfYUQaXW4S2qQ-qStxc5f_DbLJ0TKWBnkLKnkFpWj9czB2DDJjYYuMcTQIjYYkHIdamUTf6eBzRSoSauvsG46T4yQ6-RMc_VqIyzN3H44dreL5na0auOpZxfUWjASROpyigNwjvwZlpmSTDRP946YkyASaBVaxppNuCxnWPxEJOP0arySpY82xvxSJSmKFYE6juzhIQ");

		Response response = httpRequest.request(Method.GET);
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
	}
	
//---------------------------------------Track API----------------------------------------------//

	
	
	/**
	 * Description :  Get a Playlist's Tracks	 
	 */
	@Test
	public void getPlaylistTracks()	
	{
		RestAssured.baseURI = "https://api.spotify.com/v1/playlists";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Authorization", "Bearer BQAEDM1nwje5y-HfcQNtW4K2T6P87sXsIiuWGYxAPqYnGezRyeTElGXtCSnkt1BlrUwHQHRpavoqvws0taetyhnwniwwRY6ZRsg61IkKILqnQt1w59r00qsUiFR15PBglH0PPZi2HjB0mh66CQ54uoJ4TfF-Jh63YfTzUNofm0mdEkabIuvw1EfSkKtDUmRMtPsWFv155PzJkl-z6qGS8GnseGFS8Bsz1zCoPxPNbQPJcGyAUMWNbuh9XHJXdVwjFfceSSxh13oifHwahjOWa-jltMNUMA");

		Response response = httpRequest.request(Method.GET,"/4qsr9qm1OVMSIta9mtWvrt/tracks");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body == > "+responseBody);
	}




}		

