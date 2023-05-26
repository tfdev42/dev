package more;

class TreeMultipl {

    public static void treeViewOfMultiplication(int multiplicant) {
        //int cnt = multiplicant;
    
        for (int i=1; i<=10; i++){
            int result = i * multiplicant;
            System.out.printf("%d x %d = ", i, multiplicant);
            if (i > 1){ //TODO: give out the correct number of multiplications
                for(int n=1; n<=i; n++){
                    System.out.printf("%d + ", multiplicant);
                };           }
            System.out.printf("%d = %d%n", multiplicant, result);
        }
    }

    
}


