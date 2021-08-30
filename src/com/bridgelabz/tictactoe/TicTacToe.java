package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToe {

	public char playerChoice;
	public char computerChoice;
	char[] board = new char[10];
	
	public char[] createboard() {
		for (int i=1;i<10;i++) {
			board[i] = '-';
		}
		return board;
	}
	
	public char playerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player choice: X or O");
		playerChoice = sc.next().toUpperCase().charAt(0);
		return playerChoice;		
	}
	
	public void showBoard() {
		System.out.println(board[1]+ "|" +board[2]+ "|" +board[3]);
		System.out.println("-----");
		System.out.println(board[4]+ "|" +board[5]+ "|" +board[6]);
		System.out.println("-----");
		System.out.println(board[7]+ "|" +board[8]+ "|" +board[9]);
	}
	
	public boolean ifEmpty (char[] board, int position) {
		if (board[position] == '-')
			return true;
		else
			return false;
	}
	
	public char[] placeMarker(char[] baord, char playerInput) {
		Scanner sc = new Scanner(System.in);
		int position = 0;
		while(true) {
			System.out.println("Enter your choice from 1 to 9: ");
			position = sc.nextInt();
			if (position>0 || position<=9) {
				if(ifEmpty(board,position)) {
					board[position] = playerInput;
					break;
				}
			}			
		}
		return board;		
	}
	
	public void toss() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1.Heads or 2.Tails");
		int choice = sc.nextInt();
		int rand = (int)(Math.random()*10)%2;
		if(choice == rand) {
			System.out.println("Player will go first");
		}
		else {
			System.out.println("Computer will go first");
		}		
	}
	
	public boolean checkWinner(char[] baord, char playerInput) {
		return (board[1] == playerInput && board[2] == playerInput && board[3] == playerInput) || //top line
			(board[4] == playerInput && board[5] == playerInput && board[6] == playerInput) || //middle line
			(board[7] == playerInput && board[8] == playerInput && board[9] == playerInput) || //bottom line
			
			(board[1] == playerInput && board[5] == playerInput && board[9] == playerInput) || //diagonal line
			(board[3] == playerInput && board[5] == playerInput && board[7] == playerInput) || //diagonal line
			
			(board[1] == playerInput && board[4] == playerInput && board[7] == playerInput) || //first down line
			(board[2] == playerInput && board[5] == playerInput && board[8] == playerInput) || //second down line
			(board[3] == playerInput && board[6] == playerInput && board[9] == playerInput); // third down line

			
	}	
}
