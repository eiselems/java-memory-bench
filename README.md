# java-memory-bench
Just a quick test to determine java's efficiency to allocate 2 dimensional arrays

# Following steps are undertaken:
1. Determine used RAM by the JVM
2. Allocation of a NxN dimensional array (N is specified by INDEX_SIZE inside the Memtest.java file).
3. Determine used RAM after allocation
4. Output measurements and output theoretical required RAM

NOTE:
Ensure to give the programm enough heap memory by using e.g. -Xmx12g

Run from project root:
```
cd src  && javac memTest/Memtest.java && java -Xmx12g memTest.Memtest && cd .. 
```

Sample output:
```
Before: 1.600174
After: 9541.839
Diff: 9540.238
Optimal size of 50000 x 50000 2dimensional array is 9536,743164
```