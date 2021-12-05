package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.User;
import tools.ButtonEvent;
import tools.StaticObservableLists;
import tools.TimeHelper;

import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ResourceBundle;

public class MainMenuCtrl implements Initializable {
    @FXML
    private Button apptBtn;
    @FXML
    private Button custBtn;
    @FXML
    private Button loginBtn;
    @FXML
    private Button reportsBtn;
    @FXML
    private Button exitBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void onActionAppt(ActionEvent event) throws IOException {
        System.out.println("Appointments button clicked!");
        ButtonEvent.buttonAction("/view/Appointments.fxml", "Appointments Table", event);
    }

    @FXML
    void onActionCust(ActionEvent event) throws IOException {
        System.out.println("Customers button clicked!");
        ButtonEvent.buttonAction("/view/Customers.fxml", "Customers Table", event);
    }

    @FXML
    void onActionLogin(ActionEvent event) throws IOException {
        ButtonEvent.cancelButtonAction("You will be taken to the login screen again, do you want to continue?", "Login button clicked", "/view/Login.fxml", "Login Screen",event);

    }

    @FXML
    void onActionReports(ActionEvent event) throws IOException {
        System.out.println("Reports button clicked!");
        ButtonEvent.buttonAction("/view/Reports.fxml", "Reports Form", event);
    }


    public void onActionExit(ActionEvent actionEvent) {
        ButtonEvent.exitButtonAction("This will exit the program, do you want to continue?", "Exit button clicked");
    }
}
