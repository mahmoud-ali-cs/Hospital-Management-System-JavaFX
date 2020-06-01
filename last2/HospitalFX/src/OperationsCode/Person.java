package OperationsCode;

public interface Person extends Hospital_Element{
    
    enum Gender {female , male } ;
    
    public int getMyKey() ;
    public String getFirstName();
    public String getLastName();
    public String getAddress() ;
    public String getId() ;
    public String getDateOfBirth();
    public int getAge();
    public Gender getGender();
    public String getPhoneNumber();
    public String getEmail();

    
    public void setMyKey(int myKey) ;
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setAddress(String address) ;
    public void setId(String id) ;
    public void setDateOfBirth(String dateOfBirth);
    public void setAge(int age);
    public void setGender(Gender gender);
    public void setPhoneNumber(String phoneNumber);
    public void setEmail(String email);
    
    
    

    
}
