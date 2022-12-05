package org.example;

public class Main {
    public static void main(String[] args) {

        rle("xaabbcc");

    }

    public static String rle(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        Character lastElement = null;
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if(lastElement == null) {

                lastElement = element;
                count++;

            } else {
//                lastElement = element;
                if(element == lastElement) {
                    count++;
                } else {
                    if(count == 1) {
                        builder.append(lastElement);
                        lastElement = element;
                        count = 1;
                    } else {
                        builder.append(lastElement).append(count);
                        lastElement = element;
                        count = 1;
                    }

                }

            }

            if(i  == str.length() - 1) {
                if(count == 1) {
                    builder.append(lastElement);
                    lastElement = element;
                    count = 1;
                } else {
                    builder.append(lastElement).append(count);
                    lastElement = element;
                    count = 1;
                }

            }

        }




        return builder.toString();

    }

    }


    /**
     На входе произвольная строка.
     Символы, которые идут подряд и повторяются,
     нужно закодировать как название символа и количество повторений.
     Если количество повторений равно одному, то 1 не нужно писать.
     xxaabbcc -> x2a2b2c2
     abc -> abc
     */
//    function rle(str) {
//    }