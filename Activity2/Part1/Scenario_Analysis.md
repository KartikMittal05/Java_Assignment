# Part 1 – Scenario Based Analysis
## Topic: Choosing Between ArrayList and LinkedList

### 1. Real-time chat message storage
**Chosen:** LinkedList  
**Reason:** Frequent insertions at end.  
**Time Complexity:** Insertion O(1)

### 2. Music playlist with frequent reordering
**Chosen:** LinkedList  
**Reason:** Efficient insertion and deletion.  
**Time Complexity:** Insert/Delete O(1)

### 3. Student database with frequent index search
**Chosen:** ArrayList  
**Reason:** Direct index access.  
**Time Complexity:** Access O(1)

### 4. Browser back and forward navigation
**Chosen:** LinkedList  
**Reason:** Sequential navigation.  
**Time Complexity:** Navigation O(1)

### 5. Online exam storing answers sequentially
**Chosen:** ArrayList  
**Reason:** Continuous memory, fast access.  
**Time Complexity:** Access O(1)
