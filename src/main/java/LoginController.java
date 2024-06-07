import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private BorderPane login_borderPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2));
        fadeTransition.setNode(login_borderPane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }

    @FXML
    private Pane login_pane;

    public void login_action() {
        FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(1));
        fadeTransition1.setNode(logSign_pane);
        fadeTransition1.setFromValue(1);
        fadeTransition1.setToValue(0);

        fadeTransition1.setOnFinished(event ->
                {
                    logSign_pane.setVisible(false);

                    FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1));
                    fadeTransition2.setNode(login_pane);
                    fadeTransition2.setFromValue(0);
                    fadeTransition2.setToValue(1);
                    fadeTransition2.play();
                    login_pane.setVisible(true);

                    FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(1));
                    fadeTransition3.setNode(backButton_pane);
                    fadeTransition3.setFromValue(0);
                    fadeTransition3.setToValue(1);
                    fadeTransition3.play();
                    backButton_pane.setVisible(true);
                }
        );
        fadeTransition1.play();
    }

    @FXML
    private Pane logSign_pane;
    @FXML
    private Pane signUp_pane;
    @FXML
    private Pane backButton_pane;

    public void signUp_action() {
        FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(1));
        fadeTransition1.setNode(logSign_pane);
        fadeTransition1.setFromValue(1);
        fadeTransition1.setToValue(0);

        fadeTransition1.setOnFinished(event ->
                {
                    logSign_pane.setVisible(false);

                    FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1));
                    fadeTransition2.setNode(signUp_pane);
                    fadeTransition2.setFromValue(0);
                    fadeTransition2.setToValue(1);
                    fadeTransition2.play();
                    signUp_pane.setVisible(true);

                    FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(1));
                    fadeTransition3.setNode(backButton_pane);
                    fadeTransition3.setFromValue(0);
                    fadeTransition3.setToValue(1);
                    fadeTransition3.play();
                    backButton_pane.setVisible(true);
                }
        );

        fadeTransition1.play();
    }

    public void backToLoginSign_action() {
        FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(1));
        fadeTransition1.setNode(backButton_pane);
        fadeTransition1.setFromValue(1);
        fadeTransition1.setToValue(0);

        FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1));
        fadeTransition2.setNode(signUp_pane);
        fadeTransition2.setFromValue(1);
        fadeTransition2.setToValue(0);
        fadeTransition2.play();

        FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(1));
        fadeTransition3.setNode(login_pane);
        fadeTransition3.setFromValue(1);
        fadeTransition3.setToValue(0);
        fadeTransition3.play();

        fadeTransition1.setOnFinished(event ->
                {
                    signUp_pane.setVisible(false);
                    backButton_pane.setVisible(false);
                    login_pane.setVisible(false);

                    FadeTransition fadeTransition4 = new FadeTransition(Duration.seconds(1));
                    fadeTransition4.setNode(logSign_pane);
                    fadeTransition4.setFromValue(0);
                    fadeTransition4.setToValue(1);
                    fadeTransition4.play();
                    logSign_pane.setVisible(true);
                }
        );
        fadeTransition1.play();
    }




    public void getIntoAccount_action(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("topics/topics.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        String css = Objects.requireNonNull(this.getClass().getResource("topics/topicsStyle.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }


}
