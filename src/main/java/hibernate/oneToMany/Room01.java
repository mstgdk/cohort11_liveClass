package hibernate.oneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    public Room01(String color) {
        this.color = color;
    }

    public Room01() {
    }

    @Override
    public String toString() {
        return "Room01{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
