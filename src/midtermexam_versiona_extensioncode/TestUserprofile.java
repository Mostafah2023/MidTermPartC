package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author Mostafa Hussain
 */
public class TestUserprofile {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        UserProfile user = new UserProfile("","");
        
        System.out.println("Enter your name: ");
        user.setUserID(scan.nextLine());
        System.out.println("Enter your favourite genre (Comedy, Drama, Action, Mystery)");
        user.setGenre(scan.nextLine());
        System.out.println("Your UserProfile was set!");
        System.out.println("Your name is " + user.getUserID()+
                " Your favourite genre is " + user.getGenre());
    }
    
}
