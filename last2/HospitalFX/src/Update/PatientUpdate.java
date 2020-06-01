package Update;

import Home.*;
import Add.*;
import Update.*;
import OperationsCode.*;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
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

public class PatientUpdate extends Application {
    int patientKey = 43 ;
    
    
    Department [] dep ;
    int depKey  = -1;
    Doctor [] doc ;

    ObservableList obsDoc = FXCollections.observableArrayList();
 
    int [] docKeys ;
    int docCount = 0 ;
    
    
    Room [] rooms ;

    ObservableList obsRoom = FXCollections.observableArrayList();
 
    int [] roomKeys ;
    int roomCount = 0 ;    
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
        dep = op.selectAllDepartments();
        doc = op.selectAllDoctors();
        rooms = op.selectAllRooms();

        Patient p = op.searchInPatient(patientKey);
        
        
        
//        Operations op2 = new Operations();
//        op2.addDoctor("mahmoud", "mohamed", "222222", "male", "22/22/5", 22, "rrrrr", "015846", "iiiii", 5000, 1, "");
//        op2.addDoctor("marwan", "mohamed", "222222", "male", "22/22/5", 22, "rrrrr", "015846", "iiiii", 5000, 1, "");
//        op2.addDoctor("fawzy", "mohamed", "222222", "male", "22/22/5", 22, "rrrrr", "015846", "iiiii", 5000, 1, "");
    
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
        Text t12 = new Text("Room Type");
        Text t13 = new Text("MyRoom");
        Text t14 = new Text("Medical History");
        
        
        TextField firstNametf = new TextField(p.getFirstName());
        TextField lastNametf = new TextField(p.getLastName());
        TextField idtf = new TextField(p.getId());
        
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        
        ToggleGroup tg = new ToggleGroup();
        male.setToggleGroup(tg);
        female.setToggleGroup(tg);
        if(p.getGender() == Person.Gender.male){
            
            tg.selectToggle(male);
        }else{
            tg.selectToggle(female);
        }
        
        TextField dateOfBirthtf = new TextField(p.getDateOfBirth());
        TextField agetf = new TextField(Integer.toString(p.getAge()));
        TextField addresstf = new TextField(p.getAddress());
        TextField phoneNumbertf = new TextField(p.getPhoneNumber());
        TextField emailtf = new TextField(p.getEmail());
//        TextField myDepartmenttf = new TextField();
//        TextField myDoctortf = new TextField();
        
        TextArea medicalta = new TextArea(p.getMedicalHistory());

    
        // Departments
        ObservableList obsDep = FXCollections.observableArrayList();
        obsDep.add("Select Department");
        
        ChoiceBox myDepartmentBox = new ChoiceBox();
        myDepartmentBox.setItems(obsDep);
        myDepartmentBox.setTooltip(new Tooltip("Select Department"));
        
        for(int i = 0 ; i < dep.length ; i++){

            obsDep.add(dep[i].getDepartmentName());
            if( p.getMyDepartment() == dep[i].getMyKey() ){
                
                myDepartmentBox.getSelectionModel().select(dep[i].getDepartmentName());
            }
        }
        
        // Doctors

        ChoiceBox myDoctorBox = new ChoiceBox();
        myDoctorBox.setItems(obsDoc);
        myDoctorBox.setTooltip(new Tooltip("Select Doctor"));

      
        //change myDepartment
        final List optionsDep = myDepartmentBox.getItems();
        myDepartmentBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                System.out.println("Old Selected Option: " + oldValue.toString());
//                System.out.println("New Selected Option: " +newValue.toString());
                if( !oldValue.toString().equals("0") ){
//                    System.out.println("newValue.toString() : "+newValue.toString());
                    obsDoc.clear();
                    docCount = 0 ;
                }
                
                if( newValue.toString().equals("0") ){
                    
//                    obs2.remove(1, docKeys.length);
                    obsDoc.clear();
                    docCount = 0 ;
                    return ;
                }
                if( newValue.toString().equals( oldValue.toString() ) ){
                    
                    return ;
                }
                

//                obs2 = null ;
//                obs2 = FXCollections.observableArrayList();
                obsDoc.add("Select Doctor");
                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
                depKey = dep[depIndex-1].getMyKey() ;
                
                docKeys = new int [doc.length];
                for(int i = 0 ; i < doc.length ; i++){
                    if( doc[i].getMyDepartment() == depKey ){
                        if(doc[i].getMyPatient().length < 5){ //max num of patients is -> 5
                            
                            obsDoc.add(doc[i].getFirstName()+" "+doc[i].getLastName());
                            docKeys[docCount]=doc[i].getMyKey();
                            
                            if( p.getMyDoctor()== doc[i].getMyKey() ){

                                myDoctorBox.getSelectionModel().select(doc[i].getFirstName()+" "+doc[i].getLastName());
                            }                                     
                            docCount++ ;
                        }
                    }
                }

                myDoctorBox.getSelectionModel().selectFirst();
                
            }
        });
                
                
              
        
        
        // Room Types
        ObservableList obsType = FXCollections.observableArrayList();
        obsType.addAll("Select Department" , "Surgery" , "A" , "B" , "C");
        
        ChoiceBox myRoomTypeBox = new ChoiceBox();
        myRoomTypeBox.setItems(obsType);
        myRoomTypeBox.setTooltip(new Tooltip("Select Type"));

//        myRoomTypeBox.getSelectionModel().select();

        // Room
        ChoiceBox myRoomBox = new ChoiceBox();
        myRoomBox.setItems(obsRoom);
        myRoomBox.setTooltip(new Tooltip("Select Doctor"));

      
        //change myRoomType
        final List optionsType = myRoomTypeBox.getItems();
        myRoomTypeBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                System.out.println("Old Selected Option: " + oldValue.toString());
//                System.out.println("New Selected Option: " +newValue.toString());
                if( !oldValue.toString().equals("0") ){
//                    System.out.println("newValue.toString() : "+newValue.toString());
                    obsRoom.clear();
                    roomCount = 0 ;
                }
                
                if( newValue.toString().equals("0") ){
                    
//                    obs2.remove(1, docKeys.length);
                    obsRoom.clear();
                    roomCount = 0 ;
                    return ;
                }
                if( newValue.toString().equals( oldValue.toString() ) ){
                    
                    return ;
                }
                

//                obs2 = null ;
//                obs2 = FXCollections.observableArrayList();
                obsRoom.add("Select Room");
                int roomTypeIndex = myRoomTypeBox.getSelectionModel().getSelectedIndex();
                String type = "" ;
                if(roomTypeIndex == 1 ){
                    type = "Surgery" ;
                }else if(roomTypeIndex == 2){
                    type = "A" ;
                    
                }else if(roomTypeIndex == 3){
                    type = "B" ;
                    
                }else if(roomTypeIndex == 4){
                    type = "C" ;
                    
                }else{
                    System.out.println("Error in Room Type ");
                    System.exit(0);
                }


//                int roomKey = rooms[roomTypeIndex-1].getMyKey() ;
                
                roomKeys = new int [rooms.length];
                for(int i = 0 ; i < rooms.length ; i++){
                    if( rooms[i].getMyDepartment() == depKey && rooms[i].getType().equals(type)){
                        if(rooms[i].getNumOfPatients() < rooms[i].getNumOfBeds()){ 
                            
                            obsRoom.add(rooms[i].getMyKey());
                            roomKeys[roomCount]=rooms[i].getMyKey();
                            
                            if( p.getMyRoom()== rooms[i].getMyKey() ){

                                myRoomBox.getSelectionModel().select(rooms[i].getMyKey());
                                myRoomTypeBox.getSelectionModel().select(rooms[i].getType());
                            }                                     
                            
                            roomCount++ ;
                        }
                    }
                }

                myRoomBox.getSelectionModel().selectFirst();
                
            }
        });        
        
        
        
                
        
        Button add = new Button("Update Patient");
        Button back = new Button("-> back");
        
        
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(15));
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
        root.add(t12, 0, 11, 1, 1);
        root.add(t13, 0, 12, 1, 1);
        root.add(t14, 0, 13, 1, 1);
        
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
        root.add(myDepartmentBox, 1, 9, 2, 1);
        root.add(myDoctorBox, 1, 10, 2, 1);
        root.add(myRoomTypeBox, 1, 11, 2, 1);
        root.add(myRoomBox, 1, 12, 2, 1);
        root.add(medicalta, 1, 13, 2, 1);
        
        root.add(add, 1, 14, 1, 1);
        root.add(back, 2, 14, 1, 1);
        
        Scene sc = new Scene(root);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("Add Patient");
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
                if(myDoctorBox.getSelectionModel().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Please select a Doctor", "Doctor not Selected", 0);
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
                String medicalHistory = medicalta.getText();
                
                Instant time  = Instant.now();
                String startTime =  time.toString() ;
                
                double dur = Duration.between(Instant.parse(p.getStartTime()), time).toHours();
                System.out.println("Dur between ( " +Instant.parse(p.getStartTime()) + " , " + time + " ) " + dur);
                
                
                
                int roomTypeIndex = myRoomTypeBox.getSelectionModel().getSelectedIndex();
                String type = "" ;
                if(roomTypeIndex == 1 ){
                    type = "Surgery" ;
                }else if(roomTypeIndex == 2){
                    type = "A" ;
                    
                }else if(roomTypeIndex == 3){
                    type = "B" ;
                    
                }else if(roomTypeIndex == 4){
                    type = "C" ;
                    
                }else{
                    System.out.println("Error in Room Type ");
                    System.exit(0);
                }
                
                double fees = 0 ;
                if( type.equalsIgnoreCase("Surgery")){
                    fees = dur * 300 ;
                }else if( type.equalsIgnoreCase("A")){
                    fees = dur * 200 ;
                }else if( type.equalsIgnoreCase("B")){
                    fees = dur * 100 ;
                }else if( type.equalsIgnoreCase("C")){
                    fees = dur * 80 ;
                }else{
                    System.out.println("Error in fees ");
                    System.exit(0);
                }
                
                fees += p.getFees() ;
                
                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
                System.out.println(dep[depIndex-1].getDepartmentName());
                int myDepartment = dep[depIndex-1].getMyKey();
                
                int docIndex = myDoctorBox.getSelectionModel().getSelectedIndex();
//                System.out.println(doc[docIndex-1].getFirstName());
                int myDoctor = docKeys[docIndex-1];
                
                
                int roomIndex = myRoomBox.getSelectionModel().getSelectedIndex();
                int myRoom = roomKeys[roomIndex-1];
                
    
                op.updatePatient(patientKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, medicalHistory, myDoctor, myDepartment, myRoom, startTime, fees);


            }
        });
        
        
        
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


