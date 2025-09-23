package hibernate.oneToMany_bilateral;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class House02 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer area;

    @OneToMany(mappedBy = "house02", cascade = CascadeType.ALL)
    private List<Room02>rooms = new ArrayList<>();

    public House02(Integer area) {
        this.area = area;
    }

    public House02() {
    }

    @Override
    public String toString() {
        return "House02{" +
                "id=" + id +
                ", area=" + area +
                ", rooms=" + rooms +
                '}';
    }
}
