//https://cote.inflearn.com/contest/10/problem/03-02

import java.util.*;

class Test {
    public ArrayList<Integer> solutions(int n, int[] arrn, int m, int[] arrm){
        ArrayList<Integer> list = new ArrayList<>();
      
        Arrays.sort(arrn);
        Arrays.sort(arrm);

        int p1 = 0, p2 = 0;
        
        while(p1 < n && p2 < m){
            if(arrn[p1] < arrm[p2]) p1++;
            else if(arrn[p1] > arrm[p2]) p2++;
            else{
                list.add(arrn[p1]);
                p1++;
                p2++;
            } 
        }
        return list;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arrn = new int[n];
        for(int i = 0; i < n; i++){
            arrn[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arrm = new int[m];
        for(int j = 0; j < m; j++){
            arrm[j] = in.nextInt();
        }

        for(int num : T.solutions(n, arrn, m, arrm)){
            System.out.print(num + " ");
        }
        
        in.close();      
    }
}
