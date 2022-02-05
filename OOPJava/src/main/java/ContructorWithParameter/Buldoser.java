package ContructorWithParameter;

public class Buldoser {
    public String username;
    public String password;

    public Buldoser(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class DemoConstructor{
    public static void main(String[] args) {
        Buldoser Oghre = new Buldoser ("Dota", "Buldoser");
        System.out.println("Username: " + Oghre.username);
        System.out.println("Password: " + Oghre.password);
    }
}


