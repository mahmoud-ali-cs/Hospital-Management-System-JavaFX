package OperationsCode;

class Account {
    
    private String username ;
    private String password ;
    private String type ;
    private int owner ;

    public Account(String username, String password, String type, int owner) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.owner = owner;
        
        Operations op = new Operations();
        op.addAcount(username, password, type, owner);
    }
    
    
    public Account(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;

        Operations op = new Operations();
        op.addAcount(username, password, type, -1);

    }

    
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    
    
    
    
    
    
 
    
}
