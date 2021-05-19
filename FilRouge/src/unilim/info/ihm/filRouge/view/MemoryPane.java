package unilim.info.ihm.filRouge.view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import unilim.info.ihm.filRouge.controller.MemoryController;

public class MemoryPane extends GridPane {
	
	public Image imgCovid=new Image("media/covid.png");
	public ImageView covid = new ImageView(imgCovid);
	public ImageView covid2 = new ImageView(imgCovid);
	public ImageView covid3 = new ImageView(imgCovid);
	public ImageView covid4 = new ImageView(imgCovid);
	public ImageView covid5 = new ImageView(imgCovid);
	public ImageView covid6 = new ImageView(imgCovid);
	public ImageView covid7 = new ImageView(imgCovid);
	public ImageView covid8 = new ImageView(imgCovid);
	public ImageView covid9 = new ImageView(imgCovid);
	public ImageView covid10 = new ImageView(imgCovid);
	public ImageView covid11 = new ImageView(imgCovid);
	public ImageView covid12 = new ImageView(imgCovid);
	
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
	
	private MemoryController ecouteur;
	public MemoryPane() {	
	
		this.setHgap(5);
		this.setVgap(7);
	this.setAlignment(Pos.CENTER);
	this.setHgap(20);
	
		
		
		btnCarte=this.bouttonCovid();
		this.add(btnCarte, 0, 0);
		//ecouteur=new MemoryController(btnCarte,this);
		// créer un controlleur général (sans construicteur pour le bouton) et pour récupéré le bouton qui invoque le eventHandler
		btnCarte.addEventFilter(MouseEvent.MOUSE_PRESSED,new MemoryController(btnCarte,this)/*ecouteur*/);
		
		btnCarte2=this.bouttonCovid();
		this.add(btnCarte2, 0, 1);
		btnCarte2.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte2,this)/*ecouteur*/);
		
		btnCarte3=this.bouttonCovid();
		this.add(btnCarte3, 0, 2);
		btnCarte3.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte3,this));
		
		btnCarte4=this.bouttonCovid();
		this.add(btnCarte4, 1, 0);
		btnCarte4.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte4,this));
		
		btnCarte5=this.bouttonCovid();
		this.add(btnCarte5, 1, 1);
		btnCarte5.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte5,this));
		
		btnCarte6=this.bouttonCovid();
		this.add(btnCarte6, 1, 2);
		btnCarte6.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte6,this));
		
		btnCarte7=this.bouttonCovid();
		this.add(btnCarte7, 2, 0);
		btnCarte7.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte7,this));
		
		btnCarte8=this.bouttonCovid();
		this.add(btnCarte8, 2, 1);
		btnCarte8.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte8,this));
		
		btnCarte9=this.bouttonCovid();
		this.add(btnCarte9, 2, 2);
		btnCarte9.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte9,this));
		
		btnCarte10=this.bouttonCovid();
		this.add(btnCarte10, 3, 0);
		btnCarte10.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte10,this));
		
		btnCarte11=this.bouttonCovid();
		this.add(btnCarte11, 3, 1);
		btnCarte11.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte11,this));
		
		btnCarte12=this.bouttonCovid();
		this.add(btnCarte12, 3, 2);
		btnCarte12.addEventFilter(MouseEvent.MOUSE_PRESSED, new MemoryController(btnCarte12,this));
		
	}
	




	public Button bouttonCovid() {
		
		Button button=new Button();
		final Image imgCovid=new Image("media/covid.png");
		final ImageView covid = new ImageView(imgCovid);
		covid.setFitHeight(80);
		covid.setFitWidth(80);
		button.setGraphic(covid);
		return button;
		
	}
	
	
	
	

	public void setBtnCarte(Button btnCarte) {
		this.btnCarte = btnCarte;
	}





	public void setBtnCarte2(Button btnCarte2) {
		this.btnCarte2 = btnCarte2;
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





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}