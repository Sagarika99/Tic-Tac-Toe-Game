package com.bridgelabz.tictactoe;

public class TicTacToeRunner {

	public static void main(String[] args) {
		TicTacToe gamePlay = new TicTacToe();
		char[] board = gamePlay.createboard();
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
		System.out.println();
		
		gamePlay.showBoard();
		System.out.println();
		
		int chance = gamePlay.toss();
		while(true) {
			if (gamePlay.tie()){
				if(chance == 1) {
					board = gamePlay.placeMarker(board, playerChoice);
					gamePlay.showBoard();
					System.out.println();
					if (gamePlay.checkWinner(board, playerChoice)) {
						System.out.println("Player has Won");
						break;
					}
					else {
						chance = 0;
					}
				}
				else {
					board = gamePlay.checkComputerWin(board,computerChoice,playerChoice);
					//board = gamePlay.computerInput(board, computerChoice);
					gamePlay.showBoard();
					System.out.println();
					if(gamePlay.checkWinner(board, computerChoice)) {
						System.out.println("Computer has Won");
						break;
					}
					else {
						chance = 1;
					}
				}
			}
		else {
			System.out.println("It is a tie");
			break;
		}
	}

	}
}
