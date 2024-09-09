class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hnds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thds = {"", "M", "MM", "MMM"};

        return roman.append(thds[num/1000])
            .append(hnds[(num % 1000)/100])
            .append(tens[(num % 100)/10])
            .append(ones[(num % 10)/1])
            .toString();
    }
}