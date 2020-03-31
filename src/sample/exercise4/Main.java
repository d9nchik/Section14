package sample.exercise4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Text label = new Text("JavaFX");
            label.setRotate(90);
            label.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
            label.setFill(new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble()));

            hBox.getChildren().add(label);
        }
        Scene scene = new Scene(hBox, 400, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
