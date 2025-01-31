# Socket Types

In networking, sockets are endpoints for sending and receiving data across a network. There are two main types of sockets:

1. **Connection-Oriented Sockets (Reliable)**: 
   - These sockets establish a connection before data can be sent. 
   - They ensure that data is delivered in the correct order and without errors. 
   - An example of a connection-oriented protocol is TCP (Transmission Control Protocol).

2. **Connectionless Sockets (Not Reliable)**: 
   - These sockets do not establish a connection before sending data. 
   - They send packets of data (datagrams) without guaranteeing delivery, order, or error checking. 
   - An example of a connectionless protocol is UDP (User Datagram Protocol).

## UDP (User Datagram Protocol)

This code is fully focused on the connectionless socket, which is implemented using UDP. The datagram socket involves the following steps:

1. **Object Creation**: 
   - A `DatagramSocket` object is created to send and receive datagrams.

2. **Packet Structure**: 
   - Each packet contains the data to be sent and the receiver's address.
   - The data is encapsulated in a `DatagramPacket`, which includes the destination address and port.

This README provides an overview of the socket types and the specific implementation details related to connectionless sockets using UDP.
