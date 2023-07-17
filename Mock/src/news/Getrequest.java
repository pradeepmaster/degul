package news;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getrequest {

	public static void main(String[] args) {

		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response resp = r.request(Method.GET,"/api/users/2");
		resp.prettyPrint();
	
		int code=resp.statusCode();
		System.out.println(code);
		
		
	}
}
