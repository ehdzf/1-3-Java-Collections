# Java Collections

## Level 1

### Task 1:

Goal: create a simple array list, extract duplicates converting it to a hash set and use iterators methods.

- 🏃`levelone.taskone.Main` to run the program
    - Creates a new Month repo, with eleven months.
    - Add August twice to the list.
    - Displays the list's length.
    - create a Hashset from the list.
    - display the set's length.
    - display the set's unordered content.

### Task 2:

Goal: create a list with integers, then create a new one with the same items in reversed order using iterators

- 🏃`levelone.tasktwo.Main` to run the program.
    - creates an ordered list with integers from 0 to 9.
    - creates another list inserting one by one the items of the first list in the beginning of the new list (reversed
      order).
    - prints both original and inverted list

### Task 3:

Goal: Read a file and convert data into a hashmap, iterate that hashmap with a simple console game and log the results
into another file.

- 🏃`levelone.taskthree.Main` to run the program.
    - Reads the content of countries.txt.
    - Create a collection containing kv pairs of country / capital.
    - Creates a game:
        - Ask user's name.
        - Prompt the user to introduce the capital of 10 random countries.
        - Creates a users.log file if it doesn't exist.
        - Append the user's name and score into the user.log file.

## Level 2

### Task 1:

Goal: create Restaurant class and a collection that does not allow duplicates (by both, name and rating). you can have
multiple names with different ratings and viceversa.

### Task 2:

- 🏃`levelone.Main` to run the program
    - Prompt user to create 5 restaurants (name and rating privided by cli).
    - Display the sorted list of unique restaurants sorted descending by name and rating.
