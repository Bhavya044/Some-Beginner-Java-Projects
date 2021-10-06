import java.util.*;

import javax.swing.JOptionPane;

import java.math.*;
public class UserCode
{	
	 static int FinalVote;
	 static int A1 = 0,A2 = 0,A3 = 0,A4 = 0;
	 int AA=0;

	public  void Choice()
	{   
        
		System.out.println("Show the Dishes' List");
		MomCode DM= new MomCode();
		DM.DishList();
		System.out.println("Enter 1 for First Dish , 2 For Second Dish and so on");
		
    }
    public void EnterChoice()
    {
        
	
		String S1 = JOptionPane.showInputDialog("Enter your choice from menu: ");
		AA = Integer.parseInt(S1);
       
		switch (AA)
		{
		case 1:
			A1++;
			System.out.println("Dish 1 Voted");
            break;
        case 2:
            A2++;
            System.out.println("Dish 2 Voted");
            break;
        case 3:
            A3++;
            System.out.println("Dish 3 Voted");
            break;
        case 4:
            A4++;
            System.out.println("Dish 4 Voted");
            break;
        
        default:
            System.out.println("Enter the Valid Choice Available");
        }
    }
    
    public void Votes()
    {
        
        int MaxVotes=0;
        MaxVotes=Math.max(A1, A2);
        MaxVotes=Math.max(MaxVotes,A3);
        MaxVotes=Math.max(MaxVotes,A4);
        
        if(MaxVotes==A1)
        System.out.println("Dish 1 selected");
        else if(MaxVotes==A2)
        System.out.println("Dish 2 selected");
        else if(MaxVotes==A3)
        System.out.println("Dish 3 selected");
        else if(MaxVotes==A4)
        System.out.println("Dish 4 selected");
        else
        System.out.println("");
        FinalVote=MaxVotes;
    }
 
    public static void main(String args[]) {
    	
    	dishes obj3 = new dishes();
    	
    	UserCode obj2 = new UserCode();
    	obj2.Choice();
    	for(int i=0;i<8;i++) {
    		System.out.println("");
    		obj2.EnterChoice();
	
    	}
    	
    	
    	obj2.Votes();
    	
    	if(FinalVote==A1) {
    		JOptionPane.showMessageDialog(null,"Today's dish is "+ obj3.D1);
    	}
    	else if(FinalVote==A2){
    		JOptionPane.showMessageDialog(null,"Today's dish is "+ obj3.D2);
    	}
    	else if(FinalVote==A3){
    		JOptionPane.showMessageDialog(null,"Today's dish is "+ obj3.D3);
    	}
    	else {
    		JOptionPane.showMessageDialog(null,"Today's dish is "+ obj3.D4);
    	}
    	
    	
    }
	
}