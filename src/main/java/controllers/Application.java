package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Application extends Controller {

    @GET
    public static Result index() {
        return ok("hello, world");
    }
    
}
