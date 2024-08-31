// map are like students with same name
// stored as roll no ->keys and name -> value
// unique keys but there can be  duplicate values
//{key,value} key can be anything int double character
//map store unique key in sorted order

//work mostly in logN
#include <bits/stdc++.h>
using namespace std;

int main()
{
    map<int, int> mpp;
    map<int, pair<int, int>> mpp2;
    map<pair<int, int>, int> mpp3;

    mpp[1] = 2;//{1,2}
    mpp.emplace(3, 1);//{1,2}{3,1}
    mpp.insert({2, 4});//{1,2},{2,4},{3,1}

    mpp3[{2, 3}] = 10;

    /////////// ITERATING ///////////////////   
    for (auto it : mpp)
    {

        cout<< it.first <<" "<< it.second << endl;
    }

    cout << mpp[1] <<"hi"<< endl;

    cout << mpp[5]<<"hi2"<< endl;//does not exist givw 0

    ////////   iterator of key (address) /////////////
    auto it2=mpp.find(2);//if not there point to mpp.end()
    cout<< it2->second << endl;//value
    cout<< it2->first << endl;//key

    auto it3=mpp.lower_bound(2);
    auto it4=mpp.upper_bound(1);



    return 0;
}