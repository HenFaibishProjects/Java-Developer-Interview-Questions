package hashmap;

public class HashTheoreticalQestions {

/*

1. How does put() method of HashMap works in Java? (answer)
The put() method of HashMap works in the principle of hashing. It is responsible for storing an object into the backend array. The hashcode() method is used in conjunction with a hash function to find the correct location for the object into the bucket. If a collision occurs then the entry object which contains both key and value is added to a linked list and that linked list is stored into the bucket location.


2. What is the requirement for an object to be used as key or value in HashMap? (answer)
The key or value object must implement equals() and hashcode() method. The hash code is used when you insert the key object into the map while equals are used when you try to retrieve a value from the map.


3. What will happen if you try to store a key which is already present in HashMap? (answer)
If you store an existing key in the HashMap then it will override the old value with the new value and put() will return the old value. There will not be any exception or error.


4. Can you store a null key in Java HashMap? (answer)
Yes, HashMap allows one null key which is stored at the first location of bucket array e.g. bucket[0] = value. The HashMap doesn't call hashCode() on null key because it will throw NullPointerException, hence when a user call get() method with null then the value of the first index is returned.

5. Can you store a null value inside HashMap in Java? (answer)
Yes, HashMap also allows null value, you can store as many null values as you want as shown in the hashmap example post in this blog.


6. How does HashMap handle collisions in Java? (answer)
The java.util.HashMap uses chaining to handle collisions, which means new entries, an object which contains both key and values, are stored in a linked list along with the existing value and then that linked list is stored in the bucket location.

In the worst case, where all key has the same hashcode, your hash table will be turned into a linked list and searching a value will take O(n) time as opposed to O(1) time.

If you want to learn more about hash table data structure, I suggest you consult a good data structure and algorithm course like Data Structures and Algorithms: Deep Dive Using Java on Udemy, which not only cover basic data structure like array, linked list, binary tree, and hash table but also advanced concepts like O(n) sorting algorithms, Radix sort, Counting sort, etc.

Top 21 Java HashMap Interview Questions and Answers



7. Which data structure HashMap represents? (answer)
The HashMap is an implementation of hash table data structure which is idle for mapping one value to other like id to name as you can search for value in O(1) time if you have the key.


8. Which data structure is used to implement HashMap in Java? (answer)
Even though HashMap represents a hash table, it is internally implemented by using an array and linked list data structure in JDK.  The array data structure is used as a bucket while a linked list is used to store all mappings which land in the same bucket. From Java 8 onwards, the linked list is dynamically replaced by binary search tree, once a number of elements in the linked list cross a certain threshold to improve performance.


9. Can you store a duplicate key in HashMap? (answer)
No, you cannot insert duplicate keys in HashMap, it doesn't allow duplicate keys. If you try to insert an existing key with new or same value then it will override the old value but size of HashMap will not change i.e. it will remain the same. This is one of the reason when you get all keys from the HashMap by calling keySet() it returns a Set, not a Collection because Set doesn't allow duplicates.


10. Can you store the duplicate value in Java HashMap? (answer)
Yes, you can put duplicate values in HashMap of Java. It allows duplicate values, that's why when you retrieve all values from the Hashmap by calling values() method it returns a Collection and not Set. Worth noting is that it doesn't return List because HashMap doesn't provide any ordering guarantee for key or value.

If you want to explore, you can also see Java Fundamentals: Collections course from Pluralsight to learn more about fundamental properties of different collections in Java e.g. List, Set, and Map.

Java HashMap Interview Questions and Answers


11. Is HashMap thread-safe in Java? (answer)
No, HashMap is not thread-safe in Java. You should not share a HashMap with multiple threads if one or more thread is modifying the HashMap e.g. inserting or removing a map. Though, you can easily share a read-only HashMap.


12. What will happen if you use HashMap in a multithreaded Java application? (answer)
If you use HashMap in a multithreaded environment in such a way that multiple threads structurally modify the map e.g. add, remove or modify mapping then the internal data structure of HashMap may get corrupt like some links may go missing, some may point to incorrect entries and the map itself may become completely useless. Hence, it is advised not to use HashMap in the concurrent application, instead, you should use a thread-safe map e.g. ConcurrentHashMap or Hashtable.


13. What are different ways to iterate over HashMap in Java? (answer)
Here are some of the ways to iterate over HashMap in Java:
by using keySet and iterator
by using entrySet and iterator
by using entrySet and enhanced for loop
by using keySet and get() method

You can see this article for an example of each of these ways to traverse a HashMap in Java.


14. How do you remove a mapping while iterating over HashMap in Java? (answer)
Even though HashMap provides remove() method to remove a key and a key/value pair, you cannot use them to remove a mapping while traversing a HashMap, instead, you need to use the Iterator's remove method to remove a mapping as shown in the following example:

Iterator itr = map.entrySet().iterator();

while(itr.hasNext()){
  Map.Entry current = itr.next();

  if(current.getKey().equals("matching"){
     itr.remove(); // this will remove the current entry.
  }
}

You can see that we have used Iterator.remove() method to remove the current entry while traversing the map. See this article to learn more about it.


15. In which order mappings are stored in HashMap? (answer)
Random order because HashMap doesn't provide any ordering guarantee for keys, values, or entries. When you iterate over a HashMap, you may get the different order every time you iterate over it.




16. Can you sort HashMap in Java? (answer)
No, you cannot sort a HashMap because unlike List it is not an ordered collection. Albeit, you can sort contents of HashMap by keys, values or by entries by sorting and then storing the result into an ordered map like LinkedHashMap or a sorted map e.g. TreeMap.


17. What is the load factor in HashMap? (answer)
A load factor is a number which controls the resizing of HashMap when a number of elements in the HashMap cross the load factor e.g. if the load factor is 0.75 and when becoming more than 75% full then resizing trigger which involves array copy.


18. How does resizing happens in HashMap? (answer)
The resizing happens when the map becomes full or when the size of the map crosses the load factor. For example, if the load factor is 0.75 and then become more than 75% full then resizing trigger which involves array copy. First, the size of the bucket is doubled and then old entries are copied into a new bucket.


19. How many entries you can store in HashMap? What is the maximum limit? (answer)
There is no maximum limit for HashMap, you can store as many entries as you want because when you run out of the bucket, entries will be added to a linked list which can support an infinite number of entries, of course until you exhaust all the memory you have.

Btw, the size() method of HashMap return an int, which has a limit, once a number of entries cross the limit, size() will overflow and if your program relies on that then it will break.

This issue has been addressed in JDK 8 by introducing a new method called mappingCount() which returns a long value. So, you should use mappingCount() for large maps. See Java SE 8 for Really Impatient to learn more about new methods introduced in existing interfaces in JDK 8.

Top 10 Java HashMap Interview Questions and Answers


21. What is the difference between capacity and size of HashMap in Java? (answer)
The capacity denotes how many entries HashMap can store and size denotes how many mappings or key/value pair is currently present.


21. What will happen if two different keys of HashMap return same hashcode()? (answer)
If two keys of HashMap return same hash code then they will end up in the same bucket, hence collision will occur. They will be stored in a linked list together.
 */

}
