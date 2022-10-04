public class User {
    String login;
    String password;
    String email;
    int age;

    public User(String login, String password, String email, int age) {

        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

//    public String toString() {
//        String[] data = {"Login:", "Password:", "Email:", "Age:"};
//        Object[] data1 = {this.login, this.password, this.email, this.age};
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i] + " " + data1[i]);
//        }
//        return " ";
//    }
}
