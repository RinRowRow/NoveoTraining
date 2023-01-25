package org.example;

public class Exercise9 {
    /*
Removing Stars From a String

You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.



Time complexity = O(n)

Space complexity O(n)
    */

    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && builder.length() > 0) {
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
