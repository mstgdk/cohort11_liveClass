package lambda_stream.streams;

public class University {
    private String university;
    private String department;
    private int numOfStudents;
    private int gpa;

    public University(String university, String department, int numOfStudents, int gpa) {
        this.university = university;
        this.department = department;
        this.numOfStudents = numOfStudents;
        this.gpa = gpa;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "University{" +
                "university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", gpa=" + gpa +
                '}';
    }
}
