# Advertisement Management System (Java) - Code Date: August 2021

This repository contains a **Java-based advertisement management system**, developed using **NetBeans** and built with **Apache Ant**. The project includes a **main system**, as well as **two assignment iterations** showcasing its development process.

## 📌 Project Structure

advertisement-management-java/

│── main_project/           # Full Java implementation

│   ├── src/                # Source code

│   ├── build/              # Compiled classes

│   ├── dist/               # Executable JAR

│   ├── data/               # anuncios.dat, clientes.dat

│── assignments/

│   ├── tarea1/             # First version (early iteration)

│   ├── tarea2/             # Second version (enhanced)

│── exam/ (Missing)

│── README.md (To be created)

│── .gitignore (Optional)

│── build.xml

│── manifest.mf


---

## 🛠 Features

✅ **Object-Oriented Design (OOP)**
   - Implements different advertisement types (`Anuncio`, `AnuncioFrecuente`, `AnuncioImagen`, etc.)
   - Uses **encapsulation and inheritance** for structured programming.

✅ **Graphical User Interface (GUI)**
   - The system includes a user interface to manage advertisements.
   - GUI elements are implemented using **Java Swing**.

✅ **Data Persistence**
   - Advertisement data is stored in **anuncios.dat** and **clientes.dat** files.
   - Uses file handling to **read and write structured data**.

✅ **Executable JAR**
   - The **main project** can be executed using:
     ```sh
     java -jar main_project/dist/LuisAlonsoCendra-Proyecto-00824.jar
     ```
   - Assignments (`tarea1`, `tarea2`) also contain runnable `.jar` files.

✅ **Apache Ant Build Automation**
   - Uses `build.xml` for automated compilation and execution.

---

## 🚀 Installation & Usage

### **1. Clone the Repository**
```sh
git clone https://github.com/<your-username>/advertisement-management-java.git
cd advertisement-management-java
