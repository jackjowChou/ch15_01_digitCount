package com.company;
//引入 util 標準類別
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

	    Scanner scn = new Scanner(System.in);
        // 使用者使用鍵盤輸入的長整數資料
        System.out.println("n: ");
	    long n = scn.nextLong();
        // 呼叫 recFun 函數並在回傳值後印出結果
	    System.out.println(recFun(n));
    }

    // 定義一個 recFun 函式 傳入 1 個整數資料,回傳一個整數值
    public static int recFun(long val){
        // 如果傳入的值 小於 10 (即剩個位數) 則回傳 1
        if(val < 10){
            return 1;
        }else { // 如果傳入的值 大於 10 則呼叫自身函式 recFun()再加 1
            //  傳入的參數是將 val 除以 10 之後再傳入
            return 1 + recFun(val / 10);
        }
    }
}

