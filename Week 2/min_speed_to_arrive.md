```java
class Solution {
    public boolean canReach(int[] dist,double hour,double speed){
        double time=0;
        for(int i=0;i<dist.length-1;i++){
            time+=Math.ceil((double)dist[i]/speed); }
            time+=((double)dist[dist.length-1]/speed);
            return time<=hour;

    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;int high=(int) Math.pow(10, 7);
        int answer = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (canReach(dist,hour,mid)) {
            answer = mid;
            high = mid - 1; 
        } else {
            low = mid + 1;
        }
    }
    return answer;
}
        
    }
```
