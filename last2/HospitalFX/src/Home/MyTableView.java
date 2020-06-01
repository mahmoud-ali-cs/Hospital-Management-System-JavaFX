package Home;

import Home.*;
import Add.*;
import Update.*;
import OperationsCode.*;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class MyTableView extends Application{

    @Override
    public void start(Stage primaryStage) {
        Operations op = new Operations();
        Patient [] p = op.selectAllPatients();
        
        
        TableView tableView = new TableView();

    
        TableColumn<Integer, Patient> column1 = new TableColumn<>("myKey");
        column1.setCellValueFactory(new PropertyValueFactory<>("myKey"));
        TableColumn<String, Patient> column2 = new TableColumn<>("firstName");
        column2.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<String, Patient> column3 = new TableColumn<>("lastName");
        column3.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<String, Patient> column4 = new TableColumn<>("address");
        column4.setCellValueFactory(new PropertyValueFactory<>("address"));

        TableColumn<String, Patient> column5 = new TableColumn<>("id");
        column5.setCellValueFactory(new PropertyValueFactory<>("id"));
        
        TableColumn<String, Patient> column6 = new TableColumn<>("gender");
        column6.setCellValueFactory(new PropertyValueFactory<>("gender"));
        TableColumn<String, Patient> column7 = new TableColumn<>("dateOfBirth");
        column7.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        TableColumn<String, Patient> column8 = new TableColumn<>("age");
        column8.setCellValueFactory(new PropertyValueFactory<>("age"));
        TableColumn<String, Patient> column9 = new TableColumn<>("phoneNumber");
        column9.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        TableColumn<String, Patient> column10 = new TableColumn<>("email");
        column10.setCellValueFactory(new PropertyValueFactory<>("email"));
        TableColumn<Double, Patient> column11 = new TableColumn<>("fees");
        column11.setCellValueFactory(new PropertyValueFactory<>("fees"));
        TableColumn<Double, Patient> column12 = new TableColumn<>("medicalHistory");
        column12.setCellValueFactory(new PropertyValueFactory<>("medicalHistory"));
        TableColumn<Integer, Patient> column13 = new TableColumn<>("myDoctor");
        column13.setCellValueFactory(new PropertyValueFactory<>("myDoctor"));
        TableColumn<Integer, Patient> column14 = new TableColumn<>("myDepartment");
        column14.setCellValueFactory(new PropertyValueFactory<>("myDepartment"));
        TableColumn<Integer, Patient> column15 = new TableColumn<>("myRoom");
        column15.setCellValueFactory(new PropertyValueFactory<>("myRoom"));
        
        
        
        
        
        


//        TableColumn<String, Person> column2 = new TableColumn<>("Last Name");
//        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);
        tableView.getColumns().add(column7);
        tableView.getColumns().add(column8);
        tableView.getColumns().add(column9);
        tableView.getColumns().add(column10);
        tableView.getColumns().add(column11);
        tableView.getColumns().add(column12);
        tableView.getColumns().add(column13);
        tableView.getColumns().add(column14);
        tableView.getColumns().add(column15);

//        tableView.getItems().add(new Person("John", "Doe"));
    
        for(int i = 0 ; i < p.length ; i++ ){
            
            tableView.getItems().add(p[i]);
        }

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    
    public static void main (String [] args){
        launch(args);
    }
    
}
