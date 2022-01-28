public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("EnginDemirog", "555", "SoftwareDev");
        Teacher teacher2 = new Teacher("SadikTuran", "444", "PythonDev");

        System.out.println("====================================");

        //                          Dersin adı,      Dersin Kodu,  "Dersin bölümü"
        Course software = new Course("Software-Java", "Java101", "SoftwareDev"); //yukaridaki satirda tanimladigimiz ogretmeni buraya atadik.
        software.addTeacher(teacher1);

        Course software2 = new Course("Software-Python", "Python101", "PythonDev");
        Course software3 = new Course("Software-React", "ReactJS", "Frontend");

        Student student1 = new Student("Berk", "632", "Software Developer", software, software2, software3);
        Student student2 = new Student("Esra", "321", "Software Developer", software, software2, software3);

        System.out.println("======================");
        student1.getStudentInfo();
        student1.addBulkExamNote(80, 90, 98);
        student1.printNote();
        student1.calcAverage();;
        student1.isPass();

        System.out.println("======================");

        student2.getStudentInfo();
        student2.addBulkExamNote(54, 92, 94);
        student2.printNote();
        student2.calcAverage();;
        student2.isPass();

        System.out.println("======================");
    }}
