package at.htl.supermarket.rest;

import at.htl.supermarket.business.ProductService;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ProductResource {

    @Inject
    @RestClient
    ProductService productService;


    //how many products?
    @GET
    @Path("/product/count")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getNumberOfProducts" )
    @Timed(name= "timer", description = "How long it takes to perform this task", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfProducts() {
        return productService.getProduct().size();
    }

    //average price of products?
    @GET
    @Path("/product/avg/price")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getAvgPriceOfProducts" )
    public double getAvgPrice() {
        return productService.getProduct().stream().mapToDouble(p -> p.getPrice()).average().getAsDouble();
    }

    //average quantity of products?
    @GET
    @Path("/product/avg/quantity")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getAvgQuantityOfProducts" )
    public double getAvgQuantity() {
        return productService.getProduct().stream().mapToDouble(p -> p.getQuantity()).average().getAsDouble();
    }
}