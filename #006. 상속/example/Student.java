public class Student extends People {
    public int StudentNo;

    public Student(String name, String ssn, int StudentNo) {
        super(name, ssn); //부모 생성자 호출
        this.studentNo = studentNo;
    }
}
