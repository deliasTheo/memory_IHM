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


public class MemoryControllerBtnCarte implements EventHandler<MouseEvent>  {

    final private MemoryPane memory;
    
    Button tempo;
    Button tempo2;
        
    final private Image imgHtml=new Image("media/HTML.png");
    final private Image imgCss=new Image("media/css.png");
    final private Image imgJavaScript=new Image("media/javaScript.jpg");
    final private Image imgJava=new Image("media/java.jpg");
    final private Image imgpython=new Image("media/python.png");
    final private Image imgSql=new Image("media/sql.jpg");
    final private Image imgBash=new Image("media/bash.jpg");
    final private Image imgCd=new Image("media/c#.jpg");
    final private Image imgCp=new Image("media/c++.png");
    final private Image imgPhp=new Image("media/php.png");
    final private Image imgC=new Image("media/logoC.png");
    
    final private ImageView html=new ImageView(imgHtml);
    final private ImageView css=new ImageView(imgCss);
    final private ImageView javaScript=new ImageView(imgJavaScript);
    final private ImageView java=new ImageView(imgJava);
    final private ImageView python=new ImageView(imgpython);
    final private ImageView sql=new ImageView(imgSql);
    final private ImageView bash=new ImageView(imgBash);
    final private ImageView cd=new ImageView(imgCd);
    final private ImageView cp=new ImageView(imgCp);
    final private ImageView php=new ImageView(imgPhp);
    final private ImageView c = new ImageView(imgC);
    
    final private ImageView html2=new ImageView(imgHtml);
    final private ImageView css2=new ImageView(imgCss);
    final private ImageView javaScript2=new ImageView(imgJavaScript);
    final private ImageView java2=new ImageView(imgJava);
    final private ImageView python2=new ImageView(imgpython);
    final private ImageView sql2=new ImageView(imgSql);
    final private ImageView bash2=new ImageView(imgBash);
    final private ImageView cd2=new ImageView(imgCd);
    final private ImageView cp2=new ImageView(imgCp);
    final private ImageView php2=new ImageView(imgPhp);
    final private ImageView c2 = new ImageView(imgC);
    

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
    

    
    int i;
	
    
    public MemoryControllerBtnCarte(MemoryPane memory) {
        this.memory=memory;



        this.imageC(html);
        this.imageC(html2);
        this.imageC(css);
        this.imageC(css2);
        this.imageC(javaScript);
        this.imageC(javaScript2);
        this.imageC(bash);
        this.imageC(bash2);
        this.imageC(python);
        this.imageC(python2);
        this.imageC(c);
        this.imageC(c2);

        
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
        	memory.getBtnCarte().setGraphic(html);
        	i++;
        	
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== html2){
        			tempo2.setId("var");
        		}
        	}
        	
        }
        if (event.getSource()==memory.getBtnCarte2()) {
        	memory.getBtnCarte2().setGraphic(html2);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== html){
        			
        			tempo2.setId("var");
        		}
        	}
        	
        }
        if (event.getSource()==memory.getBtnCarte3()) {
        	memory.getBtnCarte3().setGraphic(css);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== css2){
        			tempo2.setId("var");
        		}
        	}
        }
        
        if (event.getSource()==memory.getBtnCarte4()) {
        	memory.getBtnCarte4().setGraphic(css2);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== css){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte5()) {
        	memory.getBtnCarte5().setGraphic(c);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== c2){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte6()) {
        	memory.getBtnCarte6().setGraphic(c2);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== c){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte7()) {
        	memory.getBtnCarte7().setGraphic(python);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== python2){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte8()) {
        	memory.getBtnCarte8().setGraphic(python2);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== python){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte9()) {
        	memory.getBtnCarte9().setGraphic(bash);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== bash2){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte10()) {
        	memory.getBtnCarte10().setGraphic(bash2);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== bash){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte11()) {
        	memory.getBtnCarte11().setGraphic(javaScript);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== javaScript2){
        			tempo2.setId("var");
        		}
        	}
        }
        if (event.getSource()==memory.getBtnCarte12()) {
        	memory.getBtnCarte12().setGraphic(javaScript2);
        	i++;
        	if (i%2==0) {
        		tempo2=(Button) event.getSource();
        		tempo2.setId("");
        		if (tempo.getGraphic()== javaScript){
        			tempo2.setId("var");
        		}
        	}
        }

    	if (i%2==1) {
    		tempo = (Button) event.getSource();
    		tempo.setId("var");
    	}
        
    	
        if (i%2==0) {
        	if (tempo.getId()==tempo2.getId()) {
        		
        		tempo.setVisible(false);
        		tempo2.setVisible(false);
        		memory.getTop().setJoueur1(memory.getTop().getJoueur1()+1);

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
        
        
    } 
	public void imageC(ImageView img) {
			
		img.setFitHeight(80);
    	img.setFitWidth(80);
			
	}

}
  