//sorting to increasing second element
//if second element same solve in descending oredr of first elements

#include<bits/stdc++.h>
using namespace std;

bool comp(pair<int,int> p1,pair<int,int> p2){
    //acco to second element
    if (p1.second<p2.second)return true;
    if (p1.second<p2.second)return false;//noot in correct order swap

    //acc to first element//s.elemt is same
    if (p1.first>p2.first)return true;

    return false;  //swap    
}

int main(){
    pair<int,int> a[]={{1,2},{2,1},{4,1}};
    //my way {2,1}{4,1}{1,2}
    //THEN {4,1}{2,1}{1,2}

    //sort(a,a+n,comp)
    //comp-self written comparaator ,boolean function
    int n = sizeof(a) / sizeof(a[0]);  // Calculate the number of elements in the array
    sort(a, a + n, comp);
    for (int i = 0; i < n; ++i) {
        cout << "{" << a[i].first << ", " << a[i].second << "}" << endl;
    }

    return 0;
}