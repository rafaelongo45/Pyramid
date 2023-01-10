public class App {
    public static void main(String[] args) throws Exception {
        pyramid(9);
    }

    public static void pyramid(int x){
        for(int i = 1; i <= x; i++){
            String myStr = "";
            for(int j = 1; j <= i; j++){
                myStr += i;
            }
            System.out.println(myStr);
        }
    }
}
