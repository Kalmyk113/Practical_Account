public abstract class Account {

    protected String name;
    protected String password;
    protected int age;
    protected int accessLevel;

    protected String getName(){
        return name;
    }

    protected String getPassword(){
        return password;
    }

    protected int getAge(){
        return age;
    }

    protected int getAccessLevel(){
        return accessLevel;
    }

    protected void setName(){
        name = this.name;
    }

    protected void setPassword(){
        password = this.password;
    }

}
