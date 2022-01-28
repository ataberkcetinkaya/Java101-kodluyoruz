public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void getStudentInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Number: " + this.stuNo);
    }

    void addBulkExamNote(int note1, int note2, int note3) { //addBulkExamNote ile ogrencilerin notlarini giriyor olacagim.
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    void printNote() {
        System.out.println("Ders: " + course1.name + " Not: " + course1.note);
        System.out.println("Ders: " + course2.name + " Not: " + course2.note);
        System.out.println("Ders: " + course3.name + " Not: " + course3.note);
    }

    void calcAverage() {
        System.out.println("Ortalama: " + (course1.note + course2.note + course3.note) / 3);
    }

    void isPass() {
        this.average = (course1.note + course2.note + course3.note) / 3;
        if (this.average > 70) {
            System.out.println("Successful");
            this.isPass = true;
        }
        else {
            System.out.println("Failed");
            this.isPass = false;
        }
    }
}
