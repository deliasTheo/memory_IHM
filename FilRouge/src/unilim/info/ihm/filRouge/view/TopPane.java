package unilim.info.ihm.filRouge.view;



import java.io.File;
import java.io.FileInputStream;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import unilim.info.ihm.filRouge.controller.MenuControllerJouer;


public class TopPane extends HBox {

    public Image imgSablier=new Image("media/sablier.png");
    public ImageView sablier = new ImageView();
    public Button btnPause=new Button();
    Integer joueur1 = 0;
    Integer joueur2 = 0;
    public TopPane() {
    	
        //IMAGE SABLIER //
        sablier.setImage(imgSablier);
        this.getChildren().add(sablier);
        sablier.setFitHeight(100);
        sablier.setFitWidth(130);


        //Score//
        Label score = new Label(joueur1.toString() + " - " + joueur2.toString());   this.getChildren().add(score);
        this.setAlignment(Pos.CENTER);
        this.setMargin(score, new Insets(0, 150, 0, 150));

        //IMAGE Pause //
        Image imgPause=new Image("media/pause.png");
        ImageView pause = new ImageView();
        pause.setImage(imgPause);
        this.getChildren().add(pause);
        
        //BOUTON//
        pause.setFitHeight(70);
        pause.setFitWidth(100);
        btnPause.setGraphic(pause);
        this.getChildren().add(btnPause);
		
    }  
    
    
	public Integer getJoueur1() {
		return joueur1;
	}


	public void setJoueur1(Integer joueur1) {
		this.joueur1 = joueur1;
	}


	public Integer getJoueur2() {
		return joueur2;
	}


	public void setJoueur2(Integer joueur2) {
		this.joueur2 = joueur2;
	}


	public Button getBtnPause() {
		return btnPause;
	}
	public void setBtnPause(Button btnPause) {
		this.btnPause = btnPause;
	}
	
	public Image getImgSablier() {
		return imgSablier;
	}
	public void setImgSablier(Image imgSablier) {
		this.imgSablier = imgSablier;
	}
	public ImageView getSablier() {
		return sablier;
	}
	public void setSablier(ImageView sablier) {
		this.sablier = sablier;
	}




}