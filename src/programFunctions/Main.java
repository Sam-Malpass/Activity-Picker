/**
 * Main
 * @author Team Jam
 */
package programFunctions;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
    /**
     * fileHandler holds the FileHandler ojbect
     */
    private FileHandler fileHandler = new FileHandler();
    /**
     * Function definition for start()
     * <p>
     * Creates all the nodes for the mainStage and then shows the mainStage
     * <p>
     * @param S is a Stage
     */
    public void start(Stage S) throws Exception {
        S.setScene(new Scene(new Group(), 400, 800));
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
}
