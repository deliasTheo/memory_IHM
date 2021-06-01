package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import unilim.info.ihm.filRouge.model.Model;

public class PrincipalPane extends VBox {

	TopPane top;
    MemoryPane memory ;
  

    public PrincipalPane(TopPane top, MemoryPane memory){
    	
        this.memory=memory;
        this.top=top;
        this.getChildren().addAll(top,memory);
        this.setMargin(memory, new Insets(100, 0, 0, 0));

    }
    

    public MemoryPane getMemory() {
        return memory;

    }

    public TopPane getTop() {
        return top;
    }



    
    
    
}

