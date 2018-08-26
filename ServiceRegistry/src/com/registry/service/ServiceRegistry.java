package com.registry.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.HashMap;
import java.util.Map;

@Path("/UserService")

public class ServiceRegistry {

    public Map<String, String> registry = new HashMap<>();

    public static void main(String[] args) {
        ServiceRegistry sr = new ServiceRegistry();
        sr.addService();
        System.out.println("The location of usd service : " + sr.getService("usd"));
        System.out.println("----------------------------------------------");
        System.out.println("Removing service xyz is " + sr.removeService("xyz"));
        System.out.println("----------------------------------------------");
        System.out.println("Calling xyz service again");
        System.out.println("The location of xyz : " + sr.getService("xyz"));
        System.out.println("----------------------------------------------");
        System.out.println("Removing service xyz again is " + sr.removeService("xyz"));

    }

    public void addService() {

        registry.put("xyz", "localhost");
        registry.put("usd", "heroku");
        System.out.println("Services added");

    }

    @GET
    @Path("/users/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
    public String getService(@PathParam("id") String id) {

        registry.put("xyz", "localhost");
        registry.put("usd", "heroku");

        String content = new String();

        return registry.get(id);

//        return registry.get(service);
//        System.out.println(content.toString());
//        return content.toString();
    }

    public boolean removeService(String service) {

        if(registry.containsKey(service)) {
            try {
                registry.remove(service);
                return true;
            } catch (NullPointerException  e) {
                return false;
            }
        } else {
            System.out.println("No services matching " + service);
            return false;
        }

    }

}
