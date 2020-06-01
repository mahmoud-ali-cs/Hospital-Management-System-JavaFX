package OperationsCode;

public class Receptionist extends Employee{

    String receptionistAccount ;

    
    
    
    public Receptionist(String receptionistAccount, int myKey, String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        this.receptionistAccount = receptionistAccount;
    }

    public String getReceptionistAccount() {
        return receptionistAccount;
    }

    public void setReceptionistAccount(String receptionistAccount) {
        this.receptionistAccount = receptionistAccount;
    }

    

 
    
    

    
}
