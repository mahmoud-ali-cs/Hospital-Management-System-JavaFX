package OperationsCode;

public class Room implements Hospital_Element{
    
    private int myKey ;
    private int numOfBeds ;
    private int numOfPatients ; //empty or full
    private String type ;
    private int myDepartment ;

    
    
    
    public Room(int myKey, int numOfBeds, int numOfPatients, String type, int myDepartment) {
        this.myKey = myKey;
        this.numOfBeds = numOfBeds;
        this.numOfPatients = numOfPatients;
        this.type = type;
        this.myDepartment = myDepartment;
    }

  
    
    
    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    public int getMyDepartment() {
        return myDepartment;
    }

    public void setMyDepartment(int myDepartment) {
        this.myDepartment = myDepartment;
    }

    


    
    @Override
    public int getMyKey() {
        return myKey ;
    }

    public void setMyKey(int myKey) {
        this.myKey = myKey;
    }
    

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    

    
}
