<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator Project</title>
</head>
<body>
    <h1>Calculator Project</h1>

    <h2>Description</h2>
    <p>
        A user-friendly calculator built using Java, Swing, and the Abstract Window Toolkit (AWT). 
        This project demonstrates fundamental programming concepts, including GUI development, 
        event handling, and object-oriented programming. With an intuitive pop-up window, users 
        can perform basic arithmetic operations seamlessly.
    </p>

    <hr>

    <h2>How It's Made</h2>
    <p><strong>Tech Used:</strong></p>
    <ul>
        <li><strong>Java</strong>: Core programming language.</li>
        <li><strong>Swing</strong>: For building the graphical user interface (GUI).</li>
        <li><strong>Abstract Window Toolkit (AWT)</strong>: For event handling and integration with Swing components.</li>
        <li><strong>ActionListener</strong>: For managing user interactions and button functionality.</li>
    </ul>

    <p><strong>Development Process:</strong></p>
    <ol>
        <li>
            <strong>Importing Libraries:</strong> The project begins by importing essential packages like 
            <code>javax.swing</code> and <code>java.awt.event</code> to enable GUI creation and user interaction.
        </li>
        <li>
            <strong>GUI Layout:</strong> Components like buttons, text fields, and panels are created using Swing. 
            These are arranged in a visually intuitive layout for easy user navigation.
        </li>
        <li>
            <strong>Event Handling:</strong> Using the <code>ActionListener</code> interface, the calculator responds 
            dynamically to user inputs. Each button press triggers an event that updates the display or performs calculations.
        </li>
        <li>
            <strong>Initialization:</strong> The <code>main</code> method instantiates the <code>Calculator</code> class, 
            ensuring a new instance is created each time the program runs, providing a fresh, reset interface for users.
        </li>
    </ol>

    <h3>Screenshot</h3>
    <p>![Calculator GUI Screenshot](./screenshot.png)</p>
    <p><em>(Replace with an actual screenshot file path or URL when available.)</em></p>

    <h3>Demo</h3>
    <p>
        <a href="https://github.com/ppandya469/Calculator/assets/141596211/1470b9b0-bc1f-4163-bc19-70a7e3f62408" target="_blank">
            Watch the Demo
        </a>
    </p>

    <hr>

    <h2>Optimizations</h2>
    <p>Although simple in its initial design, this project includes potential enhancements:</p>
    <ul>
        <li>
            <strong>Code Refactoring:</strong> Optimized repetitive logic in event handling by consolidating button actions 
            into a reusable function, improving readability and maintainability.
        </li>
        <li>
            <strong>User Experience Improvements:</strong> Enhanced the interface by adding keyboard shortcuts for quicker operations.
        </li>
        <li>
            <strong>Error Handling:</strong> Implemented checks to prevent division by zero and invalid inputs, ensuring robust functionality.
        </li>
    </ul>

    <hr>

    <h2>Lessons Learned</h2>
    <p>This project reinforced several key lessons in software development:</p>
    <ol>
        <li><strong>Importance of Modularity:</strong> Encapsulating the GUI and logic within a single class provided clarity but highlighted the importance of modular design for larger projects.</li>
        <li><strong>Event-Driven Programming:</strong> Building the ActionListener functionality emphasized the need for careful management of user interactions.</li>
        <li><strong>GUI Development Challenges:</strong> Creating an intuitive layout and handling edge cases like resizing taught me to think critically about user experience.</li>
        <li><strong>Debugging Techniques:</strong> Encountering layout and event errors helped refine my debugging skills and deepened my understanding of Java's Swing library.</li>
    </ol>

    <p>This calculator project is a stepping stone toward mastering front-end development with Java, showcasing a blend of technical knowledge and creativity. It serves as an excellent foundation for more advanced GUI-based applications.</p>
</body>
</html>
