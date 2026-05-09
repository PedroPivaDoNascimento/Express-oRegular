/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressaoregular;

/**
 *
 * @author piva
 */
public class RegexHandler {
    private final static String LANGUAGE01 = "(a|b)*((aa)|(bb))(a|b)*";
    private final static String LANGUAGE02 = "((aa|bb)|(ab|ba)(aa|bb)*(ab|ba))*";
    private final static String LANGUAGE03 = "a(b|a)*a";
    
    private final static String LETTER = "([A-Za-z])";
    private final static String NUMBER = "([0-9])";
    private final static String WORD = "("+LETTER+"|"+NUMBER+")";
    private final static String BEFORE_DOMAIN = "(("+WORD+"|(\\-|\\_))+(\\.)?("+WORD+"|(\\-|\\_))*)+";
    private final static String AFTER_DOMAIN = "("+WORD+")+(\\_)?("+WORD+"|\\.)*("+WORD+")*(\\.)("+WORD+")+";
    private final static String EMAIL = "(("+BEFORE_DOMAIN+"){1,64}@"+AFTER_DOMAIN+"){1,254}";
    
    private final static String REAL_NUMBERS = "("+NUMBER+")+(.("+NUMBER+")+)?";
    private final static String NEGATIVE_REAL_NUMBERS = "(-)?("+REAL_NUMBERS+")";
    private final static String EXPONENTIAL_NUMBERS = "("+NEGATIVE_REAL_NUMBERS+")((E|e)(\\+|\\-)?("+REAL_NUMBERS+"))?"; 

    public static String getLANGUAGE01() {
        return LANGUAGE01;
    }
    public static String getLANGUAGE02() {
        return LANGUAGE02;
    }
    public static String getLANGUAGE03() {
        return LANGUAGE03;
    }
    public static String getEMAIL() {
        return EMAIL;
    }
    public static String getEXPONENTIAL_NUMBERS() {
        return EXPONENTIAL_NUMBERS;
    }
    
    public static boolean check(String regex, String word) {
        return word.matches(regex);
    }
}
