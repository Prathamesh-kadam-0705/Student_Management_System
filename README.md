# 📚 Student Management System (Java)

This Java-based **Student Management System** manages Students, Teachers, Classrooms, Assignments, and Sports information.
It demonstrates strong **OOP concepts, interfaces, modular architecture, and real-world school management logic**, making it ideal for academic projects.

---

## 🚀 Features

### 👨‍🎓 Student Module

* Add student data
* Update and display student details
* Search students
* Handle gender-based separation
* Sort students (Name, Phone, Percentage)

### 👨‍🏫 Teacher Module

* Add teacher details
* Update teacher information
* Teacher can:

  * Search students
  * View classroom details
  * Add, view, and remove assignments
  * Sort students
  * Identify toppers / low performers

### 🏫 Classroom Module

* Manage classroom information
* Assign students to classes
* Display class details

### 🎮 Sports Module

* Store student sports activities
* Display sports info

### 📝 Assignment Module

* Add assignments
* Display assignments
* Remove assignments
* Manage assignments for individual student or whole class

### 🛠 Admin Module

* Admin operations for:

  * Managing students
  * Managing teachers
  * Handling classroom workflows

---

## 🛠️ Technologies Used

* **Java**
* **OOP Principles**
* **Interfaces**
* **Class-to-class interaction**
* Console-based UI

---

## 📂 Project Structure

```
Student_Management_System/
│── AdminInterface.java
│── Assingment.java
│── ClassRoom.java
│── ClassRoomDriver.java
│── Sport.java
│── Student.java
│── StudentInterface.java
│── Teacher.java
│── TeacherInterface.java
│── README.md
```

---

# 📘 Class Overview

## 👨‍🏫 Teacher.java

Handles teacher information:

* Teacher name
* Subject taught
* Phone number
* Password
* Display and update teacher profile

## 🧩 TeacherInterface.java

Teacher operations:

* Search student (by name / phone)
* Display student info
* Display classroom
* Sorting:

  * By Name
  * By Phone
  * By Percentage
* Separate boys & girls
* Identify class topper / low performer
* Add assignment
* Display assignment
* Remove assignment for:

  * Specific student
  * All students of a class

---

## 👨‍🎓 Student.java

Stores student attributes like:

* Name
* Roll number
* Phone
* Gender
* Marks / percentage
* Assignment & sport info

---

## 🏫 ClassRoom.java

Manages:

* Class ID
* Class teacher
* List of students
* Display classroom info

---

## 📝 Assingment.java

Handles:

* Assignment title
* Description
* Assign date
* End date

---

## 🎮 Sport.java

Stores:

* Student sports details
* Sports activities

---

## 🛠 AdminInterface.java

Provides admin-level functionalities:

* Add / update students
* Manage classrooms
* Manage teachers

---

## ▶️ How to Run the Project

1. Clone or download:

   ```bash
   git clone https://github.com/your-username/Student_Management_System.git
   ```
2. Open the folder in any Java IDE
3. Run:

   ```
   ClassRoomDriver.java
   ```
4. Follow the console menu to manage:

   * Students
   * Teachers
   * Assignments
   * Classrooms
   * Sports

---

# 🎯 Purpose of the Project

This system is ideal for:

* Java academic projects
* Practicing real-world OOP design
* Learning interfaces & class interactions
* Handling modular Java applications
* College mini-projects

---

## 📄 Adimin Login

userId = 1234567890
password = 1234

