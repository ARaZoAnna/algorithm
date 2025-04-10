//https://www.acmicpc.net/problem/1546

import java.util.*;


class Test {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double max = Integer.MIN_VALUE;

        double[] arr = new double[n];
        for(int i = 0; i < n; i++){
            double tmp = in.nextDouble();
            if(tmp > max) max = tmp;
            arr[i] = tmp;
        }

        double answer = 0;
        for(int i = 0; i < n; i++){
            answer += (arr[i]/max*100); 
        }
        answer = (answer / n);
        System.out.println(answer);        
        in.close();      
    }
}
