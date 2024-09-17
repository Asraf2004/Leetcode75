class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        int gcd = 0;
        int a = str1.length();
        int b=  str2.length();
  

        
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

//// 1ms solution...
        while (b!=0){
            int temp=b;
            b = a%b;
            a=temp;
        }

/// 2 ms solution...
        // for(int i = 1;i<=max;i++){
        //     if(str1.length()%i==0 &&  str2.length()%i==0){
        //         gcd = i;
        //     }
        // }
        return str1.substring(0,a);
    }
        
 }
