
class Chick implements Animal {     
     private String myType;     
     private String mySound1;    
     private String mySound2;
     private String mySound;
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound1 = sound1;
         mySound2 = sound2;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound()
    {
        if (Math.random() < 0.5)
            mySound = mySound1;
        else 
            mySound = mySound2;
        return mySound;
    }     
     public String getType(){return myType;} 
}
