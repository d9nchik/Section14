package sample.exercise1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER_LEFT);

        pane.add(new ImageView("src/image/ca.gif"), 1, 0);
        pane.add(new ImageView("src/image/uk.gif"), 0, 0);
        pane.add(new ImageView("src/image/us.gif"), 1, 1);
        pane.add(new ImageView("src/image/china.gif"), 0, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 1");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
