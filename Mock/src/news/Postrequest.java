package news;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postrequest {

	public static void main(String[] args) {

		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
	
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		 
		Response resp = r.request(Method.POST,"/api/users");
		resp.prettyPrint();
		int code=resp.statusCode();
		System.out.println(code);
		
	}

}
