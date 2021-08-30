package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToe {

	public char playerChoice;
	public char computerChoice;
	char[] board = new char[10];
	
	public  void board() {
		board = new char[10];
		for (int i=0;i<10;i++) {
			board[i] = ' ';
		}
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
	
}
