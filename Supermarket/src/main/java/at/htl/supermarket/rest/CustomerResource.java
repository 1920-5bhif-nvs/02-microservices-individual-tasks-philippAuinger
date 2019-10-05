package at.htl.supermarket.rest;

import at.htl.supermarket.business.CustomerService;
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
public class CustomerResource {
    @Inject
    @RestClient
    CustomerService customerService;

    //how many customers?
    @GET
    @Path("/customer/count")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getNumberOfCustomers" )
    @Timed(name= "timer", description = "How long it takes to perform this task", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfCustomers() {
        return customerService.getCustomer().size();
    }

    //average "Bonuspunkte" of customers?
    @GET
    @Path("/customer/avg/loyalitypoints")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getAvgLoyalityPointsOfCustomers" )
    public double getAvgLoyalityPoints() {
        return customerService.getCustomer().stream().mapToDouble(c -> c.getLoyalty_points()).average().getAsDouble();
    }
}
