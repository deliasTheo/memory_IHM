package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class PrincipalPane extends VBox {

	TopPane top;
    MemoryPane memory ;

    public PrincipalPane(TopPane top, MemoryPane memory){
    	
        this.memory=memory;
        this.top=top;
        this.getChildren().addAll(top,memory);
        this.setMargin(memory, new Insets(100, 0, 0, 0));

    }
    
public PrincipalPane GenererMemePane() {
	TopPane newTop=new TopPane();
	MemoryPane newMemory=new MemoryPane(newTop);
	return new PrincipalPane(newTop, newMemory);
}
    public MemoryPane getMemory() {
        return memory;

    }

    public TopPane getTop() {
        return top;
    }
    
}

