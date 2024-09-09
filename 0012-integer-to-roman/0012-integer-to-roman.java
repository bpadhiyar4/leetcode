class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        while (num != 0) {
            int repeat = 0;
            String ch = "";
            if (num >= 1000) {
                repeat = num / 1000;
                num = num % 1000;
                ch = "M";
            } else if (num >= 900) {
                repeat = num / 900;
                num = num % 900;
                ch = "CM";
            } else if (num >= 500) {
                repeat = num / 500;
                num = num % 500;
                ch = "D";
            } else if (num >= 400) {
                repeat = num / 400;
                num = num % 400;
                ch = "CD";
            } else if (num >= 100) {
                repeat = num / 100;
                num = num % 100;
                ch = "C";
            } else if (num >= 90) {
                repeat = num / 90;
                num = num % 90;
                ch = "XC";
            } else if (num >= 50) {
                repeat = num / 50;
                num = num % 50;
                ch = "L";
            } else if (num >= 40) {
                repeat = num / 40;
                num = num % 40;
                ch = "XL";
            } else if (num >= 10) {
                repeat = num / 10;
                num = num % 10;
                ch = "X";
            } else if (num >= 9) {
                repeat = num / 9;
                num = num % 9;
                ch = "IX";
            } else if (num >= 5) {
                repeat = num / 5;
                num = num % 5;
                ch = "V";
            } else if (num >= 4) {
                repeat = num / 4;
                num = num % 4;
                ch = "IV";
            } else if (num >= 1) {
                repeat = num / 1;
                num = num % 1;
                ch = "I";
            }

            for (int i = 0; i<repeat; i++) {
                roman.append(ch);
            }
        }

        return roman.toString();
    }
}