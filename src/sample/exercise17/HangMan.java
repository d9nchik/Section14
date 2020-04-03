package sample.exercise17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HangMan extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new ManHang());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 17");
        primaryStage.show();
    }
}

class ManHang extends Pane {
    public ManHang() {
        paint();
    }

    private void paint() {
        Arc ground = new Arc(40, 120, 40, 20, 0, 180);
        ground.setFill(null);
        ground.setStroke(Color.BLACK);
        ground.setType(ArcType.OPEN);

        Polyline wood = new Polyline();
        wood.getPoints().addAll(40.0, 100.0, 40.0, 10.0, 100.0, 10.0, 100.0, 30.0);

        Circle head = new Circle(100, 38, 8);
        head.setFill(null);
        head.setStroke(Color.BLACK);

        Line body = new Line(100, 46, 100, 76);
        Line leg1 = new Line(100, 76, 90, 86);
        Line leg2 = new Line(100, 76, 110, 86);
        Line hand1 = new Line(100 + 8 * Math.cos(Math.PI * 5 / 4), 38 - 8 * Math.sin(Math.PI * 5 / 4),
                90 + 8 * Math.cos(Math.PI * 5 / 4), 48 - 8 * Math.sin(Math.PI * 5 / 4));
        Line hand2 = new Line(100 + 8 * Math.cos(Math.PI * 7 / 4), 38 - 8 * Math.sin(Math.PI * 7 / 4),
                110 + 8 * Math.cos(Math.PI * 7 / 4), 48 - 8 * Math.sin(Math.PI * 7 / 4));

        getChildren().addAll(ground, wood, head, body, leg1, leg2, hand1, hand2);
    }
}
