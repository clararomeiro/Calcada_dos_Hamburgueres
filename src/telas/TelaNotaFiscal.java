package telas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaNotaFiscal extends Application {
	
	private static Stage stage;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		Parent rood = FXMLLoader.load(getClass().getResource("/view/TelaNotaFiscal.fxml"));
        Scene scene = new Scene(rood);
        stage.setTitle("Nota Fiscal");
        stage.setScene(scene);
        stage.show();
        setStage(stage);
	}
	
	public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        TelaNotaFiscal.stage = stage;
    }
}
