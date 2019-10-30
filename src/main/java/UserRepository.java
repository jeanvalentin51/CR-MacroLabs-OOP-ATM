import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashMap;
import java.util.Map;

/**
 * @author valentin
 *
 */

public class UserRepository {

//    private Map<String,String> userIDAndPwd = new HashMap<>();
//    private Map<String ,String > userIDAndName = new HashMap<>();

    private Map<String ,UserProfile> userMap = new HashMap<>();


    public UserRepository() {
    }

/*
    public void addUser(String userName, String userPassword){

        if (userExists(userID)) {
            System.out.println("User already exists. Please select another user");
        } else {
            userIDAndPwd.put(userID,userPassword);
        }
    }

    private boolean userExists (String userID){

        if (userIDAndPwd.containsKey(userID)) return true;

        return false;
    }

    public boolean isUserListEmpty (){
        boolean isListEmpty = true;

        isListEmpty = userIDAndPwd.isEmpty();
        return  isListEmpty;
    }*/
}
