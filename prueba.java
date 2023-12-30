public class prueba {
    public static void main(String[] args){
        int[][] prueba = new int[5][6];

        System.out.println(prueba.length);

        for(int i = 0; i < prueba.length; i++){
            for(int j = 0; j < prueba[i].length; j++){
                prueba[i][j]=1;
            }
        }

        for(int i = 0; i < prueba.length; i++){
            for(int j = 0; j < prueba[i].length; j++){
                System.out.print(prueba[i][j]);
            }
            System.out.println();
        }
    }
}
