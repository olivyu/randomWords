Linked List - Spring 2014

This assignment is to create a linked list class on Java.

This program will generate and manage random words. When the program first begins, ask the user how many words he wants to see. The number he chooses will be between 15 and 240. Then your program will generate that many 5-character “words” randomly – lowercase only. The random words will be stored in a linked list – alphabetically. Then the words will be displayed on the screen lined up nicely – 12 columns, and as many rows as needed. 

After the words are displayed, there will be a single line at the bottom that has all the possible commands. 

The commands are (D)elete, (A)dd, (Q)uit. After the command is performed, the screen will re-display all the words in the format listed above.

If (D)elete is selected, the program will ask the user to enter the word he wants to delete. If the word is in the list, the program will delete it. If the word is not in the list, the program will display an error message.

If (A)dd is selected, the program will generate a new random word and insert it into the correct location in the linked list. The new word will be identified when the words are re-displayed (underlined, starred, bold, brackets – you decide how to display the new word. The new word will only be identified as a new word immediately after it is added.


Example screen shot:

> abded   abehf   acopa   anerd   bdolj   belkd   elopd   frlok   fkijd   hikld   jkled   lkone	money   nifty   opens   qjild   sheyd   talks   weold   works   xikse   zebra

>(A)dd	(D)elete	(Q)uit

> A

> abded   abehf   acopa   anerd   bdolj   belkd   elopd   frlok   fkijd   hikld   jkled   lkone	money   nifty   *north  opens   qjild   sheyd   talks   weold   works   xikse   zebra

>(A)dd	(D)elete	(Q)uit

>D
>What word do you want to delete? 
>talks
	
> abded   abehf   acopa   anerd   bdolj   belkd   elopd   frlok   fkijd   hikld   jkled   lkone	money   nifty   north   opens   qjild   sheyd   weold   works   xikse   zebra

>(A)dd	(D)elete	(Q)uit
