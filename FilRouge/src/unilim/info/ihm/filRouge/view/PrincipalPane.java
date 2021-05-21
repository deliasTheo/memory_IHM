package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class PrincipalPane extends VBox {

    MemoryPane memory = new MemoryPane();
    TopPane top = new TopPane();


    public PrincipalPane(){
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