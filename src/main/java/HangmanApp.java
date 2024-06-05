import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HangmanApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("entry/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setMinWidth(850);
        stage.setMinHeight(650);
        stage.setTitle("Hangman");
        stage.setScene(scene);
        stage.show();

        GetWordData getWordData = new GetWordData("cheetah");
        System.out.println(getWordData.getWord());
    }

    public static void main(String[] args) {
        launch();
    }
}