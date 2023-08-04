public class User extends Account{

    public User(String name, String password, int age){
        this.name = name;
        this.password = password;
        this.age = age;
        this.accessLevel = 0;
    }
}
