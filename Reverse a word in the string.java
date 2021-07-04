import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer ob1 = new StringTokenizer(s);
        int n = ob1.countTokens();
        String a[] = new String [n];
        String s2="";
        for(int i=0;i<n;i++)
        {
            a[i]=ob1.nextToken();
        }
        for(int i=n-1;i>=0;i--)
        {
            if(i == 0)
            {
                s2=s2+a[i];
            }
            else
            s2=s2+a[i]+" ";
        }
        return s2;
    }
}
