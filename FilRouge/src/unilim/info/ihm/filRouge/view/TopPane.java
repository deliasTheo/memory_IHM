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
import javafx.scene.layout.HBox;


public class TopPane extends HBox {

	public Image imgSablier=new Image("media/sablier.png");
	public ImageView sablier = new ImageView();
	public TopPane() {
		//IMAGE SABLIER //
		
		sablier.setImage(imgSablier);
		this.getChildren().add(sablier);
		sablier.setFitHeight(100);
		sablier.setFitWidth(130);
		
		
		//Score//
		Label score = new Label("Score");
        this.getChildren().add(score);
        this.setAlignment(Pos.CENTER);
        this.setMargin(score, new Insets(0, 150, 0, 150));
        
		//IMAGE Pause //	
		Image imgPause=new Image("media/pause.png");
		ImageView pause = new ImageView();
		pause.setImage(imgPause);
		this.getChildren().add(pause);
		
	
		
		
		//BOUTON//
		Button btnPause=new Button();
		
		pause.setFitHeight(70);
		pause.setFitWidth(100);
		btnPause.setGraphic(pause);	
		this.getChildren().add(btnPause);
		
		
	}
	
	
	
	
}


  


