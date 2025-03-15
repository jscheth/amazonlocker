# Amazon Locker System (Java OOD)

This project is a simplified implementation of an **Amazon Locker System** designed for learning purposes using **Java** and **Object-Oriented Design (OOD)** principles. The project is currently **incomplete** and serves as a foundation for exploring OOD concepts such as inheritance, encapsulation, and design patterns.

## **Purpose**
The primary goal of this project is to provide hands-on practice in:
- Designing an effective class structure for a real-world system.
- Implementing core Java OOD concepts.
- Improving understanding of modular, scalable code architecture.

## **Features (Planned and Implemented)**
✅ Basic structure for Amazon Locker system.
✅ Core entities such as Lockers, Packages, and Users.  
✅ Basic package placement and retrieval logic.  
🟡 Improved error handling and validation (in progress).  
🟡 Enhanced UI/CLI for improved user interaction (in progress).  
❌ Integration with delivery services (planned).  
❌ Robust logging and reporting features (planned).  

## **Project Structure**
/src
 ├── models
 │   ├── Locker.java
 │   ├── Location.java
 │   ├── Agent.java
 │   ├── User.java
 │   ├── Package.java
 │   ├── Size.java
 │   ├── Status.java
 │   └── CodeMechanism.java
 │
 ├── services
 │   └── LockerService.java
 │
 └── Main.java

### **Key Classes**
- **Locker**: Represents individual lockers with attributes such as size, ID, and availability status.
- **Location**: Manages locker locations for better organization and navigation.
- **Agent**: Handles delivery personnel and their interaction with lockers.
- **User**: Represents customers who interact with the system to retrieve packages.
- **Package**: Represents the packages to be stored in the lockers, with details like package ID, size, and recipient.
- **Size** and **Status**: Enum classes that manage locker dimensions and state.
- **CodeMechanism**: Manages security codes for package retrieval.
- **LockerService**: Handles package placement, retrieval, and locker management logic.

## **How to Run**
1. Clone the repository:
   git clone https://github.com/jscheth/amazonlocker.git
2. Navigate to the project directory:
   cd amazonlocker
3. Compile the Java files:
   javac src/**/*.java
4. Run the main application:
   java src/Main

## **Future Improvements**
- Implement detailed error handling for scenarios like:
  - Full lockers.
  - Invalid package retrieval attempts.
- Add support for different locker sizes.
- Develop a graphical UI for improved user experience.
- Enhance the notification system with email or SMS alerts.

## **Contributing**
This project is intended for learning purposes, but contributions are welcome! Feel free to:
- Fork the repository.
- Improve existing features or add new ones.
- Submit a pull request with clear descriptions.

## **License**
This project is licensed under the **MIT License** — feel free to use, modify, or distribute it for educational purposes.

---
For questions or suggestions, please reach out via [GitHub Issues](https://github.com/jscheth/amazonlocker/issues).

Happy coding! 🚀
