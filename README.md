# Binary Search Tree (BST) Implementation & Traversals

This project provides a robust implementation of Binary Tree data structures in Java, developed for the **Data Structures and Algorithms (CN5005)** module. It covers core concepts like recursive insertion and all primary tree traversal methods.

## Project Structure

### 1. Basic BST Operations (`Binary1.java`)
This implementation focuses on the fundamental logic of a Binary Search Tree:
- **Node Class:** Defines the building blocks of the tree with `data`, `left`, and `right` child references.
- **Recursive Insertion:** Features a private recursive `insert` method that ensures the tree maintains its BST properties.
- **In-Order Display:** A public method to print the tree's values in ascending order.
- **Test Case:** Pre-configured to build a tree with values: `6, 4, 3, 5, 8, 7, 9`.

### 2. Advanced Tree Traversals (`Binary2.java`)
An extended implementation demonstrating how to navigate through a tree structure using different strategies:
- **Pre-order Traversal (Root → Left → Right):** Captures the root before its subtrees.
- **In-order Traversal (Left → Root → Right):** Visits nodes in non-decreasing order.
- **Post-order Traversal (Left → Right → Root):** Processes children before the parent node.



## Technical Skills Demonstrated
- **Algorithm Design:** Handling recursive calls and base cases in Java.
- **Data Structures:** Custom implementation of Tree nodes and pointers/references.
- **Testing:** Integration with external data via `input.csv` for real-world scenario testing.
