# Rock-Paper-Scissors-Game
A Java based Rock Paper Scissors game where players compete against the computer using randomly generated moves and standard game rules.

Rock Paper Scissors Game in Java

Overview

This project is a console-based implementation of the classic Rock Paper Scissors game using Java.

The player competes against the computer by selecting Rock, Paper, or Scissors. The computer randomly generates its move, and the program determines the winner according to the standard game rules.

The game continues until the player chooses to quit.

---

Features

- Interactive console gameplay
- Random computer moves
- Input validation
- Unlimited rounds
- Option to quit at any time
- Beginner-friendly implementation

---

Game Rules

- Rock beats Scissors
- Scissors beats Paper
- Paper beats Rock
- If both players choose the same move, the result is a tie

---

How It Works

1. The player enters Rock, Paper, or Scissors.
2. The computer randomly selects a move.
3. Both choices are displayed.
4. The winner is determined based on game rules.
5. The process repeats until the player enters "Quit".

---

Project Structure

RockPaperScissors.java

---

Sample Run

=== Welcome to Rock, Paper, Scissors! ===

Enter your move (Rock, Paper, Scissors). To exit, type Quit:
Rock

You chose: Rock
Computer chose: Scissors

 You win!

---

Concepts Used

- Java Classes and Objects
- Arrays
- Loops
- Conditional Statements
- User Input Handling
- Random Number Generation

---

Key Components

Random Move Generation

The computer's move is generated using Java's Random class.

Input Validation

The program checks whether the entered move is valid before proceeding.

Winner Determination

The game compares player and computer choices and declares:

- Player Win
- Computer Win
- Tie

---

Time Complexity

Each round performs a fixed number of operations.

O(1)

---

Space Complexity

The program uses a small fixed amount of memory.

O(1)

---

Future Enhancements

- Track wins, losses, and ties
- Best-of-three mode
- Scoreboard system
- Multiplayer support
- Graphical User Interface (GUI)
- Sound effects and animations

---

Technologies Used

- Java
- Scanner Class
- Random Class

---
