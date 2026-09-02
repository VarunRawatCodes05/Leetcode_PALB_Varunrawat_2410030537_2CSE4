class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            
            int [] arr = new int [26];

            for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 'a']++;
            if(arr[s.charAt(i) - 'a']>1){
                return true;
            }    
        }
        return false;
        }
        int DiffCnt = 0;
        int FirstDiff = -1;
        int SecondDiff = -1;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!=goal.charAt(i)){
                DiffCnt++;
                if(DiffCnt==1){
                FirstDiff = i;
            }
                if(DiffCnt==2){
                SecondDiff= i;
            }
            }
        }
        if(DiffCnt!=2){
            return false;
        }
        return s.charAt(FirstDiff)==goal.charAt(SecondDiff) && s.charAt(SecondDiff)==goal.charAt(FirstDiff);
    }
}