/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

/**
 *
 * @author Exile
 */
public class InputTypeVerifier {
    public int checkInt(String input, int minimum)
    {
        
        int val;
        try
        {
            val = Integer.parseInt(input);
            
        }
        catch(Exception e)
        {
            val = minimum - 1;
        }
        
        return val;
    }

}
