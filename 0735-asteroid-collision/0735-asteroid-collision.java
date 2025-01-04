class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int no:asteroids){
            boolean destroyed = false;
            while(!stk.empty() && stk.peek()>=0 && no<0 ){
                if(stk.peek()<Math.abs(no)){
                    stk.pop();
                }
                else if(stk.peek()==Math.abs(no)){
                    stk.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }

            
            }
           if(!destroyed)stk.push(no);
            
        }
      Object[] arr = stk.toArray();
int[] result = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    result[i] = (Integer) arr[i]; // Cast each element to Integer
}
return result;


    }
}
