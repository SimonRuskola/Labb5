package Labb5.state;

/** 
 * Creates a new customer "object".
*@author Simon Ruskola, Gabriel Sundblad, Elmer Tallgren, Rasmus Svedberg
*/

public class Customer{

    private int customerID;
    private String customerState = "";
    
    /** 
    sets the customer ID
    @param ID.
    */
    public Customer (int ID){
        this.customerID = ID;
    }
    /** 
    returns the customer id. 
    @return customerID.
    */
    public int getID (){
        return this.customerID;
    }

    /** 

    public void setCustomerState (String customerState){
        this.customerState = customerState;
    }
    public String getCustomerState(){
        return this.customerState;
    }   
    
    */

}
