package com.registry.service;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.Map;

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

    public String getService(String service) {

        return registry.get(service);

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
