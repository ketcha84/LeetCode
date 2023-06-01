package easy.problem_67;

public class Solution {
    public String addBinary(String a, String b) {
        int r1 = a.length() - 1;
        int r2 = b.length() - 1;
        int nextS = 0;

        StringBuilder sb = new StringBuilder();

        while(r1 >= 0 || r2 >= 0){
            int sum = nextS;
            if(r1 >= 0) sum += a.charAt(r1)-'0';
            if(r2 >= 0) sum += b.charAt(r2)-'0';
            sb.append(sum % 2);
            nextS = sum / 2;

            r1--;
            r2--;
        }

        if(nextS!=0) sb.append(nextS);

        return sb.reverse().toString();
    }

}
