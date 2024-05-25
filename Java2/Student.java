
class Student extends User{

    String matric_no = "BHU/22/04/05/0095";
    String admission_no = "IsaacOse";

    @Override
    String Register() {
        if (admission_no.equals("") || matric_no.equals("")){
            return "You can't complete the registering process at the moment";
        }
        else {
            return "You have registered for your courses";
        }
    }
    void registerCourses(String course) {
        System.out.println(course);
    }
    String checkResult() {
        if (admission_no.equals("") || matric_no.equals("")){
            return "Can't check your result";
        }
        else {
            return "You can check your result";
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Fidelis Osetohanme";
        student.password = "Osetohanme2007";
        student.registerCourses("CMP 202");
        System.out.println(student.checkResult());
    }
}