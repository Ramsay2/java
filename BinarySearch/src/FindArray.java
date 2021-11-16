import java.util.*;

public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.deepToString(sol(arr, k)));
    }

    static int[][] sol(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i] + k)) {
                list.add(arr[i] + k);
                list2.add(arr[i]);
            }
        }
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i);
            ans[i][1] = list2.get(i);
        }
LinkedList<Integer> list3 = new LinkedList<>();

        return ans;

    }

    static String getCandidates(char[][] board, int row, int col) {
        String candidates = "";
        for (char ch = '1'; ch <= '9'; ch++) {
            boolean collision = false;
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == ch ||
                        board[i][col] == ch ||
                        board[(row - row % 3) + (i / 3)][(col - col % 3) + i % 3] == ch) {
                    collision = true;
                    break;
                }


            }
            if (!collision) {
                candidates += ch;
            }

        }
        return candidates;
    }

    static boolean sudokuSolve(char[][] board) {
        int row = -1, col = -1;
        String candidates = null;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    String newcandidate = getCandidates(board, r, c);

                    if (candidates == null || newcandidate.length() < candidates.length()) ;
                }
            }
        }
        return true;
    }
}
