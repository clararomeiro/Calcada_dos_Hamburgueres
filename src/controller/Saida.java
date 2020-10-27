package controller;

import javafx.stage.Stage;
import telas.TelaInicial;

public abstract class Saida {
    public void saida(){
        TelaInicial l = new TelaInicial();
            
        try {
			l.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

}