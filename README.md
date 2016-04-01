# Solutions to Leetcode

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