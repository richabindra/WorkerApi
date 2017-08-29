This plugin utilizes the workerApi concept.
Two plugins exist to compare the benefits :
    one uses workerApi and 
    the other uses exec property of the project 

```
Note: Upgrade to gradle version 4.1
```

In both plugins, we have three tasks
A, B and C
    A
    /\
   /  \
  B    C
  
  A depends on B and
  A depends on C
  
  A prints numbers 1 to 50
  B prints number 51 to 100
  C prints numbers 101 to 150
  
  
*********** To run the plugins **************

For worker Api plugin:
    cd into workerApi directory
    run " gradle A"
    
B and C should execute in parallel and print numbers 51 to 150 in random orders
then A should print numbers 1 to 50 after B and C have finished



For non worker Api plugin ( using exec) :
cd to workerApi/consumer
run : gradle uploadArchives

cd to ../plugin
run: gradle A

Here, numbers 51 to 100 are printed in sequential order and then 1 to 50 are printed
    
    