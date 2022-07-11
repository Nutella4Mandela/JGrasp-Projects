# JGrasp-Projects
These are small projects that I had to do in one of my java classes! It was challenging and a good learning process for me! It's nothing too
crazy or fancy, but it helped me learn code in a universal way. 

# Hello World
Of course, a fun way to start with some language I never used before is printing out a "Hello World" to it. Nothing special...

![This](/JGraspImages/HelloWorld.PNG)

# IsEven
This one gives you an option to enter an integer and says whether the answer you put is either an even number or an odd number. I made a 
boolean method that checks if the number is equal to an even number. How I did this is by using the input that you made and used the % sign
by 2 to yield any remainders. If the remainder is equal to 0, then it returns true, making it even. If not, then it returns false, making it odd. 
However, I also made it so that it can also check if it's an actual integer and not a letter. If it is a letter, then the program terminates itself. I also 
did this with negative integers.

![This](/JGraspImages/IsEven.PNG)

# Speed
This project calculates the average speed depending on the distance and time using miles and hours respectively. I've used the JOptionPane for
this one to make it look a little nicer. I gave the user two questions: How many miles have you driven and How many hours did it take to get to
your destination? I then calculated the result by using your distance and dividing it by your time, getting your average speed. In this case, I
drove 6 miles in 5 hours(that is really slow), giving me an average speed of 1.2. It then prompts you to try again or not. If you don't want to try 
again, the program terminates itself, but if you do, it goes back to the first question. 

![This](/JGraspImages/Miles.PNG)

![This](/JGraspImages/Hours.PNG)

![This](/JGraspImages/Speed.PNG)

![This](/JGraspImages/TryAgain.PNG)

# Temperature
This project converts preset temperature from Fahrenheit to Celsius in a table. It's a pretty simple project where I was trying to understand how
to use for loops properly. Of course, I used a formula that calculates Celsius from -20F to 220F. Every time it's done with one of them, the 
fahrenheit goes up by 10. I used a for loop for all of it. Nothing groundbreaking, of course, but I did well with what I had.

![This](/JGraspImages/Temp.PNG)

# Book
In this project, I used two java files! The first one prints out information using constructors that prints out the ISBN, the author, the title of the 
book, the price, the edition, and the pubCode and turn them into strings and integers using getters and setters. The second java file makes an 
object that has all the information of the book using the constructor that I made from the first file. I also made it so that the price can be 
changed from your input using the setter from the first file. The first option asks if you want to change the price. If you do, then it'll ask for how 
much and then rinse and repeat for the other two books. I also changed the font of the Option Panel since I wanted to know how to do it. 

![This](/JGraspImages/BookQ.PNG)

![This](/JGraspImages/BookPrice.PNG)

![This](/JGraspImages/Book.PNG)

# Inventory
This project is relatively the same as the Book project, but I took some liberties into adding way more. This time, I made 3 files and a text file. 
The first one is the same as the first Book file, but the only difference is that I'm adding a quantity and making some changes if the user makes
an input. In the second file, I made an array that counts how many Book objects there are and updates them if there are any changes. The third 
one scans the text file with the reference of the Book class and checking how many there are in total. I've also made a code to check if the 
program can check if there is a ISBN that equals 013478796X. Once it does, it gives you a prompt similar to the Book project. I also added a
quantity question to see if the user wants to change the quantity of the book. 

![This](/JGraspImages/Inventory.PNG)

![This](/JGraspImages/Price.PNG)

![This](/JGraspImages/Quantity.PNG)

# Fleet
In this project, I've used four java files and one text file. In the first file, I made a class called ship that has a name and the year that it was built
in. I've used getters and setters for the two categories and also if there was a name change. The second file and the third file uses the
CargoShip and the CruiseShip respectively, extending from the Ship class in the first file. In these files, there's a maximum and a
minimum(trying to make it a negative, basically) of how much cargo and how many passengers it can hold. I made a boolean for both if that
were to exceed the maximum or go through the minimum. If everything seemed to be in order, then it should print out what the name and 
year it was built and how much cargo or passenger it has using the toString method. The text file says what is the ship's name and what year it
was built and if it is a cargo or a cruise ship. It also loads or unloads any passenger or any cargo from the ships, making changes. The last file
tries to scan the text file from your input and makes some changes. It uses that information, makes them into an array and prints the results. 

![This](/JGraspImages/FleetQuestion.PNG)

![This](/JGraspImages/TextFleet.PNG)

![This](/JGraspImages/Fleet.PNG)







