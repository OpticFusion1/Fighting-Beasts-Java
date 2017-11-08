package sample;

import PreGame.CreatingCharacterFX;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Label lblFightingBeasts;
    public Button btnNewGame;
    public Button btnLoadGame;
    public Button btnExit;


    @FXML
    private void BtnNewGameClick(){
        try {
            Main.myStage.close();
            new CreatingCharacterFX().start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
