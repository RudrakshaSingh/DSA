// =->Union of Two Sorted Arrays
// Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m.
// Find the union of two sorted arrays.

// The union of two arrays can be defined as the common and distinct elements
// in the two arrays.NOTE: Elements in the union should be in ascending order.

// Example 1:
// Input:n = 5,m = 5.
//       arr1[] = {1,2,3,4,5}
//        arr2[] = {2,3,4,4,5}
// Output:{1,2,3,4,5}

#include <bits/stdc++.h>
using namespace std;

vector<int> FindUnion(int arr1[], int arr2[], int n, int m)
{
    vector<int> Union;
    int i = 0, j = 0;
    while (i < n && j < m)
    {
        if (arr1[i] < arr2[j])
        {
            if (Union.size() == 0 || Union.back() != arr1[i])
            {
                Union.push_back(arr1[i]);
            }
            i++;
        }else
        {
            if (Union.size() == 0 || Union.back() != arr2[j])
            {
                Union.push_back(arr2[j]);
            }
            j++;
        }
        
    }

    while (i<n)
    {
        if (Union.back()!=arr1[i])
        {
            Union.push_back(arr1[i]);
        }
        i++;
    }

    while (j<m)
    {
        if (Union.back()!=arr2[j])
        {
            Union.push_back(arr2[j]);
        }
        j++;
    }
    

    return Union;
}

int main()
{
    int n = 10, m = 7;
    int arr1[] = {1, 2, 3, 4, 5, 6,7, 7, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
    vector<int> Union = FindUnion(arr1, arr2, n, m);
    cout << "Union of arr1 and arr2 is  " << endl;
    for (auto &val : Union)
        cout << val << " ";
    return 0;
}