package sample.exercise12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class BarChart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox();
        pane.setPadding(new Insets(11, 11, 11, 11));
        pane.setSpacing(11);
        pane.getChildren().add(new Block("Apple", 20));
        pane.getChildren().add(new Block("HTC", 26));
        pane.getChildren().add(new Block("Samsung", 28));
        pane.getChildren().add(new Block("Other", 26));

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 12");
        primaryStage.show();
    }
}

class Block extends VBox {
    private String name;
    private long percent;

    public Block(String name, long percent) {
        this.name = name;
        this.percent = percent;
        paint();
    }

    private void paint() {
        setAlignment(Pos.BOTTOM_CENTER);
        Label label = new Label(name + " -- " + percent + "%");
        getChildren().add(label);
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(percent * 5);
        rectangle.setWidth(100);
        rectangle.setFill(randomColor());
        getChildren().add(rectangle);
    }

    private Color randomColor() {
        Random random = new Random();
        return new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());
    }
}
