package at.htl.supermarket;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ProductResourceTest {

    /*@Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }*/

    @Test
    public void testProductCount() {
        given()
                .when()
                .get("/api/product/count")
                .then()
                .statusCode(200)
                .body(is("5"));
    }

    @Test
    public void testAveragePrice() {
        given()
                .when()
                .get("/api/product/avg/price")
                .then()
                .statusCode(200)
                .body(is("2.188"));
    }

    @Test
    public void testAverageQuantity() {
        given()
                .when()
                .get("/api/product/avg/quantity")
                .then()
                .statusCode(200)
                .body(is("81.8"));
    }
}