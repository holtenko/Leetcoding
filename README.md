# Solutions to Leetcode with Java/C++

## Created by holten.
## Email: holten.ko@gmail.com

### 328. Odd Even Linked List
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

**Example:**
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

**Note:**
The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...

### 197. Rising Temperature
Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

| Id(INT) | Date(DATE) | Temperature(INT) |
| :-----: |   :----:   |      :----:      |
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |

For example, return the following Ids for the above Weather table:

| Id |
|----|
|  2 |
|  4 |

### 326. Power of Three
Given an integer, write a function to determine if it is a power of three.

**Follow up:**
Could you do it without using any loop / recursion?

### 231. Power of Two
Given an integer, write a function to determine if it is a power of two.


### 292. Nim Game
You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

### 181. Employees Earning More Than Their Managers
The Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.

| Id | Name  | Salary | ManagerId |
|:--:|:-----:|:------:|:---------:|
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | NULL      |
| 4  | Max   | 90000  | NULL      |

Given the Employee table, write a SQL query that finds out employees who earn more than their managers. For the above table, Joe is the only employee who earns more than his manager.

| Employee |
|:--------:|
| Joe      |

###182. Duplicate Emails
Write a SQL query to find all duplicate emails in a table named Person.

| Id | Email   |
|:--:|:-------:|
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
For example, your query should return the following for the above table:

| Email   |
|:-------:|
| a@b.com |

**Note:** All emails are in lowercase.  

### 225. Implement Stack using Queues
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.


**Notes:**
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

### 102. Binary Tree Level Order Traversal
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

### 62. Unique Paths
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

![Example](http://articles.leetcode.com/wp-content/uploads/2014/12/robot_maze.png)

Above is a 3 x 7 grid. How many possible unique paths are there?

**Note:** m and n will be at most 100.

### 116. Populating Next Right Pointers in Each Node
Given a binary tree

```cpp
struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
```
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

**Note:**  
You may only use constant extra space.  
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,  
Given the following perfect binary tree,  
　　　　1  
　　　/ 　\   
　　2　　　 3  
　/　 \ 　　/　 \  
4 　　5 　6 　　7

After calling your function, the tree should look like:  
  　　　　　1 -> NULL  
　　　　/　 　 \  
　　　2 　->　 3 -> NULL  
　　/ 　\  　　　/ 　\  
　4　->　5->　6->　7 -> NULL  

### 1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

**Example:**
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

### 100. Same Tree

Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

### 111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

### 155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.  
pop() -- Removes the element on top of the stack.  
top() -- Get the top element.  
getMin() -- Retrieve the minimum element in the stack.  


### 344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".


### 338. Counting Bits
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:
It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.

### 191. Number of 1 Bits
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

### 104. Maximum Depth of Binary Tree
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

### 226. Invert Binary Tree
Invert a binary tree.
```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```
to
```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

### 283. Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

*Note:*
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

### 349. Intersection of Two Arrays
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

*Note:*
Each element in the result must be unique.
The result can be in any order.

### 237. Delete Node in a Linked List
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

### 100. Same Tree
Given two binary trees, write a function to check if they are equal or not.
Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

### 7. Reverse Integer
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321

### 8. String to Integer (atoi)
mplement atoi to convert a string to an integer.
*Hint:* Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
*Notes:* It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.