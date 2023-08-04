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
    public String getHello() {
        System.out.println("\n#=>GreetingResource.getHello");
        System.out.println("#=>echo!\n");
        return "echo!";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response postHello(String request) {
        System.out.println("\n#=>GreetingResource.portHello");
        System.out.println("#=>Request: \n");
        System.out.println(request);
        System.out.println("\n********************************\n\n");

        return Response.status(Response.Status.OK).entity(request).build();
    }
}
