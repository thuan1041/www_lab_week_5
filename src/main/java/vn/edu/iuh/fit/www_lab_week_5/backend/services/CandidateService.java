package vn.edu.iuh.fit.www_lab_week_5.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_week_5.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab_week_5.backend.repositories.CandidateRepository;
import java.util.Optional;
import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }
    public boolean save(Candidate candidate){
        try {
            candidateRepository.save(candidate);
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
//    find id
    public Optional<Candidate> findById(long id){
        return candidateRepository.findById(id);
    }
    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }

    public boolean exists(long id){
        return candidateRepository.findById(id).isPresent();
    }
    public boolean exists(Candidate candidate){
        return !exists(candidate.getId());
    }
    public Optional<Boolean> update(Candidate candidate){
        if(exists(candidate)) {
            return Optional.empty();
        }
        try {
            candidateRepository.save(candidate);
            return Optional.of(true);
        } catch (Exception e){
            e.getMessage();
        }
        return Optional.of(false);
    }
    public Optional<Boolean> detele(Candidate candidate){
        if(exists(candidate))
            return Optional.empty();
        try {
            candidateRepository.delete(candidate);
            return Optional.of(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.of(false);
    }

}
