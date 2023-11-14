package org.example.solution;

import com.google.gson.Gson;
import org.example.user.User;
import org.example.service.Service;


import static org.example.user.User.createDefaultUser;

public class Task1 {

    public void run() throws Exception {
        Service service = new Service();
        User user = createDefaultUser();

        System.out.println("CREATE NEW USER:");
        System.out.println(service.createNewUser(new Gson().toJson(user)));
        System.out.println();
        System.out.println("UPDATE USER: ");
        System.out.println(service.updateUser(1, new Gson().toJson(user)));
        System.out.println();
        System.out.println("DELETE USER: ");
        System.out.println(service.deleteUser(user.getId()));
        System.out.println();
        System.out.println("GET ALL USER: ");
        System.out.println(service.getAllUsers());
        System.out.println();
        System.out.println("GET USER BY ID: ");
        System.out.println(service.getUserById(2));
        System.out.println();
        System.out.println("GET USER BY USERNAME: ");
        System.out.println(service.getUserByUsername("Bret"));
    }
}
