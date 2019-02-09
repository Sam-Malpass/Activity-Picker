/**
 * ActivityList
 * @author Team Jam
 */
package storageStucture;
import java.io.Serializable;
import java.util.ArrayList;
public class ActivityList implements Serializable {
    /**
     * serialVersionUID allows the class to implement serialised
     */
    public static final long serialVersionUID = 1L;
    /**
     * listID holds the ID of the list
     */
    private long listID;
    /**
     * listName holds the name of the list
     */
    private String listName;
    /**
     * activities holds a list of Activity objects
     */
    private ArrayList<Activity> activities;
    /**
     * Constructor with no arguments
     * <p>
     *     Sets up the object
     * </p>
     */
    public ActivityList() {
        listID = 1L;
        listName = null;
        activities = null;
    }
    /**
     * Constructor with arguments
     * <p>
     *     Sets up the object using passed values
     * </p>
     * @param ID is for the listID
     * @param name is for the listName
     */
    public ActivityList(long ID, String name) {
        listID = ID;
        listName = name;
        activities = new ArrayList<>();
    }
}
