//Intersection of two sorted array
//A[1,2,2,3,3,4,5,6]
//B[2,3,3,5,6,6,7]
//ans[2,3,3,5,6]

#include <bits/stdc++.h>
using namespace std;

vector<int> IntersectionArray(int arr1[], int arr2[], int n, int m)
{
    vector<int> Intersection;
    int i = 0, j = 0;
    while (i < n && j < m)
    {
        if (arr1[i]>arr2[j])
        {
            j++;
        }else if (arr1[i]<arr2[j])
        {
            i++;
        }else
        {
            Intersection.push_back(arr1[i]);
            i++;
            j++;
        }
        
        
        
    }
    

    return Intersection;
}

int main()
{
    int n = 10, m = 7;
    int arr1[] = {1,2,2,3,3,4,5,6};
    int arr2[] = {2,3,3,5,6,6,7};
    vector<int> Union = IntersectionArray(arr1, arr2, n, m);
    cout << "Intersection of arr1 and arr2 is  " << endl;
    for (auto &val : Union)
        cout << val << " ";
    return 0;
}