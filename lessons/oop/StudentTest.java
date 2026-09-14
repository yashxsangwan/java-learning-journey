package lessons.oop;

class Subject{
    private String subjectId;
    private String subjectName;
    private int maxMarks;
    private int marksObtained;

    public String getSubjectId() {
        return subjectId;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int getMarksObtained() {
        return marksObtained;
    }
    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }
    boolean isQualified() {
        return marksObtained > maxMarks * 40/100;
    }
    public String toString() {
        return "Subject Id: " + subjectId + "\nSubjectName: " + subjectName + "\nMax. Marks: " + maxMarks + "\nMarks Obtained: " + marksObtained;
    }
    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }
    public Subject(String subjectId, String subjectName, int maxMarks) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
    }
    public Subject(String subjectId, String subjectName, int maxMarks, int marksObtained) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }
   
}
class Student{
    private String rollNumber;
    private String name;
    private String department;
    private Subject[] subs;

    public String getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public Subject[] getSubjects() {
        return subs;
    }
    public void setSubs(Subject[] subs) {
        this.subs = subs;
    }

    public Student(String rollNum, String name, String department) {
        this.rollNumber = rollNum;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "Name: " + name + "\nRoll Number: " + rollNumber + "\nDepartment: " + department;
    }
    
}
public class StudentTest {
    public static void main(String[] args) {

        // Array of objects
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("sub101", "Data Structure", 100, 95);
        subs[1] = new Subject("sub102", "Java", 100, 90);
        subs[2] = new Subject("sub103", "Database Management", 100, 87);

        Student yash = new Student("0081", "yash", "BCA");
        yash.setSubs(subs);

        System.out.println(yash.toString());
        System.out.println();
        for(Subject x: subs) {
            System.out.println(x + "\n");
        }

    }
    
}

