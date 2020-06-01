package OperationsCode;

public class Nurse extends Employee{

    private int myRoom ;

    
    
    
    public Nurse( int myRoom, int myKey, String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        this.myRoom = myRoom;
    }

    
    
    public int getMyRoom() {
        return myRoom;
    }

    public void setMyRoom(int myRoom) {
        this.myRoom = myRoom;
    }

    

    
}
