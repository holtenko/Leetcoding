**难度:** 简单

**标签:** 数学

###### [1185. 一周中的第几天](https://leetcode-cn.com/problems/day-of-the-week/)

给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。

输入为三个整数：day、month 和 year，分别表示日、月、年。

您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。

---
##### 示例

**示例 1:**
```
Input: day = 31, month = 8, year = 2019
Output: "Saturday"
```
**示例 2:**
```
Input: day = 18, month = 7, year = 1999
Output: "Sunday"
```
**示例 3:**
```
Input: day = 15, month = 8, year = 1993
Output: "Sunday"
```

---
##### 约束条件

给出的日期一定是在 `1971` 到 `2100` 年之间的有效日期。

---
#### 题解

>**重要提示: **
>- 1970.12.31 是 Thursday，这个需要通过查日历得知，我感觉应该作为题目给出的条件之一;
>- 闰年的定义是: 年份是400的倍数 或 年份是4的倍数且不是100的倍数; #闰年
>- 闰年比普通年份多一天即 `366` 天;

题目约束年份是 `1971` 年到`2100`年，那么我们计算给定日期到 `1970.12.31` 的天数 `days`，那么 `weekDay=(days+4)%7` 即为**当天是星期几**(0为周日)。

我们再创建一个数组 `weekDays=["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]`

那么 `weekDays[weekDay]` 即为最终答案。

举个例子: 如果给定`day = 1, month = 1, year = 1971`，那么距离 `1970.12.31` 是`days=1`,则结果为 `weekDay=(1+4)%7=5`,即答案为`weekDays[5]=Friday`。

那么如何计算给定日期到 `1970.12.31` 的天数 `days`呢？

可以分为以下三步:

1. 计算指定 `year` 到 `1971年` 之间的天数，如果是普通年份则每年`365`天，如果是闰年则每年`366`天;
2. 计算指定 `month` 到当年 `1月1日` 之间的天数，其中 `1/3/5/7/8/10/12月` 为 `31天`，`2月` 普通年份为 `28天`，闰年为 `29天`，其余月份为 `30天`;
3. 计算指定 `day` 到当月的天数;

上述三步的结果之和即为最终的 `days`，则 `weekDay=(days+4)%7`,答案即为`weekDays[weekDay]`。

#### 代码
[Java](../Algorithms/Q1185_DayOfTheWeek.java)