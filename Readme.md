# DSA Problem Solving with Nisha

> A structured collection of my Data Structures & Algorithms practice, problem-solving approaches, and coding solutions.

This repository documents my journey of learning and improving **Data Structures and Algorithms (DSA)** through consistent problem solving.

The problems are organized **pattern-wise and topic-wise** rather than being limited to a single coding platform. Solutions may come from platforms such as **LeetCode, GeeksforGeeks, HackerRank, Coding Ninjas, university assignments, and personal practice**.

---

## About This Repository

The goal of this repository is not just to collect solutions, but to understand:

* How to approach a problem
* How to identify the underlying pattern
* How to choose the right data structure
* How to optimize a solution
* Time and space complexity
* Different approaches to the same problem
* Common mistakes and edge cases
* How to write clean and readable code

This repository will continuously evolve as I learn new concepts and solve more problems.

---

# DSA Roadmap

The problems are organized around major DSA topics and problem-solving patterns.

```text
DSA Problem Solving
│
├── 01. Arrays
│   ├── Traversal
│   ├── Prefix Sum
│   ├── Kadane's Algorithm
│   ├── Two Pointer
│   ├── Sliding Window
│   ├── Sorting
│   └── Array Manipulation
│
├── 02. Strings
│   ├── String Manipulation
│   ├── Frequency Counting
│   ├── Palindrome
│   ├── Anagram
│   ├── Two Pointer
│   └── String Matching
│
├── 03. Hashing
│   ├── HashMap
│   ├── HashSet
│   ├── Frequency Map
│   └── Lookup Problems
│
├── 04. Linked List
│   ├── Traversal
│   ├── Insertion
│   ├── Deletion
│   ├── Reverse Linked List
│   ├── Fast & Slow Pointer
│   └── Cycle Detection
│
├── 05. Stack
│   ├── Basic Stack
│   ├── Monotonic Stack
│   ├── Parentheses
│   └── Next Greater Element
│
├── 06. Queue
│   ├── Basic Queue
│   ├── Circular Queue
│   ├── Deque
│   └── Priority Queue
│
├── 07. Searching
│   ├── Linear Search
│   ├── Binary Search
│   ├── Search Space
│   └── Binary Search on Answer
│
├── 08. Sorting
│   ├── Bubble Sort
│   ├── Selection Sort
│   ├── Insertion Sort
│   ├── Merge Sort
│   ├── Quick Sort
│   └── Counting Sort
│
├── 09. Recursion
│   ├── Basic Recursion
│   ├── Backtracking
│   ├── Subsets
│   ├── Permutations
│   └── Combination Problems
│
├── 10. Trees
│   ├── Binary Tree
│   ├── BST
│   ├── Tree Traversal
│   ├── DFS
│   └── BFS
│
├── 11. Heap
│   ├── Min Heap
│   ├── Max Heap
│   ├── Priority Queue
│   └── Top K Problems
│
├── 12. Graphs
│   ├── Graph Representation
│   ├── BFS
│   ├── DFS
│   ├── Shortest Path
│   ├── Cycle Detection
│   └── Topological Sort
│
├── 13. Greedy
│   ├── Activity Selection
│   ├── Interval Problems
│   └── Optimization Problems
│
├── 14. Dynamic Programming
│   ├── 1D DP
│   ├── 2D DP
│   ├── Knapsack
│   ├── Subsequence
│   └── DP on Trees
│
└── 15. Advanced DSA
    ├── Trie
    ├── Disjoint Set Union
    ├── Segment Tree
    └── Fenwick Tree
```

---

# Problem-Solving Patterns

One of the main goals of this repository is to recognize **patterns** instead of memorizing individual solutions.

Some important patterns I will practice:

| Pattern             | Common Use                |
| ------------------- | ------------------------- |
| Two Pointer         | Arrays, Strings           |
| Sliding Window      | Subarrays, Substrings     |
| Prefix Sum          | Range Sum Problems        |
| Hashing             | Frequency & Lookup        |
| Fast & Slow Pointer | Linked Lists              |
| Binary Search       | Sorted/Search Space       |
| Monotonic Stack     | Next Greater/Smaller      |
| BFS                 | Level/Shortest Path       |
| DFS                 | Traversal/Exploration     |
| Backtracking        | Permutations/Subsets      |
| Greedy              | Local Optimization        |
| Dynamic Programming | Overlapping Subproblems   |
| Divide & Conquer    | Merge Sort, Quick Sort    |
| Heap                | Top K / Priority Problems |
| Recursion           | Trees/Backtracking        |

---

# Repository Structure

The repository follows a topic and pattern-based structure.

```text
DSA-Problem-Solving/
│
├── README.md
├── .gitignore
│
├── Arrays/
│   ├── Two-Pointer/
│   ├── Sliding-Window/
│   ├── Prefix-Sum/
│   └── Kadane/
│
├── Strings/
│   ├── Palindrome/
│   ├── Anagram/
│   └── Frequency-Counting/
│
├── Hashing/
│   ├── HashMap/
│   └── HashSet/
│
├── LinkedList/
│   ├── Fast-Slow-Pointer/
│   ├── Reversal/
│   └── Cycle-Detection/
│
├── Stack/
│   ├── Parentheses/
│   └── Monotonic-Stack/
│
├── Queue/
│
├── Searching/
│   ├── Binary-Search/
│   └── Search-Space/
│
├── Sorting/
│
├── Recursion/
│
├── Backtracking/
│
├── Trees/
│   ├── Binary-Tree/
│   └── BST/
│
├── Heap/
│
├── Graphs/
│   ├── BFS/
│   ├── DFS/
│   └── Shortest-Path/
│
├── Greedy/
│
├── Dynamic-Programming/
│
└── Advanced-DSA/
```

---

# Solution Format

Each problem will follow a consistent structure.

```java
/*
 * Problem: Two Sum
 * Source: LeetCode #1
 * Topic: Arrays
 * Pattern: HashMap
 * Difficulty: Easy
 *
 * Approach:
 * Store previously seen elements in a HashMap.
 * For each element, check whether its complement
 * already exists in the map.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    // Solution
}
```

This makes every solution easier to understand and revise later.

---

# What Each Solution Contains

Whenever possible, each solution will include:

### 1. Problem

A short description of what needs to be solved.

### 2. Source

The platform or source of the problem.

Examples:

```text
LeetCode
GeeksforGeeks
HackerRank
Coding Ninjas
University Assignment
Personal Practice
```

### 3. Topic

The main DSA concept.

```text
Array
String
Linked List
Tree
Graph
DP
```

### 4. Pattern

The problem-solving technique.

```text
Two Pointer
Sliding Window
Binary Search
Hashing
DFS
BFS
Dynamic Programming
```

### 5. Approach

A simple explanation of how the solution works.

### 6. Complexity

```text
Time Complexity: O(n)
Space Complexity: O(n)
```

### 7. Code

The final implementation.

---

# Progress Tracker

I will update this section as I solve more problems.

| Topic               | Problems Solved |
| ------------------- | --------------: |
| Arrays              |               0 |
| Strings             |               0 |
| Hashing             |               0 |
| Linked List         |               0 |
| Stack               |               0 |
| Queue               |               0 |
| Searching           |               0 |
| Sorting             |               0 |
| Recursion           |               0 |
| Backtracking        |               0 |
| Trees               |               0 |
| Heap                |               0 |
| Graphs              |               0 |
| Greedy              |               0 |
| Dynamic Programming |               0 |
| Advanced DSA        |               0 |
| **Total**           |           **0** |

---

# Coding Platforms

Problems may be solved from multiple sources:

* LeetCode
* GeeksforGeeks
* HackerRank
* Coding Ninjas
* University/College Assignments
* Interview Preparation
* Personal Practice

The repository is **platform-independent** and focuses on problem-solving concepts and patterns.

---

# Languages

Primary language:

* Java

Other languages may be added as I explore them.

---

# Git & Contribution History

I maintain this repository using Git to track my learning progress.

### Typical workflow

```bash
git status

git add .

git commit -m "Add solution for Two Sum"

git push
```

Each meaningful problem or improvement can be maintained as a separate commit.

### Example commit history

```text
Initial repository setup
Add solution for Two Sum
Add sliding window problems
Add solution for Valid Anagram
Add binary search problems
Add linked list reversal
Add tree traversal problems
Update DSA progress tracker
```

The purpose of maintaining a proper Git history is to document the progression of my problem-solving journey.

---

# My Problem-Solving Approach

For every new problem, I try to follow this process:

```text
Understand the Problem
        ↓
Identify Input & Output
        ↓
Check Constraints
        ↓
Think of Brute Force
        ↓
Look for a Pattern
        ↓
Choose Data Structure
        ↓
Optimize the Approach
        ↓
Analyze Time & Space
        ↓
Implement
        ↓
Test Edge Cases
        ↓
Commit to GitHub
```

---

# Learning Goals

Through this repository, I aim to improve:

* Problem-solving ability
* Logical thinking
* Data Structures knowledge
* Algorithmic thinking
* Pattern recognition
* Time complexity analysis
* Space complexity analysis
* Java programming
* Coding consistency
* Interview preparation

---

# DSA Practice Goal

My focus is **consistency over quantity**.

Instead of simply solving problems, I want to understand:

> **Why does this approach work?**

> **What pattern does this problem follow?**

> **Can the solution be optimized?**

> **Can I recognize the same pattern in another problem?**

---

# Future Goals

* [ ] Build strong DSA fundamentals
* [ ] Master common problem-solving patterns
* [ ] Solve Easy-level problems consistently
* [ ] Progress to Medium-level problems
* [ ] Practice Hard-level problems
* [ ] Improve problem-solving speed
* [ ] Revise previously solved problems
* [ ] Maintain consistent GitHub contributions
* [ ] Prepare for coding interviews

---

# Progress Over Perfection

This repository represents an ongoing learning journey.

Solutions may improve over time as I learn better algorithms, data structures, and optimization techniques.

**Learn → Solve → Understand → Optimize → Document → Repeat**

---

## Author

**Nisha Patwal**

B.Tech Computer Science & Engineering

Interested in:

* Software Development
* Data Structures & Algorithms
* Full Stack Development
* Artificial Intelligence
* Problem Solving

---

⭐ If you find this repository useful, feel free to explore the solutions and problem-solving patterns.
