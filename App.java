public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Telusko n=new Telusko();
        NumberP p=new NumberP();
        Pattern obj=new Pattern();
        n.PrintN();
        System.out.println();;
        p.number();
        obj.printPattern();
    }
}

class NumberP {
    public void number(){
        int k=5;
        for(int i=1;i<k;i++)
        {
            for(int j=1;j<k;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}

class Pattern {
    public void printPattern(){
        int n=15;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||i+j<10||i-j>6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.print("    ");
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n ||i>n/2&&j==n ||j-i>=(n-1)/2||i+j<10){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.print("    ");
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<(n-i)*2;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}

class Telusko {
    
    int n=10;
    public void PrintN(){
       for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                if(i==1||j==(n)/2){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            }
            System.out.print("  ");
            for(int j=1;j<=n;j++){

                if(j==1 || i==1 || i==n/2 || i==n){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            }
            System.out.print("  ");
            for(int j=1;j<=n;j++){

                if(j==1||i==n){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            }
            System.out.print("    ");
            for(int j=1;j<=n;j++){

                if(j==1&&i<n-1 ||j==n&&i<n-1||i==n&&j>2&&j<n-2){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            }
            System.out.print("    ");
            for(int j=1;j<=n;j++){

                if(i==1&&j>n/2 || j==n/2&&i==2 || j==n/2&&i==3 || j==n/2&&i==(n-1)/2||(i==n/2&&j>n/2&&j!=n) ||j==n&&i==n/2 ||j==n&&i==(n+1)/2 ||j==n&&i==6 ||j==n&&i==7 ||j==n&&i==8 ||(i==n-1&&j>n/2&&j!=n)){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            }
            System.out.print("    ");

            for(int j=1;j<=n;j++){

                if(j==1||i==n/2&&j==2||i+j==7 ||i-j==5){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            } 
            System.out.print("    ");

            for(int j=1;j<=n;j++){

                if(j==1&&(i>2&&i<n-1) ||i==n&&(j>2&&j<n-1)||j==n&&(i>2&&i<n-1)||i==1&&(j>2&&j<n-1)){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                } 
            } 
            System.out.println();
        } 
    }
    
}


