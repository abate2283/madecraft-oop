package exercises;

import com.sun.net.httpserver.HttpServer;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.List;

class MSContext{
    private String id;

    public String getId() {
        return id;
    }

    public RoutingContext getRoutingContext() {
        return routingContext;
    }

    private final RoutingContext routingContext;
    public MSContext(RoutingContext routingContext, String id){
        this.routingContext = routingContext;
        this.id = id;

    }
    public void checkMainMethod(RoutingContext routingContext){
         List<String> firstNetwork = new ArrayList<>();
         firstNetwork.add("active");
         firstNetwork.add("inactive");
         for(String network: firstNetwork){
             if(firstNetwork.equals("active")){
                 System.out.println("Connected to: " + getId());
             }
         }


    }

}
public class InstanceVariableDemo implements RoutingContext {

    public static void main(String[] args) {


    }

    @Override
    public HttpServer request() {
        if(request().equals("nothing")){
            System.out.println("That's true!");
        }
        return request();
    }
}
