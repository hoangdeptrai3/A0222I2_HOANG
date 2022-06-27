package demo;

import java.util.LinkedList;
import java.util.Scanner;

public class SapXepTangDanTheoChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character : ");
        String input = sc.nextLine();

        LinkedList<Character> listMax = new LinkedList<>();
        for (int i = 0;i<input.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i+1;j<input.length();j++){
                if (input.charAt(j) > list.getLast()){
                    list.add(input.charAt(j));
                }
            }
            if (list.size() > listMax.size()){
                listMax.clear();
                listMax.addAll(list);
            }else {
                list.clear();
            }

        }
        for (Character ch : listMax){
            System.out.println(ch);
        }
    }
}
