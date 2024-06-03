import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.awt.*;
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



}
