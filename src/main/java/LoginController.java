import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private BorderPane login_borderPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2));
        fadeTransition.setNode(login_borderPane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(2);
        fadeTransition.play();
    }

    public void login_action(ActionEvent actionEvent) {
    }

    @FXML
    private Pane logSign_Pane;
    @FXML
    private Pane signUp_pane;

    public void signUp_action(){
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
        fadeTransition.setNode(logSign_Pane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);

        fadeTransition.setOnFinished(event ->
                {
                    FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1));
                    fadeTransition2.setNode(signUp_pane);
                    fadeTransition2.setFromValue(0);
                    fadeTransition2.setToValue(1);
                    fadeTransition2.play();
                    signUp_pane.setVisible(true);
                }
        );

        fadeTransition.play();
    }



}
