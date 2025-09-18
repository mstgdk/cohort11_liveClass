package hibernate.oneToOne_bilateral;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student02 {
    @Id
    private Long id;

    @Column(name = "stu_number")
    private Integer number;

    @Column(name = "stu_name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)//REMOVE, PERSIST
    @JoinColumn(name = "computer_id")
    private Computer02 computer;

    public Student02(Long id, Integer number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public Student02() {
    }

    @Override
    public String toString() {
        return "Student02{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", computer=" + computer +
                '}';
    }
}
