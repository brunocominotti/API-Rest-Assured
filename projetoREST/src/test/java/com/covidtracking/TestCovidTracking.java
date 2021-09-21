package com.covidtracking;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.is;

import org.junit.Test;




public class TestCovidTracking {
	
	
    @Test
    public void stateFl() {
    	baseURI = "https://api.covidtracking.com";
    	basePath = "/v1";
    	
    	given()
    		
        .when()
        	.get("states/fl/current.json")
        
        .then()
        	.log().body()
        	.statusCode(200)
    		.body("state", containsString ("FL"))
    		.body("positive", is (1909209))
    		.body("negative", is (9339038))
    		.body("probableCases", is (360372))
    		.body("hospitalizedCurrently", is(3307))
    		.body("hospitalizedCumulative", is(82237))
    		.body("death", is(32266))
                      
            
        ;
    	
    }
    
    
    
    @Test
    public void stateAl() {
    	baseURI = "https://api.covidtracking.com";
    	basePath = "/v1";
    	
    	given()
    
       	.when()
       		.get("states/al/current.json")
    
    	.then()
    		.log().body()
    		.statusCode(200)
    		.body("state", containsString ("AL"))
    		.body("positive", is (499819))
    		.body("negative", is (1931711))
    		.body("probableCases", is (107742))
    		.body("hospitalizedCurrently", is(494))
    		.body("hospitalizedCumulative", is(45976))
    		.body("death", is(10148))
        
        ;
    	    
    }
    
    
    @Test
    public void stateSp() {
    	baseURI = "https://api.covidtracking.com";
    	basePath = "/v1";
    	
    	given()
    	
       	.when()
       		.get("states/sp/current.json")
    
    	.then()
    		.log().all()
    		.statusCode(404)
    		
    			
    		
        ;
    		    	
    }
    
    


  }
	
	

