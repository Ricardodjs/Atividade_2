
package exercicio2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private CheckBox chcAcao;
    @FXML
    private CheckBox chcComedia;
    @FXML
    private CheckBox chcRomance;
    @FXML
    private CheckBox chcTerror;
    @FXML
    private RadioButton rbTitanic;
    @FXML
    private RadioButton rbNenhum;
    @FXML
    private RadioButton rbJumanji;
    @FXML
    private Button btRespostas;
    @FXML
    private Label lblGenero;
    @FXML
    private Label lblFilme;
    @FXML
    private Label lblOpiniao;
    @FXML
    private TextArea textArealOpiniao;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String filme = "";
         String genero = "";
         String opiniao="";

        //Para verificar se um radioButton esta
        //selecionado utiliza-se o método
        //isSelected()
        if (rbTitanic.isSelected()) {
            //getText() tambem retorna
            //o texto do radio
            filme = rbTitanic.getText();
        }

        if (rbJumanji.isSelected()) {
            filme = rbJumanji.getText();
        }

        if (rbNenhum.isSelected()) {
            filme = rbNenhum.getText();
        }
        
         if(chcAcao.isSelected()){
            //getText retorna o text do checkbox
            genero += chcAcao.getText();
        }
          if(chcTerror.isSelected()){
            //getText retorna o text do checkbox
            genero += chcTerror.getText();
        }
          if(chcRomance.isSelected()){
            //getText retorna o text do checkbox
            genero += chcRomance.getText();
        }
          
           if(chcComedia.isSelected()){
            //getText retorna o text do checkbox
            genero += chcComedia.getText();
        }
        
           //Pegar o texto do textArea
        opiniao +=  textArealOpiniao.getText();
        
        
         
           //setando o label
        lblFilme.setText(filme);
        lblGenero.setText(genero);
        lblOpiniao.setText(opiniao);

    }

@Override
        public void initialize(URL url, ResourceBundle rb) {
        chcAcao.setSelected(true);
    }    
    
}
