// Day 1 //09:21PM //19/06/26

Optimal solution calculate based on ---> time and space complexity.

how to judge an algo

Time Complexity

&#x09;\* The time to complete the task increases linear is called Big O or O(N) (ex: Find card in random cards)

&#x09;\* By eliminating the inputs to complete the task is called Logarthmic or O(Logn) (ex: Find a card in sorted cards)

&#x09;\* If the input sorted that would time complexity is Constant or O(1)

&#x09;\* Loop with in a loop N square or O(N^2)

&#x09;\* Loop with in a loop with in a loop O(N^3)

&#x09;\* The input to generate output \* 2  O(2^n)

&#x09;\* Permutation  Factorial or O(n!)



Big O

&#x09;\* The algo is run order of growth rate

&#x09;		  (O          Size)



&#x09;EXAMPLES -> getFirstElement(int \[] arr){

&#x09;		return arr\[0];

&#x09;		}

&#x09;	--> binarySearch(int \[] arr , int target){

&#x09;		//Logarthmic O(Logn)}

&#x09;	--> LinearSearch(){

&#x09;		//O(n) or linear}

&#x09;	--> MergeSort(int \[] arr , int left , right){

&#x09;		O(nLogn)}

&#x09;	--> printPairs(){

&#x09;		//O(N^2)}

&#x09;	--> fib(int n){

&#x09;		//O(2^n)}

&#x09;	--> fact(){

&#x09;		//O(n!)}



Space Complexity

&#x09;\* The space is required to complete the task.





Data Structures -> **Linear** DS means where all the elements are sequence order

&#x09;		(Array - fixed size blocks accessing with index)

&#x09;		(Linked List - Dynamic DS have two items HEAD(points to 1st ele \[value | address of next element]  and TAIL\[Null]) shrink and grow based on the size.)

&#x09;		(Stack -LIFO last in 1st out )

&#x09;		(Queue - FIFO first in first out first come first server) (Both stack and queue follows the linear sequence)

&#x09;	--> **Non Linear** DS where any we didn't follow any sequence to follow the elements follows the hierarchical or network (Dynamic)

&#x09;		(Graph - Nodes and edges , connected graph , non connected graph)

&#x09;		(Trees - a root has children's ,hierarchical ,all the nodes are connected no cycles)	

&#x09;	--> **Hashed based** DS with we pick out the elements easy

&#x09;		(HashMap - key : value pairs there are some mathimatical formula if any value duplicate end of the same key value pair)

&#x09;		(HashSet - we store in value only)

&#x09;		





ARRAYS	

&#x09;\* Array is continous block of memory.

&#x09;\* fixed size , accessing by index starts from zero

&#x09;Time Complexity

&#x09;	Accessing : O(1)

&#x09;	Insertion : O(1) | worst O(n)

&#x09;	Delete : O(1) | O(n)

&#x09;	Traverser : O(n) 

&#x09;	Search : if elements are random (linear) or ele are sorted (binary) :O(logn)

&#x09;	Update : O(1)

&#x09;Benfits and Limitations

&#x09;	Random access : O(1) | Fixed Size 

&#x09;	Cache friendly	     | O(n) - insert and delete

&#x09;	easy to sort	     | Ineffecient for frequent modification

&#x09;	implement other DS

&#x09;When we Use

&#x09;	1. Implement other DS

&#x09;	2. caching

&#x09;	3. Graph or visited node

&#x09;	4. mathematical

&#x09;	5. coding patterns

&#x09;Multidimentional Array

&#x09;	\[\[],\[],\[]],

&#x09;	\[\[],\[],\[]]

&#x09;	2D ,3D ,4D



LeetCode Problem

&#x09;1.Two Sum - \[15,7,2,11] , target : 9 

&#x09;	sort the array - binary search  hash map

&#x09;2. Contains Duplicate (217)

&#x09;	sort the array - hashset

&#x09;3. Contains Duplicate || (219) hash map or hash set

&#x09;	

&#x09;	

&#x09;	    

&#x09;	

