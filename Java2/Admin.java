
class Admin extends User{

    String StaffNo;

    void uploadResult(String course, float score) {
        System.out.println(course+ "" +score);
    }

    public static void main(String[] args) {
        Admin barka = new Admin();
        barka.uploadResult("cmp202", 70);
    }


}