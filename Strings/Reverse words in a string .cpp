// Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
// Example:
// Input:
// 2
// i.like.this.program.very.much
// pqr.mno
//
// Output:
// much.very.program.this.like.i
// mno.pqr

void reverse(char* begin, char* end) 
{ 
    char temp; 
    while (begin < end) { 
        temp = *begin; 
        *begin++ = *end; 
        *end-- = temp; 
    } 
} 
void reverseWords(char *s) {
    
    char* word_begin = NULL; 
    char* temp = s; 
  
    while (*temp) { 
        if ((word_begin == NULL) && (*temp != '.')) { 
            word_begin = temp; 
        } 
        if (word_begin && ((*(temp + 1) == '.') || (*(temp + 1) == '\0'))) { 
            reverse(word_begin, temp); 
            word_begin = NULL; 
        } 
        temp++; 
    } 
  
    reverse(s, temp - 1);
    cout<<s;
}