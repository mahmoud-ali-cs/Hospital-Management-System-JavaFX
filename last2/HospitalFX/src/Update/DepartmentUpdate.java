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

public class DepartmentUpdate extends Application {
    
    int departmentKey = 1 ;
    
    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
    
        Text t1 = new Text("Department Name");
        
        
        Department d = op.searchInDepartment(departmentKey);
        
        TextField departmentNametf = new TextField(d.getDepartmentName());
        
        
        Button update = new Button("Update Department");
        Button back = new Button("--> Back");
        
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        
        root.add(t1, 0, 0, 1, 1);
        root.add(departmentNametf, 1, 0, 2, 1);
        
        root.add(update, 1, 11, 1, 1);
        root.add(back, 2, 11, 1, 1);
        
        Scene sc = new Scene(root,500,500);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("update Department");
        primaryStage.show();
        
        
        //Action Code ----------------------------------------------
        
        update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                

                
                if(departmentNametf.getText().equals("") ){
                    JOptionPane.showMessageDialog(null, "Please Enter the values of all fields .", "incompele", 0);
                    return ;
                }
                
                
                String departmentName = departmentNametf.getText();

                op.UpdateDepartment(departmentKey, departmentName);
                
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
