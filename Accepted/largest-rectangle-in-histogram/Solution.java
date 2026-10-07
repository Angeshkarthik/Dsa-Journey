class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int lfs[]=new int[n];
        int rfs[]=new int[n];
        Arrays.fill(lfs,0);
        Arrays.fill(rfs,n-1);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            if(!s.isEmpty())
                lfs[i]=s.peek()+1;
            s.push(i);
        }
        while(!s.isEmpty()) s.pop();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            if(!s.isEmpty())
                rfs[i]=s.peek()-1;
            s.push(i);
        }
        for(int i=0;i<n;i++){
            ans = Math.max(ans,heights[i]*(rfs[i]-lfs[i]+1));
        }
        return ans;
    }
}