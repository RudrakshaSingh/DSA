#include<bits/stdc++.h>
using namespace std;

int main(){
    vector<int> v; // creates empty container []
    v.push_back(5);
    v.push_back(3);
    v.push_back(5);
    v.push_back(1);
    v.push_back(2);
    for (auto it:v)
    {
        cout << it << endl;
    }
    
    // Find and print the maximum element
    int max = *max_element(v.begin(), v.end());
    cout << "max : " << max << endl;

    // Find and print the minimum element
    int min = *min_element(v.begin(), v.end());
    cout << "min : " << min << endl;


    return 0;
}