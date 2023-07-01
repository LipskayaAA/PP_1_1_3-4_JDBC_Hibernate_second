package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();
        usi.createUsersTable();
        usi.saveUser("vv", "rr", (byte) 38);
        usi.saveUser("nn", "tt", (byte) 35);
        usi.saveUser("mm", "yy", (byte) 41);
        usi.saveUser("kk", "uu", (byte) 29);
        usi.removeUserById(4);
        System.out.println(usi.getAllUsers());
        usi.cleanUsersTable();
        usi.dropUsersTable();

    }
}
