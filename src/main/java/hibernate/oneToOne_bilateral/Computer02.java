package hibernate.oneToOne_bilateral;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Computer02 {
    @Id
    private Long id;

    private String brand;

    private String model;

    @OneToOne(mappedBy = "computer")
    private Student02 student;

    public Computer02(Long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Computer02() {
    }

    @Override
    public String toString() {
        return "Computer02{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", student=" + student.getName() +
                '}';
    }
}
