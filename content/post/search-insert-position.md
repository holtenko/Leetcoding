---
title: "[35] Search Insert Position"
date: 2014-04-02
tags: []
categories: ["Algorithms"]
toc: true
---

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
<!--more-->

## Examples
|  No   |    Input     | Output |
| :---: | :----------: | :----: |
|   1   | [1,3,5,6], 5 |   2    |
|   2   | [1,3,5,6], 2 |   1    |
|   3   | [1,3,5,6], 7 |   4    |
|   4   | [1,3,5,6], 0 |   0    |

## Solution
{{< highlight java "style=friendly">}}
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] >= target) {
                return 0;
            } else {
                return 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
{{< /highlight >}}