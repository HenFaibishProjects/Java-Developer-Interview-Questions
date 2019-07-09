package hashmap;
import java.util.*;
import java.util.Map.Entry;

public class HashExamples {
    // Explain the different ways of creating HashMap in java?
        public static void sol1()
        {
            //1. Creating HashMap with default initial capacity and load factor
            HashMap<String, Integer> map1 = new HashMap<String, Integer>();

            //2. Creating HashMap with 30 as initial capacity
            HashMap<String, Integer> map2 = new HashMap<String, Integer>(30);

            //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
            HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);

            //4. Creating HashMap by copying another HashMap
            HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);
        }

         // How do you add key-value pairs to HashMap?
        public static void sol2()
        {
            //Creating HashMap with default initial capacity and load factor
            HashMap<String, Integer> map = new HashMap<String, Integer>();

            //Inserting key-value pairs to map using put() method
            map.put("ONE", 1);
            map.put("TWO", 2);
            map.put("THREE", 3);
            map.put("FOUR", 4);
            map.put("FIVE", 5);

            //Printing key-value pairs
            Set<Entry<String, Integer>> entrySet = map.entrySet();
            for (Entry<String, Integer> entry : entrySet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

            System.out.println("-------------------------");

            //Creating another HashMap
            HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();

            //Inserting key-value pairs to anotherMap using put() method
            anotherMap.put("SIX", 6);
            anotherMap.put("SEVEN", 7);

            //Inserting key-value pairs of map to anotherMap using putAll() method
            anotherMap.putAll(map);

            //Printing key-value pairs of anotherMap
            entrySet = anotherMap.entrySet();

            for (Entry<String, Integer> entry : entrySet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

            //    Output :
            //
            //    FIVE : 5
            //    ONE : 1
            //    FOUR : 4
            //    TWO : 2
            //    THREE : 3
            //   ————————-
            //    FIVE : 5
            //    SIX : 6
            //    ONE : 1
            //    FOUR : 4
            //    TWO : 2
            //    SEVEN : 7
            //    THREE : 3



   // How do you add given key-value pair to HashMap if and only if it is not present in the HashMap?
        public static void sol3()
        {
            //Creating HashMap with default initial capacity and load factor
            HashMap<String, Integer> map = new HashMap<String, Integer>();

            //Adding key-value pairs
            map.put("ONE", 1);
            map.put("TWO", 2);
            map.put("THREE", 3);
            map.put("FOUR", 4);

            //Adds key-value pair 'ONE-111' only if it is not present in map
            map.putIfAbsent("ONE", 111);

            //Adds key-value pair 'FIVE-5' only if it is not present in map
            map.putIfAbsent("FIVE", 5);

            //Printing key-value pairs of map
            Set<Entry<String, Integer>> entrySet = map.entrySet();
            for (Entry<String, Integer> entry : entrySet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

            //    Output :
            //
            //    FIVE : 5
            //    ONE : 1
            //    FOUR : 4
            //    TWO : 2
            //    THREE : 3

      // How do you retrieve a value associated with a given key from the HashMap?
        public static void sol4()
        {
            //Creating HashMap with default initial capacity and load factor
            HashMap<String, Integer> map = new HashMap<String, Integer>();

            //Adding key-value pairs to HashMap
            map.put("ONE", 1);
            map.put("TWO", 2);
            map.put("THREE", 3);
            map.put("FOUR", 4);

            //Retrieving a value associated with key 'TWO'
            int value = map.get("TWO");
            System.out.println(value);
            //Output : 2
        }

// How do you check whether a particular key/value exist in a HashMap?
        public static void sol5() {
            HashMap<Integer, Double> map = new HashMap<Integer, Double>();
            map.put(1, 1.1);
            map.put(2, 2.2);
            map.put(3, 3.3);
            map.put(4, 4.4);

            //Checking whether key '3' exist in ma
            System.out.println(map.containsKey(3));      //Output : true

            //Checking whether value '3.3' exist in map
            System.out.println(map.containsValue(3.3));   //Output : true
        }



//How do you find out the number of key-value mappings present in a HashMap?
        public static void sol6()
        {
            //Creating the HashMap
            HashMap<Integer, Double> map = new HashMap<Integer, Double>();

            //Adding key-value pairs to HashMap
            map.put(111, 111.111);
            map.put(222, 222.222);
            map.put(333, 333.333);
            map.put(444, 444.444);
            map.put(555, 555.555);

            //Retrieving the number of key-value pairs present in map
            System.out.println(map.size());      //Output : 5
        }

//How do you remove all key-value pairs from a HashMap? OR How do you clear the HashMap for reuse?


        public static void sol7()
        {
            //Creating the HashMap
            HashMap<Integer, Double> map = new HashMap<Integer, Double>();

            //Adding key-value pairs to HashMap
            map.put(111, 111.111);
            map.put(222, 222.222);
            map.put(333, 333.333);
            map.put(444, 444.444);
            map.put(555, 555.555);

            //Retrieving the number of key-value pairs
            System.out.println(map.size());      //Output : 5

            //Clearing the map
            map.clear();

            //Checking the number of key-value pairs after clearing the map
            System.out.println(map.size());      //Output : 0
        }

// How do you retrieve all keys present in a HashMap?


        public static void sol8()
        {
            //Creating the HashMap
            HashMap<Integer, String> map = new HashMap<Integer, String>();

            //Adding key-value pairs to HashMap
            map.put(1, "AAA");
            map.put(2, "BBB");
            map.put(3, "CCC");
            map.put(4, "DDD");
            map.put(5, "EEE");

            //Retrieving the Key Set
            Set<Integer> keySet = map.keySet();
            for (Integer key : keySet)
            {
                System.out.println(key);
            }
        }


   // How do you retrieve all the values present in a HashMap?
        public static void sol9()
        {
            //Creating the HashMap
            HashMap<Integer, String> map = new HashMap<Integer, String>();

            //Adding key-value pairs to HashMap
            map.put(1, "AAA");
            map.put(2, "BBB");
            map.put(3, "CCC");
            map.put(4, "DDD");
            map.put(5, "EEE");

            //Retrieving the Collection view of values present in map
            Collection<String> values = map.values();
            for (String value : values)
            {
                System.out.println(value);
            }
        }

            //    Output :
            //
            //    AAA
            //            BBB
            //    CCC
            //            DDD
            //    EEE

// How do you retrieve all key-value pairs present in a HashMap?
        public static void sol10()
        {
            //Creating the HashMap
            HashMap<String, String> map = new HashMap<String, String>();

            //Adding key-value pairs to HashMap
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            //Retrieving the Set consists of all key-value pairs in map
            Set<Entry<String, String>> keyValueSet = map.entrySet();
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

            //    Output :
            //
            //    FIVE : EEE
            //    ONE : AAA
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : CCC

 //How do you remove a key-value pair from the HashMap?
        public static void sol11()
        {
            //Creating the HashMap
            HashMap<String, String> map = new HashMap<String, String>();

            //Adding key-value pairs to HashMap
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            //Printing key-value pairs
            System.out.println("HashMap Before Remove :");
            Set<Entry<String, String>> keyValueSet = map.entrySet();
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("---------------------");
            //Removing the mapping for the key 'ONE'
            map.remove("ONE");
            System.out.println("HashMap After Remove :");

            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

            //    Output :
            //
            //    HashMap Before Remove :
            //    FIVE : EEE
            //    ONE : AAA
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : CCC
            //———————
            //    HashMap After Remove :
            //    FIVE : EEE
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : CCC

// How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?
        public static void sol12()
        {
            //Creating the HashMap
            HashMap<String, String> map = new HashMap<String, String>();

            //Adding key-value pairs to HashMap
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            //Printing Key-value pairs
            System.out.println("HashMap Before Remove :");
            Set<Entry<String, String>> keyValueSet = map.entrySet();
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

            System.out.println("------------------");

            //Removes the mapping for the key 'ONE' only if it is currently mapped to 'CCC'
            map.remove("ONE", "CCC");
            //Removes the mapping for the key 'FIVE' only if it is currently mapped to 'EEE'
            map.remove("FIVE", "EEE");
            System.out.println("HashMap After Remove :");
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

            //    Output :
            //
            //    HashMap Before Remove :
            //    FIVE : EEE
            //    ONE : AAA
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : CCC
            //——————
            //    HashMap After Remove :
            //    ONE : AAA
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : CCC

// How do you replace a value associated with a given key in the HashMap?
        public static void sol13()
        {
            //Creating the HashMap
            HashMap<String, String> map = new HashMap<String, String>();

            //Adding key-value pairs to HashMap
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            //Printing Key-value pairs
            System.out.println("HashMap Before Replace :");
            Set<Entry<String, String>> keyValueSet = map.entrySet();
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

            System.out.println("------------------");
            //Replacing the value associated with 'THREE' to '333'
            map.replace("THREE", "333");
            System.out.println("HashMap After Replace :");
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

            //    Output :
            //
            //    HashMap Before Replace :
            //    FIVE : EEE
            //    ONE : AAA
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : CCC
            //——————
            //    HashMap After Replace :
            //    FIVE : EEE
            //    ONE : AAA
            //    FOUR : DDD
            //    TWO : BBB
            //    THREE : 333

   // How do you replace a value associated with the given key if and only if it is currently mapped to given value?
        public static void sol14()
        {
            //Creating the HashMap
            HashMap<String, String> map = new HashMap<String, String>();

            //Adding key-value pairs to HashMap
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            //Printing Key-value pairs
            System.out.println("HashMap Before Replace :");
            Set<Entry<String, String>> keyValueSet = map.entrySet();
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("------------------");

            //Replacing the value associated with 'FOUR' to '444' only if it is currently mapped to 'DDD'
            map.replace("FOUR", "DDD", "444");
            System.out.println("HashMap After Replace :");
            for (Entry<String, String> entry : keyValueSet)
            {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }

                //    Output :
                //    HashMap Before Replace :
                //    FIVE : EEE
                //    ONE : AAA
                //    FOUR : DDD
                //    TWO : BBB
                //    THREE : CCC
                //——————
                //    HashMap After Replace :
                //    FIVE : EEE
                //    ONE : AAA
                //    FOUR : 444
                //    TWO : BBB
                //    THREE : CCC

// How do you get synchronized HashMap in java?
        public static void sol15()
        {
            //Creating the HashMap
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            //Getting synchronized Map
            Map<String, Integer> syncMap = Collections.synchronizedMap(map);
        }
    }

