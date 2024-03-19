package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int x){
        //x = 1221 -> true x = 11212 -> false
        //xi arraye çevir,
        //arrayi ters sıralayıp başka bir array yap,
        // iki arrayin aynı indexlerini kıyasla
        x = Math.abs(x);
        char[] arr = String.valueOf(x).toCharArray();
        char[] arrReverse = new char[arr.length];
        for(int i = 0; i < arr.length; i++){
            arrReverse[arr.length - 1 - i] = arr[i]; //4 elemanlı -> arr[0] = arrRe[3], arr[1] = arrRe[2] ...
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arrReverse[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfectNumber(int x){
        //sayının bölenlerinin toplamı = sayı && bölen != sayı -> true, sayı > 0
        //sayıyı bölenleri ayırmam lazım
        //sayıdan farklı bölenleri bir arrde tutup birbirleriyle toplayacağım
        //eğer toplam sayıya eşitse true
        if(x <= 0) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < x; i++) {
            if(x % i == 0) {
                sum += i;
            }
        }
        return (sum == x);
    }
    public static String numberToWords(int x){
        //x in karakterlerini bir arraye koy
        //bu karakterleri yazı karşılıklarıyla eşleştir
        String result = "";
        if(x < 0) {
            return  "Invalid Value";
        }
        char[] arr = String.valueOf(x).toCharArray();
        String[] numberString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for(char digit: arr) {
            switch (digit){
                case '0':
                    result += numberString[0] + " ";
                    break;
                case '1':
                    result += numberString[1] + " ";
                    break;
                case '2':
                    result += numberString[2] + " ";
                    break;
                case '3':
                    result += numberString[3] + " ";
                    break;
                case '4':
                    result += numberString[4] + " ";
                    break;
                case '5':
                    result += numberString[5] + " ";
                    break;
                case '6':
                    result += numberString[6] + " ";
                    break;
                case '7':
                    result += numberString[7] + " ";
                    break;
                case '8':
                    result += numberString[8] + " ";
                    break;
                case '9':
                    result += numberString[9] + " ";
                    break;
            }
        }
        return result.trim();
    }

}
