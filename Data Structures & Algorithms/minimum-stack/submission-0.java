class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.empty()){
            min = val;
            st.push((long)val);
        }
        else{
            if(val>=min){
                st.push((long)val);
                }
            else{
                st.push(2L *val - min);
                min = val;
            }
        }
    }
    
    public void pop() {
        if(st.empty()) return;
        long x = st.peek();
        st.pop();
        if(x < min){
            min = 2 * min - x;
        }
    }
    
    public int top() {
        long x = st.peek();
         if (x >= min) {
            return (int) x;
        } else {
            return (int) min;
        }
    }   
    public int getMin() {
        return (int)min;
    }
}
