package sample.exercise10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Cylinder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        pane.setPadding(new Insets(11, 11, 11, 11));
        Ellipse ellipse1 = new Ellipse(70, 40, 60, 30);
        ellipse1.setFill(null);
        ellipse1.setStroke(Color.BLACK);
        ellipse1.centerXProperty().bind(pane.widthProperty().divide(2));
        ellipse1.radiusXProperty().bind(pane.widthProperty().divide(2).subtract(10));

        Arc arcUp = new Arc(70, 220, 60, 30, 0, 180);
        arcUp.centerYProperty().bind(pane.heightProperty().subtract(30));
        arcUp.setFill(null);
        arcUp.setType(ArcType.OPEN);
        arcUp.setStroke(Color.BLACK);
        arcUp.getStrokeDashArray().addAll(6.0, 21.0);
        arcUp.centerXProperty().bind(pane.widthProperty().divide(2));
        arcUp.radiusXProperty().bind(pane.widthProperty().divide(2).subtract(10));

        Arc arcDown = new Arc(70, 220, 60, 30, 180, 180);
        arcDown.setFill(null);
        arcDown.setType(ArcType.OPEN);
        arcDown.setStroke(Color.BLACK);
        arcDown.centerYProperty().bind(pane.heightProperty().subtract(30));
        arcDown.centerXProperty().bind(pane.widthProperty().divide(2));
        arcDown.radiusXProperty().bind(pane.widthProperty().divide(2).subtract(10));


        Line line1 = new Line(10, 40, 10, 220);
        line1.endYProperty().bind(pane.heightProperty().subtract(30));

        Line line2 = new Line(130, 40, 130, 220);
        line2.endYProperty().bind(pane.heightProperty().subtract(30));
        line2.endXProperty().bind(pane.widthProperty().subtract(10));
        line2.startXProperty().bind(pane.widthProperty().subtract(10));

        pane.getChildren().addAll(ellipse1, arcUp, arcDown, line1, line2);


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 10");
        primaryStage.show();
    }
}
