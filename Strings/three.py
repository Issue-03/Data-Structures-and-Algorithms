# function to check if palindrome
def checkIfPalindrome(str):
  n = len(str)
  if(n==1):
    return True;
  for i in range(n//2):
    if str[i] != str[-i-1]:
      return False;
  return True;

# function to print 3 palindromes
def parseThisString(str):
  for first in range(1, len(str) - 2):
    if checkIfPalindrome(str[:first]):
      for second in range(first+1,len(str)):
        if checkIfPalindrome(str[first:second]) and checkIfPalindrome(str[second:]):
          print(str[:first],str[first:second],str[second:],sep="\n")
          return
  print("Impossible")

# take input 
str = input();
parseThisString(str);