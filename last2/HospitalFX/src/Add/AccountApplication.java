//package Add;
//
//import Home.*;
//import Add.*;
//import Update.*;
//import OperationsCode.*;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.application.Application;
//import static javafx.application.Application.launch;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ChoiceBox;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.Separator;
//import javafx.scene.control.TextField;
//import javafx.scene.control.ToggleGroup;
//import javafx.scene.control.Tooltip;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import javax.swing.JOptionPane;
//import jdk.nashorn.internal.ir.BreakNode;
//
//public class AccountApplication extends Application {
//    
//    Receptionist [] receptionists ;
//    Manager [] managers ;
//
//     ObservableList obsOwner = FXCollections.observableArrayList();
// 
//    int [] manKeys ;
//    int manCount = 0 ;
//    
//    int [] recKeys ;
//    int recCount = 0 ;
//    
//    
//    @Override
//    public void start(Stage primaryStage) {
//        Operations op = new Operations();
//        receptionists = op.selectAllReceptionists();
//        managers = op.selectAllManagers();
//        
//    
//        Text t1 = new Text("username");
//        Text t2 = new Text("password");
//        Text t3 = new Text("Account Type");
//        Text t4 = new Text("Owner");
//        
//        
//        TextField usernametf = new TextField();
//        TextField passwordtf = new TextField();
//
//        
//    
//        // Account Types
//        ObservableList obsType = FXCollections.observableArrayList();
//        obsType.addAll("Select Type" , "Manager" , "Receptionist" );
//        
//        ChoiceBox myTypeBox = new ChoiceBox();
//        myTypeBox.setItems(obsType);
//        myTypeBox.setTooltip(new Tooltip("Select Type"));
//        myTypeBox.getSelectionModel().selectFirst();
//
//
//        
//        // Owners ----------------------------------------
//
//        ChoiceBox myOwnerBox = new ChoiceBox();
//        myOwnerBox.setItems(obsOwner);
//        myOwnerBox.setTooltip(new Tooltip("Select Owner"));
//
//      
//        //change myType
//        final List options = myTypeBox.getItems();
//        myTypeBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
//            @Override
//            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                if( !oldValue.toString().equals("0") ){
//                    obsOwner.clear();
//                    recCount = 0 ;
//                    manCount = 0 ;
//                }
//                
//                if( newValue.toString().equals("0") ){
//                    
////                    obs2.remove(1, docKeys.length);
//                    obsOwner.clear();
//                    recCount = 0 ;
//                    manCount = 0 ;
//                    return ;
//                }
//                if( newValue.toString().equals( oldValue.toString() ) ){
//                    
//                    return ;
//                }
//                
//
////                obs2 = null ;
////                obs2 = FXCollections.observableArrayList();
//                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
//                int depKey = dep[depIndex-1].getMyKey() ;
//
//
//                obs2.add("Select Doctor");
//                
//                docKeys = new int [doc.length];
//                for(int i = 0 ; i < doc.length ; i++){
//                    if( doc[i].getMyDepartment() == depKey ){
//                        if(doc[i].getMyPatient().length < 5){ //max num of patients is -> 5
//                            
//                            obs2.add(doc[i].getFirstName()+" "+doc[i].getLastName());
//                            docKeys[docCount]=doc[i].getMyKey();
//                            docCount++ ;
//                        }
//                    }
//                }
//
//                myDoctorBox.getSelectionModel().selectFirst();
//                
//            }
//        });
//
//        
//                
//                
//                
//                
//        
//        Button add = new Button("Add Room");
//        Button back = new Button("-> Back");
//        
//        
//        
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//        
//        root.add(t1, 0, 0, 1, 1);
//        root.add(t2, 0, 1, 1, 1);
//        root.add(t3, 0, 2, 1, 1);
//       
//        
//        root.add(numOfBedstf, 1, 0, 2, 1);
//        root.add(myTypeBox, 1, 1, 2, 1);
//        root.add(myDepartmentBox, 1, 2, 2, 1);
//       
//       
//        
//        root.add(add, 1, 11, 1, 1);
//        root.add(back, 2, 11, 1, 1);
//        
//        Scene sc = new Scene(root,500,500);
//        
//        primaryStage.setScene(sc);
//        primaryStage.setTitle("Add Room");
//        primaryStage.show();
//        
//        
//        //Action Code ----------------------------------------------
//        
//        add.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                
//
//                
////                if(firstNametf.getText().equals("") || lastNametf.getText().equals("") || idtf.getText().equals("") || dateOfBirthtf.getText().equals("") || agetf.getText().equals("") || addresstf.getText().equals("") || phoneNumbertf.getText().equals("") || emailtf.getText().equals("")){
////                    JOptionPane.showMessageDialog(null, "Please Enter the values of all fields .", "incompele", 0);
////                    return ;
////                }
//                
//                if(myDepartmentBox.getSelectionModel().getSelectedIndex() == 0){
//                    JOptionPane.showMessageDialog(null, "Please select a Department", "Department not Selected", 0);
//                    return ;
//                }
//               
//                int numOfBeds = Integer.parseInt(numOfBedstf.getText());
//                
//                //Select Type
//                String roomType = "" ;
//                int typeIndex = myTypeBox.getSelectionModel().getSelectedIndex();
//                if(typeIndex == 1){
//                    roomType = "surgery" ;
//                    
//                }else if( typeIndex == 2 ){
//                    roomType = "A" ;
//                    
//                }else if( typeIndex == 3 ){
//                    roomType = "B" ;
//                    
//                }else if( typeIndex == 4 ){
//                    roomType = "C" ;
//                    
//                }else{
//                    System.out.println("Error in Room Type");
//                    System.exit(0);
//                }
//                
//                
//                //select Department
//                int depIndex = myDepartmentBox.getSelectionModel().getSelectedIndex();
//                System.out.println(dep[depIndex-1].getDepartmentName());                              
//                int myDepartment = dep[depIndex-1].getMyKey();
//                
//                op.addRoom( numOfBeds ,  roomType,  myDepartment );
//
//
//            }
//        });
//
//        back.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//
//                HomePage homePage = new HomePage();
//                try {
//                    homePage.start(primaryStage);
//                } catch (Exception ex) {
////                    Logger.getLogger(PatientApplication.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println(ex);
//                }            }
//        });
//
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//    
//}
//
//
