/**
 * Hiker class
 **/
public class Hiker{

    //instance variables
    private String hikerId;
    
    /**
     * constructor
     *
     * @param hikerid String
     */
    public Hiker(String hikerid){
        this.hikerId = hikerid;
        
    }
    
    /**
     * set hiker's id
     * 
     * @return name String
     */
    public void setHikerId(String name){
        this.hikerId = name;
    }
    
    /**
     * get the hiker's id
     */
    public String getHikerId(){
        return hikerId;
    }
    
    /**
     *
     */
    public String toString(){
        return "";
    }
     
