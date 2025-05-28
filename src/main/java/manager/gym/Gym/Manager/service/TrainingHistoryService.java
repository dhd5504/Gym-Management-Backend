package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.TrainingHistory;
import manager.gym.Gym.Manager.repository.TrainingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingHistoryService {
    private final TrainingHistoryRepository trainingHistoryRepository;

    @Autowired
    public TrainingHistoryService(TrainingHistoryRepository trainingHistoryRepository) {
        this.trainingHistoryRepository = trainingHistoryRepository;
    }

    public List<TrainingHistory> getAllTrainingHistories() {
        return trainingHistoryRepository.findAll();
    }

    public TrainingHistory getTrainingHistoryById(Integer id) {
        Optional<TrainingHistory> optionalTrainingHistory = trainingHistoryRepository.findById(id);
        return optionalTrainingHistory.orElse(null);
    }

    public TrainingHistory createTrainingHistory(TrainingHistory trainingHistory) {
        return trainingHistoryRepository.save(trainingHistory);
    }

    public TrainingHistory updateTrainingHistory(Integer id, TrainingHistory trainingHistory) {
        trainingHistory.setId(id);
        return trainingHistoryRepository.save(trainingHistory);
    }

    public void deleteTrainingHistory(Integer id) {
        trainingHistoryRepository.deleteById(id);
    }
}
