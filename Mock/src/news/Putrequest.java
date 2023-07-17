package news;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putrequest {

	public static void main(String[] args) {

		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification r = RestAssured.given();
		
		JSONObject ob=new JSONObject();
		ob.put("name", "pradeep");
		ob.put("job", "TE");
	
		r.contentType(ContentType.JSON);
		r.body(ob.toJSONString());
		
	
		Response resp = r.request(Method.PUT,"/api/users/2");
		resp.prettyPrint();
		int co=resp.statusCode();
		System.out.println(co);
	}

}
