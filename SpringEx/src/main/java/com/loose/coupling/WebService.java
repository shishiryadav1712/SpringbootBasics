package com.loose.coupling;

public class WebService implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "User Details from web DB";
    }
    public String getUserDetailsFromWeb(){
        return "Data Fetched From web";
    }
}
