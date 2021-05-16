package unilim.info.ihm.filRouge.view;



import java.io.File;
import java.io.FileInputStream;


import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class TopPane extends HBox {

	public TopPane() {
		Image imgPause=new Image("media/pause.png");
		ImageView pause = new ImageView();
		pause.setImage(imgPause);
		this.getChildren().add(pause);
	}
	
	
	
	
}


