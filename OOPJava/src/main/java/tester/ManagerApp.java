package tester;

public class ManagerApp {
    public static void main(String[] args) {


        Manager manager1 = new Manager();
        manager1.name = "Oghre";
        manager1.sayHello("Saykoji");

        VicePresident vp = new VicePresident();
        vp.name = "Joko";
        vp.sayHello("Saykoji");
    }
}
