/**
 * MainActivity
 * @author Team Jam
 */
package storageStucture;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainActivity extends Activity {
    /**
     * serialVersionUID allows the class to implement serialised
     */
    public static final long serialVersionUID = 1L;
    /**
     * subOptions holds a list of sub-options if they are needed
     */
    ArrayList<String> subOptions;
    /**
     * Constructor with no arguments
     * <p>
     *     Sets up the object
     * </p>
     */
    public MainActivity() {
        super();
        subOptions = null;
    }
    /**
     * Constructor with arguments
     * <p>
     *     Sets up the object using the passed values
     * </p>
     * @param ID is the activityID
     * @param name is the name for the activity
     * @param desc is the description for the activity
     * @param subs is the sub-list of activities
     */
    public MainActivity(long ID, String name, String desc, ArrayList<String> subs) {
        super(ID, name, desc);
        subOptions = subs;
    }
    /**
     * Function definition for getSubOptions()
     * <p>
     *     Return the subOptions
     * </p>
     * @return subOptions
     */
    public ArrayList<String> getSubOptions() {
        return subOptions;
    }
}
