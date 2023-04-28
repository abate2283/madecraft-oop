package exercises;

import com.sun.net.httpserver.HttpServer;

public interface RoutingContext {
    HttpServer request();
}
