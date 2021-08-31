package com.bridgelabz.tictactoe;
import java.util.Scanner;
import java.util.Random;

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
	
	public char[] placeMarker(char[] board, char playerChoice) {
		Scanner sc = new Scanner(System.in);
		int playerMove = 0;
		while(true) {
			System.out.println("Enter your choice from 1 to 9: ");
			playerMove = sc.nextInt();
			if (playerMove>0 || playerMove<=9) {
				if(ifEmpty(board,playerMove)) {
					board[playerMove] = playerChoice;
					break;
				}
			}			
		}
		return board;		
	}
	
	public int toss() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1.Heads or 2.Tails");
		int choice = sc.nextInt();
		int rand = (int)(Math.random()*10)%2;
		if(choice == rand) {
			System.out.println("Player will go first");
			return 1;
		}
		else {
			System.out.println("Computer will go first");
			return 0;
		}		
	}
	
	public boolean checkWinner(char[] board, char playerInput) {
		return (board[1] == playerInput && board[2] == playerInput && board[3] == playerInput) || //top line
			(board[4] == playerInput && board[5] == playerInput && board[6] == playerInput) || //middle line
			(board[7] == playerInput && board[8] == playerInput && board[9] == playerInput) || //bottom line
			
			(board[1] == playerInput && board[5] == playerInput && board[9] == playerInput) || //diagonal line
			(board[3] == playerInput && board[5] == playerInput && board[7] == playerInput) || //diagonal line
			
			(board[1] == playerInput && board[4] == playerInput && board[7] == playerInput) || //first down line
			(board[2] == playerInput && board[5] == playerInput && board[8] == playerInput) || //second down line
			(board[3] == playerInput && board[6] == playerInput && board[9] == playerInput); // third down line			
	}
	
	public char[] computerInput(char[] board, char computerChoice) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int computerMove = 0;
		while(true) {
			computerMove = rand.nextInt(9)+1;
			if(ifEmpty(board,computerMove)) {
				board[computerMove] = computerChoice;
				break;
			}
		}
		return board;
	}
	
	public boolean tie() {
		for (int i=1; i<10;i++) {
			if (board[i] == '-') {
				return true;
			}
		}
		return false;
	}
	
	public char[] checkComputerWin(char[] board, char computerChoice, char playerChoice) {
		//first line
		if ((board[1] == board[2] && board[2] == computerChoice && ifEmpty(board,3)) || (board[1] == board[2] && board[2] == playerChoice && ifEmpty(board,3))) {			
			board[3] = computerChoice;
		}
		else if ((board[1] == board[3] && board[3] == computerChoice && ifEmpty(board,2)) || (board[1] == board[3] && board[3] == playerChoice && ifEmpty(board,2))) {
			board[2] = computerChoice;
		}
		else if ((board[2] == board[3] && board[3] == computerChoice && ifEmpty(board,1)) || (board[2] == board[3] && board[3] == playerChoice && ifEmpty(board,1))) {
			board[1] = computerChoice;
		}
		
		//second line
		else if ((board[4] == board[5] && board[5] == computerChoice && ifEmpty(board,6)) || (board[4] == board[5] && board[5] == playerChoice && ifEmpty(board,6))) {
			board[6] = computerChoice;
		}
		else if ((board[4] == board[6] && board[6] == computerChoice && ifEmpty(board,5)) || (board[4] == board[6] && board[6] == playerChoice && ifEmpty(board,5))) {
			board[5] = computerChoice;
		}
		else if ((board[5] == board[6] && board[6] == computerChoice && ifEmpty(board,4)) || (board[5] == board[6] && board[6] == playerChoice && ifEmpty(board,4))) {
			board[4] = computerChoice;
		}
		
		//third line
		else if ((board[7] == board[8] && board[8] == computerChoice && ifEmpty(board,9)) || (board[7] == board[8] && board[8] == playerChoice && ifEmpty(board,9))) {
			board[9] = computerChoice;
		}
		else if ((board[7] == board[9] && board[9] == computerChoice && ifEmpty(board,8)) || (board[7] == board[9] && board[9] == playerChoice && ifEmpty(board,8))) {
			board[8] = computerChoice;
		}
		else if ((board[8] == board[9] && board[9] == computerChoice && ifEmpty(board,7)) || (board[8] == board[9] && board[9] == playerChoice && ifEmpty(board,7))) {
			board[7] = computerChoice;
		}
		
		//first column
		else if ((board[1] == board[4] && board[4] == computerChoice && ifEmpty(board,7)) || (board[1] == board[4] && board[4] == playerChoice && ifEmpty(board,7))) {
			board[7] = computerChoice;
		}
		else if ((board[4] == board[7] && board[7] == computerChoice && ifEmpty(board,1)) || (board[4] == board[7] && board[7] == playerChoice && ifEmpty(board,1))) {
			board[1] = computerChoice;
		}
		else if ((board[1] == board[7] && board[7] == computerChoice && ifEmpty(board,4)) || (board[1] == board[7] && board[7] == playerChoice && ifEmpty(board,4))) {
			board[4] = computerChoice;
		}
		
		//second column
		else if ((board[2] == board[5] && board[5] == computerChoice && ifEmpty(board,8)) || (board[2] == board[5] && board[5] == playerChoice && ifEmpty(board,8))) {
			board[8] = computerChoice;
		}
		else if ((board[5] == board[8] && board[8] == computerChoice && ifEmpty(board,2)) || (board[5] == board[8] && board[8] == playerChoice && ifEmpty(board,2))) {
			board[2] = computerChoice;
		}
		else if ((board[2] == board[8] && board[8] == computerChoice && ifEmpty(board,5)) || (board[2] == board[8] && board[8] == playerChoice && ifEmpty(board,5))) {
			board[5] = computerChoice;
		}
		
		//third column
		else if ((board[3] == board[6] && board[6] == computerChoice && ifEmpty(board,9)) || (board[3] == board[6] && board[6] == playerChoice && ifEmpty(board,9))) {
			board[9] = computerChoice;
		}
		else if ((board[6] == board[9] && board[9] == computerChoice && ifEmpty(board,3)) || (board[6] == board[9] && board[9] == playerChoice && ifEmpty(board,3))) {
			board[3] = computerChoice;
		}
		else if ((board[3] == board[9] && board[9] == computerChoice && ifEmpty(board,6)) || (board[3] == board[9] && board[9] == playerChoice && ifEmpty(board,6))) {
			board[6] = computerChoice;
		}
		
		//first diagonal
		else if ((board[1] == board[5] && board[5] == computerChoice && ifEmpty(board,9)) || (board[1] == board[5] && board[5] == playerChoice && ifEmpty(board,9))) {
			board[9] = computerChoice;
		}
		else if ((board[1] == board[9] && board[9] == computerChoice && ifEmpty(board,5)) || (board[1] == board[9] && board[9] == playerChoice && ifEmpty(board,5))) {
			board[5] = computerChoice;
		}
		else if ((board[5] == board[9] && board[9] == computerChoice && ifEmpty(board,1)) || (board[5] == board[9] && board[9] == playerChoice && ifEmpty(board,1))) {
			board[1] = computerChoice;
		}
		
		//second diagonal
		else if ((board[5] == board[7] && board[7] == computerChoice && ifEmpty(board,3)) || (board[5] == board[7] && board[7] == playerChoice && ifEmpty(board,3))) {
			board[3] = computerChoice;
		}
		else if ((board[3] == board[5] && board[5] == computerChoice && ifEmpty(board,7)) || (board[3] == board[5] && board[5] == playerChoice && ifEmpty(board,7))) {
			board[7] = computerChoice;
		}
		else if ((board[3] == board[7] && board[7] == computerChoice && ifEmpty(board,5)) || (board[3] == board[7] && board[7] == playerChoice && ifEmpty(board,5))) {
			board[5] = computerChoice;
		}
		else {
			computerInput(board,computerChoice);
		}
		return board;
	}
}
