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

import Services.*;
import Services.userService;
import Entities.*;

@Path("Reunion")
@RequestScoped
public class ReunionResource {
	
@EJB
EvaluationSimpleService EvaluationSimpleService;
@EJB
ReunionService ReunionService;
@EJB
userService userService;

private List<Reunion> Reunions;
private List<EvaluationSimple> EvaluationSimples;
private List<user> users;


@GET
@Path("Reunions")
@Produces(MediaType.APPLICATION_JSON)
public List<Reunion> getAllReunions()
{
	
    
	//EvaluationSimples=EvaluationSimpleService.getAllEvaluationSimples();
	Reunions=ReunionService.getAllReunion();
     	return  Reunions;
}





@DELETE
@Path("{verdict}")
public Response deleteEvaluation(@PathParam(value="verdict") String verdict) {
	Reunions = ReunionService.getAllReunion();
	for (Reunion e : Reunions) {
		if (e.getVerdict().equals(verdict)) {
			
			ReunionService.deleteReunionById(e.getId());
		//	Taskservices.deleteTaskById(id);
		//	evaluationService.deleteEvaluationById(id);
			//evaluations.deleteEvaluationById(id);
			return Response.status(Status.GONE).entity("true").build();
		}
	}
	return 	Response.status(Status.NOT_FOUND).entity("false").build();


}





@POST
@Path("AjoutReunion")
@Consumes(MediaType.APPLICATION_JSON)
public String addtask(Reunion R) {
	//t.setId_employe(2);
	ReunionService.ajouterReunion(R);
	
	return ("AJOUTEE") ;
}
}


