// Problem Statement: Given an array of N integers, left rotate the array by one place.

#include<bits/stdc++.h>
using namespace std;

void leftRotateBy1(vector<int>& arr,int n){
    int temp=arr[0];
    for (int i = 1; i <n; i++)
    {
        arr[i-1]=arr[i];
    }
    arr[n-1]=temp;
}

int main(){
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7};
    int n = arr.size();

    leftRotateBy1(arr,n);

    for(auto i:arr){
        cout << i << " ";
    }
    cout << "" << endl;

    return 0;
}