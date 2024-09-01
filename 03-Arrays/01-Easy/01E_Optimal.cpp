// Problem Statement: Given an array, we have to find the largest element in the array.
// Example 1:
// Input:arr[] = {2,5,1,3,0};
// Output:5

#include <bits/stdc++.h>
using namespace std;

int findLargestElement(int arr[], int n)
{
    int max = arr[0];
    for (int i = 1; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
}

int main()
{
    int arr1[] = {2, 5, 1, 3, 0};
    int n = 5;
    int max = findLargestElement(arr1, n);
    cout << "The largest element in the array is: " << max << endl;

    return 0;
}