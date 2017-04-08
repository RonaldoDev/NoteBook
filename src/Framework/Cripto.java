/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import java.util.Random;

/**
 *
 * @author Rolando
 */
public  class Cripto {
    private String Hash;
    public Cripto(String p_senha)
    {
        Hash = p_senha;
    }
    public String Criptografa()
    {
        String _alfa = "QqWwEeTtYuIiOoPp=P*8123457AaSsFfhHKkÇçCcXxMmNnBb.RrZz";
        int _n = _alfa.length();
        Random r = new Random();
        String[] a = Hash.split("");
        for (String string : a) {
           string = Character.toString(_alfa.charAt(r.nextInt(_n)));
        }
        return a.toString();
    }
}
