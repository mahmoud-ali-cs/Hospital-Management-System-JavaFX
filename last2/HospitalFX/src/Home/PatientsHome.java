package Home;

import Add.PatientApplication;
import OperationsCode.Operations;
import OperationsCode.Patient;
import Update.PatientUpdate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class PatientsHome extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        <Text fill="WHITE" fontSmoothingType="LCD" strokeType="OUTSIDE" strokeWidth="0.0" style="-fx-font-size: 32;" text="كله رايح">
        
        Text hospital = new Text("كله رايح");
        hospital.setFont(Font.font(32));
        hospital.setFill(Paint.valueOf("WHITE"));

        Text doctor = new Text("Patients");
        doctor.setFill(Paint.valueOf("#343647"));
//        doctor.setStrokeType(StrokeType.OUTSIDE);
        doctor.setFont(Font.font(50));
//        <Text fill="#343647" strokeType="OUTSIDE" strokeWidth="0.0" style="-fx-font-size: 50;" text="Doctor">

        Button [] b = new Button[100];
        for(int i = 0 ; i < b.length ; i++){
            b[i] = new Button("11111");
            b[i].setMinSize(80, 80);
        }
        
        HBox h = new HBox(doctor);
        h.setMinSize(546, 91);
        h.setPadding(new Insets(5, 0, 0, 20));

//        Image logo = null ;  
//        try {
//            logo = new Image(new FileInputStream("Image/1.png"));
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        }
//
//        ImageView view1 = new ImageView(logo);
        
        HBox vHbox = new HBox(hospital);
        VBox v = new VBox(vHbox);
        v.setMinSize(200, 558);
        
//        FlowPane flow = new FlowPane();
//        for(int i = 0 ; i< b.length ; i++){
//            flow.getChildren().add(b[i]);
//        }

//
//        Rectangle r = new Rectangle(100, 100);
//        r.setFill(Paint.valueOf("#00F"));
//        Text t1 = new Text("Mahmoud Mohamed");
//        Text t2 = new Text("surgery doctor");

//        VBox profile = new VBox(r,t1,t2);
//        profile.setAlignment(Pos.CENTER);
//        profile.setPadding(new Insets(15));
//
//        flow.getChildren().addAll(profile);
        





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








        Button add = new Button("Add Patient");
        Button update = new Button("Update Patient");
        add.setPadding(new Insets(15));
        update.setPadding(new Insets(15));
        
//        add.set

                
        GridPane buttons = new GridPane();
        buttons.add(add, 0, 0);
        buttons.add(update, 1, 0);
        
        buttons.setPadding(new Insets(15));
        buttons.setAlignment(Pos.CENTER);
        buttons.setVgap(25);
        buttons.setHgap(25);

        BorderPane centerBorder = new BorderPane();
        centerBorder.setCenter(vbox);
        centerBorder.setBottom(buttons);






        ScrollPane scroll = new ScrollPane(centerBorder);
        scroll.setFitToWidth(true);
        
        BorderPane border = new BorderPane();
        BorderPane borderMain = new BorderPane();
        border.setLeft(v);
//        border.setTop(h);
        border.setCenter(borderMain);
        borderMain.setTop(h);
        borderMain.setCenter(scroll);

        
        h.backgroundProperty().set(new Background(new BackgroundFill(Paint.valueOf("#27A3D7"), CornerRadii.EMPTY, Insets.EMPTY)));
//        v.backgroundProperty().set(new Background(new BackgroundFill(Paint.valueOf("#343647"), CornerRadii.EMPTY, Insets.EMPTY)));
        v.setStyle("-fx-background-radius: 0 0 50 0;-fx-background-color: #343647;");

        Scene scene = new Scene(border, 800, 650);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        
        
        
        
  add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                PatientApplication patientApplication = new PatientApplication();
                patientApplication.start(primaryStage);
                

            }
        });        
        
        
  update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                PatientUpdate patientUpdate = new PatientUpdate();
                patientUpdate.start(primaryStage);
                

            }
        });        
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
