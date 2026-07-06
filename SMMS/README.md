# Student Marks Management System

## Objective

The **Student Marks Management System** is a console-based Java application that manages the marks of multiple students using arrays. It allows users to perform various operations such as displaying marks, finding the highest and lowest marks, calculating the average, searching for a mark, updating a student's mark, counting passed and failed students, and sorting the marks.

The main objective of this project is to understand how arrays work in Java and how they can be combined with methods, loops, and conditional statements to solve real-world problems.

---

# Concepts Used

This project demonstrates the following Java concepts:

- Arrays
- Methods
- Parameters and Return Values
- Loops (`for` and `while`)
- Conditional Statements (`if-else`)
- Switch Statement
- Scanner Class
- Array Traversal
- Searching
- Sorting (Bubble Sort)

---

# Arrays in Java

An array is a collection of elements of the same data type stored in contiguous memory locations. Arrays allow multiple values to be stored using a single variable.

Example:

```java
int[] marks = {85, 90, 78, 95, 88};
```

Instead of creating multiple variables:

```java
int mark1 = 85;
int mark2 = 90;
int mark3 = 78;
```

an array stores all marks together, making data easier to manage and process using loops.

---

# Methods Used

### displayMenu()

Displays all the available operations to the user.

---

### displayMarks(int[] marks)

Displays the marks of all students.

---

### highestMark(int[] marks)

Finds and returns the highest mark in the array.

---

### lowestMark(int[] marks)

Finds and returns the lowest mark in the array.

---

### average(int[] marks, int size)

Calculates and returns the average marks of all students.

---

### searchMark(int[] marks, int mark)

Searches for a particular mark and returns its position if found.

Returns `-1` if the mark is not present.

---

### updateMark(int index, int value, int[] marks)

Updates the mark of a particular student.

---

### passAndFail(int[] marks)

Counts and displays the total number of students who passed and failed.

Passing mark: **36**

---

### sortArray(int[] marks)

Sorts the student marks in ascending order using the Bubble Sort algorithm.

---

### exitProgram()

Displays the exit message before terminating the application.

---

# Project Flow

1. The program asks the user to enter the number of students.
2. The user enters the marks for each student.
3. The program validates that every mark is between **0 and 100**.
4. After storing all marks, a menu is displayed.
5. The user selects one of the available operations.
6. The corresponding method is executed.
7. After completing the operation, the menu is displayed again.
8. The application continues until the user chooses the **Exit** option.

---

# Features

- Store marks for multiple students
- Display all student marks
- Find the highest mark
- Find the lowest mark
- Calculate the average mark
- Search for a specific mark
- Update a student's mark
- Count passed and failed students
- Sort marks in ascending order
- Input validation for marks
- Menu-driven console application

---

# Sample Output

## Test Case 1: Display Marks

```
==== Student Marks System ====

1. Display Marks
2. Find Higher Mark
3. Find Lowest Mark
4. Calculate Average
5. Search Student Mark
6. Update Student Mark
7. Number of students passed and failed
8. Sort Student Marks
9. Exit

Enter your choice:
1

Student 1: 85
Student 2: 72
Student 3: 90
Student 4: 65
Student 5: 48
```

---

## Test Case 2: Highest Mark

```
Enter your choice:
2

Highest Marks: 90
```

---

## Test Case 3: Lowest Mark

```
Enter your choice:
3

Lowest Marks: 48
```

---

## Test Case 4: Average Marks

```
Enter your choice:
4

Average: 72.0
```

---

## Test Case 5: Search Student Mark

```
Enter your choice:
5

Enter mark to search:
90

Mark found at Student 3.
```

---

## Test Case 6: Update Student Mark

```
Enter your choice:
6

Enter student number:
2

Enter new mark:
80

Student 2 mark updated successfully.
```

---

## Test Case 7: Pass and Fail Count

```
Enter your choice:
7

Number of students passed and failed are 5 and 0 respectively.
```

---

## Test Case 8: Sort Student Marks


Enter your choice:
8

Student 1: 48
Student 2: 65
Student 3: 80
Student 4: 85
Student 5: 90

Array sorted successfully.



