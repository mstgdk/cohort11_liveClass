package hibernate.manyToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branch;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id")
    )
    private List<Patient>patients = new ArrayList<>();

    public Doctor(String branch) {
        this.branch = branch;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", branch='" + branch + '\'' +
                //", patients=" + patients +
                '}';
    }
}
