package br.com.learning.interfaces;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.learning.domain.Conselho;
import br.com.learning.infrastruture.ConselhoService;

@Path("/conselho")
public class ConselhoResource {

	@Inject 
	@RestClient
	ConselhoService service;
	
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Conselho hello() {
        return service.obterConselho();
    }
}