package udemy.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//проверям является ли лист палиндромом
public class ListIteratorExample { //в ListIterator есть методы hasPrevious и previous
    public static void main(String[] args) {
        String s="madama";
        List<Character> list=new LinkedList<>();
        for(char ch: s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator=list.listIterator();
        ListIterator<Character> reverseIterator=list.listIterator(list.size()); //начинает с последней позиции
        boolean isPalindrome=true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if(iterator.next()!=reverseIterator.previous()) {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
