/**
 * Main
 * @author Team Jam
 */
package programFunctions;
import graphicalUserInterface.Controllers.Controller;
import graphicalUserInterface.GUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import storageStucture.ActivityList;
import storageStucture.MainActivity;

public class Main extends Application {
    /**
     * fileHandler holds the FileHandler ojbect
     */
    private static FileHandler fileHandler = new FileHandler();
    /**
     * generator holds the RandomGenerator
     */
    private static RandomGenerator generator = new RandomGenerator();
    private static GUI gui = new GUI();
    private static ActivityList currentList = null;
    /**
     * Function definition for start()
     * <p>
     * Creates all the nodes for the mainStage and then shows the mainStage
     * <p>
     * @param S is a Stage
     */
    public void start(Stage S) throws Exception {
        S.setTitle("Activity Picker");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/graphicalUserInterface/FXML/Scene.fxml"));
            Scene scene = new Scene(root, 640, 400);
            S.setScene(scene);
            S.show();
        }
        catch (Exception e) {

        }
    }
    /**
     * Function definition for main()
     * <p>
     * Launches the application
     * <p>
     * @param args are the launch arguments
     */
    public static void main(String[] args) {
        /*Launches the application*/
        Application.launch(args);
    }

    public static void createList() {
        long id = generator.generateLong();
        String name = gui.inputWindow("Create List", "Enter name:");
        if(!name.isEmpty() && name != null) {
            ActivityList list = new ActivityList(id, name);
            fileHandler.saveList(list);
            currentList = list;
        }
    }
    public static void loadList() {
        String tmp = gui.boxSelector(fileHandler.searchListFolder(), "Select List");
        if(!tmp.isEmpty() && tmp != null) {
            currentList = fileHandler.loadList(tmp);
        }
    }

    public static void createActivtiy(String name) {
        long id = generator.generateLong();
        if(!name.isEmpty() && name != null) {
            MainActivity a = new MainActivity(id, name, "", null);
            currentList.getActivities().add(a);
            fileHandler.saveList(currentList);
        }
    }

    public static ActivityList getCurrentList() {
        return currentList;
    }

    public static void choose() {
        int choice = generator.generateInt(currentList.getActivities().size());
        gui.alertWindow("Choice Made", currentList.listActivities().get(choice));
    }

}
