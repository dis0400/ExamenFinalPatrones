package Ej2Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor {
    private List<User> listOfUsers;

    public Servidor2() {
        listOfUsers = new ArrayList<>();
    }

    @Override
    public void userLogin(User user, String username, String pwd) {
        listOfUsers.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (User user:listOfUsers) {
            System.out.println("El servidor 2 esta atendiendo a usuario de id " + user.getId());
            user.showInfo();
        }
    }
    
}
