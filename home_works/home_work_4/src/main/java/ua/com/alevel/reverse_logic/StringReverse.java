package ua.com.alevel.reverse_logic;

public class StringReverse {
    public static String reverse(String data){
        String result = "";
        char[] arrayData = data.toCharArray();
        for(int i = data.length() - 1; i >= 0; i--){
            result += Character.toString(arrayData[i]);
        }
        return result;
    }

    public static String reverse(String data, String substring){
        int l = data.indexOf(substring) + 1;
        int r = l  + substring.length()-1;
        if(l == 0) return data;
        else return reverse(data, l, r);
    }

    public static String reverse(String data, int l, int r){
        String result = "";
        char[] arrayData = data.toCharArray();
        for(int i = 0; i < l-1; i++){
            result += Character.toString(arrayData[i]);
        }
        String reversed = "";
        for(int i = l-1; i <= r-1; i++){
            reversed += Character.toString(arrayData[i]);
        }
        result += reverse(reversed);

        for(int i = r; i < data.length(); i++){
            result += Character.toString(arrayData[i]);
        }

        return result;
    }
}
