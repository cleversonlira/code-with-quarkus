package br.com.learning.infrastruture;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.com.learning.domain.Conselho;

@Path("/advice") 
@RegisterRestClient //indica que esta interface poderá ser injetada
public interface ConselhoService {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public Conselho obterConselho();
	
}
