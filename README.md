# SAIT-CMPP-269-A1
SAIT Comp. Programming Essentials (CMPP-269-B) - Assignment 1 (3 July 2021)

Generare Promocodes: 
For every $100 purchased, customers will receive a $10 promo code for a future purchase. These promo codes need to be readable, self-verifying and difficult to counterfeiters to generate. The rules for generating the promo codes is as follows:  
•	promo codes will be 5 characters long  
•	promo code will be all uppercase  
•	1 character will be a consonant or a Y  
•	2nd character will be vowel (AEIOU)  
•	3rd character will be a consonant  
•	4th character will be vowel (AEIOUY)  
•	5th character is an alphabetic check digit  
  
Here is the process to calculate the check digit:  
•	take characters 1 and 3 and add them to the sum  
•	take 2nd character value * 2 and add it to the sum  
•	take 4th character value *2 and add it to the sum  
•	calculate the reminder of the sum  divided by 26  
•	take the reminder and add it to the UNICODE for ‘A’  
