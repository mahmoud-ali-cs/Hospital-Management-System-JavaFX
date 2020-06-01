package OperationsCode;

public class Patient implements Person{
    
    								
    private int myKey ;
    private String firstName ;
    private String lastName ;
    private String address ;
    private String id ;
    private Gender gender ;
    private String dateOfBirth ;
    private int age ;
    private String phoneNumber ;
    private String email ;
    private String medicalHistory ;
    private double fees ;
    private String startTime ;

    
    private int myDoctor ;
    private int myDepartment ;
    private int myRoom ;

    public Patient(int myKey, String firstName, String lastName, String address, String id, Gender gender, String dateOfBirth, int age, String phoneNumber, String email, String medicalHistory, double fees, String startTime, int myDoctor, int myDepartment, int myRoom) {
        this.myKey = myKey;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.medicalHistory = medicalHistory;
        this.fees = fees;
        this.startTime = startTime;
        this.myDoctor = myDoctor;
        this.myDepartment = myDepartment;
        this.myRoom = myRoom;
    }


    

    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    public int getMyKey() {
        return myKey;
    }

    public void setMyKey(int myKey) {
        this.myKey = myKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getMyDoctor() {
        return myDoctor;
    }

    public void setMyDoctor(int myDoctor) {
        this.myDoctor = myDoctor;
    }

    public int getMyDepartment() {
        return myDepartment;
    }

    public void setMyDepartment(int myDepartment) {
        this.myDepartment = myDepartment;
    }


    
    
    public String [][] getMedicalArr (){
        
        String m = this.medicalHistory ;
        
        
        int countRow = 0 ; //$
        int countColumn = 0 ; //@
        for(int i = 0 ; i < m.length() ; i++){
            if( m.charAt(i) == '$' ){
                countRow++ ;
            }else if( m.charAt(i) == '@' && countRow == 0){
                countColumn++ ;
            }
        }
        
        System.out.println("Rows : " + countRow + "  Cols : " + countColumn);
        
        String [][] medical = new String[countRow][countColumn] ;
        
        int row = 0 ;
        int col = 0 ;
        int start = 0 ;
        int end = 0 ;
        
        for(int i = 0 ; i < m.length() ; i++){
            if( m.charAt(i) == '$' ){
                start = i+1 ;
                
                row++ ;
                col = 0;
            }else if( m.charAt(i) == '@' ){
                end = i ;
                medical[row][col] = m.substring(start, end);
                start = i+1 ;
                
                col++ ;
            }
        }
        
        
        
        return medical ;
    }
    
    
    
    public void setMedicalArr (String [][] medical){
        
        String m = "" ;
        
        for(int i = 0 ; i < medical.length ; i++){
            for(int j = 0 ; j < medical[i].length ; j++){
                m += medical[i][j] + "@" ;
            }
            m += "$" ;
        }
        
        
        this.medicalHistory = m ;
    }

    
    
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getMyRoom() {
        return myRoom;
    }

    public void setMyRoom(int myRoom) {
        this.myRoom = myRoom;
    }
    
    
    
    
    

    
}
