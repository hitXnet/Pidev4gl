package PiMission.Service.utils;

import java.util.List;

import javax.ejb.Remote;

import PiMission.entites.IEntity;
@Remote
public interface IService<T extends IEntity> {
    void ajouterObject(T object);
    void modifierObject(T object);
    void supprimerObject(T Object ,int Id);
    List<T> fetchAll(Class<T> carriedInstance );

    
}
