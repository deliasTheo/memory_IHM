package unilim.info.ihm.filRouge.view;



import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

public class TopPane extends HBox {
	File imgPause=new File("C:\\Users\\theop\\Documents\\Cours\\S2\\Javafx\\FilRouge\\memory_IHM\\media\\pause.png");
	String URLPause=imgPause.toURI().toURL().toString();
	Image img=new Image(URLPause, false);
	this.getChildren().addAll(imgPause);
	
}
