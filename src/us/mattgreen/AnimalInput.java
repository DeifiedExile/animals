/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;


import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Exile
 */
public class AnimalInput {
    private ArrayList zoo;
    public AnimalInput(ArrayList<Talkable> zoo)
    {
        this.zoo = zoo;

    }
    public void addAnimal()
    { 
        int animal = animalType();
        switch (animal)
        {
            case 1: 
                
                zoo.add(new Cat(miceKills(), getName()));
                break;
            case 2:
                zoo.add(new Dog(isFriendly(), getName()));
                break;
            case 3:
                zoo.add(new Student(getAge(), getName()));
                break;
                
        }
        
    }
    public int animalType()
    {
        int aType = 0;
       
        while(aType == 0)
        {
            try
            {
                aType = Integer.parseInt(JOptionPane.showInputDialog("Enter animal type:\n1. Cat\n2. Dog\n3. Student\n"));
                if(aType > 3 || aType < 1)
                {
                    aType = 0;
                } 
            }
            catch(Exception e)
            {
                aType = 0;
                JOptionPane.showMessageDialog(null, "Invalid selection. Please enter a valid value.");
            }
        }
        
        return aType;
    }
    public boolean isFriendly()
    {
        boolean isFriendly = false;
        int input = 0;
        while(input == 0)
        {
            try
            {
                input = Integer.parseInt(JOptionPane.showInputDialog("Is the animal friendly?\n1. Yes\n2. No"));
                if(input > 2 || input < 1)
                {
                    input = 0;
                }
            }
            catch(Exception e)
            {
                input = 0;
                JOptionPane.showMessageDialog(null, "Invalid selection. Please enter a valid value.");                
            }           
        }
        if(input == 1)
        {
            isFriendly = true;
        }
        else
        {
            isFriendly = false;
        }
        return isFriendly;
    }
    public int miceKills()
    {
        int kills = -1;
        while(kills < 0)
        {
            try
            {
                kills = Integer.parseInt(JOptionPane.showInputDialog("How many mice has it killed?"));
            }
            catch(Exception e)
            {
                kills = -1;
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid value.");              
            }
        }
        return kills;
    }
    public String getName()
    {
        String name = "";
        while(name.isEmpty())
        {
            try
            {
                name = JOptionPane.showInputDialog("What is his/her name?");
            }
            catch(Exception e)
            {
                name = "";
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid value.");
            }
        }
        return name;
    }
    public int getAge()
    {
        int age = 0;
        
        while(age == 0)
        {
            try
            {
                age = Integer.parseInt(JOptionPane.showInputDialog("How old is he/she?"));
                
            }
            catch(Exception e)
            {
                age = 0;
                JOptionPane.showMessageDialog(null, "Invalid age. Please enter a valid value.");       
            }
        }
        return age;
    }

}
