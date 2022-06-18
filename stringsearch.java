package com.dsa;

public class stringsearch {
    public static void main(String[] args) {
        String name="arjun";
        char find='b';
        System.out.println(search(name,find));
    }

     static boolean search(String name, char find) {
        if (name.length()==0){
            return false;
        }
         for (int i = 0; i <name.length() ; i++) {
             if (find==name.charAt(i))
                 return true;

         }
         return false;
    }
}
