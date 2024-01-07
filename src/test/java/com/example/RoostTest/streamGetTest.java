// Test generated by RoostGPT for test restAssuredTesting using AI Type Open AI and AI Model gpt-4


// Test generated for /device/camera/stream_get for http method type GET in rest-assured framework


// RoostTestHash=06b2d2ebbc


package com.example.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class streamGetTest {
  
    @Test  
    public void stream_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/example/RoostTest/streamGetTest.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
                
  
                Response response = given()
				.pathParam("params", map.get("params") != null ? map.get("params") : "")
                .when()
                .get("/device/camera/stream")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: search results matching criteria");
    
              if (response.jsonPath().get("jetson_uuid") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("jetson_uuid"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("status") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("status"), instanceOf(String.class));  
          }
    
              if (response.jsonPath().get("rtsp") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("rtsp"), instanceOf(String.class));  
          }
				}
if (response.statusCode() == 400) {
					System.out.println("Description: bad input parameter");
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
