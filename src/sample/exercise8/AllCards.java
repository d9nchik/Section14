package sample.exercise8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AllCards extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                pane.add(new ImageView("src/image/card/" + (i * 9 + j + 1) + ".png"), j, i);
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 8");
        primaryStage.show();
    }
}
