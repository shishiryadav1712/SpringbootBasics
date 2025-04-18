package com.loose.coupling;

public class UserManager {

    private UserDataProvider dataProvider;
    private UserDataProvider webData;
    public UserManager(UserDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }



        public String getUserInfo(){
            return dataProvider.getUserDetails() ;
        }

        public String getUserWebInfo(){
        return dataProvider.getUserDetailsFromWeb();
        }

}
