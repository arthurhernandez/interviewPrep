class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanSymbols = new HashMap<>();
        romanSymbols.put('I',1);
        romanSymbols.put('V',5);
        romanSymbols.put('X',10);
        romanSymbols.put('L',50);
        romanSymbols.put('C',100);
        romanSymbols.put('D',500);
        romanSymbols.put('M',1000);
        int sum = 0;
        int stringLength = s.length()-1;
        while(stringLength >=1){
            int currentInt = romanSymbols.get(s.charAt(stringLength));
            int nextInt = romanSymbols.get(s.charAt(stringLength -1));
            sum += currentInt;
            if(nextInt < currentInt){
                sum -= nextInt;   
                stringLength -= 2;
            }
            else stringLength--;
            
        }
        if(stringLength == 0) sum += romanSymbols.get(s.charAt(0));
        return sum;
    }
}
