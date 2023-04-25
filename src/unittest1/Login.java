/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest1;

/**
 *
 * @author Zahra
 */
public class Login {
    int RegID = 90;
    public boolean UserName(String strInput){
        if(strInput.contains("?"))
        {return true;
    }
        return false;
}
public String Login(int ID){
    if( ID == RegID)
    {
        return "Welcome to the application";
    }
    else {
        return "Your id is not valid";
    }
}

}