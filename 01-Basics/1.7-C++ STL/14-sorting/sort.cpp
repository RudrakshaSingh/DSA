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

    cout << "new" << endl;
    //sort full all container
    // sort(v.begin(),v.end());//do not include end

    // sorting a portion
    sort(v.begin(), v.begin()+3);

    for (auto it:v)
    {
        cout << it << endl;
    }

    //in descending oreder
    cout << "new" << endl;
    sort(v.begin(),v.end(),greater<int>());
    for (auto it:v)
    {
        cout << it << endl;
    }
    


    return 0;
}