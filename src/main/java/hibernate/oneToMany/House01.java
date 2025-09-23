package hibernate.oneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class House01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer area;

    @OneToMany (fetch = FetchType.EAGER)//LAZY
    @JoinColumn(name = "house_id")
    private List<Room01> rooms = new ArrayList<>();

    public House01(Integer area) {
        this.area = area;
    }

    public House01() {
    }

    @Override
    public String toString() {
        return "House01{" +
                "id=" + id +
                ", area=" + area +
                //", rooms=" + rooms +
                '}';
    }
}
