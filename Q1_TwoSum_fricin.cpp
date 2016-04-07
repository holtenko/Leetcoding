class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> rtvec;
        vector<int> findvec;
        for(int p = 0;p!=nums.size();++p)
        {
           int nexttarget=target-nums[p];

           for(int q = 0;q!=findvec.size();++q)
           {
               if(findvec[q]==nexttarget)
               {
                   rtvec.push_back(q);
                   rtvec.push_back(p);
                   return rtvec;

               }
            }
            findvec.push_back(nums[p]);
        }
        return rtvec;
    }
};
