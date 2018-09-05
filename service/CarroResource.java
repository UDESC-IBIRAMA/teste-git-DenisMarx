/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dehh.com.br.desafio2.Carro;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Denis
 */
@Path("generic")
public class CarroResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CarroResource
     */
    public CarroResource() {
    }

    /**
     * Retrieves representation of an instance of service.CarroResource
     * @return an instance of dehh.com.br.desafio2.Carro
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Carro getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CarroResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Carro content) {
    }
}
