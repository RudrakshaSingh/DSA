#include <bits/stdc++.h>
using namespace std;

void print(vector<int> v){
    for(auto it:v){
        cout << it<<" ";
    }
    cout << "" << endl;
}

int main()
{
    vector<int> v;
    v.push_back(10);
    v.push_back(2);
    v.push_back(3);
    v.push_back(4);
    v.push_back(5);
    v.push_back(6);

    //--------------------- Iterator ---------------------------//

    vector<int>::iterator it = v.begin(); // v.begin() points to memory address

    cout << *(it) << " " << endl;

    it++;
    cout << *(it) << " " << endl;

    it = it + 2;
    cout << *(it) << " " << endl;

    cout << "it2" << endl;

    vector<int>::iterator it2 = v.end(); // points to address after last element
    it2--;                               // need to decrement for last element
    cout << *(it2) << " " << endl;

    // not ever used
    //  vector<int>::iterator it = v.rend();//reverse end point to before 1
    //  vector<int>::iterator it = v.rbegin();//point to 6

    cout << v[0] << " " << v.at(0) << endl;

    cout << v.back() << " " << endl;

    //-------- for loop iteration ---------//

    for (vector<int>::iterator it = v.begin(); it != v.end(); it++)
    {

        cout << *(it) << " ";
    }
    cout << "" << endl;
    cout << "shortcut iterator" << endl;

    for (auto it = v.begin(); it != v.end(); it++)
    {

        cout << *(it) << " ";
    }
    //-------- for each loop iteration ---------//
    cout << "" << endl;
    cout << "for each loop" << endl;
    for(auto it:v){
        cout << it<<" ";
    }
    cout << "" << endl;

    //-------- v.erase() -------------------//
    cout << "erasing" << endl;
    v.erase(v.begin()+1);
    print(v);

    v.erase(v.begin()+1,v.begin()+3);//excludes end
    print(v);

    //-------- inserting -------------------//
    v.insert(v.begin(),1);
    cout << "inserting" << endl;
    print(v);

    cout << "inserting 2 , 9's" << endl;
    v.insert(v.begin()+1,2,9);
    print(v);

    cout << "inserting another vector at any place of a vector" << endl;
    vector<int> v2;
    v2.push_back(50);
    v2.push_back(50);
    v.insert(v.begin(),v2.begin(),v2.end());//excludes end index
    print(v);

    //-------- size of vector -------------------//
    cout << "size of vector is "<<v.size() << endl;

    //-------- pop the last element -------------------//
    cout << "pop the last element" << endl;
    v.pop_back();
    print(v);

    //-------- swap vector -------------------//
    cout << "swapping vector" << endl;
    v.swap(v2);
    print(v);

    //-------- clear vector -------------------//
    cout << "clear vector " << endl;
    v.clear();
    print(v);
    
    //--------  vector empty = 1 else 0  -------------------//
    cout << "vector empty = true else false " << endl;
    cout << v.empty() << endl;
    return 0;
}