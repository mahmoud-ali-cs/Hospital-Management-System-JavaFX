package Home;

import Home.*;
import Add.*;
import Update.*;
import OperationsCode.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePage extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Operations op = new Operations();
//        op.addAcount("mahmoud", "123456", "manager", 0);
//        op.addDepartment("Department One", "", 0, "", 0, "", 0, "", 0);
//        op.addDoctor("mahmoud", "mohamed", "546984656", "male", "11/11/2018", 20, "fdagag", "54621654", "fasfasgasg", 2000, 0);
//        op.addNurse("mahmoud", "mohamed", "564531354", "male", "22/66/11", 33, "gsfdgdfg", "964621", "fafadfaf", 6000, 0);
//        op.addRoom(1, "Surgery", 0);
//        op.addManager("mahmoud", "mohamed", "54464654", "male", "22/22/25",20 , "fadsgsa", "5264513", "dgftrtr", 20000, "mahmoud");
//        op.addReceptionist("mahmoud", "mohamed", "56435135", "male", "22/22/200", 20, "aaaaaa", "555555", "tgreysy", 6000, "mohamed");










        // TEXT -------------------------------------
        Text tm = new Text("Manager ");
        Text tdep = new Text("Department ");
        Text troom = new Text("Room ");
        Text td = new Text("Doctor ");
        Text tn = new Text("Nurse ");
        Text tr = new Text("Receptionist ");
        Text te = new Text("Employee ");
        Text tp = new Text("Patient");
        
        
        //BUTTON ---------------------------------------------
        //Manager -------------------------
        Button bm1 = new Button("Show data");
        Button bm2 = new Button("add Manager");
        Button bm3 = new Button("Update Manager");
        Button bm4 = new Button("delete Manager");

        //Department-----------------------
        Button bdep1 = new Button("Show data");
        Button bdep2 = new Button("add Department");
        Button bdep3 = new Button("Update Department");
        Button bdep4 = new Button("delete Department");

        //Room-----------------------------
        Button broom1 = new Button("Show data");
        Button broom2 = new Button("add Room");
        Button broom3 = new Button("Update Room");
        Button broom4 = new Button("delete Room");

        //Doctor---------------------------
        Button bd1 = new Button("Show data");
        Button bd2 = new Button("add Doctor");
        Button bd3 = new Button("Update Doctor");
        Button bd4 = new Button("delete Doctor");

        //Nurse----------------------------
        Button bn1 = new Button("Show data");
        Button bn2 = new Button("add Nurse");
        Button bn3 = new Button("Update Nurse");
        Button bn4 = new Button("delete Nurse");

        //Receptionist---------------------
        Button br1 = new Button("Show data");
        Button br2 = new Button("add Receptionist");
        Button br3 = new Button("Update Receptionist");
        Button br4 = new Button("delete Receptionist");

        //Employee-------------------------
        Button be1 = new Button("Show data");
        Button be2 = new Button("add Employee");
        Button be3 = new Button("Update Employee");
        Button be4 = new Button("delete Employee");

        //Patient--------------------------
        Button bp1 = new Button("Show data");
        Button bp2 = new Button("add Patient");
        Button bp3 = new Button("Update Patient");
        Button bp4 = new Button("delete Patient");

        
        
        
        
        
        
        //Creating the Action event handler 
        EventHandler<ActionEvent> eventHandler = 
           new EventHandler<ActionEvent>() { 

           @Override 
           public void handle(ActionEvent e) { 
               
                //Manager -------------------------
               if(e.getTarget() == bm1){
               }else if(e.getTarget() == bm2){
               }else if(e.getTarget() == bm3){
                   ManagerUpdate managerUpdate = new ManagerUpdate();
                   managerUpdate.start(primaryStage);
               }else if(e.getTarget() == bm4){
                   
                   
                //Department-----------------------
               }else if(e.getTarget() == bdep1){
               }else if(e.getTarget() == bdep2){
                   DepartmentApplication departmentApplication = new DepartmentApplication();
                   departmentApplication.start(primaryStage);                   
               }else if(e.getTarget() == bdep3){
                   DepartmentUpdate departmentUpdate = new DepartmentUpdate();
                   departmentUpdate.start(primaryStage);
               }else if(e.getTarget() == bdep4){

                //Room-----------------------------
               }else if(e.getTarget() == broom1){
               }else if(e.getTarget() == broom2){
                   RoomApplication roomApplication = new RoomApplication();
                   roomApplication.start(primaryStage);
               }else if(e.getTarget() == broom3){
                   RoomUpdate roomUpdate = new RoomUpdate();
                   roomUpdate.start(primaryStage);
               }else if(e.getTarget() == broom4){
                   
                //Doctor---------------------------
               }else if(e.getTarget() == bd1){
               }else if(e.getTarget() == bd2){
                   DoctorApplication doctorApplication = new DoctorApplication();
                   doctorApplication.start(primaryStage);
               }else if(e.getTarget() == bd3){
                   DoctorUpdate doctorUpdate = new DoctorUpdate();
                   doctorUpdate.start(primaryStage);
               }else if(e.getTarget() == bd4){
                   
                //Nurse----------------------------
               }else if(e.getTarget() == bn1){
               }else if(e.getTarget() == bn2){
                   NurseApplication nurseApplication = new NurseApplication();
                   nurseApplication.start(primaryStage);
               }else if(e.getTarget() == bn3){
                   NurseUpdate nurseUpdate = new NurseUpdate();
                   nurseUpdate.start(primaryStage);
               }else if(e.getTarget() == bn4){
                   
                //Receptionist---------------------
               }else if(e.getTarget() == br1){
               }else if(e.getTarget() == br2){
                   ReceptionistApplication receptionistApplication = new ReceptionistApplication();
                   receptionistApplication.start(primaryStage);
               }else if(e.getTarget() == br3){
                   
               }else if(e.getTarget() == br4){
                   
                //Employee-------------------------
               }else if(e.getTarget() == be1){
               }else if(e.getTarget() == be2){
               }else if(e.getTarget() == be3){
               }else if(e.getTarget() == be4){
                   
               }else if(e.getTarget() == bp1){
                   MyTableView myTableView = new MyTableView();
                   myTableView.start(primaryStage);
               }else if(e.getTarget() == bp2){
                   PatientApplication patientApplication = new PatientApplication();
                   patientApplication.start(primaryStage);
               }else if(e.getTarget() == bp3){
                   PatientUpdate patientUpdate = new PatientUpdate();
                   patientUpdate.start(primaryStage);
               }else if(e.getTarget() == bp4){
                   PatientsHome patientsHome = new PatientsHome();
                   patientsHome.start(primaryStage);

                  
               }else{
                   
               }
           } 
        };    
        
        
        //Adding the event handler 
        //Manager -------------------------
        bm1.addEventHandler(ActionEvent.ACTION, eventHandler);
        bm2.addEventHandler(ActionEvent.ACTION, eventHandler);
        bm3.addEventHandler(ActionEvent.ACTION, eventHandler);
        bm4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Department-----------------------
        bdep1.addEventHandler(ActionEvent.ACTION, eventHandler);
        bdep2.addEventHandler(ActionEvent.ACTION, eventHandler);
        bdep3.addEventHandler(ActionEvent.ACTION, eventHandler);
        bdep4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Room-----------------------------
        broom1.addEventHandler(ActionEvent.ACTION, eventHandler);
        broom2.addEventHandler(ActionEvent.ACTION, eventHandler);
        broom3.addEventHandler(ActionEvent.ACTION, eventHandler);
        broom4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Doctor---------------------------
        bd1.addEventHandler(ActionEvent.ACTION, eventHandler);
        bd2.addEventHandler(ActionEvent.ACTION, eventHandler);
        bd3.addEventHandler(ActionEvent.ACTION, eventHandler);
        bd4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Nurse----------------------------
        bn1.addEventHandler(ActionEvent.ACTION, eventHandler);
        bn2.addEventHandler(ActionEvent.ACTION, eventHandler);
        bn3.addEventHandler(ActionEvent.ACTION, eventHandler);
        bn4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Receptionist---------------------
        br1.addEventHandler(ActionEvent.ACTION, eventHandler);
        br2.addEventHandler(ActionEvent.ACTION, eventHandler);
        br3.addEventHandler(ActionEvent.ACTION, eventHandler);
        br4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Employee-------------------------
        be1.addEventHandler(ActionEvent.ACTION, eventHandler);
        be2.addEventHandler(ActionEvent.ACTION, eventHandler);
        be3.addEventHandler(ActionEvent.ACTION, eventHandler);
        be4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        //Patient--------------------------
        bp1.addEventHandler(ActionEvent.ACTION, eventHandler);
        bp2.addEventHandler(ActionEvent.ACTION, eventHandler);
        bp3.addEventHandler(ActionEvent.ACTION, eventHandler);
        bp4.addEventHandler(ActionEvent.ACTION, eventHandler);
        
        
        
        
        
        
        
        
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(15));
        root.setVgap(15);
        root.setHgap(15);
        
        
        root.add(tm, 0, 0);
        root.add(tdep, 0, 1);
        root.add(troom, 0, 2);
        root.add(td, 0, 3);
        root.add(tn, 0, 4);
        root.add(tr, 0, 5);
        root.add(te, 0, 6);
        root.add(tp, 0, 7);
        
        
        root.add(bm1, 1, 0);
        root.add(bm2, 2, 0);
        root.add(bm3, 3, 0);
        root.add(bm4, 4, 0);
        
        root.add(bdep1, 1, 1);
        root.add(bdep2, 2, 1);
        root.add(bdep3, 3, 1);
        root.add(bdep4, 4, 1);
        
        root.add(broom1, 1, 2);
        root.add(broom2, 2, 2);
        root.add(broom3, 3, 2);
        root.add(broom4, 4, 2);
        
        root.add(bd1, 1, 3);
        root.add(bd2, 2, 3);
        root.add(bd3, 3, 3);
        root.add(bd4, 4, 3);
        
        root.add(bn1, 1, 4);
        root.add(bn2, 2, 4);
        root.add(bn3, 3, 4);
        root.add(bn4, 4, 4);
        
        root.add(br1, 1, 5);
        root.add(br2, 2, 5);
        root.add(br3, 3, 5);
        root.add(br4, 4, 5);
        
        root.add(be1, 1, 6);
        root.add(be2, 2, 6);
        root.add(be3, 3, 6);
        root.add(be4, 4, 6);
        
        root.add(bp1, 1, 7);
        root.add(bp2, 2, 7);
        root.add(bp3, 3, 7);
        root.add(bp4, 4, 7);


        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();

    }
    
    public static void main (String [] args){
        launch(args);
    }
    
}
