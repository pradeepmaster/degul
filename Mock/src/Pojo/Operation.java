package Pojo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Operation {

	public static void main(String[] args) {
        
		RestAssured.baseURI="http://reqres.in/";
		RequestSpecification res = RestAssured.given();
		Response respo = res.request(Method.GET,"/api/users/2");
		Single user = respo.as(Single.class);
		
		Pojo.Data ds = user.getData();
		String name=ds.getFirst_name();
		System.out.println(name);
		
		Support ds1 = user.getSupport();
		String t=ds1.getText();
		System.out.println(t);
		 
   
	}
}
 
