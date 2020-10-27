package telas;

import controller.TelaClienteController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaCliente {

	private static Stage stage;

	public static void main(String[] args) {

	}
	
	 public void start(Stage stage) throws Exception {
	        Parent rood = FXMLLoader.load(getClass().getResource("/view/TelaCliente.fxml"));
	        Scene scene = new Scene(rood);
	        stage.setTitle("Cliente");
	        stage.setScene(scene);
	        stage.show();
	        setStage(stage);
	    }

	    public static Stage getStage() {
	        return stage;
	    }

	    public static void setStage(Stage stage) {
	        TelaCliente.stage = stage;
	    }
}
