# Java Loops

# Number Guessing Game

## Objective
This program is a number guessing game in which the user guesses the number until that number matches with the random number that had taken by computer. 

## Concepts Used
Loops allow a block of code to execute repeatedly until a condition becomes false or a specified number of iterations is completed.

In java we have 3 types of loops(Control statements):
1. for loop : This loop is used when we know upto how many iteration we have to do.
2. while loop : While loop depends on a condition if the condition is true loop runs or else it ends.
3. do while : If we want to complete atleast one iteration whether the condition is true or flase then we use do while.

## Project Flow
1. This program takes input from the user and checks if it makes with the number that have been already randomly selected by the program.
2. In this program the user has 6 attempts to guess the number.
3. Every time the user enters a number the program check whether the number is high or low with respective to the number selected by program.
4. If the user guessed it correctly in those 6 attempts or below, then he wins the game or else he losses it.
5. After the 6 attempts if the player wants to start over the game he can enter 'Y' or else 'N' if not. 
6. If he enters 'Y' then the game starts from first or else if it is 'N' then the game is over.

## Test Cases

### TestCase1:
Input:
Guess the number (between 0 to 100) in 6 attempts:
50
Too High!
25
Too Low!
37
Too High!
31
Congratulations! You guessed correctly.
If you want start over the game: (enter Y or N)
N
Game Over.

### TestCase2:
Input:
Guess the number (between 0 to 100) in 6 attempts: 
50
Too Low!
60
Too Low!
70
Too High!
65
Too High!
62
Too Low!
64
Too High!
Your are out of chances
If you want start over the game: (enter Y or N)
Y
Guess the number (between 0 to 100) in 6 attempts: 
50
Too Low!
75
Too High!
68
Too High!
60
Too High!
55
Too High!
52
Congratulations! You guessed correctly.
If you want start over the game: (enter Y or N)
n
Invalid input