class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        HashMap<Integer, String> intToRomanMap = new LinkedHashMap<>();
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(900, "CM");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(400, "CD");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(90, "XC");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(40, "XL");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(9, "IX");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(4, "IV");
        intToRomanMap.put(1, "I");
        for (int key : intToRomanMap.keySet()) {
            while (num >= key) {
                num = num - key;
                ans.append(intToRomanMap.get(key));
            }
        }
        return ans.toString();
    }
}
