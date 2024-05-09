package io.codeclou.demo.rest;

import com.atlassian.annotations.security.AdminOnly;
import io.codeclou.demo.model.OrderModel;
import io.codeclou.demo.services.OrderService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/demo/")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class DemoEndpoint {
    private OrderService orderService;

    @Inject
    public DemoEndpoint(OrderService orderService) {
        this.orderService = orderService;
    }

    @GET
    @Path("/orders")
    @AdminOnly
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getOrders() {
        // AUTHENTICATION + AUTHORIZATION => @AdminOnly

        // BUSINESS LOGIC
        try {
            List<OrderModel> orders = this.orderService.getOrders();
            return Response.ok(orders).build();
        } catch (Exception e) {
            // implement logging here
            return Response.ok("{ \"error\" : \"failed to process orders\" }").status(500).build();
        }
    }
}
