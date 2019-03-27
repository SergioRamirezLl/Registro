package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TexFld {
	private String text;
	private TextField txt= new TextField();
	private Label lbl = new Label(text);
	
	public TexFld(String text) {
		this.text=text;
	}
	
	public HBox box() {
		HBox bot = new HBox();
		bot.setSpacing(20);
		bot.getChildren().addAll(lbl,txt);
		lbl.setText(text);
		return bot;
	}
	
	public String getTexto() {
		String word = txt.getText();
		return word;
	}
}
