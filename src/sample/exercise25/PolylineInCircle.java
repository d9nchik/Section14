package sample.exercise25;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Random;

public class PolylineInCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final double RADIUS = 100;

        double[] angles = new double[5];

        Random random = new Random();
        for (int i = 0; i < 5; i++)
            angles[i] = random.nextDouble();

        Arrays.sort(angles);

        Circle circle = new Circle(0, 0, RADIUS);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);

        Polygon polygon = new Polygon();
        polygon.setFill(null);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();
        for (double angle : angles)
            list.addAll(RADIUS * Math.cos(Math.PI * 2 * angle),
                    RADIUS * Math.sin(Math.PI * 2 * angle));

        Group group = new Group();
        group.getChildren().addAll(circle, polygon);

        StackPane pane = new StackPane();
        pane.setPadding(new Insets(15, 15, 15, 15));
        pane.getChildren().addAll(group);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 25");
        primaryStage.show();
    }
}
