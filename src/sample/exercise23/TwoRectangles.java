package sample.exercise23;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class TwoRectangles extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the center coordinates, width and heights of first rectangle: ");
        MyRectangle2D rectangle1 = new MyRectangle2D(input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble());
        System.out.print("Enter the center coordinates, width and heights of the second rectangle: ");
        MyRectangle2D rectangle2 = new MyRectangle2D(input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble());

        Text text = new Text();
        Pane pane = new Pane();
        text.xProperty().bind(pane.widthProperty().divide(4));
        text.yProperty().bind(pane.heightProperty().subtract(10));
        if (rectangle1.overlaps(rectangle2))
            text.setText("The rectangles overlap");
        else if (rectangle1.contains(rectangle2) || rectangle2.contains(rectangle1))
            text.setText("One rectangle is contained in another");
        else
            text.setText("The rectangles do not overlap");

        pane.getChildren().addAll(rectangle1, rectangle2, text);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 23");
        primaryStage.show();
    }
}
