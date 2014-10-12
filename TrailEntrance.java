import java.util.LinkedList;

/**
 * TrailEntrance class
 **/
public class TrailEntrance{

    //instance variables
    private LinkedList<Group> queue;
    private int trailNum;
    
    /**
     * constructor
     **/
    public TrailEntrance(){
        //initialize variables
        queue = new LinkedList();
    }
    
    /**
     * check if the group is full
     *
     * @return boolean
     **/
    public boolean isGroupFull(){
        boolean full = false;
        for(int i = 0; i < queue.size(); i++){
            //need to add more
            }
        return full;
    }
    
    /**
     * add groups of hiker to the queue
     **/
    addGroupToQ(Group group){
         //need more code
    }
    
    /**
     * set the trail number
     **/
    public void setTrailNum(int trail){
        this.trailNum = trail;
    }
    
    /**
     * get the trail number
     *
     * @return int
     **/
    public int getTrailNum(){
        return trailNum;
    }
    
    /**
     * get the hikers information in the groups.
     *
     * @return String
     **/
    public String getTrailInfo(){
        //need more work
        return "";
    }
