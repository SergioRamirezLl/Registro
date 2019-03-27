package application;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Boton {
	private Button btn = new Button("Registrar");
	
	public Boton() {
	}
	
	public HBox box() {
		HBox bot = new HBox();
		bot.setSpacing(20);
		bot.getChildren().addAll(btn);
		return bot;
	}
	public Button getBtn() {
		return btn;
	}
}
