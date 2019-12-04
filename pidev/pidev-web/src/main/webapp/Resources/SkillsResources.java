package WebServices.Resources;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import CompetenceEntities.Skills;
import CompetenceServices.SkillsServices;




@Path("Skill")
@RequestScoped
public class SkillsResources {

	
	@EJB	
	SkillsServices skillservices;
	
	
	private List<Skills> skillslist;

	@GET
	@Path("skills")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Skills> getAllSkills()
	{
		
	     	skillslist = skillservices.getAllSkills();		 
	     	return  skillslist;
	}
	
	/*	@DELETE
	@Path("{delete}")
	public Response deleteskill(@PathParam(value="delete")String delete)
	{
		for (Skills s:skillslist)
		{
			if (s.getTechnologie().equals(delete))  
			{
				skillslist.remove(s);
				SkillsServices.DeleteFormation(f.getId_Formation());
				return Response.status(Status.OK).entity("Competence a ete supprime").build();
			}
		}*/
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("ajout")
		public String addskill(Skills skills) 
		{
			
			//  skillslist.add(skills);
			 skillservices.ajouterSkill(skills);
			System.out.println(skillslist);
			return ("ajoutee");
			
			
		}
		
		
		/*@DELETE
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


}*/
		@DELETE
@Path("{Nom}")
public Response deleteSkill(@PathParam(value="Nom") String Nom) {
	skillslist = skillservices.getAllSkills();	
	for (Skills e : skillslist) {
		
		if (e.getNom().equals(Nom)) {
			skillservices.supprimerSkill(e.getIdskill());
			
		
			return Response.status(Status.GONE).entity("true").build();
		}
		
	}
	
	return 	Response.status(Status.NOT_FOUND).entity("false").build();


}


	}


	


