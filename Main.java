import java.util.Arrays;

class DS {
    public static void main(String[] args) {
        String[] array1 = new String[1000000];
        Arrays.fill(array1, "nemo");
        findNemo(array1);
        findNemo(array1);
    }

    public static void findNemo(String[] array){
        long startTime = System.nanoTime();
        for(int i=0;i<array.length;i++){
            if(array[i] == "nemo"){
                break;
            }
        }
        System.out.println("It took " + (System.nanoTime() - startTime) + " nano seconds to find Nemo.");
    }
}
