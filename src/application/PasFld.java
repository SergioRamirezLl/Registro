package application;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;

public class PasFld {
	private String text;
	private PasswordField txt= new PasswordField();
	private Label lbl = new Label(text);
	
	public PasFld(String text) {
		this.text=text;
	}
	
	public HBox box() {
		HBox bot = new HBox();
		bot.setSpacing(20);
		bot.getChildren().addAll(lbl,txt);
		lbl.setText(text);
		return bot;
	}
}
