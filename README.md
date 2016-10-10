# GetLongestSequence
Get longest sequence that each person's weight and height is bigger than previous person

A circus is designing a tower routine consisting of people standing atop one another's shoulders.For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower.

EXAMPLE:

Input (ht,wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)

Output:The longest tower is length 6 and includes from top to bottom:
(56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)

Write height and weight in a wrapper class Htwt, Implements Comparable, write method: compareTo, compare height first, if height is equal, compare weight, in this way, height is sorted

Suppose height is sorted, then weight is like 13,14,10,11,12

Longest ends with a[0] 13

Longest ends with a[1] 13,14

Longest ends with a[2] 10

Longest ends with a[3] 10,11

Longest ends with a[4] 10,11,12

We put the longest sequence ends with a[i] in solutions[i], we check if a[j].isBefore(a[i]) (both weight and height is smaller), is so, find the longest temp, add(a[i]) to temp, save temp as solutions[i]

last, recursion to i+1

