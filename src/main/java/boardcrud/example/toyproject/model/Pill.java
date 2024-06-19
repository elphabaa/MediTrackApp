package boardcrud.example.toyproject.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Pill")
public class Pill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pillName", nullable = false)
    private String pillName;

    @OneToMany(mappedBy = "pill", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Introduction> introduction;
}
