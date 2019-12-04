package ress;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import PiMission.Service.EmployeService;
import PiMission.Service.MissionService;
import PiMission.Service.NoteFraisEmployeService;
import PiMission.entites.Employe;
import PiMission.entites.Frais;
import PiMission.entites.Fraisprevu;
import PiMission.entites.Mission;
import PiMission.entites.Nature;
import PiMission.entites.NotefraisEmploye;
import PiMission.managedbeans.FraisEmploye;

@Path("consulter")
@RequestScoped
public class ressource {
	@EJB
	NoteFraisEmployeService e;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("frais")
	public Response getListfrais() {
		return Response.ok(e.fetchAll()).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("addfrais")
	public Response addfraisemploye(final NotefraisEmploye input) {
		e.ajouterObject(input);
		return Response.created(null).build();
	}

	@DELETE
	@Path("/deleteFrais/{id}")
	public Response deleteFrais(@PathParam(value = "id") int idfrais) {
		if (e.fetchAll().stream().anyMatch(obj -> obj.getIdfraisem() == idfrais)) {
			e.supprimerObject(idfrais);
			return Response.status(Status.GONE).entity("true").build();
		}
		return Response.status(Status.NOT_FOUND).entity("false").build();

	}

}
