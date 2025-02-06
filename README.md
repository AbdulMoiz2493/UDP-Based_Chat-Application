# UDP-Based Chat Application

## Overview

The UDP-Based Chat Application is a Java program that facilitates real-time communication between clients using the User Datagram Protocol (UDP). This lightweight application allows multiple clients to connect to a server and exchange messages efficiently.

## Features

- **Client-Server Architecture**: Centralized server manages client connections and message routing.
- **Real-Time Messaging**: Enables instant message exchange between clients.
- **UDP Protocol**: Utilizes UDP for faster communication without the overhead of connection establishment.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure the latest version of JDK is installed on your system.

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/AbdulMoiz2493/UDP-Based_Chat-Application.git
   cd UDP-Based_Chat-Application
   ```

2. **Compile the Source Files**:
   ```bash
   javac server.java client.java
   ```

3. **Run the Server**:
   ```bash
   java server
   ```

4. **Run the Client** (in a new terminal window for each client):
   ```bash
   java client
   ```

## Usage

- **Server**:
  - Listens for incoming client connections.
  - Forwards messages from one client to the intended recipient(s).

- **Client**:
  - Connects to the server.
  - Sends messages to other clients via the server.
  - Receives messages from other clients through the server.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

- **Abdul Moiz**  
  Email: abdulmoiz8895@gmail.com 
  GitHub: [AbdulMoiz2493](https://github.com/your-username)
