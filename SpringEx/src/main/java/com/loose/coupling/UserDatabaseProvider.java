package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        return "User Details from DB";
    }
    public String getUserDetailsFromWeb(){
        return "Data Fetched From databaseeeeeeeeeeee";
    }
}
