/****************************************************************
 * Purpose : To create a tic tac toe game.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class TicTacToeGame {

	// Method to create a empty tic tac toe board
	public static void createEmptyBoard() {
		char[] board = new char[10];
		for (int a = 0; a < 9; a++) {
			board[a] = (char) (a+1);
			System.out.println(" "+ board[a]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe game ");
		createEmptyBoard();

	}

}
