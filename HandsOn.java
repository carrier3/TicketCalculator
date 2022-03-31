package com.carrie_reed.handson2;

public class HandsOn {

	public static void main(String[] args) {
		
		//variables
		int age = 60;
		final int studentCost = 8;
		final int seniorCost = 7;
		final int childCost = 8;
		final int everyoneCost = 10;
		
		boolean isStudent = true;
		
		boolean student = false;
		boolean senior = false;
		boolean child = false;
		boolean everyone = false;
//		boolean isValid = true;
		

		
		if (age <= 0) {
//			isValid = false;
			System.out.println("Invalid age.");
		}
//		while (isValid = true)
		else {
			//find person status
			if (age >= 65) {
				senior = true;
			}
			else {
				if (isStudent) {
					student = true;
				}	
				else if(age <= 12) {
					child = true;
				}
				else {
					everyone = true;
				}
			}
		}
		
		

		
		//print statements
		if (student) {
			System.out.println("Students pay $" + studentCost);
		}
		else if (senior) {
			System.out.println("Seniors pay $" + seniorCost);
		}
		else if (child) {
			System.out.println("Children pay $" + childCost);
		}
		else {
			System.out.println("Everyone else pays $" + everyoneCost);
		}
	}

}
