package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //(심화1 : 10988번 : 팰린드롬인지 확인하기)
        //팰린드롬 = 회문 : 우영우, 토마토처럼 거꾸로 읽어도 비슷한 구조를 의미.

        //1. 단어를 입력받는다.
        //2. 거꾸로 해서 입력한 단어와 비슷한지 판별
        //3. 출력 -> 1 : 팰린드롬, 0 : 그 외

        Scanner sc = new Scanner(System.in);
        //단어 입력
        String word = sc.nextLine();

        //입력받은  문자열 reverse
        StringBuffer sb = new StringBuffer(word);
        String wordReverse = sb.reverse().toString();

        //if : 팰린드롬. (입력한 "word"와 뒤집은 "wordReverse"가 동일한 경우)
        if (word.equals(wordReverse)) {
            System.out.println("1");

        //else : 팰린드롬이 아닌 경우
        } else {
            System.out.println("0");
        }

    }

}
