/****************************************************************
 * Purpose : To create a tic tac toe game.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class TicTacToeGame {
	static char player_letter;
	static char computer_letter;

	/* *purpose: Function to create a empty board */
	public static void createEmptyBoard() {
		char[] board = new char[10];
		for (int a = 1; a < board.length; a++) {
			board[a] = '-';
		}
	}

	/* *purpose: Function to determine the letter for player and computer . */
	public static char chooseLetter(char chosen_letter) {
		if (chosen_letter == 'x') {
			player_letter = 'x';
			computer_letter = 'o';
		} else if (chosen_letter == 'o') {
			player_letter = 'o';
			computer_letter = 'x';
		} else
			System.out.println("Enter valid letter or enter x or o in lower case");
		return player_letter;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe game ");
		createEmptyBoard();

		Scanner sc = new Scanner(System.in);
		/* Taking user input to choose a letter x or o. */
		System.out.println("Choose your letter: x or o");
		char chosen_letter = sc.next().charAt(0);

		chooseLetter(chosen_letter);
		sc.close();

	}

}
