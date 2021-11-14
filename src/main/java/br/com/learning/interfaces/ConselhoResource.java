package br.com.learning.interfaces;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.learning.domain.Cliente;
import br.com.learning.infrastruture.ClienteService;

@Path("/cliente")
public class ConselhoResource {

	@Inject 
	@RestClient
	ClienteService service;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> hello() {
        return service.obterClientes();
    }
}