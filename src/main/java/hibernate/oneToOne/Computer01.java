package hibernate.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Computer01 {
    @Id
    private Long id;

    private String brand;

    private String model;

    public Computer01(Long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Computer01() {
    }

    @Override
    public String toString() {
        return "Computer01{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
