package skyscraper;
import java.util.*;

public class BuildFloors {
	
	public void BuildFloorsImplementation(int skyscraper[], int floors) {
		
		int daynum = 1;
		int floornum = floors;
		ArrayList<Integer> inventory = new ArrayList<Integer>();
		
		System.out.println("The order of construction is as follows -");
		
		for (int c = 0; c < floors ; c++) {
			
			if(skyscraper[c] >= floornum) {
				System.out.println("\n" + "Day: " + daynum);
				System.out.print(skyscraper[c] + " ");
				floornum--;
				
				if (inventory.isEmpty()) {
					System.out.println();
				}
				
				else {
					int h = 0;
					int floornum1 = floornum;
					
					while (!inventory.isEmpty() && inventory.get(h) >= floornum1) {
					System.out.print(inventory.get(h) + " ");
					
					inventory.remove(h);
				
					floornum--;
					floornum1--;
				}
			
			}	

		}					
			
				
			else {
				System.out.println("\n" + "Day: " + daynum);
				System.out.println();
				
				inventory.add(skyscraper[c]);
				Collections.sort(inventory, Collections.reverseOrder());			
				}
			
			daynum++;	
		}
		
	}
			
}
		
	

	
	



