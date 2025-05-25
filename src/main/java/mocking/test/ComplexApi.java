package mocking.test;

import io.restassured.response.Response;
import mocking.beeceptorPojo.Company;
import mocking.beeceptorPojo.Employees;
import mocking.beeceptorPojo.Teams;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ComplexApi {
    @Test
    public void api(){
        Response response = given()
                .get("https://tushar.free.beeceptor.com/user")
                .then()
                .extract()
                .response();
        System.out.println(response.getBody().asPrettyString());
        Company company = response.as(Company.class);
        //extract the names of all departments.
        //1.using jsonPath
        List<String> departmentList = response.jsonPath().getList("departments.collect{it.name}");
        System.out.println(departmentList);
        //2. using stream
        company.getDepartments().stream().forEach(departments -> System.out.println(departments.getName()));

        //Extract the name and salary of the highest-paid employee.
        //1. using object
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<company.getDepartments().size();i++){
            List<Teams> teams = company.getDepartments().get(i).getTeams();
            for(int j=0;j<teams.size();j++){
                List<Employees> empList2 = teams.get(j).getEmployees();
                for(int k=0;k<empList2.size();k++){
                   map.put(empList2.get(k).getName(), empList2.get(k).getSalary());
                }
            }

        }
        System.out.println(map);
        //employee with highest salary
        int highestSalary = -4000;
        String highestSalaryPerson = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(highestSalary<entry.getValue()){
                highestSalary = entry.getValue();
                highestSalaryPerson = entry.getKey();
            }
        }

        System.out.println("Person with highest salary "+ highestSalaryPerson);
    }
}
