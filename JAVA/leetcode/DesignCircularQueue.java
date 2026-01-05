//https://leetcode.com/problems/design-circular-queue/

import java.util.*;
class MyCircularQueue {
    int[] queue;
    int in = 0;
    int out = 0;
    int k;
    public MyCircularQueue(int k) {
        this.k = k;
        queue = new int[k];
    }
    
    public int step(int idx){
        if(idx + 1 < k) return idx+1;
        else return 0;
    }

    public int stepBack(int idx){
        if(idx - 1 < 0) return k-1;
        else return idx-1;
    }

    public boolean enQueue(int value) {
        if(this.isFull()) return false;
        if(queue[in] == 0) queue[in] = value;
        in = this.step(in);
        return true;
    }
    
    public boolean deQueue() {
        if(this.isEmpty()) return false;
        else{
            queue[out] = 0;
            out = this.step(out);
            return true;
        }
    }
    
    public int Front() {
        if(this.isEmpty()) return -1;
        else return queue[out];
    }
    
    public int Rear() {
        if(this.isEmpty()) return -1;
        return queue[this.stepBack(in)];
    }
    
    public boolean isEmpty() {
        if(queue[out] == 0) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(queue[in] > 0) return true;
        else return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
