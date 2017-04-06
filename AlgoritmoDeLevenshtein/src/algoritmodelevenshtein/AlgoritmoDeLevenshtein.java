package algoritmodelevenshtein;

/**
 *
 * Criado 06/04/2017 ás 16:21:17 por ThLewis
 */
public class AlgoritmoDeLevenshtein {
    
    private int[][] tab;
    private char[] ch1;
    private char[] ch2;
    
    public AlgoritmoDeLevenshtein(String str1, String str2){
       ch1 = str1.toCharArray();
       ch2 = str2.toCharArray();
       tab = new int [ch1.length+1][ch2.length+1];
    }
    
    public int calcularDistancia(){
        
        for (int i = 0; i < tab[0].length; i++) {
            tab[0][i] = i;
        }
        
        for (int i = 0; i < tab.length; i++) {
            tab[i][0] = i;
        }
        
        for (int i = 1; i <= ch1.length; i++) {
            for (int j = 1; j <= ch2.length; j++) {
                if (ch1[i-1] == ch2[j-1]) {
                    tab[i][j] = tab[i-1][j-1];
                } else {
                    tab[i][j] = 1 + minimo(tab[i-1][j],tab[i][j-1],tab[i-1][j-1]);
                }
            }
        }
        return tab[ch1.length][ch2.length];
    }
    
    public int minimo(int n1, int n2, int n3){
        int m = Math.min(n1, n2);
        return Math.min(m, n3);
    }
    
    public void printarTabela(){
        System.out.println("");
        System.out.println("Tabela do Algoritmo");
        for (int i = 0; i < ch1.length+1; i++) {
            for (int j = 0; j < ch2.length+1; j++) {
                System.out.print(" " + tab[i][j] + " |");;
            }
            System.out.println("");
            for (int j = 0; j < ch2.length+1; j++) {
                System.out.print(" -  ");
            }
            System.out.println("");
        }
    }
    
}
