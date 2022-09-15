class StarPattern{

     static void Pattern(int num) {
         for (int i = 1; i < num; i++) {
             for (int j = num - i; j > 1; j--) {
                 System.out.print(" ");

             }

             for (int j = 0; j < i; j++) {
                 System.out.print("* ");

             }
             System.out.println();


         }

     }
         public static void main(String[]args){
             int n = 6;
             Pattern(n);

         }
     }