class Solution {
    public String getPermutation(int A, int B) {
        List<Integer> numbers = new ArrayList<>();

        int fact = 1;

        if (A <= 12) {
            for (int i=1;i<A;i++) {
                fact *= i;
                numbers.add(i);
            }
        } else{
            fact = Integer.MAX_VALUE;
            for (int i=1;i<A;i++) {
                numbers.add(i);
            }
        }


        B = B-1;

        numbers.add(A);
        String ans ="";
        while(true) {
            ans += numbers.get(B/fact);
            numbers.remove(B/fact);
            if(numbers.size() == 0) {
                break;
            }

            B = B%fact;
            fact = fact / numbers.size();
        }

        return ans;
    }
}