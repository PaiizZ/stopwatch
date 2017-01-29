# Stopwatch tasks by Wanchanapon Thanwaranurak (5710546607)

I ran the tasks on a MacBook Air (13-inch, Early 2015) , and got these results:

Task                                          | Time
:---------------------------------------------|---------------:
Append 50,000 chars to String                 | 2.276261 sec
Append 100,000 chars to String                | 2.849177 sec
Append 100,000 chars to StringBuilder         | 0.002406 sec
Add 1 billion double primitives using array   | 1.208155 sec
Add 1 billion double objects using array      | 6.214105 sec
Add 1 billion BigDecimal objects using array  | 10.759961 sec

## The result of SpeedTest tasks

> Append 50,000 chars to String 
> final string length = 50000 
> Elapsed time 2.276261 sec

Append 100,000 chars to String 
final string length = 100000 
Elapsed time 2.849177 sec 

Append 100,000 chars to StringBuilder
final string length = 100000
Elapsed time 0.002406 sec

Sum array of double primitives with count=1,000,000,000
sum = 2.500005E14
Elapsed time 1.208155 sec

Sum array of Double objects with count=1,000,000,000
sum = 2.500005E14
Elapsed time 6.214105 sec

Sum array of BigDecimal with count=1,000,000,000
sum = 250000500000000
Elapsed time 10.759961 sec

## Explanation of results

* Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?


* Why is appending to StringBuilder so much different than appending to String? What is happening to the String?


* Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?

* why is there such a big difference in the time used to append chars to a String and to a StringBuilder?
  Even though we eventually "copy" the StringBuilder into a String so the final result is the same.

* why is there a significant difference in times to sum double, Double, and BigDecimal values?
