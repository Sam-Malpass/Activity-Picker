package graphicalUserInterface.Controllers;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import programFunctions.Main;
import storageStucture.Activity;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private ListView<String> choiceList;
    @FXML private Button enterButton;
    @FXML private TextField inputBar;
    @FXML private Button chooseButton;
    @FXML private Button exitButton;
    private URL tmp;
    private ResourceBundle tmpII;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tmp = url;
        tmpII = resourceBundle;
        enterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.createActivtiy(inputBar.getText());
                prepList();
                inputBar.clear();
            }
        });
        inputBar.addEventHandler(KeyEvent.KEY_RELEASED, keyEvent -> {
            /*If enter pressed*/
            switch (keyEvent.getCode()) {
                case ENTER:
                    Main.createActivtiy(inputBar.getText());
                    prepList();
                    inputBar.clear();
                    /*Break*/
                    break;
                /*Default*/
                default:
                    /*Break*/
                    break;
            }
        });
        chooseButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.choose();
            }
        });
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    private void prepList() {
        choiceList.setItems(FXCollections.observableArrayList(Main.getCurrentList().listActivities()));
        choiceList.refresh();
    }

    @FXML
    private void createList() {
        Main.createList();
        prepList();
    }
    @FXML
    private void loadList() {
        Main.loadList();
        prepList();
    }
    @FXML
    private void close() {
        System.exit(0);
    }
}
