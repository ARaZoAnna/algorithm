//https://cote.inflearn.com/contest/10/problem/01-04

import java.util.*;

class Test {
    public ArrayList<String> solutions(int num, String[] strArray){
        ArrayList<String> arrayList = new ArrayList<>();

        //StringBuilder 사용용
        // for(String x : strArray){
        //     // String str = new StringBuilder(x).reverse().toString();
        //     // arrayList.add(str);
        // }

        for (String x : strArray){
            //String은 문자를 수정할 수 없으니 char 배열로 바꿈
            char[] c = x.toCharArray();
            int lIdx = 0;
            int rIdx = x.length()-1;
            while(lIdx < rIdx){
                char tmp = c[lIdx];
                c[lIdx] = c[rIdx];
                c[rIdx] = tmp;
                lIdx++;
                rIdx--;
            }
            //char 배열을 String으로 변환
            String s = String.valueOf(c);
            arrayList.add(s);
        }

        return arrayList;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] strArray = new String[num];

        for (int i = 0; i<num; i++){
            strArray[i] = in.next();
        }
        for (String s : T.solutions(num, strArray)){
            System.out.println(s);
        }

    }

}
