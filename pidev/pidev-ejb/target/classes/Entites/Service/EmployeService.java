package PiMission.Service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import PiMission.Service.utils.AbstractService;
import PiMission.entites.Employe;
@Stateless
@LocalBean
public class EmployeService extends AbstractService<Employe> implements IEmployeService{

}
