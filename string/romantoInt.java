
import java.util.HashMap;

/* 
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.*/

class romantoInt{
    public int romantoInt(String s){
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int prevalue = 0;

        for (int i = s.length() - 1; i >= 0; i-- ){
            int current = roman.get(s.charAt(i));
            if (current < prevalue){
                total -= current;

            }else{
                total += current;

            }

            prevalue = current;

        }

        return total;
        

    }
}


