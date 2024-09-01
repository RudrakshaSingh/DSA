// Find the missing number in an array

// Problem Statement: Given an integer N and an array of size N-1 containing N-1 
// numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

#include<bits/stdc++.h>
using namespace std;

int missingNumber(vector<int> a,int n){
    int XOR1=0,XOR2=0;
    for (int i = 0; i < n-1; i++)
    {
        XOR1=XOR1^a[i];
        XOR2=XOR2^(i+1);

    }
    XOR2^=n;

    return (XOR1^XOR2);
}

int main()
{
    int N = 5;
    vector<int> a = {1, 2, 4, 5};
    int ans = missingNumber(a, N);
    cout << "The missing number is: " << ans << endl;
    return 0;
}