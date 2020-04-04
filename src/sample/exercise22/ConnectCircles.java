package sample.exercise22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class ConnectCircles extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Random random = new Random();
        Circle circle1 = new Circle(random.nextInt(400) + 100, random.nextInt(400) + 100, 15);
        Circle circle2 = new Circle(random.nextInt(400) + 100, random.nextInt(400) + 100, 15);
        circle1.setFill(Color.WHITE);
        circle2.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle2.setStroke(Color.BLACK);

        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());

        Text forCircle1 = new Text(circle1.getCenterX(), circle1.getCenterY(), "1");
        Text forCircle2 = new Text(circle2.getCenterX(), circle2.getCenterY(), "2");
        pane.getChildren().addAll(line, circle1, circle2, forCircle1, forCircle2);

        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 21");
        primaryStage.show();
    }
}
