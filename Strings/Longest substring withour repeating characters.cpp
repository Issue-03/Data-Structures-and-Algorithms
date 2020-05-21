int SubsequenceLength (string input) 
{
    int n = input.length(); 
  
    int result = 0; 

    vector<int> lastIndexOf(256, -1); 
  
    int i = 0; 
  
    for (int j = 0; j < n; j++) { 
  
        i = max(i, lastIndexOf[input[j]] + 1); 
  
        result = max(result, j - i + 1); 
  
        lastIndexOf[input[j]] = j; 
    } 
    return result; 
    
}