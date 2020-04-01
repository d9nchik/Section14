package sample.exercise6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckBoard extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {
                Rectangle square = new Rectangle(0, 0, 50, 50);
                if ((i + j) % 2 == 0)
                    square.setFill(Color.WHITE);
                pane.add(square, i, j);
            }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 6");
        primaryStage.show();
    }
}
