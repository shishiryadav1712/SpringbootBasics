package com.loose.coupling;

import java.sql.SQLOutput;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider provider = new UserDatabaseProvider();
        UserManager manager = new UserManager(provider);
        System.out.println(manager.getUserInfo());
        System.out.println(manager.getUserWebInfo());


        UserDataProvider webProvider = new WebService();
        UserManager webManager = new UserManager(webProvider);
        System.out.println(webManager.getUserInfo());
        System.out.println(webManager.getUserWebInfo());
    }
}
