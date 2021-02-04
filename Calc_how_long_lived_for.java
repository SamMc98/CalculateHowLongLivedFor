package Java_Challenges;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calc_how_long_lived_for {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
		
		LocalDate date = java.time.LocalDate.now();
		System.out.println(date + "\nAdd your DOB. YYYY-MM-DD:");
		
		String date1 = input.nextLine();
        //default, ISO_LOCAL_DATE
        LocalDate DOB = LocalDate.parse(date1);

        System.out.println(DOB);
		
        Period diff = Period.between(DOB, date); 
        System.out.println(diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days");
        //prints age in years, months, days
        System.out.println(diff.getDays() + " days");
       //prints age in days
        input.close();
	}
}
