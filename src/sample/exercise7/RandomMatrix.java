package sample.exercise7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class RandomMatrix extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                TextField textField = new TextField();
                textField.setPrefColumnCount(1);
                textField.setText(random.nextInt(2) + "");
                pane.add(textField, i, j);
            }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 7");
        primaryStage.show();
    }
}
