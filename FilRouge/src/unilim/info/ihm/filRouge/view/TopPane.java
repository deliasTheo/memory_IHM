package unilim.info.ihm.filRouge.view;



import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;
public class TopPane extends HBox {

	ImageView myImageView;

	Image myImage = new Image(getClass().getResourceAsStream("C:\\Users\theop\Documents\Cours\S2\Javafx\FilRouge\memory_IHM\FilRouge\src\ressources\\pause.png"));

	public void displayImage() {
		myImageView.setImage(myImage);
}
}


	
	





  


