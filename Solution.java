class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            temp.put(arr[i], temp.getOrDefault(arr[i],0)+1);
        }
        int max = -1;
        for(int key : temp.keySet()){
            if(key == temp.get(key)){
                max = Math.max(max,key);
            }
        }
        return max;
    }
}
