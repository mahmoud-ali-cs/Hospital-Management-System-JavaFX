package OperationsCode;

public class Doctor extends Employee{

    private int myDepartment ;
    private int [] myPatient ;

   
    
    
    public Doctor( int myDepartment, int [] myPatient, int myKey, String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        this.myDepartment = myDepartment;
        this.myPatient = myPatient;
    }

    
    public int getMyDepartment() {
        return myDepartment;
    }

    public void setMyDepartment(int myDepartment) {
        this.myDepartment = myDepartment;
    }

    public int[] getMyPatient() {
        return myPatient;
    }

    public void setMyPatient(int[] myPatient) {
        this.myPatient = myPatient;
    }

    
    
    
    
 
   





    

    
    

    
}
