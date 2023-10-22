package Project1;

public class Menu {
    String name;
    String exp;

    public Menu(String name, String exp){
        this.name = name;
        this.exp = exp;
    }

    public void printing(String name, String exp){
        System.out.printf("%-17s | %s\n", name, exp);
    }
}
