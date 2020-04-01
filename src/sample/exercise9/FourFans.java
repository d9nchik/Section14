package sample.exercise9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FourFans extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(11, 11, 11, 11));
        pane.setHgap(11);
        pane.setVgap(11);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Group temp = new Group();
                Circle circle = new Circle();
                circle.setRadius(50);
                circle.setCenterX(50);
                circle.setCenterY(50);
                circle.setStroke(Color.BLACK);
                circle.setFill(null);
                temp.getChildren().add(circle);
                for (int z = 0; z < 4; z++) {
                    Arc arc = new Arc(50, 50, 40, 40, 30 + 90 * z, 35);
                    arc.setFill(Color.RED);
                    arc.setType(ArcType.ROUND);
                    arc.setStroke(Color.RED);
                    temp.getChildren().add(arc);
                }
                pane.add(temp, i, j);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 9");
        primaryStage.show();
    }
}
