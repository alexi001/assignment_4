public class InvertedTriangle{
    public static void main(String args[]) {
        for (int i= 5; i >= 1; i--) { 
            for (int j = 0; j < 5 - i; j++){
                System.out.print(' ');
			}
            for (int j = (2 - i); j < (2 - i) + (2 * i - 1); j++){
                System.out.print('*');
			}
            System.out.print('\n');
        }
	}
}