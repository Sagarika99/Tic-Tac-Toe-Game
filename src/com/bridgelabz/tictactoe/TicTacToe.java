package com.bridgelabz.tictactoe;

public class TicTacToe {

	public static void board() {
		char[] createboard = new char[10];
		for (int i=1;i<10;i++) {
			createboard[i] = ' ';
		}
	}
	
	
	public static void main(String[] args) {
		board();
		}
}
