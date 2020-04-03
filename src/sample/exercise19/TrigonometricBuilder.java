package sample.exercise19;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TrigonometricBuilder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Polyline sinus = new Polyline();
        ObservableList<Double> list = sinus.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(100 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }

        Polyline casinos = new Polyline();
        ObservableList<Double> list1 = casinos.getPoints();
        for (int x = -170; x <= 170; x++) {
            list1.add(x + 200.0);
            list1.add(100 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
        }

        Line xLine = new Line(200, 0, 200, 200);
        Line yLine = new Line(0, 100, 400, 100);
        Polyline xArrow = new Polyline();
        xArrow.getPoints().addAll(195.0, 15.0, 200.0, 0.0, 205.0, 15.0);
        Polyline yArrow = new Polyline();
        yArrow.getPoints().addAll(385.0, 95.0, 400.0, 100.0, 385.0, 105.0);
        Text xTitle = new Text(385.0, 90, "x");
        Text yTitle = new Text(185.0, 15.0, "y");

        pane.getChildren().addAll(new Text(100, 110, "-2\u03c0"),
                new Text(150, 110, "-\u03c0"),
                new Text(200, 110, "0"),
                new Text(250, 110, "\u03c0"),
                new Text(300, 110, "2\u03c0"));

        pane.getChildren().addAll(sinus, casinos, xArrow, xTitle, xLine, yArrow, yLine, yTitle);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 19");
        primaryStage.show();
    }
}
