package prototypepattern;


public class Weapon 
{
    private String type;

    public Weapon(String type) {
        this.type = type;
    }
    
     public Weapon(Weapon other) {
        this.type = other.type;
    }
     
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
