import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class HangmanApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("entry/Login.fxml"));

//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("game/hangman.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("topics/topics.fxml"));
//        String css = Objects.requireNonNull(this.getClass().getResource("topics/topicsStyle.css")).toExternalForm();


        Scene scene = new Scene(fxmlLoader.load());
        stage.setMinWidth(850);
        stage.setMinHeight(650);
        stage.setTitle("Hangman");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}