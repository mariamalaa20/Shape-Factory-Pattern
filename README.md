# 🛠️ Shape Factory

A simple Java-based Shape Factory that demonstrates the Factory Design Pattern. The project creates different shapes (Rectangle and Triangle) and calculates their area and perimeter.

## ✨ Features
- Implements the **Factory Design Pattern**
- Supports multiple shape types (**Rectangle** & **Triangle**)
- Uses an **interface (IShapeTemplate)** to enforce method implementation
- Modular and extensible design

## 📋 Requirements
- Java Development Kit (**JDK 8+**)
- Any Java IDE (**IntelliJ IDEA, Eclipse, VS Code, etc.**)

## ⚙️ Installation
```bash
# Clone this repository
git clone https://github.com/YOUR_GITHUB_USERNAME/ShapeFactory.git
cd ShapeFactory

# Compile the Java files
javac *.java

# Run the program
java Main
```

## 📂 Project Structure
```
ShapeFactory/
├── IShapeTemplate.java   # Interface for shapes
├── Main.java             # Entry point of the program
├── Rectangle.java        # Rectangle class implementing IShapeTemplate
├── Triangle.java         # Triangle class implementing IShapeTemplate
├── ShapeFactory.java     # Factory class to create shape objects
```

## 🚀 Usage
```java
ShapeFactory shapeFactory = new ShapeFactory();
IShapeTemplate shape1 = shapeFactory.createShape(1); // Creates a Rectangle
shape1.Area();
shape1.Perimeter();

IShapeTemplate shape2 = shapeFactory.createShape(2); // Creates a Triangle
shape2.Area();
shape2.Perimeter();
```



