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
    private final String LANGUAGE01 = "(a|b)*((aa)|(bb))(a|b)*";
    private final String LANGUAGE02 = "(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*";
    private final String LANGUAGE03 = "a(a|b)*a";
    
    private final String LETTER = "([A-Za-z])";
    private final String NUMBER = "([0-9])";
    private final String WORD = "("+LETTER+"|"+NUMBER+")";
    private final String BEFORE_DOMAIN = "(("+WORD+"|(\\-|\\_))+(\\.)?("+WORD+"|(\\-|\\_))+)+";
    private final String AFTER_DOMAIN = "@("+WORD+")+(\\_)?("+WORD+"|\\.|)+("+WORD+")+";
    private final String EMAIL = "(("+BEFORE_DOMAIN+"){1,64}"+AFTER_DOMAIN+"){1,254}";
    
    
    
    public static boolean check(String regex, String word) {
        return word.matches(regex);
    }
}
