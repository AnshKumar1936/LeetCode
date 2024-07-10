class Solution {
    public int passThePillow(int n, int time) {
        int ct=0;
        boolean dir = false;
        int person = 1;

        while(ct<time){
            if(dir==false){
                person++;
            }
            else{
                person--;
            }
            if(person==n || person==1){
                dir =! dir;
            }
            ct++;
        }
    return person;
    }
}
