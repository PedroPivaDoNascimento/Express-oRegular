/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expressaoregular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author piva
 */
public class ExpressaoRegular {

    public static String testResult(String regex, String word) {
        if (RegexHandler.check(regex, word)) {
            return "Sucesso";
        }
        
        return "Falha";
    }
    public static void testExercice(List<String> ex, String language){
    
        for (String word : ex) {
            System.out.println(testResult(language, word));
        }
    }
    
    public static void main(String[] args) {
        // Exercício 02: Contém aa ou bb
        List<String> ex02 = new ArrayList<>(Arrays.asList(
            "aa", "bba", "aabba", "baab", "bbaa", // Sucessos
            "a", "b", "abab", "aba", "baba"       // Falhas
        ));
        System.out.println("Exercício 02:");
        testExercice(ex02, RegexHandler.getLANGUAGE01());

        // Exercício 03: Quantidade par de a e de b
        List<String> ex03 = new ArrayList<>(Arrays.asList(
            "aabb", "abab", "aaaa", "bb", "",    // Sucessos
            "a", "b", "aaab", "abb", "aba"       // Falhas
        ));
        System.out.println("Exercício 03:");
        testExercice(ex03, RegexHandler.getLANGUAGE02());

        // Exercício 04: Começa e termina com 'a'
        List<String> ex04 = new ArrayList<>(Arrays.asList(
            "aa", "aba", "aaaaa", "abba", "aabaa", // Sucessos
            "ab", "ba", "b", "abc", "bb"           // Falhas
        ));
        System.out.println("Exercício 04:");
        testExercice(ex04, RegexHandler.getLANGUAGE03());

        // Exercício 05: E-mail
        List<String> ex05 = new ArrayList<>(Arrays.asList(
            "teste@gmail.com", "user.123@uol.com.br", "a@b.co", "email@empresa.org", "dev_jr@web.net", // Sucessos
            "email@", "@gmail.com", "joao@com", "espaco @gmail.com", "a.b.c"                          // Falhas
        ));
        System.out.println("Exercício 05:");
        testExercice(ex05, RegexHandler.getEMAIL());

        // Exercício 06: Reais negativos com expoente
        List<String> ex06 = new ArrayList<>(Arrays.asList(
            "-1.5e10", "-0.5E-2", "-123.45e+5", "-10.0e2", "-3.14e0", // Sucessos
            "21123--312", "-1.5-", "-e10", "-1.5e", "-123-.5e5.5"             // Falhas
        ));
        System.out.println("Exercício 06:");
        testExercice(ex06, RegexHandler.getEXPONENTIAL_NUMBERS());

    }
}
