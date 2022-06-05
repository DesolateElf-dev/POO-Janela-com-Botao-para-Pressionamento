import com.sun.beans.editors.FontEditor;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

class ManipuladoraBotao implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hello World");
    }
}



public class JanelaComBotao extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //BorderPane panPrincipal = new BorderPane();
        StackPane panPrincipal = new StackPane();

        Text texto = new Text("Aperto o botão abaixo");
        texto.setFont(Font.font(18));
        texto.setTextAlignment(TextAlignment.CENTER);

        Scene scn = new Scene(panPrincipal, 400, 200, Color.BLACK);
        ManipuladoraBotao pressButton = new ManipuladoraBotao();

        stage.setScene(scn);
        stage.setTitle("Aperte o Botão");
        stage.addEventFilter(ActionEvent.ANY, pressButton);

        Button btn = new Button("Me Aperte");
        btn.setPrefWidth(100);
        btn.setPrefHeight(40);

        panPrincipal.getChildren().addAll(btn, texto);

        StackPane.setAlignment(btn, Pos.CENTER);
        StackPane.setAlignment(texto, Pos.TOP_CENTER);

/*        panPrincipal.setCenter(btn);
        //panPrincipal.setAlignment(, Pos.TOP_CENTER);
        panPrincipal.setTop(texto);*/

        stage.show();

    }

    public static void main(String[] args){
        Application.launch(JanelaComBotao.class, args);
    }
}
