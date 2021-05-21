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

public class MemoryControllerBtnCarte implements EventHandler<MouseEvent> {

    final private MemoryPane memory;
        

    final private Image imgCovid=new Image("media/covid.png");  
    final private ImageView covid = new ImageView(imgCovid);
    final private ImageView covid2 = new ImageView(imgCovid);
    final private ImageView covid3 = new ImageView(imgCovid);
    final private ImageView covid4 = new ImageView(imgCovid);
    final private ImageView covid5 = new ImageView(imgCovid);
    final private ImageView covid6 = new ImageView(imgCovid);
    final private ImageView covid7 = new ImageView(imgCovid);
    final private ImageView covid8 = new ImageView(imgCovid);
    final private ImageView covid9 = new ImageView(imgCovid);
    final private ImageView covid10 = new ImageView(imgCovid);
    final private ImageView covid11 = new ImageView(imgCovid);
    final private ImageView covid12 = new ImageView(imgCovid);
    
    MediaPlayer mediaPlayer;
    
	final Image imgC=new Image("media/logoC.png");
    final ImageView langageC1 = new ImageView(imgC);
    final ImageView langageC2 = new ImageView(imgC);
    final ImageView langageC3 = new ImageView(imgC);
    final ImageView langageC4 = new ImageView(imgC);
    final ImageView langageC5 = new ImageView(imgC);
    final ImageView langageC6 = new ImageView(imgC);
    final ImageView langageC7 = new ImageView(imgC);
    final ImageView langageC8 = new ImageView(imgC);
    final ImageView langageC9 = new ImageView(imgC);
    final ImageView langageC10 = new ImageView(imgC);
    final ImageView langageC11 = new ImageView(imgC);
    final ImageView langageC12 = new ImageView(imgC);
    
    
    
    
    int i;
	
    
    public MemoryControllerBtnCarte(MemoryPane memory) {
        this.memory=memory;


        this.imageC(langageC1);
        this.imageC(langageC2);
        this.imageC(langageC3);
        this.imageC(langageC4);
        this.imageC(langageC5);
        this.imageC(langageC6);
        this.imageC(langageC7);
        this.imageC(langageC8);
        this.imageC(langageC9);
        this.imageC(langageC10);
        this.imageC(langageC11);
        this.imageC(langageC12);
        
        this.imageC(covid);
        this.imageC(covid2);
        this.imageC(covid3);
        this.imageC(covid4);
        this.imageC(covid5);
        this.imageC(covid6);
        this.imageC(covid7);
        this.imageC(covid8);
        this.imageC(covid9);
        this.imageC(covid10);
        this.imageC(covid11);
        this.imageC(covid12);
        
      

    }
    
    public void music() {
		String s = "methodeF.mp3";
		String uriString = new File("src\\media\\methodeF.mp3").toURI().toString();
		MediaPlayer player = new MediaPlayer( new Media(uriString));
		player.play();
		
	}
    
    
    
    @Override
    public void handle(MouseEvent event) {
    	this.music();
    	
        if (event.getSource()==memory.getBtnCarte()) {
        	memory.getBtnCarte().setGraphic(langageC1);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte2()) {
        	memory.getBtnCarte2().setGraphic(langageC2);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte3()) {
        	memory.getBtnCarte3().setGraphic(langageC3);
        	i++;
        }
        
        if (event.getSource()==memory.getBtnCarte4()) {
        	memory.getBtnCarte4().setGraphic(langageC4);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte5()) {
        	memory.getBtnCarte5().setGraphic(langageC5);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte6()) {
        	memory.getBtnCarte6().setGraphic(langageC6);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte7()) {
        	memory.getBtnCarte7().setGraphic(langageC7);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte8()) {
        	memory.getBtnCarte8().setGraphic(langageC8);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte9()) {
        	memory.getBtnCarte9().setGraphic(langageC9);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte10()) {
        	memory.getBtnCarte10().setGraphic(langageC10);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte11()) {
        	memory.getBtnCarte11().setGraphic(langageC11);
        	i++;
        }
        if (event.getSource()==memory.getBtnCarte12()) {
        	memory.getBtnCarte12().setGraphic(langageC12);
        	i++;
        }

    	
        
    	
        if (i%2==0) {
        	memory.getBtnCarte().setGraphic(covid);
        	memory.getBtnCarte2().setGraphic(covid2);
        	memory.getBtnCarte3().setGraphic(covid3);
        	memory.getBtnCarte4().setGraphic(covid4);
        	memory.getBtnCarte5().setGraphic(covid5);
        	memory.getBtnCarte6().setGraphic(covid6);
        	memory.getBtnCarte7().setGraphic(covid7);
        	memory.getBtnCarte8().setGraphic(covid8);
        	memory.getBtnCarte9().setGraphic(covid9);
        	memory.getBtnCarte10().setGraphic(covid10);
        	memory.getBtnCarte11().setGraphic(covid11);
        	memory.getBtnCarte12().setGraphic(covid12);


        }
        
        
    } 
	public void imageC(ImageView img) {
			
		img.setFitHeight(80);
    	img.setFitWidth(80);
			
	}

}
  