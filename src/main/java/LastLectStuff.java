public class LastLectStuff {
    private static int add2 = 1;
    public static void main(String[] args) {

        int add1 = add(10, 2);
        int[] additionResults = {add1, add(5, 5), add(6, 5)};
        int[] subtractionResults = {subtract(4, 5), subtract(10, 2)};

        for (int i = 0; i < additionResults.length; i++){
            System.out.print(additionResults[i] + "-");
        }

        for (int element :
                additionResults) {
            System.out.println(element);
            if (element % 2 == 0){
                System.out.println("EVEN");
            }
            else {
                System.out.println("ODD");
            }
        }
    }

    public static int add(int x, int y){
        add2 = 1;
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }
}
