import acm.graphics.GLabel;
import acm.program.ConsoleProgram;

public class AccountMain extends ConsoleProgram {

    private AccountCanvas canvas;

    String name;
    String password;
    int age;
    int choice;
    int accnum;
    private AccountCollection accounts;
    private Admin admin;
    private Owner owner;
    private User user;

    public void run(){

        accounts = new AccountCollection();

        do {
            canvas.reset();
            println("------------------------------------------------------");
            println("Choose an Option:");
            println("[1] Create Admin Account");
            println("[2] Create Owner Account");
            println("[3] Create User Account");
            println("[4] Login");
            println("[5] Display Accounts Account");
            println("[6] Exit");
            println("------------------------------------------------------");

            choice = readInt("Choice: ");

            switch(choice) {
                case 1: //Create Admin Account
                    name = readLine("Enter Name: ");
                    password = readLine("Enter Password: ");
                    age = readInt("Enter Age: ");
                    admin = new Admin(name, password, age);
                    accounts.add(admin);
                    canvas.clear();
                    canvas.displayAccount(admin.name, admin.getAge(), admin.getAccessLevel());
                    break;
                case 2: //Create Owner Account
                    name = readLine("Enter Name: ");
                    password = readLine("Enter Password: ");
                    age = readInt("Enter Age: ");
                    owner = new Owner(name, password, age);
                    accounts.add(owner);
                    canvas.clear();
                    canvas.displayAccount(owner.name, owner.getAge(), owner.getAccessLevel());
                    break;
                case 3: //Create User Account
                    name = readLine("Enter Name: ");
                    password = readLine("Enter Password: ");
                    age = readInt("Enter Age: ");
                    user = new User(name, password, age);
                    accounts.add(user);
                    canvas.clear();
                    canvas.displayAccount(user.name, user.getAge(), user.getAccessLevel());
                    break;
                case 4: //Login
                    name = readLine("Enter Name: ");
                    password = readLine("Enter Password: ");
                    accnum = accounts.login(name, password);
                    if(accnum>=0){
                        canvas.clear();
                        canvas.displayAccount(accounts.get(accnum).getName(), accounts.get(accnum).getAge(), accounts.get(accnum).getAccessLevel());
                    } else {
                        canvas.clear();
                        canvas.displayAccount(accnum);
                    }

                    break;
                case 5: //Display
                    for(int i=0; i<accounts.getSize(); i++){
                        println("------------------------------------------------------");
                        println("Account no. " + (i+1));
                        println("Name: " + accounts.get(i).getName());
                        println("Age: " + accounts.get(i).getAge());
                        switch (accounts.get(i).getAccessLevel()){
                            case 0:
                                println("\tUser Access");
                                break;
                            case 1:
                                println("\tOwner Access");
                                break;
                            case 2:
                                println("\tAdmin Access");
                                break;
                            default:
                                println("\tAccess Unknown");
                                break;
                        }
                        println("------------------------------------------------------");
                    }
                    break;
                case 6: //Exit
                    canvas.clear();
                    canvas.endProgram();
                    readLine();
                    exit();
                default:
                    break;
            }
        } while (choice != 6);
    }

    public void init(){
        canvas = new AccountCanvas(); // Responsible for displaying the cards
        add(canvas);
        setTitle("Accounts Program");
        setSize(1280, 720);
    }

    public static void main(String[] args){
        (new AccountMain()).start(args);
    }
}


