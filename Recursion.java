public class Recursion {
    public int function(int x) {
        if(x == 1 || x == 2){
            return 1;
        } else {
            return (function(x -1) + function(x - 2));
        }
    }
}
