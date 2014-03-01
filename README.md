JavaSorting
===========

A project to evaluate a variety of sorting algorithms implementations


1) Insertion Sort In Java

Introduction

In this example we are going to sort integer values of an array using insertion sort.

Insertion sorting algorithm is similar to bubble sort. But insertion sort is more  efficient than bubble sort because in insertion sort the elements comparisons are less as compare to bubble sort. In insertion sorting algorithm compare the value until  all the prior elements are lesser than compared value is not found. This mean that the all previous values are lesser than compared value. This algorithm is more efficient than the bubble sort .Insertion sort is a good choice for small values and for nearly-sorted values. There are more efficient algorithms such as quick sort, heap sort, or merge sort for large values .

Positive feature of insertion sorting: 

1.It is simple to implement 
2.It is efficient on (quite) small data values 
3.It is efficient on data sets which are already nearly sorted.

The complexity of insertion sorting is O(n) at best case of an already sorted array and  O(n2) at worst case .

Code description:

In insertion sorting take the element form left assign value into a variable. Then compare the  value with  previous values. Put  value so that values must be lesser than the previous values. Then assign  next  value to a variable and follow the same steps relatively until the comparison not reached to end of array.  
