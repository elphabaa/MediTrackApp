package boardcrud.example.toyproject.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid", nullable = false, unique = true)
    private Long uid;
    @Column(name = "userId", nullable = false, unique = true)
    private String userId;
    @Column(name= "userName", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prescription> prescriptions;
}
