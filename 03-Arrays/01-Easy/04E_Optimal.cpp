// Problem Statement: Given an integer array sorted in non-decreasing order, (ascending)
// remove the duplicates in place such that each unique element appears only
// once. The relative order of the elements should be kept the same.

#include <bits/stdc++.h>
using namespace std;

int removeDuplicate(vector<int> &arr, int n) // pass by reference
{
    int i = 0;
    for (int j = 1; j < n; j++)
    {
        if (arr[i] != arr[j])
        {
            i++;
            arr[i] = arr[j];
        }
    }
    return i + 1;
}

int main()
{
    vector<int> arr = {1, 2, 2, 3, 3, 3, 4};
    int n = arr.size();

    int k = removeDuplicate(arr, n);
    cout << "The array after removing duplicate elements is " << endl;
    for (int i = 0; i < k; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}