class Solution {
    boolean checkBalanced(int arr[] ){
        int common =0;
        for(int i =0;i<26;i++){
            if(arr[i]==0) continue;
            if(common ==0) common=arr[i];
            else if (arr[i]!=common){
                return false;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int maxL=0;
        int cnt[] =new int[26];
        for(int i =0;i<n;i++){
            Arrays.fill(cnt,0);
            for(int j =i;j<n;j++){
                cnt[s.charAt(j)-'a']++;
                if(checkBalanced(cnt)){
                    maxL=Math.max(maxL,j-i+1);
                }
            }
        }
        return maxL;
    }
}