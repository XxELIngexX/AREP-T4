package edu.eci.arep;
import edu.eci.arep.controllers.*;
//public class Main {
//    public static void main(String[] args) {
//        HttpServer.start(new String[]{"edu.eci.arep.controllers.HelloController", "edu.eci.arep.controllers.GreetingController","edu.eci.arep.controllers.ProductController"});
//        //HttpServer.start(args);
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Servidor Iniciado");

        String port = System.getenv("PORT");

        if (port == null) {
            port = "8082";
        }

        // Configurar el servidor en ese puerto
        HttpServer.setPort(Integer.parseInt(port));
        System.out.println(port);


        HttpServer.start(new String[]{"edu.eci.arep.controllers.HelloController", "edu.eci.arep.controllers.GreetingController","edu.eci.arep.controllers.ProductController"});
        //HttpServer.start(args);

    }
}
