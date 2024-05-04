class Solution {
    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int l1 = v1.length;
        int l2 = v2.length;

        int i = 0;
        while(i<l1 && i<l2) {
           int value1 = Integer.parseInt(v1[i]);
           int value2 = Integer.parseInt(v2[i]);

           if(value1 > value2) return 1;
           else if(value2 > value1) return -1;
           else {
               i++;
           }
        }
        while(i<l1) {
            int value = Integer.parseInt(v1[i]);
            if(value!=0) return 1;
            i++;
        }
        while (i<l2) {
            int value = Integer.parseInt(v2[i]);
            if(value!=0) return -1;
            i++;
        }
        return 0;
    }
}