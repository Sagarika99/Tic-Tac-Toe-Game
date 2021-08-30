package com.bridgelabz.tictactoe;

public class TicTacToeRunner {

	public static void main(String[] args) {
		TicTacToe gamePlay = new TicTacToe();
		gamePlay.board();
		char playerChoice = gamePlay.playerInput();
		char computerChoice;		
		if (playerChoice == 'X') {
			computerChoice = 'O';
		}
		else {
			computerChoice = 'X';
		}
		System.out.println("Player Choice: "+playerChoice);
		System.out.println("Computer Choice: "+computerChoice);
		
		gamePlay.showBoard();
	}
}
