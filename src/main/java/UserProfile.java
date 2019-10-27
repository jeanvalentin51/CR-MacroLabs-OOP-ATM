import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;

/**
 * @author valentin
 */

public class UserProfile {

    private ArrayList allUsers;
    private String userPassword = "";


    public UserProfile(){
        this.allUsers = new ArrayList(0);
    }

    public UserProfile(String password){
        // used for testing purposes
        this.allUsers = new ArrayList(0);
        this.userPassword = password;
        allUsers.add(userPassword);
    }

    public void setUserPassword (String password){
        this.allUsers = new ArrayList(0);
        this.userPassword = password;
        allUsers.add(userPassword);
    }

    public String getUserPassword() {
        return userPassword;
    }


}
