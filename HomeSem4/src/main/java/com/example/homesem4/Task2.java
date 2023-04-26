package com.example.homesem4;

import java.util.Stack;

/**
 * Учитывая строку, s содержащую только символы '(', ')', '{', '}''[', ']' и, , определите,
 * является ли введенная строка допустимой.
 *
 * Строка ввода допустима, если:
 *
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открывающая скобка того же типа.
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(isValid("(]"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()[]}"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("["));
        System.out.println(isValid("(("));
        System.out.println(isValid("([)]"));

    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            if ("({[".contains(s.charAt(i) + "")){
                stack.add(s.charAt(i));
            }
            if (")}]".contains(s.charAt(i) + "") & stack.size() == 0) return false;
            ch = s.charAt(i);
            switch (ch){
                case (')'): if (stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case ('}'): if (stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case (']'): if (stack.peek() != '[') return false;
                    stack.pop();
                    break;
                }
            }
        if (stack.size() != 0) return false;
        return true;
        }
}
