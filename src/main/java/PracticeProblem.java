/*
Author: Alex Liang
Lesson: 1.10 - String Manipulation
Date Created: Mar 2, 2026
Last Modified: 
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		//Write question 1 code here
	String sentence;
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	sentence = input.nextLine();
	boolean detection;
	detection = sentence.contains("on");
	System.out.println(detection);
	}

	public static void q2() {
		//Write question 2 code here
	String word;
	Scanner input = new Scanner(System.in);
	System.out.print("Input the word mango: ");
	word = input.nextLine();
	String wordcheck = word.toLowerCase();
	boolean detection;
	detection = wordcheck.contains("mango");
	System.out.println(detection);
	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word = input.nextLine();
	System.out.print("Input a letter: ");
	String letter = input.nextLine();
	System.out.println(word.indexOf(letter));
	System.out.println(word.lastIndexOf(letter));
	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String sentence = input.nextLine();
	int length = sentence.length();
	System.out.println("Your sentence is " + length + " characters long");
	}

	public static void q5() {
		//Write question 5 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String sentence = input.nextLine();
	System.out.print("Input a word to replace: ");
	String replacement = input.nextLine();
	System.out.print("What word would you like to replace it with: ");
	String replaced = input.nextLine();
	System.out.println(sentence.replaceAll(replacement, replaced));
	}

	public static void q6() {
		//Write question 6 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String sentence = input.nextLine();
	System.out.println(sentence.toUpperCase());
	System.out.println(sentence.toLowerCase());
	}

	public static void q7() {
		//Write question 7 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word = input.nextLine();
	System.out.println(word.substring(0,4));
	int length = word.length();
	System.out.println(word.substring(length - 4));
	}

	public static void q8() {
		//Write question 8 code here
	}

}
