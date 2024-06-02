package hangman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HangmanApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("entry/Login.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("game/hangman.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.setTitle("Hangman");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}