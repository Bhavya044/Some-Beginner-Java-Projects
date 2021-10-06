

import javax.swing.*;

class dishes{
	
		static String D1,D2,D3,D4;
	
	void DishEnt() {
		
		D1 = JOptionPane.showInputDialog("Enter the 1st food item");
		
		D2 = JOptionPane.showInputDialog("Enter the 2nd food item");
		
		D3 = JOptionPane.showInputDialog("Enter the 3rd food item");
		
		D4 = JOptionPane.showInputDialog("Enter the 4th food item");
			
	}
	
}
public class MomCode {

	void DishList() {
		
		dishes obj1 = new dishes();
		obj1.DishEnt();
		
		System.out.println("Today's menu:");
		System.out.println("1."+ obj1.D1);
		System.out.println("2."+ obj1.D2);
		System.out.println("3."+ obj1.D3);
		System.out.println("4."+ obj1.D4);
		

	}

}
