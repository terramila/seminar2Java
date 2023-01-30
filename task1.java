    package seminar2;

    import java.util.Arrays;
    import java.io.File;
    import java.io.PrintWriter;
    import java.io.IOException;

    public class task1 {
        /**
         * @param args
         */
        public static void main(String[] args) {
            int [] mas = {11, 3, 14, 16, 7};
            try {
            File file = new File("newFile.txt");
            
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;
                        
                        
                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;


                    }
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(mas[i+1]);
                    pw.close();
                    
                }
                
            }
        } catch(IOException e){
            System.out.print("Error:" +e);

        } 
    
            System.out.println(Arrays.toString(mas));
        }
    }
