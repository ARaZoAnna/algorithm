//https://leetcode.com/problems/add-strings/description/

class Solution {
    public String addStrings(String num1, String num2) {
        //아스키 코드로 변환하여 계산합니다.
        //일의 자리부터 연산을 합니다
        //carry를 처리하여 올림 처리를 합니다.

        int idx =0;
        int zero;
        if(num1.length() > num2.length()){
            zero = num1.length()-num2.length();
            while(zero > 0){
                num2 = "0" + num2;
                zero--;
            }
            idx = num1.length() -1;
        }else if(num1.length() < num2.length()){
            zero = num2.length() - num1.length();
            while(zero > 0){
                num1 = "0" + num1;
                zero--;
            }
            idx = num2.length()-1;
        }
        System.out.print(num1 + " " + num2);
        int carry = 0;
        String ans = "";

        while(idx >= 0){
            int n1 = num1.charAt(idx) - '0'; 
            int n2 = num2.charAt(idx) - '0';
            
            int sum = n1 + n2 + carry;
           
            ans = Character.toString((char)(sum % 10 + '0')) + ans;
            
            carry = 0;
             if(sum >= 10){
                carry = 1;
            }

            idx--;

        }

        return ans;
    }
}
