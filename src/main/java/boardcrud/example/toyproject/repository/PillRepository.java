package boardcrud.example.toyproject.repository;

import boardcrud.example.toyproject.model.Pill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PillRepository extends
        JpaRepository<Pill, Long> { }
