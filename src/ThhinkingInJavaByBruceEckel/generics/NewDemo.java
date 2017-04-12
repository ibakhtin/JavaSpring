package ThhinkingInJavaByBruceEckel.generics;

import eu.bakhtin.util.New;

import java.util.*;

/**
 * @author Igor Bakhtin
 */
public class NewDemo
{
    public static void main(String[] args)
    {
        Map<String, List<String>> stringListMap = New.map();
        List<String> stringList = New.list();
        LinkedList<String> stringLinkedList = New.linkedList();
        Set<String> stringSet = New.set();
        Queue<String> stringQueue = New.queue();
    }
}
