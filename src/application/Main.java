package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	private TexFld name = new TexFld("Nombre:");
	private TexFld mail = new TexFld("Email:");
	private PasFld pass = new PasFld("Password:");
	private Boton btn = new Boton();
	private Label lbl = new Label("Registro");
	@Override
	public void start(Stage primaryStage) {
		try {
			FlowPane root = new FlowPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Registro examen");
			primaryStage.show();
			
			root.setVgap(20);
			root.setHgap(400);
			root.setAlignment(Pos.CENTER);
			root.getChildren().addAll(lbl,name.box(),mail.box(),pass.box(),btn.box());
			
			btn.getBtn().setOnAction(evt->{
				System.out.println("hola: "+ name.getTexto());
				System.out.println("te escribo a: "+ mail.getTexto());
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
