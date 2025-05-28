package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Facility;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IService<T> {

    List<T> getAll();
    List<T> getById(@PathVariable int id);
    String save(T t);

    int updateByID(int id, T t);
    int deleteByID(int id);
}
