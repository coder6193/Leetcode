/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval int1,Interval int2){
                return int1.start-int2.start;
            }
        });
        
        //iterate through the list
        for(int i=0;i<intervals.size()-1;){
            if(intervals.get(i).end>=intervals.get(i+1).start){
                Interval s=intervals.get(i);
                s.end=Math.max(s.end,intervals.get(i+1).end);
                intervals.set(i,s);
                intervals.remove(i+1);
            }
            else{
                i++;
            }
        }
        
        return intervals;
    }
}

/*
 Questions to ask:
 1.
 Mistakes done:
 1. Don't know how to write comparator function. Here are the artcles explaining the same
 https://www.geeksforgeeks.org/comparator-interface-java/
 https://stackoverflow.com/questions/4018090/sorting-listclass-by-one-of-its-variable
 C is comparator.
 2.set, get and remove functions in List. remove removes at an index and also at object.
 3.writing the function to find the new end time correctly. intervals[i].end= Math.max(intervals[i+1].end,intervals[i].end).
 
 
 Other optimal solutions:
 All top answers followed the same approach
 
 */