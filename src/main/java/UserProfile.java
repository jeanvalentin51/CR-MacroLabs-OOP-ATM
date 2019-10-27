/**
 * @author valentin
 */

public class UserProfile {
    private String userPassword = "";

    public UserProfile(){

    }

    public UserProfile(String password){
        this.userPassword = password;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


}
