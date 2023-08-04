import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AccountCollection {

    private ArrayList<Account> list;
    private Scanner sc;

    public AccountCollection() {
        list = new ArrayList<>();
    }

    public void add(Account acc){
        list.add(acc);
    }

    public Account get(int index){
        return list.get(index);
    }

    public int getSize(){
        return list.size();
    }

    public int login(String name, String pass){
        for(int i=0; i<list.size(); i++){
            if (Objects.equals(list.get(i).getName(), name) && Objects.equals(list.get(i).getPassword(), pass)){
                return i;
            }
        }
        return -1;
    }
}
