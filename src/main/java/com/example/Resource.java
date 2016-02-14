package com.example;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Service
@Path("/hello")
public class Resource {

    @GET
    public String sayHello(){
        return "HELLO";
    }
}
