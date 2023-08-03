package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.annotations.Param;

@Path("/echo")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "echo!";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(String request) {
        return Response.status(Response.Status.OK).entity(request).build();
    }
}
