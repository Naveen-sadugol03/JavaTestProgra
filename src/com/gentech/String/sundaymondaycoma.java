package com.gentech.String;
public class sundaymondaycoma {
    public static void main(String[] args) {
        String input = "sundaymondaytuesdaywednesdaythursdayfridaysaturday";
        String result = insertCommasAfterDays(input);
        System.out.println(result);  
    }

    public static String insertCommasAfterDays(String input) {
        
        String[] daysOfWeek = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (String day : daysOfWeek) {
            if (input.startsWith(day, index)) {
                if (result.length() > 0) {
                    result.append(',');
                }
                result.append(day);
                index += day.length();
            }
        }

        return result.toString();
    }
}