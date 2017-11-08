package PreGame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreatingCharacterFX extends Application {
    private static Stage myStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CreatingCharacterWindow.fxml"));
        CreatingCharacterFX.myStage = primaryStage;
        CreatingCharacterFX.myStage.setResizable(false);
        CreatingCharacterFX.myStage.setTitle("Criação de Personagem");
        CreatingCharacterFX.myStage.setScene(new Scene(root, 375, 275));
        CreatingCharacterFX.myStage.show();
        while(true){
            //AQUI (VER CONTOLLER)
        }
    }
}
