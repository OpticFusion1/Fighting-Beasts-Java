package PreGame;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.awt.*;

public class Controller {
    @FXML
    private TextField TxtName;
    @FXML
    private Slider SldStrength;
    @FXML
    private Slider SldLuck;
    @FXML
    private Slider SldMagic;
    @FXML
    private Label LblStrength;
    @FXML
    private Label LblLuck;
    @FXML
    private Label LblMagic;
    public Button BtnConfirm;

    //ESSA FUNÇÃO PRECISA SER CHAMADA NO LOOP INFINITO DA CLASSE
    public void CheckValues(){
        LblStrength.setText(Double.toString(SldStrength.getValue()));
        LblLuck.setText(Double.toString(SldLuck.getValue()));
        LblMagic.setText(Double.toString(SldMagic.getValue()));
    }

    private boolean CharIsOk() {
        if ((TxtName.getText().contains("^[a-Z]")) && (SldStrength.getValue() + SldLuck.getValue() + SldMagic.getValue() <= 15)) {
            return true;
        } else {
            return false;
        }
    }

    @FXML
    public void CreateChar(){
        if (CharIsOk()){
            Character Char = new Character(TxtName.getText(), (int)SldStrength.getValue(), (int)SldLuck.getValue(), (int)SldMagic.getValue());
            System.out.println("Deu bom!");
        }
    }
}
