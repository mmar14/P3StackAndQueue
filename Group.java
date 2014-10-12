import java.util.Stack;
/**
 * Class Group
 **/
public class Group{

    //instance variables
    private Stack<String> group;
    private int numbHikers;
    private int maxHikers;
    
    /**
     * constructor
     **/
    public Group(int maxHikers){
        this.maxHikers = maxHikers;
        
    }
    
    /**
     * put auto-generated hikers into the stack.
     *
     * @param hikers list of string
     **/
    public void setHikers(String[] hikers){
        
    }
    
    /**
     * get the number of hikers in a group
     * 
     * @return hikers int
     */
    public int getGroupNum(){
        return numbHikers;
    }
    
    /**
     * check if the group is full
     * 
     * @return boolean
     **/
    public boolean isGroupFull(){
        boolean full = false;
        if(group.size()==maxHikers)
            full = true;
        return full; 
    }
    
    /**
     * add hiker to the group
     **/
    public void addHiker(Hiker hiker){
    
    }
    
    /**
     * toString method
     *
     * @return String
     *//
    @Override
    public String toString(){
        return "";
    }
    
