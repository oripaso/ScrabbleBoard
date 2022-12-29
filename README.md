# ScrabbleBoard

In this project I built the game Book Scrabble - similar to the game Scrabble the players will have to put together words that intersect with
each other like in a crossword puzzle and score points. 
However, the legal words are not all the words in the dictionary
English, but only words that appear in the books chosen for the game.
In this section, a generic server will be built in stages that will allow the user to play against the server.

Later I will implement the logic of the word search in the book dictionary. I would like to make sure that my solution is scalable - that is, even when the number of books and / or the number of customers requesting service at the same time will increase, my solution will still work efficiently without a significant increase in resources; The increase in resources should
Be linear in relation to the size of the problem I'm trying to solve. The books are given as text files. Imagine that for every query regarding the existence of a certain word we would have to search for it in all the files. It would require a lot of I/O operations and therefore not scalable.
Imagine that we store all the words in >HashSet<String. It is better to search in memory (RAM) than on disk, however, very quickly (along with the growth of the problem) I may run out of space. The computer will enter the process of trashing (exchange of pages between the RAM and the disk) and once again the performance will decrease until the possible collapse of the server.
That's why my dictionary will use several filters:
1. Cache Manager - which will keep in memory the answers to the most common queries. The search in it will be in O(1) time and its size will be fixed according to a parameter that I define. Thus, given a query, I will quickly check what the answer is. If the answer exists, then I will return it. Otherwise, I will pass the question to the next filter.
2. Bloom Filter - an efficient and very economical algorithm on the spot, which knows how to say with absolute certainty whether a word is not found in the dictionary of books, and with as high a probability as we like whether a word is found.
3. If the user nevertheless chooses to challenge the dictionary, thinking that the dictionary was wrong and the word is actually not found, then an I/O based search will be performed. The rules of the game will fine the challenger with points if he bothered the server for nothing, or they will give him a bonus if he was right.
In any case, when an answer comes back I will update the cache manager to save unnecessary searches.
