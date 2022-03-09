
package Labb5.simulator;
 

public abstract class Event {

    //EventQueue queue;
    protected double time;
    
    
    abstract public void doMe(EventQueue queue, double random);    //utför eventet
    abstract public double getTime(); //få fram tiden händelsen ska inträffa
    
}
