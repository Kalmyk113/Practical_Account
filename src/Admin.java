public class Admin extends Account{

    public Admin(String name, String password, int age){
        this.name = name;
        this.password = password;
        this.age = age;
        this.accessLevel = 2;
    }

}
