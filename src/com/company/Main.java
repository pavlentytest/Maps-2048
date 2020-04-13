package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        Map-ы (Ассоциативные массивы, словари, хранилище (ключ-значение)
         */
         /*
         Hashtable
         пары: ключ-значения
         null нельзя
         все методы synchronized - могут проблемы со скоростью
         выполнение всех операций начинается с вычисления хэша от ключа - это фактически индекс
         неупорядочено все - порядок определяется хэш функцией
          */

        Hashtable<String,String> phones = new Hashtable();
        phones.put("Ivan","245624");
        phones.put("Petr","345345");
        phones.put("Maxim","344434");
        phones.put("Alex","834348");

        Enumeration keys = phones.keys();
        while(keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = (String) phones.get(key);
            System.out.println("key: "+ key + "; value: "+value);
        }

       // String str = "Hello";
       // System.out.println(str.hashCode());

        /*
        HashMap - аналогично как и в случае с Hashtable (можно null, все методы потоконебезопасны)
         */

        HashMap<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        HashMap<String,String> map2 = new HashMap<>();
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");

        map.putAll(map2);

        map.remove("key4");

        System.out.println(map);

        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> m: set) {
            System.out.println("key: "+ m.getKey()+"; value: "+m.getValue());
        }

        map.clear();

        // поиск по ключу и значению
        // map.containsKey();
        // map.continsValue();

        /*
        LinkedHashMap
         */
        LinkedHashMap<String,Double> currency = new LinkedHashMap<>();
        currency.put("EUR",89.4);
        currency.put("USD",56.3);
        currency.put("CZK",2.5);
        for(String key: currency.keySet()) {
            System.out.println("key: "+ key+"; value: "+currency.get(key));
        }

        /*
        TreeMap - сортируются по ключам - natural ordering
        Comparator - если нужна своя сортировка
         */

        TreeMap<Integer,String> days = new TreeMap<>();
        days.put(3,"Wednesday");
        days.put(1,"Monday");
        days.put(2,"Tuesday");

        System.out.println(days);

        // все ключи
        System.out.println(days.keySet());

        // получить все значения
        System.out.println(days.values());

        // получение первого значения
        System.out.println(days.get(days.firstKey()));


    }
}
