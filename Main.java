package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public static Stage myStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Main.myStage = primaryStage;
        Main.myStage.setResizable(false);
        Main.myStage.setTitle("Hello World");
        Main.myStage.setScene(new Scene(root, 300, 275));
        Main.myStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}