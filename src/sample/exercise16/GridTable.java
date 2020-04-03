package sample.exercise16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GridTable extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(new tickTackTable(), 100, 100));
        primaryStage.setTitle("Exercise 16");
        primaryStage.show();
    }
}

class tickTackTable extends Pane {
    public tickTackTable() {
        paint();
    }

    private void paint() {
        Line vertical1 = new Line();
        vertical1.setStartY(0);
        vertical1.endYProperty().bind(heightProperty());
        vertical1.startXProperty().bind(widthProperty().divide(3));
        vertical1.endXProperty().bind(widthProperty().divide(3));
        vertical1.setStroke(Color.RED);

        Line vertical2 = new Line();
        vertical2.setStartY(0);
        vertical2.endYProperty().bind(heightProperty());
        vertical2.startXProperty().bind(widthProperty().divide(3).multiply(2));
        vertical2.endXProperty().bind(widthProperty().divide(3).multiply(2));
        vertical2.setStroke(Color.RED);

        Line horizontal1 = new Line();
        horizontal1.setStartX(0);
        horizontal1.endXProperty().bind(widthProperty());
        horizontal1.startYProperty().bind(heightProperty().divide(3));
        horizontal1.endYProperty().bind(heightProperty().divide(3));
        horizontal1.setStroke(Color.BLUE);

        Line horizontal2 = new Line();
        horizontal2.setStartX(0);
        horizontal2.endXProperty().bind(widthProperty());
        horizontal2.startYProperty().bind(heightProperty().divide(3).multiply(2));
        horizontal2.endYProperty().bind(heightProperty().divide(3).multiply(2));
        horizontal2.setStroke(Color.BLUE);

        getChildren().addAll(vertical1, vertical2, horizontal1, horizontal2);
    }
}
