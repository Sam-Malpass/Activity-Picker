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
    /**
     * Function definition for getListID()
     * <p>
     *     Return the listID
     * </p>
     * @return listID
     */
    public long getListID() {
        return listID;
    }
    /**
     * Function definition for getListName()
     * <P>
     *     Return the listName
     * </P>
     * @return listName
     */
    public String getListName() {
        return listName;
    }
    /**
     * Function definition for getActivities()
     * <P>
     *     Returns the activities
     * </P>
     * @return activities
     */
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public ArrayList<String> listActivities() {
        ArrayList<String> tmp = new ArrayList<>();
        for (Activity A : activities) {
            tmp.add(A.getActivityName());
        }
        return tmp;
    }
}
