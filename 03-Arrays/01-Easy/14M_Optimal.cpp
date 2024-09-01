// Longest Subarray with sum K | [Postives and Negatives and 0]

// Problem Statement: Given an array and a sum k, we need to print the length
// of the longest subarray that sums to k.

#include <bits/stdc++.h>
using namespace std;

int getLongestSubarray(vector<int> &a, int k) {
    map<long long,int> preSumMap;
    long long sum=0;
    int maxLen=0;

    for (int i = 0; i < a.size(); i++)
    {
        sum+=a[i];

        if (sum==k)
        {
            maxLen=max(maxLen,i+1);
        }

        int rem=sum-k;

        if (preSumMap.find(rem)!=preSumMap.end())
        {
            int len=i-preSumMap[rem];
            maxLen=max(maxLen,len);
        }

        if (preSumMap.find(sum)==preSumMap.end())
        {
            preSumMap[sum]=i;
        }       
    }
    return maxLen;
     
}

int main()
{
    vector<int> a = {-1, 1,0,0, 1};
    int k = 1;
    int len = getLongestSubarray(a, k);
    cout << "The length of the longest subarray is: " << len << "\n";
    return 0;
}
