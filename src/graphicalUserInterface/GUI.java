/**
 * GUI
 * @author Team Jam
 */
package graphicalUserInterface;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.List;

public class GUI {
    public static List<String> items;
    public static String sResult;
    public GUI() {}
    /**
     * Function definition for inputWindow()
     * <P>
     *     Creates an input window for the user
     * </P>
     * @param title is the title for the window
     * @param prompt is the prompt
     * @return the user input
     */
    public String inputWindow(String title, String prompt) {
        TextInputDialog window = new TextInputDialog();
        window.setTitle(title);
        window.setContentText(prompt);
        window.showAndWait();
        return window.getResult();
    }
    /**
     * Function definition for boxSelector()
     * <p>
     * Converts an ArrayList of strings into a combo box and returns
     * the selected item
     * </p>
     * @param list is the list to be used in the combo box
     * @return the option
     */
    public String boxSelector(List<String> list, String titleStr) {
        items = list;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML/Box Selector Pop-Up.fxml"));
            Scene scene = new Scene(root, 300, 200);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle(titleStr);
            stage.showAndWait();
        }
        catch (Exception e) {
        }
        return sResult;
    }
    public void alertWindow(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText("");
        alert.setContentText(content);
        alert.showAndWait();
    }
}
