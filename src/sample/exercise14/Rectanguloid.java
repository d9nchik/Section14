package sample.exercise14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Rectanguloid extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Rectangul(10, 60, 60, 30));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 14");
        primaryStage.show();
    }
}

class Rectangul extends Pane {
    private long startX, startY, endX, endY;

    public Rectangul() {
        this(10, 30, 30, 10);
    }


    public Rectangul(long startX, long startY, long endX, long endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        paint();
    }

    private void paint() {
        Line line1 = new Line();
        line1.setStartX(endX);
        line1.setStartY(endY);
        line1.setEndY(endY);
        line1.endXProperty().bind(widthProperty().subtract(startX));

        Line line2 = new Line();
        line2.setStartX(startX);
        line2.setStartY(startY);
        line2.setEndY(endY);
        line2.setEndX(endX);

        Line line3 = new Line();
        line3.setStartX(startX);
        line3.setStartY(startY);
        line3.setEndY(startY);
        line3.endXProperty().bind(widthProperty().subtract(endX));

        Line line4 = new Line();
        line4.setStartY(startY);
        line4.setEndY(endY);
        line4.startXProperty().bind(line3.endXProperty());
        line4.endXProperty().bind(line1.endXProperty());

        Line line5 = new Line();
        line5.setStartX(startX);
        line5.setStartY(startY);
        line5.setEndX(startX);
        line5.endYProperty().bind(heightProperty().subtract(endY));

        Line line6 = new Line();
        line6.setStartX(endX);
        line6.setStartY(endY);
        line6.setEndX(endX);
        line6.endYProperty().bind(heightProperty().subtract(startY));

        Line line7 = new Line();
        line7.setStartY(startY);
        line7.startXProperty().bind(line4.startXProperty());
        line7.endXProperty().bind(line4.startXProperty());
        line7.endYProperty().bind(line5.endYProperty());

        Line line8 = new Line();
        line8.setStartY(endY);
        line8.startXProperty().bind(line1.endXProperty());
        line8.endXProperty().bind(line1.endXProperty());
        line8.endYProperty().bind(line6.endYProperty());

        Line line9 = new Line();
        line9.startXProperty().bind(line6.endXProperty());
        line9.startYProperty().bind(line6.endYProperty());
        line9.endXProperty().bind(line8.endXProperty());
        line9.endYProperty().bind(line8.endYProperty());

        Line line10 = new Line();
        line10.startXProperty().bind(line5.endXProperty());
        line10.startYProperty().bind(line5.endYProperty());
        line10.endXProperty().bind(line7.endXProperty());
        line10.endYProperty().bind(line7.endYProperty());

        Line line11 = new Line();
        line11.startXProperty().bind(line5.endXProperty());
        line11.startYProperty().bind(line5.endYProperty());
        line11.endXProperty().bind(line6.endXProperty());
        line11.endYProperty().bind(line6.endYProperty());

        Line line12 = new Line();
        line12.startXProperty().bind(line8.endXProperty());
        line12.startYProperty().bind(line8.endYProperty());
        line12.endXProperty().bind(line7.endXProperty());
        line12.endYProperty().bind(line7.endYProperty());


        getChildren().addAll(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12);
    }
}
