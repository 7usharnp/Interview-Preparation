package restAssuredPractice;

import io.restassured.response.Response;
import org.testng.Assert;
import pojos.UserResponse;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Beeceptor {
    public static void main(String[] args) {
        UserResponse user = given()
                .when()
                .get("https://tushar.free.beeceptor.com/user")
                .then()
                .extract().as(UserResponse.class);
        System.out.println(user);
        Response response = given().when().get("https://tushar.free.beeceptor.com/user");


        //find a person whose city is pune
        String name = response.jsonPath().getString("data.users.find{it.address.city == 'Pune' }.name ");
        System.out.println("Person living in pune is "+ name);
        //using Pojo
        for(int i=0;i< user.getData().getUsers().size();i++){
            if( user.getData().getUsers().get(i).getAddress().getCity().equals("Pune")){
                System.out.println("Person living in Pune "+ user.getData().getUsers().get(i).getName());
            }
        }
        // Loop through the list of users and print all names and cities (using Java or RestAssured)
        //using object
        for(int i=0;i< user.getData().getUsers().size();i++){
            System.out.println("Name : "+user.getData().getUsers().get(i).getName()+" City : "+ user.getData().getUsers().get(i).getAddress().getCity());
        }
        //Assert that all zipcodes are not null and are 6 digits long
        //look collect is used instead of find as we are collecting data we use findAll in case of conditon like data.user.findAll{it.address.zipcode == '123456' } here condition is there if you want to just collect data use collect
        List<String> zipCodes =response.jsonPath().getList("data.users.collect { it.address.zipcode } ");
        System.out.println(zipCodes);
        for (int i = 0; i < zipCodes.size();i++ ){
            String zipcode = zipCodes.get(i);
            Assert.assertTrue(zipcode != null);
            Assert.assertTrue(zipcode.length() == 6);

        }

       // Validate the city of the user with id = 2 is "Mumbai"
        String cityName = "Mumbai";
        for(int i = 0; i< user.getData().getUsers().size();i++){
            if(user.getData().getUsers().get(i).getId() == 2){
                Assert.assertTrue(user.getData().getUsers().get(i).getAddress().getCity().equals(cityName),"city name not matching");

            }
        }
    }
}
