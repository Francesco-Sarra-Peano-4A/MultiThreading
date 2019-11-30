Teoria sul Multithdreading: 

La teoria del  multithreading  permette  di eseguire più  processi nello stesso momento.

Questo esercizio permette di mandare per 10 volte le parole "HI" e "HELLO"  e in modo casuale :

esempio 1:
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hello
ciao
ciao
ciao
ciao
Hello
Hello
Hello
Hello
Hello
Hello
Hello
ciao
ciao
ciao
ciao
ciao
ciao
esempio 2: 
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hello
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
esempio 3:
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
ciao
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi

Succesivamente si introdotto un'altra classe di nome "say" che doveva eserre restituita in output sotto forma di stringa .
Questo medoto confronto a quello prima di "hi" e "hello" è più veloce e più facile da leggere perchè bisogna eseguire solo una classe invece che due . Infine la classe "say" avrà solo il metodo "run()" dove permette di restituire grazie a un ciclo for , 10 volte la parola cosaDire.

Nel main si usa il metodo .start perchè fa partire il Thread che esegue i metodi nel run .
Succesivamente si dichiare cosaDire che verrà usato nel metodo Say perchè l'attributo "parola" viene usata solo per quel metodo.


