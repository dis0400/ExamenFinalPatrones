package Ej2Proxy;

public class Client {
    public static void main(String[] args){
        Proxy proxy = new Proxy();

        User u1 = new User("mariel23", 23, "m23");
        User u2 = new User("botsito09", 21, "l09");

        proxy.addUser(u1);
        proxy.addUser(u2);

        proxy.userLogin(u1, "mariel23", "m23");
        proxy.userLogin(u2, "botsito09", "m23");
        proxy.userLogin(u2, "botsito09", "109");

        proxy.atenderUsuarios();
    }
}
