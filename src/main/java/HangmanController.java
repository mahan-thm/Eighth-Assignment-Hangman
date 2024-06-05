import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HangmanController implements Initializable {
    @FXML
    private BorderPane hangman_boarderPane;
    @FXML
    private HBox letters_hBox;

    @Override
    public void initialize(URL url2, ResourceBundle resourceBundle) {

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2));
        fadeTransition.setNode(hangman_boarderPane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();



        for (int i = 0; i < 5; i++) {
            Label label = new Label("   ");
            label.setId("label" + "a" + "_" + i);
            label.getStyleClass().add("letters_style");

            letters_hBox.getChildren().add(label);
        }
    }
}