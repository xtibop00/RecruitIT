package AutomatedTest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculate")
public class Calculate {

       @GET
    @Path("/add/{a}/{b}")
    public String addStringParamGet(@PathParam("numOne") double numOne, @PathParam("numTwo") double numTwo) {
              return Double.toString(numTwo + numOne);
    }
       
    @POST
    @Path("/add/{numOne}/{numTwo}")
    public String addStringParamPost(@PathParam("numOne") double numOne, @PathParam("numTwo") double numTwo) {
        return addParam(numOne,numTwo);
    }

    public String addParam(double numOne, double numTwo) {
       return Double.toString(numTwo + numOne);
    }
}
