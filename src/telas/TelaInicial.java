package telas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaInicial extends Application {

	private static Stage stage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent rood = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml")); // carrega o fxml
        Scene scene = new Scene(rood); // coloca o fxml em uma cena
        stage.setTitle("Calçada dos Hamburgueres");
        stage.setScene(scene); // coloca a cena em uma janela
        stage.show(); // abre a janela
        
        setStage(stage);
		
	}
	
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		TelaInicial.stage = stage;
		
	}

}
