// https://leetcode.com/problems/angle-between-hands-of-a-clock/
class Solution {
    public double angleClock(int hour, int minutes) {
      // 12 hr = 360 degree, 1hr = 30 degree, 1minute = 30/60
      // 60 min = 360 degree, 1 min = 6 degree
        double hr = ((hour % 12) * 30) + ((double)minutes/60 * 30);
        
        double min = (minutes * 6);
        
        double angle = Math.abs(hr - min);
        
        if(angle > 180){
            angle = 360.0 - angle;
        }
        return angle;
    }
}
