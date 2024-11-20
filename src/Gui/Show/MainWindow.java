package Gui.Show;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class MainWindow extends Application{
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 600, 400);
        stage.setTitle("Konference Administration System");
        stage.setScene(scene);
        stage.show();


    }
}
