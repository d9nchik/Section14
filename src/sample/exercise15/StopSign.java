package sample.exercise15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StopSign extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final long RADIUS = 70;
        StackPane pane = new StackPane();
        pane.setPadding(new Insets(11, 11, 11, 11));

        Polygon polygon = new Polygon();
        for (int i = 0; i < 8; i++) {
            polygon.getPoints().add(RADIUS * (Math.cos(Math.PI * (1 / 8.0 + i / 4.0))));
            polygon.getPoints().add(RADIUS * (Math.sin(Math.PI * (1 / 8.0 + i / 4.0))));
        }
        polygon.setFill(Color.RED);
        pane.getChildren().add(polygon);

        Text text = new Text("STOP");
        text.setFont(Font.font("Times New Roman", 30));
        text.setFill(Color.WHITE);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 15");
        primaryStage.show();
    }
}
