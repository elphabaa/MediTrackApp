package boardcrud.example.toyproject.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "introduction")
public class Introduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pill_id")
    private Pill pill;

    private String dosage;
    private String instruction;
}
