package Home;

import Home.*;
import Add.*;
import Update.*;
import OperationsCode.*;

import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

public class PatientMedicalHistory extends Application {
    
    int patientKey = 33 ;//any value
    
    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
        Patient p = op.searchInPatient(patientKey);
        String [][] m = {{"aaa" , "bbb" , "ccc" , "dddddd"} ,{"aaa" , "bbb" , "ccc" , "dddddd"} } ;
        p.setMedicalArr(m);
        String [][] medical = p.getMedicalArr() ;
            
        TextField [][] tf = new TextField[2][3] ;
        
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                tf[i][j].setText(medical[i][j]);
            }
        }
        
//        TextArea [] ta = new TextArea[medical.length] ;
//        for(int i = 0 ; i < ta.length ; i++){
//            ta[i].setText(medical[i][medical.length-1]);
//        }
        
        
//        System.out.println(p.getMedicalHistory());
//        p.getMedicalArr();
        
        
        
        
        
        
        
        
        //READ ONLY--------------------------------
//        firstNametf.setEditable(false);
//        lastNametf.setEditable(false);
//        addresstf.setEditable(false);
//        dateOfBirthtf.setEditable(false);
//        agetf.setEditable(false);
//        phoneNumbertf.setEditable(false);
//        emailtf.setEditable(false);
//        gendertf.setEditable(false);
//        idtf.setEditable(false);
//        myDoctortf.setEditable(false);
//        myDepartmenttf.setEditable(false);
                
        
        
        
        
        
        
        
        
                
                
        
        Button back = new Button("--> Back");
        
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        
//        for(int i = 0 ; i < tf.length ; i++){
//            for(int j = 0 ; j < tf[0].length ; j++){
//                
//                root.add(tf[i][j], j, i, 1, 1);
//                System.out.println("i : " + i + "  j : " + j);
//            }
//        }
//
//        for(int i = 0 ; i < ta.length ; i++){
//
//            root.add(ta[i], medical.length-1, i, 1, 1);
//            System.out.println("i : " + i );
//        }
        
        root.add(back, 2, 11, 1, 1);
        
        Scene sc = new Scene(root,500,500);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("Patient Data");
        primaryStage.show();
        
        
        
        
        
        
        
        //Back Button Action--------------------------------------
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                HomePage homePage = new HomePage();
                try {
                    homePage.start(primaryStage);
                } catch (Exception ex) {
//                    Logger.getLogger(PatientApplication.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
            }
        });        
        
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
