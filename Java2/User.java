public class User {

    String name;
    String password;
    String login(){
        return "Logged In";
    }
    String logout(){
        return "Logged Out";
    }
    String Register() {
        if(name.equals("") || password.equals("")) {
            return "Can't be empty";
        }
        else {
            return "Success";
        }

    }
}
