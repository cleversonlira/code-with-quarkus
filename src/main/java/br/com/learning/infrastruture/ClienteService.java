package br.com.learning.infrastruture;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.com.learning.domain.Cliente;

@Path("/clientes") 
@RegisterRestClient //indica que esta interface poderá ser injetada
public interface ClienteService {

	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> obterClientes();
	
}
