# DSA-JAVA-CODE
Arrays

This repository contains Java programs based on Arrays, covering basic array operations and problem-solving exercises.

Array Programs

Arrays
│
├── 01. Running Sum
│   └── Calculates the cumulative sum of elements in an array.
│
├── 02. Plus One
│   └── Adds one to a number represented by an array of digits.
│
├── 03. Move Zeroes
│   └── Moves all zero elements to the end of the array.
│
├── 04. Number of Good Pairs
│   └── Counts the number of pairs of equal elements in an array.
│
├── 05. Left Rotation
│   └── Rotates the elements of an array towards the left.
│
├── 06. Right Rotation
│   └── Rotates the elements of an array towards the right.
│
├── 07. Count Even and Odd
│   └── Counts the even and odd elements present in an array.
│
├── 08. Maximum Average Subarray
│   └── Finds the subarray with the maximum average value.
│
├── 09. Array Sum
│   └── Calculates the sum of all elements in an array.
│
└── 10. Maximum Element
    └── Finds the largest element present in an array.
    

  𝗔𝗿𝗿𝗮𝘆 𝗣𝗿𝗼𝗴𝗿𝗮𝗺𝘀

01. Running Sum

Description: Calculates the cumulative sum of the elements in an array.
Approach: Traverse the array from left to right and maintain a running total by adding each element.

02. Plus One

Description: Adds one to a number represented as an array of digits.
Approach: Start from the last digit, add one, and handle any carry by moving towards the beginning of the array.

03. Move Zeroes

Description: Moves all zero elements to the end of the array while maintaining the order of the non-zero elements.
Approach: Traverse the array, place each non-zero element in the next available position, and fill the remaining positions with zeroes.

04. Number of Good Pairs

Description: Counts the number of pairs of elements that have the same value.
Approach: Compare each element with the elements that follow it and increase the count whenever their values are equal.

05. Left Rotation

Description: Rotates the elements of an array towards the left by a specified number of positions.
Approach: Shift the elements to the left and place the elements removed from the beginning at the end.

06. Right Rotation

Description: Rotates the elements of an array towards the right by a specified number of positions.
Approach: Shift the elements to the right and place the elements removed from the end at the beginning.

07. Count Even and Odd

Description: Counts the number of even and odd elements in an array.
Approach: Traverse the array and check each element using the remainder when divided by 2.

08. Maximum Average Subarray

Description: Finds the continuous subarray of a given size with the maximum average.
Approach: Calculate the first window's sum and then slide the window by removing the outgoing element and adding the incoming element.

09. Array Sum

Description: Calculates the total sum of all the elements in an array.
Approach: Traverse the array and continuously add each element to a sum variable.

10. Maximum Element

Description: Finds the largest element present in an array.
Approach: Start with the first element as the maximum and compare it with each remaining element, updating the maximum when a larger value is found.
