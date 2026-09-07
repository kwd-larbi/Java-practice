 /* Assignment Tic-Tac-Toe
   Name: Kwadwo Larbi
   File Created on July 2, 2026
 
 
 */
 
 /*
 BEGIN PROGRAM

    DECLARE board as 2D array of char size 3x3
    DECLARE currentPlayer as char ('X' for human, 'O' for computer)
    DECLARE winnerStatus as integer

    CALL initBoard()

    SET currentPlayer = 'X'   // human always starts

    DO
        IF currentPlayer == 'X' THEN
            CALL yourTurn()
        ELSE
            CALL machineTurn()
        ENDIF

        CALL gameBoard()

        winnerStatus = checkWinner()

        IF winnerStatus == 1 THEN
            DISPLAY "You win!"
        ELSE IF winnerStatus == -1 THEN
            DISPLAY "Computer wins!"
        ELSE IF winnerStatus == 0 THEN
            DISPLAY "It's a tie!"
        ENDIF

        SWITCH currentPlayer:
            CASE 'X': currentPlayer = 'O'
            CASE 'O': currentPlayer = 'X'
        END SWITCH

    WHILE winnerStatus == 2   // 2 means no winner yet

END PROGRAM
 */
 
public class TTTLarbi{
   
   static char[][] board = new char[3][3];
 
 }