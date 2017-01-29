# Stopwatch tasks by Wanchanapon Thanwaranurak (5710546607)

I ran the tasks on a MacBook Air (13-inch, Early 2015) , and got these results:

Task                                          | Time
:---------------------------------------------|-------------:
Append 50,000 chars to String                 | 2.276261 sec
Append 100,000 chars to String                | 2.849177 sec
Append 100,000 chars to StringBuilder         | 0.002406 sec
Add 1 billion double primitives using array   | 1.208155 sec
Add 1 billion double objects using array      | 6.214105 sec
Add 1 billion BigDecimal objects using array  | 10.759961 sec

## The result of SpeedTest tasks

The result                                                           |
:--------------------------------------------------------------------|
Append 50,000 chars to String                                        |
                                                                     |
final string length = 50000                                          |
                                                                     |
Elapsed time 2.276261 sec                                            |
                                                                     |
                                                                     |
Append 100,000 chars to String                                       |
                                                                     |
final string length = 100000                                         |
                                                                     |
Elapsed time 2.849177 sec                                            |
                                                                     |
                                                                     |
Append 100,000 chars to StringBuilder                                |
                                                                     |
final string length = 100000                                         |
                                                                     |
Elapsed time 0.002406 sec                                            |
                                                                     |
                                                                     |
Sum array of double primitives with count=1,000,000,000              |
                                                                     |
sum = 2.500005E14                                                    |
                                                                     |
Elapsed time 1.208155 sec                                            |
                                                                     |
                                                                     |
Sum array of Double objects with count=1,000,000,000                 |
                                                                     |
sum = 2.500005E14                                                    |
                                                                     |
Elapsed time 6.214105 sec                                            |
                                                                     |
                                                                     |
Sum array of BigDecimal with count=1,000,000,000                     |
                                                                     |
sum = 250000500000000                                                |
                                                                     |
Elapsed time 10.759961 sec                                           |
                                                                     |

## Explanation of results

* Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
  * Because appending 100,000 chars more than appending 50,000 chars, it so twice.

* Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
  * Because the String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation.

* Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
  * double is faster because double is a primitive data type but Double objects take longer than double primitive because a Double object is actually a wrapper of a double primitive. Wrappers of primitives are not mutable (immutable). So when using Doubles, Java has create a new Double object. And BigDecimals is also a hard work for the computer, because they are immutable too. A new BigDecimal object has to be created every time that we made any changes to an existing BigDecimal object.

* why is there such a big difference in the time used to append chars to a String and to a StringBuilder?
  Even though we eventually "copy" the StringBuilder into a String so the final result is the same.
  * The String is a mutable, when append a new chars. The String will create a new Object but The StringBuilder have a array chars in Object, when append a new chars; the StringBuilder can ready to append if can't append the StringBuilder will create a new array chars size is 2*value.length + 2 and copy value in old array to new array then append a new chars.

* why is there a significant difference in times to sum double, Double, and BigDecimal values?
  * Because double is a primitive data type but Double and BigDecimal are mutable (immutable).
