# Part 1 – Concept Analysis
## Topic: ArrayList vs LinkedList

### Comparison Table

| Feature | ArrayList | LinkedList |
|------|---------|-----------|
| Internal Structure | Dynamic Array | Doubly Linked List |
| Access Time Complexity | O(1) | O(n) |
| Insertion Time Complexity | O(n) | O(1) |
| Deletion Time Complexity | O(n) | O(1) |
| Memory Usage | Less | More |

### Suitable Data Structure Selection
| Scenario                  | Best Choice | Reason                       |
| ------------------------- | ----------- | ---------------------------- |
| **Student Record System** | ArrayList   | Fast access using index      |
| **Browser History**       | LinkedList  | Easy forward/back navigation |
| **Online Shopping Cart**  | ArrayList   | Frequent read operations     |
| **Undo/Redo Feature**     | LinkedList  | Fast insert/delete from ends |

