package unilim.info.ihm.filRouge.controller;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import unilim.info.ihm.filRouge.view.MemoryPane;

public class MemoryController implements EventHandler<MouseEvent> {
	private Button button;
	int i=0;
	private Image imgC=new Image("media/logoC.png");
	private ImageView langageC = new ImageView(imgC);
	private MemoryPane memory;
	final Image imgCovid=new Image("media/covid.png");
	final ImageView covid = new ImageView(imgCovid);
	public MemoryController(Button button,MemoryPane memory) {
		this.memory=memory;
		this.button=button;
		
	
}
	@Override
	public void handle(MouseEvent event) {
		
		button.setGraphic(langageC);
		langageC.setFitHeight(80);
		langageC.setFitWidth(80);
		i++;

		if (i==2) {
			
			
			memory.setBtnCarte(memory.getBtnCarte());
			memory.getBtnCarte().setGraphic(covid);
			memory.getBtnCarte2().setGraphic(covid);
			memory.getBtnCarte3().setGraphic(covid);
			memory.getBtnCarte4().setGraphic(covid);
			memory.getBtnCarte5().setGraphic(covid);
			memory.getBtnCarte6().setGraphic(covid);
			memory.getBtnCarte7().setGraphic(covid);
			memory.getBtnCarte8().setGraphic(covid);
			memory.getBtnCarte9().setGraphic(covid);
			memory.getBtnCarte10().setGraphic(covid);
			memory.getBtnCarte11().setGraphic(covid);
			memory.getBtnCarte12().setGraphic(covid);
			
		}
	}

}
