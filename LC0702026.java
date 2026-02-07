class Solution {
    public int minimumDeletions(String s) {
        // int n = s.length();
        // int count =0;
        // Stack<Integer> st = new Stack<>();
        // for(int i=0;i<n;i++){
        //     if(!st.isEmpty() && s.charAt(i) =='a' && st.peek()=='b'){
        //         st.pop();
        //         count++;
        //     }
        //     else{
        //         st.push((int)s.charAt(i));
        //     }
        // }
        // return count;  TC =O(n) SC =O(n)
        // optimal TC=O(n) SC=O(1)
                int n = s.length();
        int minD = 0;
        int bC=0;
        for(int i =0;i<n;i++){
            if(s.charAt(i)=='b'){
                bC++;
            }else{
                minD= Math.min(minD+1,bC);
            }
        }
        return minD;
    }
}