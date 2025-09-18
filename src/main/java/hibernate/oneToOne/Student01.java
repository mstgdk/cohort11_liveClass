package hibernate.oneToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "student_01")
public class Student01 {
    @Id
    private Long id;

    @Column(name = "stu_number")
    private Integer number;

    @Column(name = "stu_name")
    private String name;

    @OneToOne
    @JoinColumn(name = "computer_id")
    private Computer01 computer;


    public Student01(Long id, Integer number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;

    }

    public Student01() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer01 getComputer() {
        return computer;
    }

    public void setComputer(Computer01 computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", computer=" + computer +
                '}';
    }
}
