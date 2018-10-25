# Coin-Calculator

## Intro ##
This is a coin calculator program which asks the user for a quantity of money, entered as a floating-point number, and then computes how many dollar coins, half-dollars, quarters, dimes, nickels, and pennies (in that order!) would be needed to add up to this quantity.  

## Example ##
This is an example of the project ran in Netbeans:

![lab2b pic](https://user-images.githubusercontent.com/44477560/47523626-183d5c00-d85e-11e8-902e-c56c3ba6dc77.PNG)

## Project Summary ##

In this assignment I was tasked with creating a coin calculator that computers the number of Dollars, Half-dollars, Quarters, Dimes, Nickles, and Pennies in a given number. This has practical use in everyday life. Imagine needing exact change when ordering something at a drive-thru. This program was a quick and simple one to code with no extra classes needed to make it work. This program takes us of a Scanner to ask for the input from the user. The user then puts in the number they desire (ex: 3.41) and the program then computes how many of each coin type is needed to equal that amount. This code requires less than ten variables to work properly. When the amount is entered the program takes the number entered and multiplies it by 100 so that it’s a whole number rather than a floating point number. It then starts with the dollar amount and breaks the number down from there. Starting from dollar it divides the number by 100 to get the total dollars used in the number. Next it takes the modulus of that number by 100. Then the number is divided by 50 to get the half-dollar amount. Next, it takes the modulus of 50. Then, it goes on to the quarter amount by dividing by 25 to get the amount of quarters. Then, the number is modulus by 25 to move to the dimes. The dimes amount is found by dividing by 10 then then taking the modulus of 10 to continue to the nickels. The nickels are found by diving by five and the modulus of five to continue to the pennies. The pennies are the leftover amount after the number is broken down. The reason the modulus is take by each value is to break it down so the next value can correctly be chosen.  In the end the number is printed to the screen in the number of each coin type needed to get the amount typed in.
The overall point to this assignemnt was to create a program that is useful in eeryday life while getting use to the common methods in Java and how to use them properly.
