package sample.exercise11;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HappyFace extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.setPadding(new Insets(11, 11, 11, 11));

        Circle head = new Circle();
        head.setRadius(60);
        head.setStroke(Color.BLACK);
        head.setFill(null);
        pane.getChildren().add(head);

        pane.getChildren().addAll(new Eye(35, 40),
                new Eye(85, 40));

        Pane mousePane = new Pane();
        Arc mouse = new Arc(60, 60, 40, 35, 225, 85);
        mouse.setType(ArcType.OPEN);
        mouse.setFill(null);
        mouse.setStroke(Color.BLACK);
        mousePane.getChildren().add(mouse);
        pane.getChildren().add(mousePane);

        Pane nose = new Pane();
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        list.add(60.0);
        list.add(50.0);
        list.add(85.0);
        list.add(80.0);
        list.add(55.0);
        list.add(80.0);
        nose.getChildren().add(polyline);
        pane.getChildren().add(nose);


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 11");
        primaryStage.show();
    }
}

class Eye extends Pane {
    private double xCoordinate;
    private double yCoordinate;

    public Eye() {
        this(0, 0);
    }

    public Eye(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        paint();
    }

    public void paint() {
        Ellipse ellipse = new Ellipse(xCoordinate, yCoordinate, 15, 10);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(null);
        Circle eyeSide = new Circle(xCoordinate, yCoordinate, 7);
        getChildren().addAll(ellipse, eyeSide);

    }


    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
        paint();
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
        paint();
    }
}
