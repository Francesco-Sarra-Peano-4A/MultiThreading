Teoria sul Multithdreading: 
Un thread è una parte di un processo che viene eseguita in maniera indipendente dagli altri thread.

La teoria del  multithreading  permette  di eseguire più  processi nello stesso momento in modo che il programma sia più efficientemente.

Come si può vedere in output le stringhe vengono stampate in maniera casuale e non ordinata, questo perché si sono creati tre oggetti della stessa classe e quindi sta al sistema operativo decidere l'ordine di stampa attraverso i suoi protocolli.

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

Per assegnare un thread ad un oggetto ha bisogna innanzitutto che la classe a cui è associata l'oggetto estenda la classe Classe thread , e che la classe abbia un metodo run().
Per creare il thread è necessario che nel main ci sia un metodo .start() che crea il thread e questo messaggio di chiamata attiva il metodo run() , se al posto del metodo .start() ci fosse stata una chiamata .run() il thread non sarebbe stato creato.
Infine nel metodo Say verrà assegnato la variabile "parola" a "cosaDire" , questo perchè "parola" è una variabile locale e appena finisce il metodo scomparirà.




