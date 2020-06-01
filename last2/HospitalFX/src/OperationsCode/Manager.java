package OperationsCode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Manager extends Employee{

    String managerAccount ;

    
    public Manager(String managerAccount, int myKey, String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        this.managerAccount = managerAccount;
        
    }     
    
    
    
    

    public Manager(String managerAccount, String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super( firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        this.managerAccount = managerAccount;
        
        Operations op = new Operations();
        op.addManager(firstName, lastName, id, email, dateOfBirth, age, address, phoneNumber, email, salary, managerAccount);        
        
        int myKey = -1 ;
        this.setMyKey(myKey);
    } 
    
    public Manager( String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super( firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        
        Operations op = new Operations();
        op.addManager(firstName, lastName, id, email, dateOfBirth, age, address, phoneNumber, email, salary, "null");   
        
        int myKey = -1 ;
        this.setMyKey(myKey);
    } 

    public String getManagerAccount() {
        return managerAccount;
    }

    public void setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
    }

    
    
    
    
    
    


    
    

//
//    //ADD METHODS---------------------------------------------------
//    
//    public Room addRoom (int numOfBeds , int numOfPatients , String type, int myDepartment ){
//        Operations op = new Operations();
//        op.addRoom( numOfBeds , numOfPatients , type, myDepartment );
//        
////        Department myDep = op.searchInDepartment(myDepartment);
//        
//        Room r = new Room( 0 ,numOfBeds , numOfPatients , type, myDepartment );
//        return r ;
//    } 
//    
//    public Department addDepartment (String departmentName, String doctorsKey , int numOfDoctors , String patientsKey , int numOfPatients,String nursesKey , int numOfNurses , String roomsKey , int numOfRooms){
//        
//        Operations op = new Operations();
//        op.addDepartment( departmentName, doctorsKey , numOfDoctors , patientsKey , numOfPatients, nursesKey , numOfNurses , roomsKey , numOfRooms);
//        
//        Department d = null ;
//        
//        try{
//            
//            int [] doctorsKeyArr =  op.separateKeys(doctorsKey);
//            int [] patientsKeyArr =  op.separateKeys(patientsKey);
//            int [] nursesKeyArr =  op.separateKeys(nursesKey);
//            int [] roomsKeyArr =  op.separateKeys(roomsKey);
//
//
//            d = new Department(0, departmentName, numOfDoctors, doctorsKeyArr, numOfPatients, patientsKeyArr, numOfNurses, nursesKeyArr, numOfRooms, roomsKeyArr);
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        
//        return d ;
//    }    
//    
//    public Employee addEmployee (String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,String address , String phoneNumber  , String email , double salary) {
//        
//        Operations op = new Operations();
//        op.addEmployee(firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
//        
//        Person.Gender g = null ;
//        
//        if(gender.equals("female")){
//            g = Person.Gender.female ;
//        }else if(gender.equals("male")){
//            g = Person.Gender.male ;
//        }else{
//            System.out.println("error in gender ");
//        }
//        
//        Employee e = new Employee(0, firstName, lastName, id, g, dateOfBirth, age, address, phoneNumber, email, salary);
//        return e ; 
//    } 
//    
//    
//    //complete from here
//    
//     
//
//    public Doctor addDoctor (String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
//                              String address , String phoneNumber  , String email , double salary , int myDepartment , String myPatients){
//        
//        Doctor doc = null;
//        
//        try {
//            Operations op = new Operations();
//            op.addDoctor(firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, age, myPatients);
//            
////            Department d =op.searchInDepartment(myDepartment);
//            
//            int [] patientkeys = op.separateKeys(myPatients);
////            Patient p[] = new Patient[keys.length];
////            for(int i = 0; i < p.length; i++){
////                p[i] = op.searchInPatient(keys[i]);
////            }
//            
//            
//        Person.Gender g = null ;
//        
//        if(gender.equals("female")){
//            g = Person.Gender.female ;
//        }else if(gender.equals("male")){
//            g = Person.Gender.male ;
//        }else{
//            System.out.println("error in gender ");
//        }
//            
//            
//            doc = new Doctor(myDepartment,patientkeys , 0, firstName, lastName, id, g, dateOfBirth, age, address, phoneNumber, email, salary);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//            return doc ;
//    } 
//    
//    public Nurse addNurse (String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
//                              String address , String phoneNumber  , String email , double salary , String myRooms){
//        
//            Nurse n = null;
//        try {
//            
//            Operations op = new Operations();
//            op.addNurse(firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, myRooms);
//            
//            int [] roomkeys = op.separateKeys(myRooms);
//            
////            Room r[] = new Room[keys.length];
////            for(int i = 0; i < r.length; i++){
////                r[i] = op.searchInRoom(keys[i]);
////            }
//            
//            n = new Nurse(roomkeys, 0, firstName, lastName, id, Gender.female, dateOfBirth, age, address, phoneNumber, email, salary);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//        
//        return n ;
//    } 
//    
//    public Receptionist addReceptionist (String firstName , String lastName , String id , String gender , String dateOfBirth , int age , String address , String phoneNumber , String email , double salary , String receptionistAccount){
//       
//        Receptionist r = null;
//        
//        Operations op = new Operations();
//        op.addReceptionist(firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, receptionistAccount);
//
////        Account a = op.searchInAccount(receptionistAccount);
//        
//        Person.Gender g = null ;
//        
//        if(gender.equals("female")){
//            g = Person.Gender.female ;
//        }else if(gender.equals("male")){
//            g = Person.Gender.male ;
//        }else{
//            System.out.println("error in gender ");
//        }
//        
//        r = new Receptionist(receptionistAccount, 0, firstName, lastName, id, g, dateOfBirth, age, address, phoneNumber, email, salary);
//        
//        return r ;
//    } 
//    
//    public Patient addPatient (String firstName , String lastName , String id , String gender, String dateOfBirth , int age ,
//                              String address , String phoneNumber  , String email ,String medicalHistory , double fees , int myDoctor , int myDepartment){
//        
//        Operations op = new Operations();
//        op.addPatient(firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, medicalHistory, fees, myDoctor, myDepartment);
//        
////        Doctor d = op.searchInDoctor(myDoctor);
////        Department dep = op.searchInDepartment(myDepartment);
//        
//        Person.Gender g = null ;
//        
//        if(gender.equals("female")){
//            g = Person.Gender.female ;
//        }else if(gender.equals("male")){
//            g = Person.Gender.male ;
//        }else{
//            System.out.println("error in gender ");
//        }
//        
//        Patient p = new Patient(0 , firstName, lastName, address, id, dateOfBirth, phoneNumber, email, age, g, medicalHistory, myDoctor, myDepartment);
//        return p ;
//    } 
//    
//
//
//    
//    
//    
//    //REMOVE METHODS-------------------------------------------------
//    
//    public void removeRoom (int roomKey){
//        Operations op = new Operations();
//        op.removeById("room", roomKey);
//    } 
//    
//    public void removeDepartment (int depKey){
//        Operations op = new Operations();
//        op.removeById("department", depKey);
//    }     
//    public void removeEmployee (int empKey){
//        Operations op = new Operations();
//        op.removeById("employee", empKey);
//    } 
//    
//    public void removeDoctor (int docKey){
//        Operations op = new Operations();
//        op.removeById("doctor", docKey);
//    } 
//    
//    public void removeNurse (int nurseKey){
//        Operations op = new Operations();
//        op.removeById("nurse", nurseKey);
//    } 
//    
//    public void removeReceptionist (int recepKey){
//        Operations op = new Operations();
//        op.removeById("receptionist", recepKey);
//    } 
//    
//    public void removePatient (int patKey){
//        Operations op = new Operations();
//        op.removeById("patient", patKey);
//    } 
//    
//
//    
//    
//    
//    //Modify METHODS-------------------------------------------------
//
//    public void updateRoom (int myKey, int numOfBeds, int numOfPatients, String type, int myDepartment){
//        Operations op = new Operations();
//        op.updateRoom(myKey, numOfBeds, numOfPatients, type, myDepartment);
//    } 
//    
//    public void updateDepartment (int myKey , String departmentName, String doctorsKey , int numOfDoctors,String patientsKey,int numOfPatients,String nursesKey,int numOfNurses,String roomsKey,int numOfRooms){
//        Operations op = new Operations();
//        op.UpdateDepartment(myKey, departmentName, doctorsKey, numOfDoctors, patientsKey, numOfPatients, nursesKey, numOfNurses, roomsKey, numOfRooms);
//    } 
//    
//    public void updateEmployee (int myKey, String firstName, String lastName, String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary){
//        Operations op = new Operations();
//        op.updateEmployee(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
//    } 
//    
//    public void updateDoctor (int myKey, String firstName, String lastName, String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary, int myDepartment, int myPatients){
//        Operations op = new Operations();
//        op.updateDoctor(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, myDepartment, myPatients);
//    } 
//    
//    public void updateNurse (int myKey, String firstName, String lastName , String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary, String myRooms){
//        Operations op = new Operations();
//        op.updateNurse(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, myRooms);
//    } 
//    
//    public void updateReceptionist (int myKey, String firstName, String lastName , String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary, int receptionistAccount){
//        Operations op = new Operations();
//        op.updateReceptionist(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary, receptionistAccount);
//    } 
//    
//    public void updatePatient (int myKey, String firstName, String lastName, String id, String gender, String dateOfBirth, int age, String address, String phoneNumber, String email, int myDoctor, int myDepartment){
//        Operations op = new Operations();
//        op.updatePatient(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, myDoctor, myDepartment);
//    } 
//
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    private Department getDepartmentByKey(int myKey) {
//        Operations op = new Operations();
//        Department d = op.searchInDepartment(myKey);
//        return d ;
//    }
//    
//    private Room getRoomByKey(int myKey) {
//        Operations op = new Operations();
//        Room r = op.searchInRoom(myKey);
//        return r ;
//    }    
//
//    private Employee getEmployeeByKey(int myKey) {
//        Operations op = new Operations();
//        Employee e = op.searchInEmployees(myKey);
//        return e ;
//    }     
//
//    
//    private Doctor getDoctorByKey(int myKey) {
//        Operations op = new Operations();
//        Doctor d = op.searchInDoctor(myKey);
//        return d ;
//    }     
//    
//    
    
    
    
    
    

       
}
