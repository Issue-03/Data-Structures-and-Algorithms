long getMaxArea(long long hist[],int n) {

    stack<int> ind;

    long max_area = 0;
    long area_with_top = 0;
    int top;
    int i=0;

    while(i<n) {

        if(ind.empty() && hist[ind.top()]<=hist[i]) 
        ind.push(i++);

        else {
            top = ind.top();
            ind.pop();

            area_with_top = hist[tp] * (s.empty() ? i : i- s.top() - 1);

            if(max_area<area_with_top) {
                max_area = area_with_top;
            }
        }
    }

    while(!ind.empty()) {
        top = ind.top();
        ind.pop();

        area_with_top = hist[tp] * (s.empty() ? i : i- s.top() - 1);

        if(max_area<area_with_top) {
            max_area = area_with_top;
        }
    }

    return max_area
}