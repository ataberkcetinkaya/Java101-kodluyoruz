public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher; //null teacher

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0; //varsayilan dersnotu 0
        this.teacher = teacher; //constructor'dan yine yukaridaki bilgilere esitlemek icin
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        }
        else {
            System.out.println("Course and prefix not match.");
        }
    }

    void printTeacherInfo() {
        this.teacher.getTeacherInfo(); //this.teacher diyerek Teacher class'ındaki getTeacherInfo()'ya ulaştık ve Main'de new
        //yaptigimda getTeacherInfo'nun bilgilerini basacak.
    }}