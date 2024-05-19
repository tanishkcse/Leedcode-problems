import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, result, "", 0, 0);
        return result;
    }

    private void generate(int n, List<String> result, String str, int open, int close) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }
        if (open < n) {
            generate(n, result, str + "(", open + 1, close);
        }
        if (close < open) {
            generate(n, result, str + ")", open, close + 1);
        }
    }
}
