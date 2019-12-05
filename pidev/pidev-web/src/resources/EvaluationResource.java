package PIDEV.resources;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Services.EvaluationSimpleService;
import Services.userService;
import Entities.*;

@Path("Evaluation")
@RequestScoped
public class EvaluationResource {
	
@EJB
EvaluationSimpleService EvaluationSimpleService;
@EJB
userService userService;

private List<EvaluationSimple> EvaluationSimples;
private List<user> users;


@GET
@Path("EvaluationSimples")
@Produces(MediaType.APPLICATION_JSON)
public List<EvaluationSimple> getAllEvaluationSimples()
{
	
    
	EvaluationSimples=EvaluationSimpleService.getAllEvaluationSimples();
     	return  EvaluationSimples;
}





@DELETE
@Path("{commentaire}")
public Response deleteEvaluation(@PathParam(value="commentaire") String commentaire) {
	EvaluationSimples = EvaluationSimpleService.getAllEvaluationSimples();
	for (EvaluationSimple e : EvaluationSimples) {
		if (e.getCommentaire().equals(commentaire)) {
			EvaluationSimpleService.deleteEvaluationSimpleById(e.getIdevaluation());
		
			return Response.status(Status.GONE).entity("true").build();
		}
	}
	return 	Response.status(Status.NOT_FOUND).entity("false").build();


}





@POST
@Path("ajout")
@Consumes(MediaType.APPLICATION_JSON)
public String addtask(EvaluationSimple t) {
	t.setId_employe(2);
	EvaluationSimpleService.ajouterEvaluationSimple(t);
	return ("AJOUTEE") ;
}
}


