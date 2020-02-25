class CQueue {
    private Stack<Integer> data;
    private Stack<Integer> temp;
    public CQueue() {
        data = new Stack<>();
        temp = new Stack<>();
    }
    
    public void appendTail(int value) {
        if (data.isEmpty()) {
            data.push(value);
        } else {
            while (!data.isEmpty())
                temp.push(data.pop());
            data.push(value);
            while (!temp.isEmpty()) {
                data.push(temp.pop());
            }
        }
    }
    
    public int deleteHead() {
        if (data.isEmpty())
            return -1;
        return data.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */