package sample.exercise18;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class QuadraticFunction extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(150 - scaleFactor * x * x);
        }

        Line xLine = new Line(200, 0, 200, 200);
        Line yLine = new Line(0, 150, 400, 150);
        Polyline xArrow = new Polyline();
        xArrow.getPoints().addAll(195.0, 15.0, 200.0, 0.0, 205.0, 15.0);
        Polyline yArrow = new Polyline();
        yArrow.getPoints().addAll(385.0, 145.0, 400.0, 150.0, 385.0, 155.0);
        Text xTitle = new Text(385.0, 140, "x");
        Text yTitle = new Text(185.0, 15.0, "y");

        pane.getChildren().addAll(polyline, xLine, yLine, xArrow, yArrow, xTitle, yTitle);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 18");
        primaryStage.show();
    }
}
