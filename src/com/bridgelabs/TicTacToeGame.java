/****************************************************************
 * Purpose : To create a tic tac toe game.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class TicTacToeGame {

	/* *purpose: Function to create a empty board */
	public static void createEmptyBoard() {
		char[] board = new char[10];
		for (int a = 1; a < board.length ; a++) {
			board[a] = '-';
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe game ");
		createEmptyBoard();

	}

}
