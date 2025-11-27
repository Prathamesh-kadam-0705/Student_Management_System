
# 📚 Student Management System (Java)

This Java-based **Student Management System** manages Students, Teachers, Classrooms, Assignments, and Sports information.
It demonstrates strong **OOP concepts, interfaces, modular architecture, fixed-size array data structures, and real-world school management logic**, making it ideal for academic projects.

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
* Manage assignments for individual students or whole class

### 🛠 Admin Module

* Managing students
* Managing teachers
* Handling classroom workflows

---

## 🛠️ Technologies Used

* **Java**
* **OOP Principles**
* **Interfaces**
* **Class-to-class interaction**
* **Console-based UI**
* **Fixed-size arrays (default size = 50)**

---

## 📌 Data Structure Used

This project stores data using **static fixed-size arrays**.
If a size is not provided, the system uses a **default capacity of 50**.

```
Default Array Size = 50
```

Arrays are used for storing:

* Students
* Teachers
* Assignments
* Sports entries
* Classrooms

All operations such as search, update, sorting, and removal are implemented manually using:

* Index-based access
* Linear search
* Custom sorting logic
* Manual shifting for removal

This helps students understand low-level **array management**, memory use, and algorithm implementation without using Java Collections.

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

* Search student (name / phone)
* Display student info
* Display classroom
* Sort students (Name, Phone, Percentage)
* Separate boys & girls
* Identify class topper / low performer
* Add assignment
* Display assignment
* Remove assignment (individual / whole class)

---

## 👨‍🎓 Student.java

Stores student attributes:

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

Admin functionalities:

* Add / update students
* Manage classrooms
* Manage teachers

---

# 🔐 Admin Login

Use the following credentials to access the admin panel:

```
User ID : 1234567890  
Password: 1234
```

---


