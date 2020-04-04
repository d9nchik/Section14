package sample.exercise24;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class InsideOrNot extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();
        for (int i = 0; i < 8; i++)
            list.add(input.nextDouble());

        Circle point = new Circle(input.nextDouble(), input.nextDouble(), 5);
        Text text = new Text();
        text.xProperty().bind(pane.widthProperty().divide(4));
        text.yProperty().bind(pane.heightProperty().subtract(10));
        if (polygon.contains(point.getCenterX(), point.getCenterY()))
            text.setText("The point is inside polygon");
        else
            text.setText("The point isn't inside polygon");

        pane.getChildren().addAll(polygon, text, point);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 23");
        primaryStage.show();
    }
}
