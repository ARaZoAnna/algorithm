//https://cote.inflearn.com/contest/10/problem/02-05

import java.util.*;

class Test {
    
    public ArrayList<Integer> solutions(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);

        for(int i = 3; i <= n; i++){
            boolean check = true;
            for(int num : list){
                if(i % num == 0) check = false;
            }
            if (check) list.add(i);
        }

        return list;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      
        System.out.println(T.solutions(n).size());
        
        in.close(); 
    }

}
