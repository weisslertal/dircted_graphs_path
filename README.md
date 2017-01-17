Author: Tal Weissler

This program reads a directed graph from a text file. when a search word is entered (that appears in the graph) it prints all possible termination nodes from that word  and the probability of getting to them. probabilities are calculated according to the weights.

Explenation of what a directed graph is and of basic related terms (such as nodes and edges):
http://mathinsight.org/definition/directed_graph


Input:

The input will be a text file. Change the variable "fileName" to the desired file name.
The file describes the edges of the graph. It is formatted as a simple text file where each line describes a single edge using a colon-delimited format as such:

ORIGINATING_WORD:WEIGHT_NUMBER:TERMINATING_WORD

For example:       someWord:1:anotherWord

Restrictions: the weights have to be non-negative numbers but don't have to be integers (1.5384 is allowed).
The words can contain all keys including whitespace, except for the string "Not getting to a termination node".
The input search word has to be a word that exists in the graph for the program to compute a proper output.

assumptions about the input: The input file is in the specified format. The weight contains only digits (and the decimal point and the minus sign). 


Output:

The program prints every possible termination node (nodes from which there is no outgoing edge) that can be reached from the starting node (chosen by entered search word). The program also prints the chances (in percentage) of getting to each termination node assuming a traveler will travel the graph by selecting an outgoing edge in a weighted (according to the edge weight)uniformly distributed random selection.

in case a termination node is inserted as input, that word will be printed with the probability of 100%. 


Assumptions:

1. the graph is a single directed graph (the arrows are one sided).

2. Bigger weight means higher probability.

3. In each "trip" the traveler takes, every arrow can only be traveled once. 
This results in possible routs that don't end in a termination node (in case of loops in the graph). In that case, the program will print "Not getting to a termination node" as one of the words along with the probability of getting stuck (if there are a few routs that end in getting stuck, the probability will be the sum of all of them).


Example:

For the input file:

	dad:1.1234567:mom
	dad:3:child
	child:5:sister
	child:10:brother/!*~
	sister:1:child
	
And input search word:

	dad
	
The output will be:

	termination word: mom, probability: 27.245507391892826 %
	termination word: Not getting to a termination node, probability: 8.083832512011908 %
	termination word: brother/!*~, probability: 64.67066009609526 %


Problems with the current specification:

The main problem with the current specification is how to deal with loops in the graph. If the traveler can go through every arrow as many times as he wants, then he could get stuck in an infinite loop. On the other hand, if he can't go through an arrow twice, then he would end his trip in a node which is not a termination node. There are 2 options for that - printing a node that isn't a termination node, or having an option of "getting stuck" and not reaching a termination node.
In this case I chose the option that the traveler can "get stuck", but usually I would choose the option that suits the application I'm using the program for.



