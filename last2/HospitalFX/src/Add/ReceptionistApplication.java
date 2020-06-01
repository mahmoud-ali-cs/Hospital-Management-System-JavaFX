package Add;

import Home.*;
import Add.*;
import Update.*;
import OperationsCode.*;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class ReceptionistApplication extends Application {
    
    Department [] dep ;

//    ObservableList obs2 = FXCollections.observableArrayList();
 
    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
        dep = op.selectAllDepartments();
        
        Operations op2 = new Operations();
    
        Text t1 = new Text("First Name");
        Text t2 = new Text("Last Name");
        Text t3 = new Text("ID");
        Text t4 = new Text("Gender");
        Text t5 = new Text("Date Of Birth");
        Text t6 = new Text("Age");
        Text t7 = new Text("Address");
        Text t8 = new Text("Phone Number");
        Text t9 = new Text("E-mail");
        Text t10 = new Text("Salary");
        Text t11 = new Text("ReceptionstAccount");
        
        
        TextField firstNametf = new TextField();
        TextField lastNametf = new TextField();
        TextField idtf = new TextField();
        
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        
        ToggleGroup tg = new ToggleGroup();
        male.setToggleGroup(tg);
        female.setToggleGroup(tg);
        
        TextField dateOfBirthtf = new TextField();
        TextField agetf = new TextField();
        TextField addresstf = new TextField();
        TextField phoneNumbertf = new TextField();
        TextField emailtf = new TextField();
        TextField salarytf = new TextField();
        TextField RecepAccounttf = new TextField();
//        TextField myDepartmenttf = new TextField();
//        TextField myDoctortf = new TextField();
        
    
        // Departments
//        ObservableList obs = FXCollections.observableArrayList();
//        obs.add("Select Department");
//        
//        for(int i = 0 ; i < dep.length ; i++){
//
//            obs.add(dep[i].getDepartmentName());
//        }
//
//        ChoiceBox myDepartmentBox = new ChoiceBox();
//        myDepartmentBox.setItems(obs);
//        myDepartmentBox.setTooltip(new Tooltip("Select Department"));
//        myDepartmentBox.getSelectionModel().selectFirst();

        
        // Doctors


        
      
                
                
                
                
        
        Button add = new Button("Add Receptionst");
        Button update = new Button("-> Update");
        
        
        
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
        root.add(male, 1, 3, 1, 1);
        root.add(female, 2, 3, 1, 1);
        root.add(dateOfBirthtf, 1, 4, 2, 1);
        root.add(agetf, 1, 5, 2, 1);
        root.add(addresstf, 1, 6, 2, 1);
        root.add(phoneNumbertf, 1, 7, 2, 1);
        root.add(emailtf, 1, 8, 2, 1);
        root.add(salarytf, 1, 9, 2, 1);
        root.add(RecepAccounttf, 1, 10, 2, 1);
        
        root.add(add, 1, 11, 1, 1);
        root.add(update, 2, 11, 1, 1);
        
        Scene sc = new Scene(root,500,500);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("Add Recp");
        primaryStage.show();
        
        
        //Action Code ----------------------------------------------
        
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                

                
                if(firstNametf.getText().equals("") || lastNametf.getText().equals("") || idtf.getText().equals("") || dateOfBirthtf.getText().equals("") || agetf.getText().equals("") || addresstf.getText().equals("") || phoneNumbertf.getText().equals("") || emailtf.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter the values of all fields .", "incompele", 0);
                    return ;
                }
                
//                if(myDepartmentBox.getSelectionModel().getSelectedIndex() == 0){
//                    JOptionPane.showMessageDialog(null, "Please select a Department", "Department not Selected", 0);
//                    return ;
//                }
               
                String firstName = firstNametf.getText();
                String lastName = lastNametf.getText();
                String id = idtf.getText();
                String recepAcc = RecepAccounttf.getText();
                
                
                String gender = "";
                if( tg.getSelectedToggle() == male ){
                    gender = "male" ;
                }else if( tg.getSelectedToggle() == female ){
                    gender = "female" ;
                }else{
                    JOptionPane.showMessageDialog(null, "Please select a gender", "gender", 0);
                    return ;
                }
                
                String dateOfBirth = dateOfBirthtf.getText();
                
                int age = -1 ;
                try{
                    age = Integer.parseInt( agetf.getText() );
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid input, Please Enter your Age","Invalid Age",1);
                    return ;
                }
                
                String address = addresstf.getText();
                String phoneNumber = phoneNumbertf.getText();
                String email = emailtf.getText();
                
                double salary = -1 ;
                try{
                    salary = Double.parseDouble(agetf.getText() );
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid input, Please Enter your Age","Invalid Age",1);
                    return ;
                }     
                
//                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
//                System.out.println(dep[depIndex-1].getDepartmentName());
//                int myDepartment = dep[depIndex-1].getMyKey();
                System.out.println("aaaaaaa");
                op.addReceptionist(firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, recepAcc);


            }
        });
        
        
        
        update.setOnAction(new EventHandler<ActionEvent>() {
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


