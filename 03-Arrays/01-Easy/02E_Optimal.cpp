// Problem Statement: Given an array, find the second smallest and
// second largest element in the array. Print ‘-1’ in the event that
// either of them doesn’t exist.

#include <bits/stdc++.h>
using namespace std;

int secondSmallest(int arr[], int n) {if (n < 2)
        return -1;
    int smallest = INT_MAX, secondSmallest = INT_MAX;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] < smallest)
        {
            secondSmallest = smallest;
            smallest = arr[i];
        }
        else if (arr[i] < secondSmallest && arr[i] != smallest)
        {
            secondSmallest = arr[i];
        }
    }

    // If no valid second largest element found, return -1
        if (secondSmallest == INT_MIN)
            return -1;
        return secondSmallest;
}

int secondLargest(int arr[], int n)
{
    if (n < 2)
        return -1;
    int large = INT_MIN, second_large = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > large)
        {
            second_large = large;
            large = arr[i];
        }
        else if (arr[i] > second_large && arr[i] != large)
        {
            second_large = arr[i];
        }
    }

    // If no valid second largest element found, return -1
        if (second_large == INT_MIN)
            return -1;
        return second_large;
}

int main()
{
    int arr1[] = {1, 2, 3, 4, 7, 7, 5};
    int n = 7;
    int ss = secondSmallest(arr1, n);
    int sl = secondLargest(arr1, n);

    cout << "The second largest element in the array is: " << sl << endl;
    cout << "The second samllest element in the array is: " << ss << endl;

    return 0;
}