package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaAdministrador;
import telas.TelaInicial;
import telas.TelaPedidos;


public class TelaAdministradorController extends Saida implements Initializable {

    @FXML private Button btnSim;
    @FXML private Button btnSair;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnSair.setOnMouseClicked((MouseEvent e)->{
            saida();
            fecha();
        });
        
        btnSim.setOnMouseClicked((MouseEvent e)->{
            TelaPedidos tp = new TelaPedidos();
            try {
                tp.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaAdministradorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fecha();
        });
            
    }
    
    
    private void fecha(){
        TelaAdministrador.getStage().close();
    }
}
