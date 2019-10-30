import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

/**
 * @author valentin
 */

public class UserProfile {

    private String userPassword = "";
    private String userName = "";
    private String userID = "";


    public UserProfile(){
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String password) {


        this.userPassword = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }


    //    public UserProfile(String password){
//        // used for testing purposes
//        this.allUsers = new ArrayList(0);
//        this.userPassword = password;
//        allUsers.add(userPassword);
//    }


}
