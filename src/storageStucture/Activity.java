/**
 * Activity
 * @author Team Jam
 */
package storageStucture;
import java.io.Serializable;
public abstract class Activity implements Serializable {
    /**
     * activityID holds the ID of the activity
     */
    private long activityID;
    /**
     * activityName holds the name of the activity
     */
    private String activityName;
    /**
     * activityDescription holds a description of the activity
     */
    private String activityDescription;
    /**
     * Function definition for getActivityID()
     * <P>
     *     Gets the activityID for the activity
     * </P>
     * @return activityID
     */
    public long getActivityID() {
        return activityID;
    }
    /**
     * Function definition for getActivityName()
     * <P>
     *     Returns the activityName
     * </P>
     * @return activityName
     */
    public String getActivityName() {
        return activityName;
    }
    /**
     * Function definition for getActivityDescription()
     * <P>
     *     Returns the activityDescription
     * </P>
     * @return activityDescription
     */
    public String getActivityDescription() {
        return activityDescription;
    }
}
