package telas;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaAdministrador extends Application{
    private static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rood = FXMLLoader.load(getClass().getResource("/view/TelaAdministrador.fxml"));
        Scene scene = new Scene(rood);
        stage.setTitle("Admin");
        stage.setScene(scene);
        stage.show();
        
        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        TelaAdministrador.stage = stage;
    }
}
    <?xml version="1.0" encoding="UTF-8"?>

<?import java.lang.*?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>


<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="468.0" prefWidth="178.0" style="-fx-background-color: #00000;" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1">
<children>
<Text layoutX="56.0" layoutY="127.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Twice R$ 9,00">
<font>
<Font size="15.0" />
</font>
</Text>
<Text layoutX="60.0" layoutY="162.0" strokeType="OUTSIDE" strokeWidth="0.0" text="BBH R$ 6,14">
<font>
<Font size="15.0" />
</font>
</Text>
<Text layoutX="59.0" layoutY="194.0" strokeType="OUTSIDE" strokeWidth="0.0" text="NCT R$ 5,00">
<font>
<Font size="15.0" />
</font>
</Text>
<Text layoutX="52.0" layoutY="236.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Priscila Senna R$ 7,50">
<font>
<Font size="15.0" />
</font>
</Text>
<Text fill="#e5892e" layoutX="62.0" layoutY="385.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Bebidas" textAlignment="CENTER" wrappingWidth="102.296875">
<font>
<Font size="18.0" />
</font>
</Text>
<Text fill="#e5892e" layoutX="25.0" layoutY="268.0" stroke="BLACK" strokeType="OUTSIDE" strokeWidth="0.0" text="Acompanhamentos" textAlignment="CENTER">
<font>
<Font size="18.0" />
</font>
</Text>
<Text layoutX="70.0" layoutY="406.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Agua R$ 2,50">
<font>
<Font size="14.0" />
</font>
</Text>
<Text layoutX="55.0" layoutY="460.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Milkshake R$ 8,50">
<font>
<Font size="14.0" />
</font>
</Text>
<Text layoutX="71.0" layoutY="432.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Suco R$ 4,00">
<font>
<Font size="14.0" />
</font>
</Text>
<Text layoutX="58.0" layoutY="300.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Batata frita R$ 5,00">
<font>
<Font size="14.0" />
</font>
</Text>
<Text layoutX="52.0" layoutY="327.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Batata cheddar R$ 7,00">
<font>
<Font size="14.0" />
</font>
</Text>
<Text layoutX="52.0" layoutY="355.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Onion rings R$ 6,50">
<font>
<Font size="14.0" />
</font>
</Text>
</children>
</AnchorPane>
