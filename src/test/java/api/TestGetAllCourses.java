package api;

import api.pojoResponsePayloads.AllCourses.AllCourses;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.testng.annotations.Test;

public class TestGetAllCourses {

    @Test
    public void getNumberOfCourses() {
        AllCourses allCourses =
                RestAssured.given().expect().defaultParser(Parser.JSON).when().get("https://www.rahulshettyacademy.com/api/course").as(AllCourses.class);
        System.out.println(allCourses.getCourses());
    }
}