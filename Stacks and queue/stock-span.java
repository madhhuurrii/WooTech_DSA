import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + "
");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        // solve
        int[] ans = new int[arr.length];
        Stack < Integer > st = new Stack < > ();
        st.push(arr.length - 1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() != 0 && arr[i] > arr[st.peek()]) {
                ans[st.peek()] = st.peek() - i;
                st.pop();
            }
            st.push(i);
        }
        while (st.size() != 0) {
            ans[st.peek()] = st.peek() - (-1);
            st.pop();
        }
        return ans;
    }

}