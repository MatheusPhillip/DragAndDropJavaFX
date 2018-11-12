package draganddrop;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author Phillip
 */
public class FXMLDocumentController implements Initializable {

    private Label Drag;
    @FXML
    private ImageView setaDireita;
    @FXML
    private ImageView target1;
    @FXML
    private ImageView setaCima;
    @FXML
    private ImageView setaEsquerda;
    @FXML
    private ImageView setaBaixo;

    private int contador = 1;
    @FXML
    private ImageView target2;
    @FXML
    private ImageView target3;
    @FXML
    private ImageView target4;
    @FXML
    private Button buttonClean;
    @FXML
    private ImageView target5;
    @FXML
    private ImageView target6;
    @FXML
    private ImageView target7;
    @FXML
    private ImageView target8;
    @FXML
    private ImageView target9;
    @FXML
    private ImageView target10;
    @FXML
    private ImageView target11;
    @FXML
    private ImageView target12;
    @FXML
    private ImageView target13;
    @FXML
    private ImageView target14;
    @FXML
    private ImageView target15;
    @FXML
    private ImageView target16;
    @FXML
    private ImageView target17;
    @FXML
    private ImageView target18;
    @FXML
    private ImageView target19;
    @FXML
    private ImageView target20;
    @FXML
    private ImageView target21;
    @FXML
    private ImageView target22;
    @FXML
    private ImageView target23;
    @FXML
    private ImageView target24;

    public String[] comandos; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // 
    }

    /*
    @FXML
    private void handleDragDetection(MouseEvent event) {
        
        Dragboard db = Drag.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putString(Drag.getText());
        
        db.setContent(cb);
        
        event.consume();
        
        
        /*
        Dragboard db = DragGrid.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putString(DragGrid.getAlignment().toString());
        db.setContent(cb);
        event.consume();
       
        
    }
     */
    @FXML
    private void handleDragOver(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    private void handleImageDrop(DragEvent event) {

        Image img = event.getDragboard().getImage();

       
        if(contador <= 24){
            String idName2 = "#target" + contador;
            ImageView imageview = (ImageView) target8.getScene().lookup(idName2);
            imageview.setImage(img);
            //comandos[contador - 1] = idName2;
            contador++;
        }
        

//        if (contador == 0) {
//            target1.setImage(img);
//            Comandos.add(contador);
//        } else if (contador == 1) {
//            target2.setImage(img);
//            Comandos.add(contador);
//        } else if (contador == 2) {
//            target3.setImage(img);
//            Comandos.add(contador);
//        } else if (contador == 3) {
//            target4.setImage(img);
//            Comandos.add(contador);
//        }
//        contador++;
    }

    @FXML
    private void handleDragDetection(MouseEvent event) {

        ImageView tempImg = (ImageView) event.getTarget();

        Dragboard db = tempImg.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(tempImg.getImage());

        db.setContent(cb);

        event.consume();
    }

    @FXML
    private void Reset(ActionEvent event) {

        for (int i = 1; i <= 24; i++) {
            String idName = "#target" + i;
            ImageView imageview = (ImageView) target8.getScene().lookup(idName);
            imageview.setImage(null);
        }

//        target1.setImage(null);
//        target2.setImage(null);
//        target3.setImage(null);
//        target4.setImage(null);
//
          contador = 1;
    }
    

}
