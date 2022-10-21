import java.util.Arrays;
 
public class SortStringByFrequency {
    public static void main(String[] args) {
        String s = "Aabb";
        int f[] = new int[s.length()];
        char[] st = s.toCharArray();
        for (int i = 0; i < st.length; i++) {
            f[i] = countFrequency(st, st[i]);
        }
//        System.out.println(Arrays.toString(f));
        System.out.println(sortArray(st, f));
    }
 
    public static int countFrequency(char[] a, char b) {
        int count = 0;
        for (char i : a){
            if (i == b)
                count++;
        }
        return count;
    }
 
    public static String sortArray(char[] a, int[] b) {
        int t = 0;char c;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0;j < a.length - i - 1;j++) {
                if (b[j] < b[j + 1]) {
                    t = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = t;
 
                    c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(b));
        return Arrays.toString(a);
    }
}