import java.io.*;
import java.util.*;

public class Main {

    public static class LLToStackAdapter {
        LinkedList < Integer > list;
        int size;
        public LLToStackAdapter() {
            list = new LinkedList < > ();
            this.size = 0;
        }


        int size() {
            // write your code here
            return this.size;
        }

        void push(int val) {
            // write your code here
            this.list.addFirst(val);
            size++;
        }

        int pop() {
            // write your code here
            int val = this.list.getFirst();
            this.list.removeFirst();
            size--;
            return val;
        }

        int top() {
            // write your code here
            return this.list.getFirst();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToStackAdapter st = new LLToStackAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}