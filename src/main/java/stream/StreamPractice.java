package stream;

import io.restassured.response.Response;
import pojos.Employee;
import pojos.Products;
import pojos.Rating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StreamPractice {

    public static void main(String[] args) {
        Response response = given().when().get("https://fakestoreapi.com/products");
        List<Products> productsList = response.jsonPath().getList("", Products.class);
        //Print all product titles priced above $100.
        productsList.stream().filter(p->p.getPrice() > 100).forEach(pr-> System.out.println(pr.getTitle()+ " " + " Price : $"+ pr.getPrice()));
        //Print only the IDs of all products under the "electronics" category.
        System.out.println(" List of Product ids from elctronics category: ");
        productsList.stream().filter(p->p.getCategory().equals("electronics")).forEach(p-> System.out.println(p.getId()));
        //Sort and print the top 5 most expensive products.
        System.out.println("List of most expensive products");
        productsList.stream().sorted(Comparator.comparingDouble(Products::getPrice).reversed()).limit(5).forEach(p-> System.out.println(p.getTitle() +" $"+ p.getPrice()));
        //second highest salary using stream for employee
        Employee tushar = new Employee("Tushar","Atpadi", 29, 956660.3);
        Employee sandesh = new Employee("sandesh","pune", 25, 9500.3);
        Employee snehal = new Employee("snehal","akluj", 32, 87950.3);
        Employee sarhak = new Employee("sarhak","wagholi", 18, 966650.3);
        Employee mugdah = new Employee("mugdah","shetphale", 92, 96756750.3);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(tushar);
        employeeList.add(sandesh);
        employeeList.add(snehal);
        employeeList.add(sarhak);
        employeeList.add(mugdah);

       employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(1).forEach(e-> System.out.println("Person with highest salary "+e.getName()));


    }
}
