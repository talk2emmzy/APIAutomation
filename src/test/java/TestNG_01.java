import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG_01 {

    @Test
    void Test_01(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        int statusCode1 = response.getStatusCode();
        Assert.assertEquals(statusCode1, 200);



    }
}
