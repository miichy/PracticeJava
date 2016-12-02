package NonOverlappingIntervals;

/**
 * [[1,100],[11,22],[1,11],[2,12]]  expected 2
 * @author liuke
 *
 */
public class Solution {

	public static void main(String[] args) {
		Solution s  = new Solution();
		Interval one = new Interval(1,2);
		Interval two = new Interval(1,2);
		Interval three = new Interval(1,2);
		Interval four = new Interval(2,3);
		Interval[] intervals = {one,two,three,four};
		System.out.println(s.eraseOverlapInterval(intervals));
	}
	
	public int eraseOverlapInterval(Interval[] intervals){
		if(intervals == null || intervals.length == 0)
			return 0;
		
		int firstStart = intervals[0].start;
		int firstEnd = intervals[0].end;
		int result = 0;
		
		for(int i = 1;i < intervals.length;i++){
			Interval tmp = intervals[i];
			if(firstEnd == tmp.start){
				firstEnd = tmp.end;
			}else{
				result += 1;
			}
		}
		
		return result;
		
	}

}
