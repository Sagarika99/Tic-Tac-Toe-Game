package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToe {

	public char playerChoice;
	public char computerChoice;
	
	public  void board() {
		char[] board = new char[10];
		for (int i=0;i<10;i++) {
			board[i] = ' ';
		}
	}
	
	public void playerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player choice: X or O");
		playerChoice = sc.next().charAt(0);
		
		if (playerChoice == 'X') {
			computerChoice = 'O';
		}
		else {
			computerChoice = 'X';
		}
		System.out.println("Player Choice: "+playerChoice);
		System.out.println("Computer Choice: "+computerChoice);
		
		
	}
	
}
