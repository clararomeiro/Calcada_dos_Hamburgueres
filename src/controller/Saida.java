package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;
import telas.TelaInicial;

public abstract class Saida {
    public void saida(){
        TelaInicial l = new TelaInicial();
            
            try {
                l.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaAdministradorController.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }
    

}
