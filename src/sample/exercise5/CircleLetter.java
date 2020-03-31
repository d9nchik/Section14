package sample.exercise5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CircleLetter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double RADIUS = 50;
        final double CENTER_POSITION_X = 100;
        final double CENTER_POSITION_Y = 100;
        Pane pane = new Pane();
        String my = " JavaFX Learning";
        for (int i = 0; i < my.length(); i++) {
            double v = Math.PI + i * Math.PI * 2 / my.length();
            Text text = new Text(CENTER_POSITION_X + RADIUS * Math.cos(v), CENTER_POSITION_Y + RADIUS * Math.sin(v), "" + my.charAt(i));
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
            text.setRotate(-90 + 360.0 * i / my.length());
            pane.getChildren().add(text);
        }
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 5");
        primaryStage.show();
    }
}
