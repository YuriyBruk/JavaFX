package javaFx.start;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Test");
        Text text = new Text(10,20,"test javaFX");
        text.setFont(new Font(40));
        BorderPane pane = new BorderPane();
        pane.setCenter(button);
        pane.setTop(text);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("JavaFX title");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
