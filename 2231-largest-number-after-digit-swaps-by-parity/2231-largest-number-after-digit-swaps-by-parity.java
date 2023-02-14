class Solution {
    public int largestInteger(int num) {
        /*
        List<Integer> numList = new ArrayList<>();
        while (num != 0) {
            numList.add(num % 10);
            num = num / 10;
        }
        List<Integer> even = numList.stream().filter(x -> x % 2 == 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> odd = numList.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        String result ="";
        int evenIndex=0, oddIndex=0;
        for(int i=0; i< numList.size(); i++){
            int x = numList.get(i);
            if(x%2==0){
                result += even.get(evenIndex);
                evenIndex++;
            }else{
                result += odd.get(oddIndex);
                oddIndex++;
            }
        }
        return Integer.parseInt(result);
        */
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();
        int value = num;
        while(num != 0){
            if((num % 10) % 2 == 0){
                even.add(num % 10);
            }
            else odd.add(num % 10);

            num = num / 10;
        }

        StringBuilder sb = new StringBuilder();
        num = value;
        while(num > 0){
            int cur = num % 10;
            if((num % 10) % 2 == 0)
                sb.insert(0, even.poll());
            else
                sb.insert(0, odd.poll());
            num /= 10;
        }
        return Integer.parseInt(sb.toString());
    }
}