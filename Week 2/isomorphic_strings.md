```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[1000];
        int[] indexT = new int[1000];
        int lenS = s.length();
        int lenT= t.length();
        if (lenS != lenT) return false;
        for (int i = 0; i < lenS; i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
```