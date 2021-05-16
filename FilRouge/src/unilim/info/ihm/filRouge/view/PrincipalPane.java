package unilim.info.ihm.fileRouge.view;

import javafx.scene.layout.VBox;

public class PrincipalPane extends VBox {
	
	MemoryPane memory = new MemoryPane();
	TopPane top = new TopPane();
	
	public PrincipalPane(){
		this.getChildren().addAll(memory,top);
		
	}

	public MemoryPane getMemory() {
		return memory;
	}

	public TopPane getTop() {
		return top;
	}
	
}
