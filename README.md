# Calculator Project

## Description

A user-friendly calculator built using Java, Swing, and the Abstract Window Toolkit (AWT). This project demonstrates fundamental programming concepts, including GUI development, event handling, and object-oriented programming. With an intuitive pop-up window, users can perform basic arithmetic operations seamlessly.

---

## How It's Made

**Tech Used:**
- **Java**: Core programming language.
- **Swing**: For building the graphical user interface (GUI).
- **Abstract Window Toolkit (AWT)**: For event handling and integration with Swing components.
- **ActionListener**: For managing user interactions and button functionality.

**Development Process:**
1. **Importing Libraries:**  
   The project begins by importing essential packages like `javax.swing` and `java.awt.event` to enable GUI creation and user interaction.
2. **GUI Layout:**  
   Components like buttons, text fields, and panels are created using Swing. These are arranged in a visually intuitive layout for easy user navigation.
3. **Event Handling:**  
   Using the `ActionListener` interface, the calculator responds dynamically to user inputs. Each button press triggers an event that updates the display or performs calculations.
4. **Initialization:**  
   The `main` method instantiates the `Calculator` class, ensuring a new instance is created each time the program runs, providing a fresh, reset interface for users.

**Screenshot**  
![Calculator GUI Screenshot](./screenshot.png)  
*(Replace with an actual screenshot file path or URL when available.)*

**Demo:**  
[Watch the Demo](https://github.com/ppandya469/Calculator/assets/141596211/1470b9b0-bc1f-4163-bc19-70a7e3f62408)

---

## Optimizations

Although simple in its initial design, this project includes potential enhancements:
- **Code Refactoring:**  
  Optimized repetitive logic in event handling by consolidating button actions into a reusable function, improving readability and maintainability.
- **User Experience Improvements:**  
  Enhanced the interface by adding keyboard shortcuts for quicker operations.
- **Error Handling:**  
  Implemented checks to prevent division by zero and invalid inputs, ensuring robust functionality.

---

## Lessons Learned

This project reinforced several key lessons in software development:
1. **Importance of Modularity:**  
   Encapsulating the GUI and logic within a single class provided clarity but highlighted the importance of modular design for larger projects.
2. **Event-Driven Programming:**  
   Building the ActionListener functionality emphasized the need for careful management of user interactions.
3. **GUI Development Challenges:**  
   Creating an intuitive layout and handling edge cases like resizing taught me to think critically about user experience.
4. **Debugging Techniques:**  
   Encountering layout and event errors helped refine my debugging skills and deepened my understanding of Java's Swing library.

This calculator project is a stepping stone toward mastering front-end development with Java, showcasing a blend of technical knowledge and creativity.  
It serves as an excellent foundation for more advanced GUI-based applications.
