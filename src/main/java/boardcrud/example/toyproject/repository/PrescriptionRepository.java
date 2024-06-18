package boardcrud.example.toyproject.repository;
import boardcrud.example.toyproject.model.Prescription;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends
    JpaRepository<Prescription, Long> { }
