// Test generated by RoostGPT for test aman321 using AI Type Open AI and AI Model gpt-4


// Test generated for /api/device/camera/feature/alert_post for http method type POST in rest-assured framework


// RoostTestHash=c211c7fbe6


package com.example.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;

public class alertPostTest {
  
    @Test  
    public void alert_post_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/example/RoostTest/alertPostTest.csv"))) {  
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
				.contentType(ContentType.JSON)
				.body("{\n"+
					"  \"sn\": \"" + map.get("sn") + "\",\n" +
					"  \"cameraId\": \"" + map.get("cameraId") + "\",\n" +
					"  \"timestamp\": \"" + map.get("timestamp") + "\",\n" +
					"  \"confidence\": \"" + map.get("confidence") + "\",\n" +
					"  \"alert\": \"" + map.get("alert") + "\",\n" +
					"  \"subAlert\": \"" + map.get("subAlert") + "\",\n" +
					"  \"photoUrl\": \"" + map.get("photoUrl") + "\",\n" +
					"  \"videoUrl\": \"" + map.get("videoUrl") + "\n" +
 				"}")
                .when()
                .post("/api/device/camera/feature/alert")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 201) {
					System.out.println("Description: alert created");
				}
if (response.statusCode() == 400) {
					System.out.println("Description: invalid input, object invalid");
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
