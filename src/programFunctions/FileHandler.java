/**
 * FileHandler
 * @author Team Jame
 */
package programFunctions;
import storageStucture.ActivityList;
import java.io.*;
public class FileHandler {
    /**
     * Constructor with no arguments
     */
    FileHandler(){
    }
    /**
     * Function definition for loadUserProfile()
     * <p>
     * Loads the selected file and returns the object in the file
     * <p>
     * @param S is the name of the file
     * @return the List
     */
    public ActivityList loadList(String S) {
        /*Open a file*/
        File file = new File("List/" + S + ".ser");
        /*Create a UserProfile*/
        ActivityList List = new ActivityList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            /*Attempt to write file to List*/
            List = (ActivityList) ois.readObject();
            /*Exception handling*/
        } catch (Exception ex) {
            /*Print stack trace*/
            ex.printStackTrace();
        }
        /*Return List*/
        return List;
    }
    /**
     * Function definition for saveUserProfile()
     * <p>
     * Write the UserProfile P to a file
     * <p>
     * @param P is the UserProfile to be saved
     */
    public void saveList(ActivityList P) {
        /*Opens a file*/
        File file = new File("List/" + P.getListName() + ".ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            /*Write object to file*/
            oos.writeObject(P);
            /*Exception handling*/
        } catch (Exception ex) {
            /*Print stack trace*/
            ex.printStackTrace();
        }
    }
    /**
     * Function definition for deleteUserProfile()
     * <p>
     * Opens a file of a given name, then deletes the file
     * <p>
     * @param U is the name of the file to delete
     */
    public void deleteList(String U) {
        /*Opens a file*/
        File file = new File("List/" + U + ".ser");
        /*Delete the file*/
        file.delete();
        /*Return*/
    }
}
