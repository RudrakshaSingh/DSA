// Problem Statement: Given an array of N integers, left rotate the array by d place.

#include<bits/stdc++.h>
using namespace std;

void reverse(vector<int>& arr,int f,int l){
    while (f < l) {
        swap(arr[f], arr[l]);
        ++f;
        --l;
    }
    
}


void leftRotateByD_Places(vector<int>& arr,int n,int d){
    
    //effective places
    d=d%n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);

}
void rightRotateByD_Places(vector<int>& arr,int n,int d){
    
    //effective places
    d=d%n;
    reverse(arr,n-d,n-1);
    reverse(arr,0,n-1-d);
    reverse(arr,0,n-1);

}

int main(){
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7};
    int n = arr.size();
    int d=9;

    leftRotateByD_Places(arr,n,d);

    for(auto i:arr){
        cout << i << " ";
    }
    cout << "" << endl;

    rightRotateByD_Places(arr,n,d);

    for(auto i:arr){
        cout << i << " ";
    }
    cout << "" << endl;

    return 0;
}