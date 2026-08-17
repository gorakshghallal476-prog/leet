class Solution {
    public double angleClock(int hour, int minutes) {
      double angle=30*hour-5.5*minutes;
      if(angle<0)
        angle=angle*(-1);
    if(angle > 180)
       return 360-angle;
    return angle;
     

    }
}