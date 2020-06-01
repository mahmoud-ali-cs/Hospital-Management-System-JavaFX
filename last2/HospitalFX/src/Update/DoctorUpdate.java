package Update;

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

public class DoctorUpdate extends Application {
    
    int doctorKey = 5 ;//any value
    
    //part1
    Department [] dep ;

    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
        //part2
        dep = op.selectAllDepartments();
        
    
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
        Text t11 = new Text("MyDepartment");
        
        
        
        
        Doctor d = op.searchInDoctor(doctorKey);
        
        
        
        TextField firstNametf = new TextField(d.getFirstName());
        TextField lastNametf = new TextField(d.getLastName());
        TextField idtf = new TextField(d.getId());
        
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        
        ToggleGroup tg = new ToggleGroup();
        male.setToggleGroup(tg);
        female.setToggleGroup(tg);
        if(d.getGender() == Person.Gender.male){
            
            tg.selectToggle(male);
        }else{
            tg.selectToggle(female);
        }
        
        TextField dateOfBirthtf = new TextField(d.getDateOfBirth());
        TextField agetf = new TextField(Integer.toString(d.getAge()));
        TextField addresstf = new TextField(d.getAddress());
        TextField phoneNumbertf = new TextField(d.getPhoneNumber());
        TextField emailtf = new TextField(d.getEmail());
        TextField salarytf = new TextField(Double.toString(d.getSalary()));
//        TextField myDepartmenttf = new TextField();
//        TextField myDoctortf = new TextField();
        
        
        // Departments
        //part3
        ObservableList obs = FXCollections.observableArrayList();
        obs.add("Select Department");
        
        ChoiceBox myDepartmentBox = new ChoiceBox();
        myDepartmentBox.setItems(obs);
        myDepartmentBox.setTooltip(new Tooltip("Select Department"));
        
        for(int i = 0 ; i < dep.length ; i++){

            obs.add(dep[i].getDepartmentName());
            if( d.getMyDepartment() == dep[i].getMyKey() ){
                
                myDepartmentBox.getSelectionModel().select(dep[i].getDepartmentName());
            }
        }


        
                
                
                
        
        Button add = new Button("Update Patient");
        add.setAlignment(Pos.CENTER);
        
        
        
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
        root.add(myDepartmentBox, 1, 10, 2, 1);
        
        root.add(add, 1, 11, 2, 1);
        
        Scene sc = new Scene(root,500,500);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("Update Doctor");
        primaryStage.show();
        
        
        //Action Code ----------------------------------------------
        
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                

                
                if(firstNametf.getText().equals("") || lastNametf.getText().equals("") || idtf.getText().equals("") || dateOfBirthtf.getText().equals("") || agetf.getText().equals("") || addresstf.getText().equals("") || phoneNumbertf.getText().equals("") || emailtf.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter the values of all fields .", "incompele", 0);
                    return ;
                }
                
                if(myDepartmentBox.getSelectionModel().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Please select a Department", "Department not Selected", 0);
                    return ;
                }
                
                String firstName = firstNametf.getText();
                String lastName = lastNametf.getText();
                String id = idtf.getText();
                
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
                    salary = Double.parseDouble( agetf.getText() );
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid input, Please Enter your Salary","Invalid Salary",1);
                    return ;
                }

                //part4
                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
                int myDepartment = dep[depIndex-1].getMyKey();
                
                
                op.updateDoctor(doctorKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, myDepartment);

            }
        });
        
        
        
        
        
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
