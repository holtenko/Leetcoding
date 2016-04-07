class MinStack {
private:
    stack<int> s;
    stack<int> min;
public:
    void push(int x) {
        s.push(x);
        if(min.empty()) min.push(x);
        else if(min.top()<x) min.push(min.top());
        else min.push(x);
    }

    void pop() {
        s.pop();
        min.pop();
    }

    int top() {
        return s.top();
    }

    int getMin() {
        return min.top();
    }
};
