package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class GagnePane extends VBox{
    Button retourMenu=new Button("Menu");
    Label cGagne=new Label("C'est gagn� !!!");
     final Image image = new Image("media/coupe.png"); 
     final ImageView coupe = new ImageView(image); 
    

    public GagnePane() {
        this.getChildren().addAll(coupe,cGagne,retourMenu);
        this.setAlignment(Pos.CENTER);
        retourMenu.setPrefSize(200, 50);

        cGagne.setFont (Font.font ( "verdana ", FontWeight.BOLD, FontPosture.REGULAR, 20));
        retourMenu.setFont (Font.font ( "verdana ", FontWeight.BOLD, FontPosture.REGULAR, 20));
        this.setMargin(cGagne, new Insets(20, 0, 0, 0));
        this.setMargin(retourMenu, new Insets(100, 0, 0, 0));
    }

    public Button getRetourMenu() {
        return retourMenu;
    }

    public void setRetourMenu(Button retourMenu) {
        this.retourMenu = retourMenu;
    }



}