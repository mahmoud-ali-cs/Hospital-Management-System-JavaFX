package OperationsCode;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operations {



/*
    This class contains the following operations: 1-Delete All , 2-Delete By ID , 3-Insert , 4-Update , 5- Search
    On the fllowing tables: 1- Departemnet , 2-Doctor , 3-Employees , 4-Manager , 5-Nurse , 6-Patient , 7-Receptionist , 8-Room
    
 */
    
 //   DATABASE TABLES COLUMNS NAMES
//   int myKey , appointment , Roomsnumber , age , Patient_id , Age , Salary , managerAccount , MyRoom, numOfBeds , numOfPatients , myDepartment , Rooms_number;
    
//    String Department_name , Doctors_number , Doctors_key , Patient_key , Nurses_key , Rooms_key , FirstName , LastName , specialization , address ,email , Address , Nurses_number , ID , date_of_birth , id , department , PhoneNumber , medical_History , type , Patient_number ,Email , Gender , gender , query;
//    double salary;
    
//     Scanner input = new Scanner(System.in);
    
    
    String query ;
    
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";                     //The driver that connects to the database
//    private final String DRIVER = "com.mysql.jdbc.Driver";                     //The driver that connects to the database
    private final String URL="jdbc:mysql://localhost/finalddatabase";           //The url of the database
    private final String USER = "root";                                        //The username of the database
    private final String PASSWORD = "";                                        //The password of the database

    private Connection con;                                                    //The connection variale
//    private Statement stmt;                                                    //The statement variable

    
    // The constructor of the class 
    public Operations() {
        con = null;
//       stmt = null;
       
        try {
            Class.forName(DRIVER);                                              //The class responsible of the connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);             //get the connection
//            stmt = con.createStatement();                                       //Begin creating statements
       }
       
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.println("Connection error!!!");
           System.out.println(e);
       }
    }



    
    
    
    
    
    //Begin the Insert operation of the different tables
    
        public void addAcount(String userName , String password , String type , int owner)
        {

            Statement stmt = null ;                                  
            try {
                stmt = con.createStatement();
            } catch (SQLException e) {
                System.out.println(e);
            }


            try
            {
                
            query = "INSERT INTO account (userName , password , type , owner) "
                    + "VALUES('"+userName+"','"+password+"','"+type+"', '"+owner+"')";
            stmt.executeUpdate(query);
            }
            
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    
    
    public void addDepartment(String departmentName){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }


        try
        {   
            query = "INSERT INTO department (myKey , departmentName , doctorsKey , numOfDoctors, patientsKey , numOfPatients , nursesKey , numOfNurses , roomsKey ,  numOfRooms) "
                    + "VALUES(null,'"+departmentName+"','"+""+"','"+0+"', '"+""+"' ,'"+0+"','"+""+"','"+0+"','"+""+"','"+0+"')";
            stmt.executeUpdate(query);
            
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
        
        public void addDoctor(String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
                              String address , String phoneNumber  , String email , double salary , int myDepartment ){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
            
        try
        {   
             query = "INSERT INTO doctor (firstName , lastName , id , gender , dateOfBirth , age , address ,  phoneNumber , email , salary , myDepartment , myPatients) "
                    + "VALUES('"+firstName+"','"+lastName+"','"+id+"', '"+gender+"','"+dateOfBirth+"','"+age+"','"+address+"','"+phoneNumber+"' , '"+email+"','"+salary+"' , '"+myDepartment+"' , '"+""+"')";
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
        
        public void addEmployee(String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
                              String address , String phoneNumber  , String email , double salary ){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
            
        try
        {   
             query = "INSERT INTO employee (firstName , lastName , id , gender , dateOfBirth , age , address ,  phoneNumber , email , salary) "
                    + "VALUES('"+firstName+"','"+lastName+"','"+id+"', '"+gender+"','"+dateOfBirth+"','"+age+"','"+address+"','"+phoneNumber+"' , '"+email+"',"+salary+")";
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }    
    
        public void addManager(String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
                              String address , String phoneNumber  , String email , double salary , String managerAccount){

            
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
        try
        {   
             query = "INSERT INTO manager (firstName , lastName , id , gender , dateOfBirth , age , address ,  phoneNumber , email , salary ,managerAccount) "
                    + "VALUES('"+firstName+"','"+lastName+"','"+id+"', '"+gender+"','"+dateOfBirth+"','"+age+"','"+address+"','"+phoneNumber+"' , '"+email+"','"+salary+"' , '"+managerAccount+"')";
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }    
        public void addNurse(String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
                              String address , String phoneNumber  , String email , double salary , int myRoom){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
            
        try
        {   
             query = "INSERT INTO nurse (firstName , lastName , id , gender , dateOfBirth , age , address ,  phoneNumber , email , salary , myRoom) "
                    + "VALUES('"+firstName+"','"+lastName+"','"+id+"', '"+gender+"','"+dateOfBirth+"','"+age+"','"+address+"','"+phoneNumber+"' , '"+email+"','"+salary+"' , '"+myRoom+"')";
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
        public void addPatient(String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
                              String address , String phoneNumber  , String email ,String medicalHistory , double fees , int myDoctor , int myDepartment , int myRoom , String startTime){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
        try
        {   
             query = "INSERT INTO patient (firstName , lastName , id , gender , dateOfBirth , age , address ,  phoneNumber , email , medicalHistory , fees ,  myDoctor , myDepartment , myRoom , startTime) "
                    + "VALUES('"+firstName+"','"+lastName+"','"+id+"', '"+gender+"','"+dateOfBirth+"','"+age+"','"+address+"','"+phoneNumber+"' , '"+email+"','"+medicalHistory+"' , '"+fees+"' , '"+myDoctor+"' , '"+myDepartment+"' , '"+myRoom+"' , '"+startTime+"')" ;
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }   
        public void addReceptionist(String firstName , String lastName , String id , String gender , String dateOfBirth , int age , String address , String phoneNumber , String email , double salary , String receptionistAccount ){
        
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
        try
        {   
             query = "INSERT INTO receptionist (firstName ,lastName ,id ,gender ,dateOfBirth ,age ,address ,phoneNumber ,email ,salary ,receptionistAccount ) "
                    + "VALUES('"+firstName+"','"+lastName+"','"+id+"', '"+gender+"', '"+dateOfBirth+"', '"+age+"', '"+address+"', '"+phoneNumber+"', '"+email+"', '"+salary+"', '"+receptionistAccount+"')";
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }   
        public void addRoom(int numOfBeds  , String type, int myDepartment ){
            
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
            
            
        try
        {   
             query = "INSERT INTO room (numOfBeds , numOfPatients , type , myDepartment) "
                    + "VALUES('"+numOfBeds+"','"+0+"','"+type+"', '"+myDepartment+"')";
            stmt.executeUpdate(query);
            System.out.println("Data is successfull inserted");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }        
        //Delete all data from a table
    public void deleteTable(String Table)
    {

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        try
        {
            query = "DELETE FROM "+ Table ;
            stmt.executeUpdate(query);
            System.out.println("All the data of the table " + Table + " has been successfully deleted.");
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }        
    }
           
    //remove

    public void removeById(String Table, int 	myKey){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        query = "DELETE FROM " + Table + " WHERE myKey = '"+myKey+"' " ;
            
        try {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    public void removeAccount(String Table, String username){

        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        query = "DELETE FROM " + Table + " WHERE username = '"+username+"' " ;
            
        try {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }   
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Department[] selectAllDepartments(){
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        
        int count = 0 ;
        
        try{
            r = stmt.executeQuery("select count(*) from department");

            while (r.next()) {
                count = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        query = "SELECT * FROM department " ;
        try {
            r = stmt.executeQuery(query);
            System.out.println("executed");
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }


        


        Department [] d = new Department[count];
    
        try{
            int i  = 0 ;
            while(r.next())
            {
                System.out.println("myKey : " + i  + r.getInt("myKey"));

                int myKey = r.getInt("myKey");
                String departmentName = r.getString("departmentName") ;
                int numOfDoctors = r.getInt("numOfDoctors");
                String keys = r.getString("doctorsKey");
                int [] doctorsKey = separateKeys(keys);
                int numOfPatients = r.getInt("numOfPatients");
                keys = r.getString("patientsKey");
                int [] patientsKey = separateKeys(keys);
                int numOfNurses = r.getInt("numOfNurses");
                keys = r.getString("nursesKey");
                int [] nursesKey = separateKeys(keys);
                int numOfRooms = r.getInt("numOfRooms");
                keys = r.getString("roomsKey");
                int [] roomsKey = separateKeys(keys);
                d[i] = new Department(myKey, departmentName, numOfDoctors, doctorsKey, numOfPatients, patientsKey, numOfNurses, nursesKey, numOfRooms, roomsKey);

                i++ ;
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return d ;   
    }
    
    
    public Doctor[] selectAllDoctors(){
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        
        int count = 0 ;
        
        try{
            r = stmt.executeQuery("select count(*) from doctor");

            while (r.next()) {
                count = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        query = "SELECT * FROM doctor " ;
        try {
            r = stmt.executeQuery(query);
            System.out.println("executed");
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }


        


        Doctor [] d = new Doctor[count];
    
        try{
            int i  = 0 ;
            while(r.next())
            {
                int myKey = r.getInt("myKey");
                String firstName = r.getString("firstName");
                String lastName = r.getString("lastName");
                String id = r.getString("id");
                Person.Gender gender = null ;
                String g = r.getString("gender") ;
                if(g.equals("female")){
                    gender = Person.Gender.female ;
                }else if(g.equals("male")){
                    gender = Person.Gender.male ;
                }else{
                System.out.println("error in gender ");
                }
                String dateOfBirth = r.getString("dateOfBirth");
                int age = r.getInt("age");
                String address = r.getString("address");
                String phoneNumber = r.getString("phoneNumber");
                String email = r.getString("email");
                double salary = r.getDouble("salary");

                int myDepartment = r.getInt("myDepartment");

                
                String keys = r.getString("myPatients") ;
                int [] myPatients = separateKeys(keys);

                d[i] = new Doctor(myDepartment, myPatients, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
                
                
                
                i++ ;
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return d ;   
    }
    
    

    public Room[] selectAllRooms(){
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        
        int count = 0 ;
        
        try{
            r = stmt.executeQuery("select count(*) from room");

            while (r.next()) {
                count = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        query = "SELECT * FROM room " ;
        try {
            r = stmt.executeQuery(query);
            System.out.println("executed");
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }


        


        Room [] rooms = new Room[count];
    
        try{
            int i  = 0 ;
            while(r.next())
            {
                int myKey = r.getInt("myKey") ;
                int numOfBeds = r.getInt("numOfBeds") ;
                int numOfPatients = r.getInt("numOfPatients") ; 
                String type = r.getString("type");
                int myDepartment = r.getInt("myDepartment") ;

                
                rooms[i] = new Room(myKey, numOfBeds, numOfPatients, type, myDepartment);
                
                
                i++ ;
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return rooms ;   
    }


    public Patient[] selectAllPatients(){
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        
        int count = 0 ;
        
        try{
            r = stmt.executeQuery("select count(*) from patient");

            while (r.next()) {
                count = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        query = "SELECT * FROM patient " ;
        try {
            r = stmt.executeQuery(query);
            System.out.println("executed");
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }


        


        Patient [] patients = new Patient[count];
    
        try{
            int i  = 0 ;
            while(r.next())
            {
                int myKey = r.getInt("myKey") ;
                String firstName = r.getString("firstName");
                String lastName = r.getString("lastName");
                String id = r.getString("id");
                Person.Gender gender = null ;
                String g = r.getString("gender") ;
                if(g.equals("female")){
                    gender = Person.Gender.female ;
                }else if(g.equals("male")){
                    gender = Person.Gender.male ;
                }else{
                    System.out.println("error in gender ");
                }
                String dateOfBirth = r.getString("dateOfBirth");
                int age = r.getInt("age");
                String address = r.getString("address");
                String phoneNumber = r.getString("phoneNumber");
                String email = r.getString("email");
                String medicalHistory = r.getString("medicalHistory") ;
                double fees = r.getDouble("fees") ;
                String startTime = r.getString("startTime") ;
                int myDepartment = r.getInt("myDepartment") ;
    //            Department myDepartment = searchInDepartment(key);
                int myDoctor = r.getInt("myDoctor") ;
                int myRoom = r.getInt("myRoom") ;

                
                patients[i] = new Patient(myKey, firstName, lastName, address, id, gender, dateOfBirth, age, phoneNumber, email, medicalHistory, fees, startTime, myDoctor, myDepartment, myRoom);
                
                
                i++ ;
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return patients ;   
    }


    public Receptionist[] selectAllReceptionists(){
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        
        int count = 0 ;
        
        try{
            r = stmt.executeQuery("select count(*) from receptionist");

            while (r.next()) {
                count = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        query = "SELECT * FROM receptionist " ;
        try {
            r = stmt.executeQuery(query);
            System.out.println("executed");
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }


        


        Receptionist [] rec = new Receptionist[count];
    
        try{
            int i  = 0 ;
            while(r.next())
            {
                int myKey = r.getInt("myKey");
                String firstName = r.getString("firstName");
                String lastName = r.getString("lastName");
                String id = r.getString("id");
                Person.Gender gender = null ;
                String g = r.getString("gender") ;
                if(g.equals("female")){
                    gender = Person.Gender.female ;
                }else if(g.equals("male")){
                    gender = Person.Gender.male ;
                }else{
                    System.out.println("error in gender ");
                }
                String dateOfBirth = r.getString("dateOfBirth");
                int age = r.getInt("age");
                String address = r.getString("address");
                String phoneNumber = r.getString("phoneNumber");
                String email = r.getString("email");
                double salary = r.getDouble("salary");
                String receptionistAccount = r.getString("receptionistAccount");

                rec[i] = new Receptionist(receptionistAccount, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
                
                
                i++ ;
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return rec ;   
    }
    
    public Manager[] selectAllManagers(){
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        
        int count = 0 ;
        
        try{
            r = stmt.executeQuery("select count(*) from manager");

            while (r.next()) {
                count = r.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        query = "SELECT * FROM manager " ;
        try {
            r = stmt.executeQuery(query);
            System.out.println("executed");
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }


        


        Manager [] m = new Manager[count];
    
        try{
            int i  = 0 ;
            while(r.next())
            {
                int myKey = r.getInt("myKey");
                String firstName = r.getString("firstName");
                String lastName = r.getString("lastName");
                String id = r.getString("id");
                Person.Gender gender = null ;
                String g = r.getString("gender") ;
                if(g.equals("female")){
                    gender = Person.Gender.female ;
                }else if(g.equals("male")){
                    gender = Person.Gender.male ;
                }else{
                    System.out.println("error in gender ");
                }
                String dateOfBirth = r.getString("dateOfBirth");
                int age = r.getInt("age");
                String address = r.getString("address");
                String phoneNumber = r.getString("phoneNumber");
                String email = r.getString("email");
                double salary = r.getDouble("salary");

                String managerAccount = r.getString("managerAccount");

                m[i] = new Manager(managerAccount, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
                
                
                i++ ;
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return m ;   
    }
    













    
    //Search in tables
    public Department searchInDepartment(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        ResultSet r  = null ;
        query = "SELECT * FROM department WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }

        
        Department d = null;
    
        try{

            if(r.next())
            {

                String departmentName = r.getString("departmentName") ;
                int numOfDoctors = r.getInt("numOfDoctors");
                String keys = r.getString("doctorsKey");
                int [] doctorsKey = separateKeys(keys);
                int numOfPatients = r.getInt("numOfPatients");
                keys = r.getString("patientsKey");
                int [] patientsKey = separateKeys(keys);
                int numOfNurses = r.getInt("numOfNurses");
                keys = r.getString("nursesKey");
                int [] nursesKey = separateKeys(keys);
                int numOfRooms = r.getInt("numOfRooms");
                keys = r.getString("roomsKey");
                int [] roomsKey = separateKeys(keys);
                d = new Department(myKey, departmentName, numOfDoctors, doctorsKey, numOfPatients, patientsKey, numOfNurses, nursesKey, numOfRooms, roomsKey);


            }else{
                System.out.println("Error in Department: NOT FOUND");
            }

        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

    
         return d ;   
       
    }
    
    public Doctor searchInDoctor(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        ResultSet r  = null ;
        query = "SELECT * FROM doctor WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }

        Doctor d = null;
        
        try{

            if(r.next())
            {

                String firstName = r.getString("firstName");
                String lastName = r.getString("lastName");
                String id = r.getString("id");
                Person.Gender gender = null ;
                String g = r.getString("gender") ;
                if(g.equals("female")){
                    gender = Person.Gender.female ;
                }else if(g.equals("male")){
                    gender = Person.Gender.male ;
                }else{
                System.out.println("error in gender ");
                }
                String dateOfBirth = r.getString("dateOfBirth");
                int age = r.getInt("age");
                String address = r.getString("address");
                String phoneNumber = r.getString("phoneNumber");
                String email = r.getString("email");
                double salary = r.getDouble("salary");

                int myDepartment = r.getInt("myDepartment");
//                Department myDepartment = searchInDepartment(key) ;

                
                String keys = r.getString("myPatients") ;
                int [] myPatients = separateKeys(keys);
//                Patient [] myPatient = new Patient[k.length];

//                for(int j = 0 ; j < k.length ; j++ ){
//                    myPatient[j] = searchInPatient(k[j]);
//                }

                d = new Doctor(myDepartment, myPatients, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);

            }
        
        }catch(SQLException e){
            System.out.println("doctor error");
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

        

        return d ;
    }    

    public Manager searchInManager(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        ResultSet r  = null ;
        query = "SELECT * FROM manager WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }

        
     Manager m = null;
        
        try{
            
            if(r.next())
            {

            String firstName = r.getString("firstName");
            String lastName = r.getString("lastName");
            String id = r.getString("id");
            Person.Gender gender = null ;
            String g = r.getString("gender") ;
            if(g.equals("female")){
                gender = Person.Gender.female ;
            }else if(g.equals("male")){
                gender = Person.Gender.male ;
            }else{
                System.out.println("error in gender ");
            }
            String dateOfBirth = r.getString("dateOfBirth");
            int age = r.getInt("age");
            String address = r.getString("address");
            String phoneNumber = r.getString("phoneNumber");
            String email = r.getString("email");
            double salary = r.getDouble("salary");

            String managerAccount = r.getString("managerAccount");
//            Account managerAccount = searchInAccount(key);
            m = new Manager(managerAccount, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
            
            }else{
                System.out.println("Error in Manager : NOT FOUND");
            }
        
        }catch(SQLException e){
                System.out.println(e);
        }

     return m ;
    }    

    
    public Employee searchInEmployees(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        ResultSet r  = null ;
        query = "SELECT * FROM employee WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }

       if(r == null){
           //error 
           System.out.println("sql error");
       }
        Employee e = null;
     
        try{
            
            if(r.next())
            {

            String firstName = r.getString("firstName");
            String lastName = r.getString("lastName");
            String id = r.getString("id");
            Person.Gender gender = null ;
            String g = r.getString("gender") ;
            if(g.equals("female") ){
                gender = Person.Gender.female ;
            }else if(g.equals("male")){
                gender = Person.Gender.male ;
            }else{
                System.out.println("error in gender ");
            }
            String dateOfBirth = r.getString("dateOfBirth");
            int age = r.getInt("age");
            String address = r.getString("address");
            String phoneNumber = r.getString("phoneNumber");
            String email = r.getString("email");
            double salary = r.getDouble("salary");

            e = new Employee(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);

            }else{
                System.out.println("Error n Employee : NOT FOUND");
            }
            
        }catch(SQLException s){
            System.out.println(s);
        }
        return e ;
    }    
   

    public Nurse searchInNurse(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        ResultSet r  = null ;
        query = "SELECT * FROM nurse WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
        }

        
        Nurse n = null;
        
        
        try{
            
            if(r.next()){

  
            String firstName = r.getString("firstName");
            String lastName = r.getString("lastName");
            String id = r.getString("id");
            Person.Gender gender = null ;
            String g = r.getString("gender") ;
            if(g.equals("female")){
                gender = Person.Gender.female ;
            }else if(g.equals("male")){
                gender = Person.Gender.male ;
            }else{
                System.out.println("error in gender ");
            }
            String dateOfBirth = r.getString("dateOfBirth");
            int age = r.getInt("age");
            String address = r.getString("address");
            String phoneNumber = r.getString("phoneNumber");
            String email = r.getString("email");
            double salary = r.getDouble("salary");
            int myRoom = r.getInt("myRoom");
//            int [] myRooms = separateKeys(keys);

//            Room [] myRooms = new Room[k.length] ;
//            for(int j = 0 ; j < k.length ; j++){
//                myRooms[j] = searchInRoom(k[j]);
//            }
            n = new Nurse(myRoom, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);

            }else{
                System.out.println("error in Nurse : NOT FOUND");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        

         return n ;
    }     
    
    public Patient searchInPatient(int myKey)
    {
        
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        ResultSet r  = null ;
        query = "SELECT * FROM patient WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }

        Patient p = null;
        
        try{
            
            if(r.next()){
       
            String firstName = r.getString("firstName");
            String lastName = r.getString("lastName");
            String id = r.getString("id");
            Person.Gender gender = null ;
            String g = r.getString("gender") ;
            if(g.equals("female")){
                gender = Person.Gender.female ;
            }else if(g.equals("male")){
                gender = Person.Gender.male ;
            }else{
                System.out.println("error in gender ");
            }
            String dateOfBirth = r.getString("dateOfBirth");
            int age = r.getInt("age");
            String address = r.getString("address");
            String phoneNumber = r.getString("phoneNumber");
            String email = r.getString("email");
            String medicalHistory = r.getString("medicalHistory") ;
            double fees = r.getDouble("fees") ;
            String startTime = r.getString("startTime") ;
            int myDepartment = r.getInt("myDepartment") ;
//            Department myDepartment = searchInDepartment(key);
            int myDoctor = r.getInt("myDoctor") ;
            int myRoom = r.getInt("myRoom") ;
//            Doctor myDoctor = searchInDoctor(key);
//            System.out.println("ssssssssss");

            p = new Patient(myKey, firstName, lastName, address, id, gender, dateOfBirth, age, phoneNumber, email, medicalHistory, fees, startTime, myDoctor, myDepartment, myRoom);
            
            }else{
                System.out.println("Error in Patient : NOT FOUND");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
         return p ;
    }    
    
    public Receptionist searchInReceptionist(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
  
        ResultSet r  = null ;
        query = "SELECT * FROM receptionist WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
        }

        Receptionist rec = null;
        
//        r.next();
    
        try{
            
 
            if(r.next()){


            String firstName = r.getString("firstName");
            String lastName = r.getString("lastName");
            String id = r.getString("id");
            Person.Gender gender = null ;
            String g = r.getString("gender") ;
            if(g.equals("female")){
                gender = Person.Gender.female ;
            }else if(g.equals("male")){
                gender = Person.Gender.male ;
            }else{
                System.out.println("error in gender ");
            }
            String dateOfBirth = r.getString("dateOfBirth");
            int age = r.getInt("age");
            String address = r.getString("address");
            String phoneNumber = r.getString("phoneNumber");
            String email = r.getString("email");
            double salary = r.getDouble("salary");
            String receptionistAccount = r.getString("receptionistAccount");
//            Account receptionistAccount = searchInAccount(key)   ;

            rec = new Receptionist(receptionistAccount, myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);

            }else{
                System.out.println("Error in Receptionist : NOT FOUND");
            }
        
        
        }catch(SQLException e){
            System.out.println(e);
        }
                

                
                
         return rec ;
    }

    public Account searchInAccount(String username)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
  
        ResultSet r  = null ;
        query = "SELECT * FROM account WHERE username = '"+username+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }

             Account ac = null;
        
        try{
            
            if(r.next()){
                String password = r.getString("password");
                String type = r.getString("type");
                int owner = r.getInt("owner");

                ac = new Account(username, password, type, owner);
            }else{
               //error 
                System.out.println("Error in Account : NOT FOUND");
            }
       
        
        }catch(SQLException e){
            System.out.println(e);
        }




//        https://stackoverflow.com/questions/33664078/java-jdbc-result-set-error-but-why
//        This kind of error appears when you try to access something without moving cursor. Try to put myRs1.next(); before getting String.


           


         return ac ;
    }  

   public Room searchInRoom(int myKey)
    {
        Statement stmt = null ;                                  
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
  
        ResultSet r  = null ;
        query = "SELECT * FROM room WHERE myKey = '"+myKey+"' " ;
        try {
            r = stmt.executeQuery(query);
        } catch (SQLException ex) {
           //error
           System.out.println("Sql error");
       }

            Room room = null;
        
//        r.next();

        try{
            
            if(r.next()){
    //            System.out.println("found");
                int numOfBeds = r.getInt("numOfBeds") ;
                int numOfPatients = r.getInt("numOfPatients") ; 
                String type = r.getString("type");
                int myDepartment = r.getInt("myDepartment") ;
//                Department myDepartment = searchInDepartment(key) ;

                room = new Room(myKey, numOfBeds, numOfPatients, type, myDepartment);
            }else{
                System.out.println("Error in Room: NOT FOUND");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
         return room ;
    }  

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void UpdateDepartment(int myKey , String departmentName) {
            
            
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE department SET departmentName = ?  WHERE myKey = ?";
            ps=con.prepareStatement(query);

            ps.setString(1, departmentName);
            ps.setInt(2, myKey);

            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }




       
    }
    
    public void updatePatient(int myKey, String firstName, String lastName, String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email , String medicalHistory, int myDoctor, int myDepartment , int myRoom , String startTime , double fees) {
    
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE patient SET firstName = ? , lastName = ?, id = ? , gender = ? , dateOfBirth = ? , age = ? , address = ? , phoneNumber = ? , email = ? , medicalHistory = ? , myDoctor = ? , myDepartment = ? ,myRoom = ? , startTime = ? , fees = ? WHERE   myKey = ?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, id);
            ps.setString(4, gender);
            ps.setString(5, dateOfBirth);
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8, phoneNumber);
            ps.setString(9, email);
            ps.setString(10, medicalHistory);
            ps.setInt(11, myDoctor);
            ps.setInt(12, myDepartment);
            ps.setInt(13, myRoom);
            ps.setString(14, startTime);
            ps.setDouble(15, fees);
            ps.setInt(16, myKey);
            
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
        
    }
    
    
    public void updateDoctor(int myKey, String firstName, String lastName, String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary, int myDepartment ){
        
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE doctor SET firstName = ? , lastName = ? , id = ? , gender = ? , dateOfBirth = ? , age = ? , address = ? , phoneNumber = ? , email = ? , salary = ?  , myDepartment = ?  WHERE myKey = ?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, id);
            ps.setString(4, gender);
            ps.setString(5, dateOfBirth);
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8, phoneNumber);
            ps.setString(9, email);
            ps.setDouble(10, salary);
            ps.setInt(11, myDepartment);
            ps.setInt(12, myKey);
            
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
    }
    
    public void updateEmployee(int myKey, String firstName, String lastName, String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String 	email, double salary){
    
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE employee SET firstName = ? , lastName = ? , id = ? , gender = ? , dateOfBirth = ? , age = ? , address = ? , phoneNumber = ? , email = ?, salary = ? WHERE  myKey = ?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, id);
            ps.setString(4, gender);
            ps.setString(5, dateOfBirth);
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8, phoneNumber);
            ps.setString(9, email);
            ps.setDouble(10, salary);
            ps.setInt(11, myKey);
            
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void updateManager(int myKey, String firstName, String lastName , String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary){
    
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE manager SET firstName = ? , lastName = ? , id = ? , gender = ? , dateOfBirth = ? , age = ? , address = ? , phoneNumber = ? , email = ? , salary = ?   WHERE  myKey = ? ";
            ps = con.prepareStatement(query);
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, id);
            ps.setString(4, gender);
            ps.setString(5, dateOfBirth);
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8, phoneNumber);
            ps.setString(9, email);
            ps.setDouble(10, salary);
            ps.setInt(11, myKey);
            
            System.out.println(ps);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    public void updateNurse(int myKey, String firstName, String lastName , String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary, int myRoom) {
    
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE nurse SET firstName = ? , lastName = ? , id = ? , gender = ? , dateOfBirth = ? , age = ? , address = ? , phoneNumber = ? , email = ? , salary = ? , myRoom = ? WHERE myKey = ?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, id);
            ps.setString(4, gender);
            ps.setString(5, dateOfBirth);
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8, phoneNumber);
            ps.setString(9, email);
            ps.setDouble(10, salary);
            ps.setInt(11, myRoom);
            ps.setInt(12, myKey);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
//            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateReceptionist(int myKey, String firstName, String lastName , String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary, int receptionistAccount) {
    
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE receptionist SET firstName = ? , lastName = ? , id = ? , gender = ? , dateOfBirth = ? , age = ? , address = ? , phoneNumber = ? , email = ? , salary = ? , receptionistAccount = ? WHERE myKey = ?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, id);
            ps.setString(4, gender);
            ps.setString(5, dateOfBirth);
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8, phoneNumber);
            ps.setString(9, email);
            ps.setDouble(10, salary);
            ps.setInt(11, receptionistAccount);
            ps.setInt(12, myKey);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    
    public void updateRoom(int myKey, int numOfBeds, String type, int myDepartment){
    
        try {
            PreparedStatement ps = null;
            
            query = "UPDATE room SET numOfBeds = ? , type = ? , myDepartment = ? WHERE myKey = ?";
            ps = con.prepareStatement(query);
            
            ps.setInt(1, numOfBeds);
            ps.setString(2, type);
            ps.setInt(3, myDepartment);
            ps.setInt(4, myKey);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    
    }
    
    public void updateAccount(String username, String password, String type, int owner) throws SQLException{
        
        PreparedStatement ps = null;
        
        query = "UPDATE account SET username = ? , password = ? , type = ? WHERE owner = ?";
        ps = con.prepareStatement(query);
        
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, type);
        ps.setInt(4, owner);
        
        ps.executeUpdate();
        
    }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public int [] separateKeys(String keys) throws Exception{
        int size = 0 ;
        for(int i = 0 ; i < keys.length() ; i++){
            if(keys.charAt(i) == ';'){
                size++ ;
            }else if(keys.charAt(i) >= '1' && keys.charAt(i) <= '9'){
                continue;
            }else{
//                System.out.println("unvalid input in seperateKeys");
                throw new Exception("unvalid input in seperateKeys : "+keys);
            }
        }

        int [] arr = new int [size] ;
        int count = 0 ;
        
        int start = 0 ;
        int end = 0 ;
        for(int i = 0 ; i < keys.length() ; i++){
            if(keys.charAt(i) == ';'){
                end = i ;
                arr[count] = Integer.parseInt(keys.substring(start, end));
                count++ ;
                start = i+1 ;
            }
        }
        
        return arr ; 
    }

}
    
