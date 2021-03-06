import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nsr = new int[n];
        Stack < Integer > st = new Stack < > ();
        st.push(n-1);
        // nsr[n - 1] = n;
        // for (int i = n - 2; i >= 0; i--) {
        //     if (a[i] >= a[i + 1])
        //         nsr[i] = i + 1;
        //     else
        //         nsr[i] = nsr[i + 1];
        // }

        st.push(0);
        for (int i = 1; i < n; i++) {
            while (st.size() != 0 && a[st.peek()] > a[i]) {
                nsr[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (st.size() != 0) {
            nsr[st.peek()] = n;
            st.pop();
        }

        int[] nsl = new int[n];
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() != 0 && a[st.peek()] > a[i]) {
                nsl[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (st.size() != 0) {
            nsl[st.peek()] = -1;
            st.pop();
        }

        int ans = 0, currArea = 0;
        for (int i = 0; i < n; i++) {
            // int l = a[i];
            int w = nsr[i] - nsl[i] - 1;
            currArea = w * a[i];
            if (ans < currArea)
                ans = currArea;
            // ans = Math.max(ans,currArea);
        }

        System.out.print(ans);



        // code
    }
}