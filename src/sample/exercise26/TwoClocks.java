package sample.exercise26;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TwoClocks extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();

        ClockPane clockPane1 = new ClockPane(4, 20, 45);
        clockPane1.setHeight(250);
        clockPane1.setWidth(250);
        ClockPane clockPane2 = new ClockPane(22, 46, 15);
        clockPane2.setWidth(250);
        clockPane2.setHeight(250);
        hBox.getChildren().addAll(clockPane1, clockPane2);

        primaryStage.setScene(new Scene(hBox));
        primaryStage.setTitle("Exercise 26");
        primaryStage.show();
    }
}
