package restAssuredPractice;

import io.restassured.response.Response;
import pojos.Products;

import java.io.File;
import java.util.Comparator;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RestAssuredDemo {

    /*public static void main(String[] args) {
        List<Products> products = null;

            Response response = given()
                    .when()
                    .get("https://fakestoreapi.com/products");
           products = response.jsonPath().getList("", Products.class);

        //find total numbers of products;
        System.out.println("Total number of products "+ products.size());
        // ************************************
        //Find how many products belong to electronic category using jsonPath
        int electronicProducts = response.jsonPath().getList("findAll { it.category == 'electronics' }").size();
        System.out.println("Total products from electronic "+ electronicProducts);
        //Find how many products belong to electronic category using Stream
         long count = products.stream().filter(p->p.getCategory().equals("electronics")).count();
        System.out.println("Total products from electronic " + count);
        //Find how many products belong to electronic category using iterator
        int counter=0;
        for (Products product : products) {
            if(product.getCategory().equals("electronics")){
                counter++;
            }
        }
        System.out.println("Total products from electronic " + counter);

        // *****************************************
        //Find the product names with rating 4.5 and more using stream
        products.stream().filter(p->p.getRating().getRate() >= 4.5).forEach(p-> System.out.println(p.getTitle()+" : Rating-> "+p.getRating().getRate()));
        //Find the product names with rating 4.5 and more using jsonpath
        List<String> titles =response.jsonPath().getList("findAll {it.rating.rate >= 4.5}.title");
        System.out.println(titles);
        //Find the product names with rating 4.5 and more using iterator
        for (Products product : products) {
            if(product.getRating().getRate() >= 4.5 ){
                System.out.println(product.getTitle());
            }
        }
        //***********************************************
        //highest rating count product using jsonPath
        int ratingCount = response.jsonPath().getInt("max { it.rating.count }.rating.count ");
        String highestNumbersOfRatingsProduct = response.jsonPath().getString("find {it.rating.count == "+ ratingCount+" }.title");
        System.out.println("Product with highest Rating count: " + highestNumbersOfRatingsProduct + " and total numbers of rating are "+ ratingCount);
        //highest rating count with stream
        Products maxRatedProduct =  products.stream().max(Comparator.comparingInt(p-> p.getRating().getCount())).orElse(null);
        System.out.println("Product with highest Rating count: " + maxRatedProduct.getTitle() + " and total numbers of rating are "+ maxRatedProduct.getRating().getCount());
        //using iterator
        Products maxRated = null;
        int highestRatingCount =0;
        for (Products product : products) {
           if(product.getRating().getCount() > highestRatingCount){
               highestRatingCount = product.getRating().getCount();
               maxRated = product;
           }
        }
        System.out.println("Product with highest Rating count: " + maxRated.getTitle() + " and total numbers of rating are "+ maxRated.getRating().getCount());

        //Verify all images ends with .jpg extensions
        //using stream
       // products.stream().forEach(p-> Assert.assertTrue(p.getImage().endsWith(".jpg"),p.getTitle()+ " Image has not .jpg extension"));
        //using jsonpath
        response.jsonPath().getList("findAll { it.image =~ /.*.jpg }.title");
        //Returns all titles with jpg image extensions.

       }
*/
    public static void main(String[] args) {
        //schema validation:
        given()
                .when()
                .get("https://fakestoreapi.com/products/1")
                .then()
                .assertThat()
                .body(matchesJsonSchema(new File("C:\\Users\\tushar.nangare\\IdeaProjects\\CodingChallenges\\src\\test\\resources\\product1_Schema.json")));
    }
    }

