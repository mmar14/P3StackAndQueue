import java.util.Stack;
/**
 * The Class Group is an part of the implementation of "The Hiker Program".
 * 
 * The Class Group acts as the stack data structure that holds Hiker objects. 
 * 
 * There is maximun number of hikers that it can hold. It has methods to add hikers to the group, 
 * get the number of hikers in the group and check if the group is full or not. 
 * It also has a toString method that returns the state of the object.
 **/
public class Group
{
   // crating a stack of Hiker
    private Stack<Hiker> group; //I changed it because is a stack of Hiker
    private int numbHikers;
    private int maxHikers;
    
    /**
     * constructor
     **/
    public Group(int maxHikers)
    {
        
        group = new Stack<Hiker>(); 
        this.maxHikers = maxHikers;
        
    }
    
    /**
     * put auto-generated hikers into the stack.
     *
     * @param hikers list of string
     **/
    public void setHikers(String[] hikers)
    {
        
    }
    
    /**
     * get the number of hikers in a group
     * 
     * @return hikers int
     */
    public int getGroupNum()
    {
        return numbHikers;
    }
    
    /**
     * check if the group is full
     * 
     * @return boolean
     **/
    public boolean isGroupFull()
    {
        boolean full = false;
        
        if(group.size() == maxHikers)
        {
            full = true;
        }
        return full; 
    }
    
    /**
     * add hiker to the group
     **/
    public void addHiker(Hiker hiker)
    {
        
        group.puss(hiker);
    }
    
    /**
     * toString method
     *
     * @return String
     */
    @Override
    public String toString()
    {
        return "";
    }
    
