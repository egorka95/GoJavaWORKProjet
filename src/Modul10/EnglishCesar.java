package Modul10;


import java.util.ArrayList;
import java.util.List;

public class EnglishCesar {
    List<Character> alphabet = new ArrayList<Character>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-'};
    EnglishCesar() {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }
    String encrypt(String text, int m, int k) {
        int n = alphabet.size();
        m = m % n;
        k = k % n;
        if (gcd(n, m) != 1) {//проверка простоты n относительно m
            return null;
        }
        StringBuilder cryptogram = new StringBuilder();
        //блок шифрования данных
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index * m + k) % n;
            cryptogram.append(alphabet.get(index));
        }
        return cryptogram.toString();
    }
    public String decrypt(String text, int m, int k){
        int n = alphabet.size();
        m = m % n;
        k = k % n;
        int reversedM = -1;//обратное к m
        //ищем обратное к m
        for (int i = 0; i < n; i++) {
            if ((i * m) % n == 1) {
                reversedM = i;
                break;
            }
        }
        StringBuilder newText = new StringBuilder();
        //блок дешифрования данных
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (((index - k) * reversedM) % n + n) % n;
            newText.append(alphabet.get(index));
        }
        return newText.toString();

    }
    //алгоритм поиска наибольшего общего делителя
    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public String encrypt(Bouqet flower1, int m, int k) {
        return null;
    }
}


