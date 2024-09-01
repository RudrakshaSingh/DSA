// problem Statement: You are given an array of integers, your task is to move a
// ll the zeros in the array to the end of the array and move non-negative integers
// to the front by maintaining their order.

#include <bits/stdc++.h>
using namespace std;

vector<int> moveZeros(int n, vector<int> arr)
{
    int j;

    // finding first zero
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 0)
        {
            j = i;
            break;
        }
    }

    //no non-zero elements:
    if (j == -1) return arr;

    for (int i = j + 1; i < n; i++)
    {
        if (arr[i] != 0)
        {
            // swap
            swap(arr[i], arr[j]);
            j++;
        }
    }

    return arr;
}

int main()
{
    vector<int> arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    int n = 10;
    vector<int> ans = moveZeros(n, arr);
    for (auto it : ans)
    {
        cout << it << " ";
    }
    cout << '\n';
    return 0;
}
