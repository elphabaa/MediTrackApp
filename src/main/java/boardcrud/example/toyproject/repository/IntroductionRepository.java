package boardcrud.example.toyproject.repository;

import org.aspectj.apache.bcel.generic.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntroductionRepository extends
        JpaRepository<Instruction, Long> { }