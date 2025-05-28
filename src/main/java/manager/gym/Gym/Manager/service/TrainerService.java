package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.staff.Trainer;
import manager.gym.Gym.Manager.repository.GymStaffRepository;
import manager.gym.Gym.Manager.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService implements ITrainerService {
    @Autowired
    private TrainerRepository trainerRepository;
    @Override
    public List<Trainer> getAll() {
        return trainerRepository.findAll();
    }

    @Override
    public List<Trainer> getById(int id) {
        return trainerRepository.findById(id);
    }

    @Override
    public String save(Trainer trainer) {
        Trainer saveTrainer = trainerRepository.save(trainer);
        return saveTrainer.getName();
    }

    @Override
    public int updateByID(int id, Trainer trainer) {
        Trainer foundTrainer = getById(id).get(0);
        if (foundTrainer != null){
            foundTrainer.setEmployee(trainer);
            Trainer updatedTrainer = trainerRepository.save(foundTrainer);
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteByID(int id) {
        trainerRepository.deleteById(id);
        return 1;
    }
}
