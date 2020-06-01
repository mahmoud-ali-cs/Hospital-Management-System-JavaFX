package OperationsCode;

public class Department implements Hospital_Element{
    
    private int myKey ;
    private String departmentName ;
    private int numOfDoctors ;
    private int [] doctorsKey ;
    private int numOfPatients ;
    private int [] patientsKey ;
    private int numOfNurses ;
    private int [] nursesKey ;
    private int numOfRooms ;
    private int [] roomsKey ;

    
    
    
    
    
    
    public Department(int myKey, String departmentName, int numOfDoctors, int[] doctorsKey, int numOfPatients, int[] patientsKey, int numOfNurses, int[] nursesKey, int numOfRooms, int[] roomsKey) {
        this.myKey = myKey;
        this.departmentName = departmentName;
        this.numOfDoctors = numOfDoctors;
        this.doctorsKey = doctorsKey;
        this.numOfPatients = numOfPatients;
        this.patientsKey = patientsKey;
        this.numOfNurses = numOfNurses;
        this.nursesKey = nursesKey;
        this.numOfRooms = numOfRooms;
        this.roomsKey = roomsKey;
    }

    
    
    
    
    
    public int getMyKey() {
        return myKey;
    }

    public void setMyKey(int myKey) {
        this.myKey = myKey;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumOfDoctors() {
        return numOfDoctors;
    }

    public void setNumOfDoctors(int numOfDoctors) {
        this.numOfDoctors = numOfDoctors;
    }

    public int[] getDoctorsKey() {
        return doctorsKey;
    }

    public void setDoctorsKey(int[] doctorsKey) {
        this.doctorsKey = doctorsKey;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    public int[] getPatientsKey() {
        return patientsKey;
    }

    public void setPatientsKey(int[] patientsKey) {
        this.patientsKey = patientsKey;
    }

    public int getNumOfNurses() {
        return numOfNurses;
    }

    public void setNumOfNurses(int numOfNurses) {
        this.numOfNurses = numOfNurses;
    }

    public int[] getNursesKey() {
        return nursesKey;
    }

    public void setNursesKey(int[] nursesKey) {
        this.nursesKey = nursesKey;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int[] getRoomsKey() {
        return roomsKey;
    }

    public void setRoomsKey(int[] roomsKey) {
        this.roomsKey = roomsKey;
    }




    

    
    

    
    
}
