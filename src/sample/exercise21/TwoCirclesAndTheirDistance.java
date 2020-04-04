package sample.exercise21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class TwoCirclesAndTheirDistance extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Random random = new Random();
        Circle circle1 = new Circle(random.nextInt(400) + 100, random.nextInt(400) + 100, 15);
        Circle circle2 = new Circle(random.nextInt(400) + 100, random.nextInt(400) + 100, 15);

        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        double distance = Math.sqrt(Math.pow(circle1.getCenterX() - circle2.getCenterX(), 2) +
                Math.pow(circle1.getCenterY() - circle2.getCenterY(), 2));
        double averageX = (circle1.getCenterX() + circle2.getCenterX()) / 2.0;
        double averageY = (circle1.getCenterY() + circle2.getCenterY()) / 2.0;
        Text text = new Text(10 + averageX, averageY + 10, distance + "");
        pane.getChildren().addAll(circle1, circle2, line, text);

        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 21");
        primaryStage.show();
    }
}
