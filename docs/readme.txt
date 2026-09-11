9/10/2026
Krisha Joshi

This program asks users to guess the next words of the sonnet.

To run this program, start the Main class

The program prints out the sonnet and stops at a random word, printing a series of underscores instead.
The program prompts the user for the next word. Once the user responds, the program will dictate whether the user was right or wrong.
It will restart the sonnet, stopping at a different word. This will go on until the user gets three words correct or three words incorrect.

Core pseudocode:

Let correctCount be an int
Let wrongCount be an int

while correctCount < 3 and wrongCount < 3:
    choose random word from the sonnet
    print sonnet from beginning up to random word

    print "_________" and stop printing sonnet after

    ask user to enter missing word

    if user answer is correct:
        print "Correct"
        correctCount+=1
    else:
        print "wrong"
        wrongCount+=1
        Print correct word

End while loop

if correctCount == 3:
    print "you were able to guess all 3 words"
else:
    print "you were not able to guess all the words"




