package com.registry.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

    public Map<String, String> registry = new HashMap<>();

    public static void main(String[] args) {
        ServiceRegistry sr = new ServiceRegistry();
        sr.addService();
        System.out.println(sr.getService("usd"));
    }

    public void addService() {

        registry.put("xyz", "localhost");
        registry.put("usd", "heroku");
        System.out.println("Services added");

    }

    public String getService(String service) {

        return registry.get(service);

    }

}
