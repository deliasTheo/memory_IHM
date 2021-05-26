package unilim.info.ihm.filRouge.controller;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import unilim.info.ihm.filRouge.view.MemoryPane;
import unilim.info.ihm.filRouge.view.MenuPane;
import unilim.info.ihm.filRouge.view.ParametrePane;
import unilim.info.ihm.filRouge.view.TopPane;



public class ParametreControllerReessayer implements EventHandler<MouseEvent> {

	private MemoryPane memory;
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
	
	public ParametreControllerReessayer(MemoryPane memory) {
		this.memory=memory;
	}
	
	@Override
	public void handle(MouseEvent event) {
		
	memory.getBtnCarte().setVisible(true);
	memory.getBtnCarte2().setVisible(true);
	memory.getBtnCarte3().setVisible(true);
	memory.getBtnCarte4().setVisible(true);
	memory.getBtnCarte5().setVisible(true);
	memory.getBtnCarte6().setVisible(true);
	memory.getBtnCarte7().setVisible(true);
	memory.getBtnCarte8().setVisible(true);
	memory.getBtnCarte9().setVisible(true);
	memory.getBtnCarte10().setVisible(true);
	memory.getBtnCarte11().setVisible(true);
	memory.getBtnCarte12().setVisible(true);
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
	covid.setFitHeight(80);
	covid.setFitWidth(80);
	covid2.setFitHeight(80);
	covid2.setFitWidth(80);
	covid3.setFitHeight(80);
	covid3.setFitWidth(80);
	covid4.setFitHeight(80);
	covid4.setFitWidth(80);
	covid5.setFitHeight(80);
	covid5.setFitWidth(80);
	covid6.setFitHeight(80);
	covid6.setFitWidth(80);
	covid7.setFitHeight(80);
	covid7.setFitWidth(80);
	covid8.setFitHeight(80);
	covid8.setFitWidth(80);
	covid9.setFitHeight(80);
	covid9.setFitWidth(80);
	covid10.setFitHeight(80);
	covid10.setFitWidth(80);
	covid11.setFitHeight(80);
	covid11.setFitWidth(80);
	covid12.setFitHeight(80);
	covid12.setFitWidth(80);
	
	}
}

	
	
