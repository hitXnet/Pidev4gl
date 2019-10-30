package PiMission.Service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import PiMission.Service.utils.AbstractService;
import PiMission.entites.Notefrais;

@Stateless
@LocalBean
public class NotefraisService extends AbstractService<Notefrais> implements NotefraisServiceRemote {



}
