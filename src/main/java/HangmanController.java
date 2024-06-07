import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HangmanController implements Initializable {
    private String word;
    @FXML
    private BorderPane hangman_boarderPane;
    @FXML
    private HBox letters_hBox;
    @FXML
    private Label time_label;

    @Override
    public void initialize(URL url2, ResourceBundle resourceBundle) {

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2));
        fadeTransition.setNode(hangman_boarderPane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();

        GetWordData getWordData = new GetWordData(TopicController.gameTopic);
        this.word = getWordData.getWord().toLowerCase();
        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {
            Label label = new Label("   ");
            label.getStyleClass().add("letters_style");

            letters_hBox.getChildren().add(label);
        }

    }

    @FXML
    private Group hangmanBody_group;

    private int nthHangmanBody = 0;

    public void inputLetter(ActionEvent actionEvent) {
        String letter = ((Button) actionEvent.getSource()).getText().toLowerCase();
        boolean hangman = true;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter.charAt(0)) {

                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.5));
                fadeTransition.setNode((Button) actionEvent.getSource());
                fadeTransition.setFromValue(1);
                fadeTransition.setToValue(0.3);
                fadeTransition.play();

                ((Label) letters_hBox.getChildren().get(i)).setText(letter);
                ((Button) actionEvent.getSource()).setDisable(true);

                hangman = false;
            }
        }
        if (hangman == true) {
            FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(0.5));
            fadeTransition1.setNode((Button) actionEvent.getSource());
            fadeTransition1.setFromValue(1);
            fadeTransition1.setToValue(0.3);
            ((Button) actionEvent.getSource()).setStyle("-fx-background-color:  #ff0000 ;-fx-background-radius: 25");
            fadeTransition1.play();

            ((Button) actionEvent.getSource()).setDisable(true);

            hangmanBody_group.getChildren().get(nthHangmanBody).setVisible(true);
            FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(0.5));
            fadeTransition2.setNode(hangmanBody_group.getChildren().get(nthHangmanBody));
            fadeTransition2.setFromValue(0);
            fadeTransition2.setToValue(1);
            fadeTransition2.play();
            nthHangmanBody++;
        }
    }
}