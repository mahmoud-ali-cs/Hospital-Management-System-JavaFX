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

public class RoomUpdate extends Application {
    
    int roomKey = 40 ;
    
    //part1
    Department [] dep ;
    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
        //part2
        dep = op.selectAllDepartments();
        
    
        //TEXT------------------------------------------
        Text t1 = new Text("Number Of Beds");
        Text t2 = new Text("Room Type");
        Text t3 = new Text("Department Name");
        
        //The ROOM -------------------------------------
        Room r = op.searchInRoom(roomKey);
        
        
        
        //DATA -------------------------------------------
        //Room TYPE
        ChoiceBox myTypeBox = new ChoiceBox();
        ObservableList obsType = FXCollections.observableArrayList();
        myTypeBox.setItems(obsType);
        myTypeBox.setTooltip(new Tooltip("Select Room Type"));
        
        obsType.addAll("Select Type" , "Surgery" , "A" , "B" , "C");

        //numOfBeds
        TextField numOfBedstf = new TextField(Integer.toString(r.getNumOfBeds()));
        
        //SELECT DEPARTMENT
        //part3
        ObservableList obs = FXCollections.observableArrayList();
        obs.add("Select Department");
        
        ChoiceBox myDepartmentBox = new ChoiceBox();
        myDepartmentBox.setItems(obs);
        myDepartmentBox.setTooltip(new Tooltip("Select Department"));
        
        for(int i = 0 ; i < dep.length ; i++){

            obs.add(dep[i].getDepartmentName());
            
            if( r.getMyDepartment() == dep[i].getMyKey() ){
                myDepartmentBox.getSelectionModel().select(dep[i].getDepartmentName());
            }
        }
        
        
        
        
        
        Button update = new Button("Update Department");
        Button back = new Button("--> Back");
        
        
        
        
        
        
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        
        root.add(t1, 0, 0, 1, 1);
        root.add(t2, 0, 1, 1, 1);
        root.add(t3, 0, 2, 1, 1);
        
        root.add(numOfBedstf, 1, 0, 2, 1);
        root.add(myTypeBox, 1, 1, 2, 1);
        root.add(myDepartmentBox, 1, 2, 2, 1);
        
        root.add(update, 1, 11, 1, 1);
        root.add(back, 2, 11, 1, 1);
        
        Scene sc = new Scene(root,500,500);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("update Room");
        primaryStage.show();
        
        
        //Action Code ----------------------------------------------
        
        update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                

                //CHECK-----------------
                if(numOfBedstf.getText().equals("") ){
                    JOptionPane.showMessageDialog(null, "Please Enter the values of all fields .", "incompele", 0);
                    return ;
                }
                if(myTypeBox.getSelectionModel().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Please select a Type", "Type not Selected", 0);
                    return ;
                }                
                if(myDepartmentBox.getSelectionModel().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Please select a Department", "Department not Selected", 0);
                    return ;
                }                
                
                
                //get NEW DATA---------------
                
                int numOfBeds = -1 ;
                try{
                    numOfBeds = Integer.parseInt( numOfBedstf.getText() );
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid input, Please Enter your Number of Beds","Invalid Number",1);
                    return ;
                }
                
                
                //Select Department
                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
                int myDepartment = dep[depIndex-1].getMyKey();
                
                
                //Select Type
                String roomType = "" ;
                int typeIndex = myTypeBox.getSelectionModel().getSelectedIndex();
                if(typeIndex == 1){
                    roomType = "surgery" ;
                    
                }else if( typeIndex == 2 ){
                    roomType = "A" ;
                    
                }else if( typeIndex == 3 ){
                    roomType = "B" ;
                    
                }else if( typeIndex == 4 ){
                    roomType = "C" ;
                    
                }else{
                    System.out.println("Error in Room Type");
                    System.exit(0);
                }
                     
                
                op.updateRoom(roomKey, numOfBeds, roomType, myDepartment);
                
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

//    public static void main(String[] args) {
//        launch(args);
//    }
    
}
