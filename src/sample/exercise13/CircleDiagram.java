package sample.exercise13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class CircleDiagram extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int[] percents = {20, 26, 28, 26};
        String[] names = {"Apple", "HTC", "Samsung", "Others"};
        Scene scene = new Scene(new Diagram(names, percents));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 13");
        primaryStage.show();
    }

}

class Diagram extends StackPane {
    private final static int RADIUS = 90;
    private String[] names;
    private int[] percent;

    public Diagram(String[] names, int[] percent) {
        this.names = names;
        this.percent = percent;
        paint();
    }

    private static Color randomColor() {
        Random random = new Random();
        return new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    private void paint() {
        int total = 0;
        for (int i = 0; i < names.length; i++) {
            Pane pane = new Pane();
            Arc arc = new Arc(RADIUS + 10, RADIUS + 10, RADIUS, RADIUS, total, 3.6 * percent[i]);
            arc.setType(ArcType.ROUND);
            arc.setFill(randomColor());
            Text label = new Text(names[i] + " -- " + percent[i] + "%");
            label.setX(RADIUS + 10 + 3 * RADIUS / 4.0 * (Math.cos(Math.PI / 50 * (percent[i] / 2.0 + total / 3.6))));
            label.setY(RADIUS + 10 - 3 * RADIUS / 4.0 * (Math.sin(Math.PI / 50 * (percent[i] / 2.0 + total / 3.6))));
            pane.getChildren().addAll(arc, label);
            getChildren().add(pane);
            total += 3.6 * percent[i];
        }
    }
}
