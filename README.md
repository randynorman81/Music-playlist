# 🎵 Media Library (v2.0)

## 📝 Purpose
A Java program that manages Songs and Podcasts using **Inheritance**. It shows how different media types can share a parent class (`Media`) but keep their own unique data.

## 🚀 Features
* **Inheritance:** `Song` and `Podcast` inherit from `Media`.
* **Data Safety:** Ratings are locked between 1 and 5 stars.
* **Polymorphism:** One loop displays both songs and podcasts correctly.

## 🔄 Interaction Flow
1. The program starts and creates an `ArrayList` of `Media`.
2. It adds a `Song` and a `Podcast` to the list.
3. It checks the song rating to make sure it's valid (1-5).
4. It loops through the list and prints the details of every item.

## 💻 How to Run
1. Open your terminal in the project folder.
2. Type `javac *.java` and press Enter.
3. Type `java Main` and press Enter.


* **Verification:** I manually tested the code using `javac` in Windows Powershell to ensure all classes communicated correctly.
