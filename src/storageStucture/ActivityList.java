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
}
