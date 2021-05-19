package unilim.info.ihm.filRouge.controller;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import unilim.info.ihm.filRouge.view.MemoryPane;

public class MemoryController implements EventHandler<MouseEvent> {
    private Button button;
    final private MemoryPane memory;
        
    final private Image imgC=new Image("media/logoC.png");
    final private Image imgCovid=new Image("media/covid.png");
   
    final private ImageView covid = new ImageView(imgCovid);
    final private ImageView langageC = new ImageView(imgC);
    
    
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