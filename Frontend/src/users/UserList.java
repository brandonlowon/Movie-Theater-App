package users;
import java.util.ArrayList;

public class UserList {
    ArrayList<User> users;

    public UserList(){
        users = new ArrayList<User>();
    }

    public UserList(ArrayList<User> userList){
        users = userList;
    }

    public User findUser(String email, String password){
        for (User tempUser:users){
            if(tempUser.getPersonalEmail().getEmailAddress().equals(email) && tempUser.getPassword().equals(password)){
                return tempUser;
            }
        }
        return null;
    }

    public void addUser(User newUser){
        users.add(newUser);
    }

    
}
