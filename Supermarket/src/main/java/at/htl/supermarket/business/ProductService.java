package at.htl.supermarket.business;

import at.htl.supermarket.model.Product;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/product")
@RegisterRestClient
public interface ProductService {

    @GET
    @Produces("application/json")
    List<Product> getProduct();
}
