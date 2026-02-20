# Student_Result_Processing
# Overview
This project is a console-based Java application designed to manage and analyze student academic records in a simple and structured way. The system allows users to register learners by entering their ID, name, and marks for multiple subjects. Once the data is entered, the program automatically calculates a performance index (average score) to evaluate each learner’s academic standing. This helps in quickly understanding how well a student is performing without manually computing totals or averages.

The application provides several useful features such as viewing all registered learners, identifying students who need academic support (those below the performance threshold), and displaying the highest-performing student. These functionalities make the system not just a storage tool but also a basic analysis platform for academic monitoring. The menu-driven interface ensures the program is easy to use, even for beginners, as users can choose operations step-by-step.

Additionally, the project includes file handling to save learner data into a text file, allowing records to be preserved beyond a single program run. This demonstrates the integration of object-oriented programming concepts, collections, and file operations in one cohesive application. Overall, the project showcases how Java can be used to build a small but practical system that manages data efficiently while reinforcing core programming concepts.
# Features 

Learner Registration
Users can add new student records by entering ID, name, and marks for five subjects.

Automatic Performance Calculation
The system calculates a performance index (average score) instantly after data entry.

View All Records
Displays a complete list of all registered learners in a clear format.

Identify Students Needing Support
Shows learners whose performance index is below the passing threshold.

Top Performer Identification
Finds and displays the student with the highest performance index.

Data Persistence (File Saving)
Saves student records to a text file so information is not lost after closing the program.

Menu-Driven Interface
Provides an easy step-by-step navigation for users to interact with the system.

# Technologies Used

Java Programming Language
Core language used to implement logic, object-oriented design, and program flow.

Object-Oriented Programming (OOP)
Classes, objects, encapsulation, and methods are used to structure the application.

Java Collections Framework
ArrayList is used to store and manage multiple student records dynamically.

File Handling (java.io package)
BufferedWriter and FileWriter are used to store data in a text file.

Scanner Class (java.util package)
Handles user input through the console interface.

Exception Handling
Try-catch blocks ensure the program handles file errors gracefully.
