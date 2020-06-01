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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;

public class PatientData extends Application {
    
    int patientKey = 33 ;//any value
    
    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
            
        Text t1 = new Text("First Name");
        Text t2 = new Text("Last Name");
        Text t3 = new Text("ID");
        Text t4 = new Text("Gender");
        Text t5 = new Text("Date Of Birth");
        Text t6 = new Text("Age");
        Text t7 = new Text("Address");
        Text t8 = new Text("Phone Number");
        Text t9 = new Text("E-mail");
        Text t10 = new Text("MyDepartment");
        Text t11 = new Text("MyDoctor");
        Text t12 = new Text("Medical History");
        
        
        
        
        Patient p = op.searchInPatient(patientKey);
        
        
        
        TextField firstNametf = new TextField(p.getFirstName());
        TextField lastNametf = new TextField(p.getLastName());
        TextField idtf = new TextField(p.getId());

        TextField gendertf ;
        if(p.getGender() == Person.Gender.male){
            
            gendertf = new TextField("male");
        }else{
            gendertf = new TextField("female");
        }
        
        TextField dateOfBirthtf = new TextField(p.getDateOfBirth());
        TextField agetf = new TextField(Integer.toString(p.getAge()));
        TextField addresstf = new TextField(p.getAddress());
        TextField phoneNumbertf = new TextField(p.getPhoneNumber());
        TextField emailtf = new TextField(p.getEmail());
        
        Department myDepartment = op.searchInDepartment(p.getMyDepartment());
        TextField myDepartmenttf = new TextField(myDepartment.getDepartmentName());
        
        Doctor myDoctor = op.searchInDoctor(p.getMyDoctor());
        TextField myDoctortf = new TextField(myDoctor.getFirstName() + " " + myDoctor.getLastName());
        
        
        
//        TextField diseasestf = new TextField(myDoctor.getFirstName() + " " + myDoctor.getLastName());
        
        
        
        
        
        
        
        //READ ONLY--------------------------------
        firstNametf.setEditable(false);
        lastNametf.setEditable(false);
        addresstf.setEditable(false);
        dateOfBirthtf.setEditable(false);
        agetf.setEditable(false);
        phoneNumbertf.setEditable(false);
        emailtf.setEditable(false);
        gendertf.setEditable(false);
        idtf.setEditable(false);
        myDoctortf.setEditable(false);
        myDepartmenttf.setEditable(false);
                
        
        
        
        
        
        
        
        
                
                
        
        Button back = new Button("--> Back");
        
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        
        root.add(t1, 0, 0, 1, 1);
        root.add(t2, 0, 1, 1, 1);
        root.add(t3, 0, 2, 1, 1);
        root.add(t4, 0, 3, 1, 1);
        root.add(t5, 0, 4, 1, 1);
        root.add(t6, 0, 5, 1, 1);
        root.add(t7, 0, 6, 1, 1);
        root.add(t8, 0, 7, 1, 1);
        root.add(t9, 0, 8, 1, 1);
        root.add(t10, 0, 9, 1, 1);
        root.add(t11, 0, 10, 1, 1);
        
        root.add(firstNametf, 1, 0, 2, 1);
        root.add(lastNametf, 1, 1, 2, 1);
        root.add(idtf, 1, 2, 2, 1);
        root.add(gendertf, 1, 3, 2, 1);
        root.add(dateOfBirthtf, 1, 4, 2, 1);
        root.add(agetf, 1, 5, 2, 1);
        root.add(addresstf, 1, 6, 2, 1);
        root.add(phoneNumbertf, 1, 7, 2, 1);
        root.add(emailtf, 1, 8, 2, 1);
        root.add(myDepartmenttf, 1, 9, 2, 1);
        root.add(myDoctortf, 1, 10, 2, 1);
        
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
