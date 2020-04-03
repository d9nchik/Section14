package sample.exercise20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static void drawArrowLine(double startX, double startY,
                                     double endX, double endY, Pane pane) {
        double length = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        pane.getChildren().add(new Line(startX, startY, endX, endY));
        Polyline arrow = new Polyline();
        double acos = Math.acos((startX - endX) / length);
        double asin = Math.asin((startY - endY) / length);
        arrow.getPoints().addAll(endX + 10 * (Math.cos(acos + 0.314)),
                endY + 10 * (Math.sin(asin + 0.314)));
        arrow.getPoints().addAll(endX, endY);
        arrow.getPoints().addAll(endX + 10 * (Math.cos(acos - 0.314)),
                endY + 10 * (Math.sin(asin - 0.314)));
        pane.getChildren().add(arrow);

    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Random random = new Random();
        drawArrowLine(random.nextInt(200), random.nextInt(200),
                random.nextInt(200), random.nextInt(200), pane);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Exercise 20");
        primaryStage.show();
    }
}
