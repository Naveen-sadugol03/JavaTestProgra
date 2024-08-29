package com.gentech.String;
class StringLength{
    static int findStringLength(String str){
        int count=0;
        while(true){
            try{
                str.charAt(count);
                count++;
            }catch(Exception e){
                return count;
            }
        }
    }
}
public class withoutusinglength {
    public static void main(String[] args) {
        int res=StringLength.findStringLength("Welcome");
        System.out.println(res);
    }
}
