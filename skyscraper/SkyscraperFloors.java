package skyscraper;

import java.util.Scanner;

public class SkyscraperFloors {
	
	
	public static void main(String[] args) {
		
		
		BuildFloors buildFloors = new BuildFloors();


		System.out.println("Please enter the total no of floors in the building -");
	
		
		try (Scanner sc = new Scanner(System.in)) {
			int floors = sc.nextInt();
			int skyscraper[] = new int[floors];
			int day = 1;
			for(int i=0;i<floors;i++) {
			System.out.println("Please enter the floor size given on day: " + day);
				skyscraper[i] = sc.nextInt();
				day++;
				
			}
			
			buildFloors.BuildFloorsImplementation(skyscraper, floors);
		}

	}

}

