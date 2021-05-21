package unilim.info.ihm.filRouge.controller;

import java.io.File;
import java.nio.file.Paths;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import unilim.info.ihm.filRouge.view.MemoryPane;

public class MemoryController implements EventHandler<MouseEvent> {
    private Button button;
    final private MemoryPane memory;
        
    final private Image imgC=new Image("media/logoC.png");
    final private Image imgCovid=new Image("media/covid.png");
   
    final private ImageView covid = new ImageView(imgCovid);
    final private ImageView langageC = new ImageView(imgC);
    MediaPlayer mediaPlayer;
	public void music() {
		String s = "methodeF.mp3";
		String uriString = new File("C:\\Users\\theop\\Documents\\Cours\\S2\\Javafx\\FilRouge\\memory_IHM\\FilRouge\\src\\media\\methodeF.mp3").toURI().toString();
		MediaPlayer player = new MediaPlayer( new Media(uriString));
		 player.play();
		
	}
    
	
	

	  
	
	
	
	
    int i=0;
    
    public MemoryController(Button button,MemoryPane memory) {
        this.memory=memory;
        this.button=button;
        
        
        langageC.setFitHeight(80);
        langageC.setFitWidth(80);
        covid.setFitHeight(80);
    	covid.setFitWidth(80);
    }
    
    @Override
    public void handle(MouseEvent event) {
    	this.music();
    	
        //((Button) event.getSource()).setGraphic(langageC);
    	button.setGraphic(langageC);
        i++;
        // faire plein de if pour tous les boutons avec le i et tester le getGraphique 
        if (i%2==0) {
        	//memory.getBtnCarte().setGraphic(covid);
        	//memory.getBtnCarte2().setGraphic(covid);
        	button.setGraphic(covid);

        }
        
        
    }

}
  