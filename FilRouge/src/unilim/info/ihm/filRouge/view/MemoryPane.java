package unilim.info.ihm.filRouge.view;




import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.controller.MemoryControllerBtnCarte;

public class MemoryPane extends GridPane {
	private TopPane top;

	private Button btnCarte;
	private Button btnCarte2;
	private Button btnCarte3;
	private Button btnCarte4;
	private Button btnCarte5;
	private Button btnCarte6;
	private Button btnCarte7;
	private Button btnCarte8;
	private Button btnCarte9;
	private Button btnCarte10;
	private Button btnCarte11;
	private Button btnCarte12;
	
	private MemoryControllerBtnCarte ecouteur; 

	private String cheminTheme;

	



	final List<Button> cartes = new ArrayList<Button>();	
			


	
	public MemoryPane(TopPane top, String cheminTheme,Stage primaryStage) {	
		this.cheminTheme=cheminTheme;
		this.ecouteur=new MemoryControllerBtnCarte(this,cheminTheme,primaryStage);

		btnCarte=this.bouttonCovid();
		btnCarte.addEventFilter(MouseEvent.MOUSE_PRESSED,ecouteur);

		btnCarte2=this.bouttonCovid();
		btnCarte2.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte3=this.bouttonCovid();
		btnCarte3.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte4=this.bouttonCovid();
		btnCarte4.addEventFilter(MouseEvent.MOUSE_PRESSED,ecouteur);

		btnCarte5=this.bouttonCovid();
		btnCarte5.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte6=this.bouttonCovid();
		btnCarte6.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte7=this.bouttonCovid();
		btnCarte7.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte8=this.bouttonCovid();
		btnCarte8.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte9=this.bouttonCovid();
		btnCarte9.addEventFilter(MouseEvent.MOUSE_PRESSED,ecouteur);

		btnCarte10=this.bouttonCovid();
		btnCarte10.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte11=this.bouttonCovid();
		btnCarte11.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);

		btnCarte12=this.bouttonCovid();
		btnCarte12.addEventFilter(MouseEvent.MOUSE_PRESSED, ecouteur);
		
		cartes.add(btnCarte);
		cartes.add(btnCarte2);
		cartes.add(btnCarte3);
		cartes.add(btnCarte4);
		cartes.add(btnCarte5);
		cartes.add(btnCarte6);
		cartes.add(btnCarte7);
		cartes.add(btnCarte8);
		cartes.add(btnCarte9);
		cartes.add(btnCarte10);
		cartes.add(btnCarte11);
		cartes.add(btnCarte12);
		
		Collections.shuffle(cartes);
		
		this.top=top;
		this.setHgap(5);
		this.setVgap(7);
		this.setAlignment(Pos.CENTER);
		this.setHgap(20);
	
		for (int i = 0; i < 12; i++) {
            this.add(this.cartes.get(i), i / 3, i % 3);
        }
	}
	









	public Button bouttonCovid() {
		
		Button button=new Button();
		final Image img=new Image(cheminTheme);
		final ImageView imgView = new ImageView(img);
		imgView.setFitHeight(80);
		imgView.setFitWidth(80);
		button.setGraphic(imgView);
		return button;
		
	}
	
	
	
	

	public void setBtnCarte(Button btnCarte) {
		this.btnCarte = btnCarte;
	}





	public void setBtnCarte2(Button btnCarte2) {
		this.btnCarte2 = btnCarte2;
	}



	public void setCheminTheme(String cheminTheme) {
		this.cheminTheme = cheminTheme;
	}





	public String getCheminTheme() {
		return cheminTheme;
	}


	public TopPane getTop() {
		return top;
	}





	public void setTop(TopPane top) {
		this.top = top;
	}





	public void setBtnCarte3(Button btnCarte3) {
		this.btnCarte3 = btnCarte3;
	}





	public void setBtnCarte4(Button btnCarte4) {
		this.btnCarte4 = btnCarte4;
	}





	public void setBtnCarte5(Button btnCarte5) {
		this.btnCarte5 = btnCarte5;
	}





	public void setBtnCarte6(Button btnCarte6) {
		this.btnCarte6 = btnCarte6;
	}





	public void setBtnCarte7(Button btnCarte7) {
		this.btnCarte7 = btnCarte7;
	}





	public void setBtnCarte8(Button btnCarte8) {
		this.btnCarte8 = btnCarte8;
	}





	public void setBtnCarte9(Button btnCarte9) {
		this.btnCarte9 = btnCarte9;
	}





	public void setBtnCarte10(Button btnCarte10) {
		this.btnCarte10 = btnCarte10;
	}





	public void setBtnCarte11(Button btnCarte11) {
		this.btnCarte11 = btnCarte11;
	}





	public void setBtnCarte12(Button btnCarte12) {
		this.btnCarte12 = btnCarte12;
	}





	public Button getBtnCarte() {
		return btnCarte;
	}



	public Button getBtnCarte2() {
		return btnCarte2;
	}



	public Button getBtnCarte3() {
		return btnCarte3;
	}



	public Button getBtnCarte4() {
		return btnCarte4;
	}



	public Button getBtnCarte5() {
		return btnCarte5;
	}



	public Button getBtnCarte6() {
		return btnCarte6;
	}



	public Button getBtnCarte7() {
		return btnCarte7;
	}



	public Button getBtnCarte8() {
		return btnCarte8;
	}



	public Button getBtnCarte9() {
		return btnCarte9;
	}



	public Button getBtnCarte10() {
		return btnCarte10;
	}



	public Button getBtnCarte11() {
		return btnCarte11;
	}



	public Button getBtnCarte12() {
		return btnCarte12;
	}
	
	public MemoryControllerBtnCarte getEcouteur() {
		return ecouteur;
	}










	public List<Button> getCartes() {
		return cartes;
	}


}