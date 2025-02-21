# CustomLinkedList Implementation
A Java implementation of a singly linked list data structure that provides basic list operations.

## Features
- Dynamic size management
- Integer value storage
- Basic operations (append, prepend, pop)
- Search functionality
- Index-based access

## Methods
### Basic Operations
- append(int value): Adds a new node with the given value to the end of the list
- prepend(int value): Adds a new node with the given value at the start of the list
- pop(): Removes the last element from the list

### Information Methods
- size(): Returns the current number of nodes in the list
- head(): Returns the value of the first node, or null if empty
- tail(): Returns the value of the last node, or null if empty
- at(int index): Returns the value at the specified index or null if invalid index

## Usage Example
![image](https://github.com/user-attachments/assets/8614ebcd-ecb4-48da-ba70-d8bf0bac2b46)

## Implementation Details
The implementation uses an inner node class to represent each element in the list. Each node contains:
- An integer value
- A reference to the next node
  
The main CustomLinkedList class maintains:
- A reference to the head node
- A size counter
