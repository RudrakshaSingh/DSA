// Problem Statement: Given an array of size n, write a program to check if the 
// given array is sorted in (ascending) order or not. 
// If the array is sorted then return True, Else return False.

// Note: Two consecutive equal values are considered to be sorted.

#include<bits/stdc++.h>
using namespace std;
bool checkSort(int arr[],int n){
    for (int i = 1; i < n; i++)
    {
        if (arr[i]>=arr[i-1] || arr[i]==arr[i-1])
        {
        }else{
            return false;
        }    
    }
    return true;
}

int main(){
    int arr[] = {1, 2, 3, 4, 7, 7};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << checkSort(arr,n) << endl;

    return 0;
}