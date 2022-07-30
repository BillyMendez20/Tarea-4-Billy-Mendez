package gt.edu.umg.binarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Binarios {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        
        
        boolean salir = false;
        int op;

        
        while (!salir) {

            
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Opcion 5");
            
            System.out.println("7. Salir");

            try{
            
                //Pide una opcion
                System.out.println("Introduce un numero: ");
                op = sn.nextInt();

                //Realiza una de las opciones
                switch (op) {
                    case 1:
                        Scanner scanner = new Scanner(System.in);
                        String binario;

    System.out.print("introdusca un binario: ");
    binario = scanner.next();

    int base = 2;
    int exp = 0;
    int powerValue = 1;
    int decima = 0;
    int x = binario.length() - 1;

    while (x >= 0){
    if(binario.charAt(x) == '1'){
    for(int j = 0; j < exp; j++){
    powerValue *= base;
    }
    decima += powerValue;
    powerValue = 1;
    }
    x--;
    exp++;
    }
    System.out.println("el numero decimal es: " + decima);
    break;
                    case 2:
                        Scanner sc = new Scanner(System.in);
                        System.out.println("introdusca el decimal");
                        int de = sc.nextInt();
                        System.out.println("equivalente binario "+de+"es : ");
                        System.out.println(Integer.toBinaryString(de));
                        
                        break;
                    case 3:
                        Scanner l=new Scanner(System.in);
                        String b1=""; 
                        String b2=""; 
                        System.out.println("Ingrese un numero en binario");
                        b1=l.next();
                        System.out.println("Ingrese un segundo numero en binario");
                        b2=l.next();
                      
                        int n1=Integer.parseInt(b1,2);
                        int n2=Integer.parseInt(b2,2);
                        int sum=n1+n2;
                        String resultado=Integer.toString(sum ,2);
                        System.out.println("Su resultado es: "+sum);
                
                        break;
                    case 4:
                        Scanner l2=new Scanner(System.in);
                        String rb1=""; 
                        String rb2=""; 
                        System.out.println("Ingrese un numero en binario");
                        b1=l2.next();
                        System.out.println("Ingrese un segundo numero en binario");
                        b2=l2.next();
                      
                        int rn1=Integer.parseInt(rb1,2);
                        int rn2=Integer.parseInt(rb2,2);
                        int res=rn1-rn2;
                        String resultad=Integer.toString(res ,2);
                        System.out.println("Su resultado es: "+res);
                        break;
                    case 5:
                        Scanner mul=new Scanner(System.in);
                        long mb1,mb2,m=0;
                        long md,mf=1;
                        
                        System.out.println("ingrese el primer binario");
                        mb1=mul.nextLong();
                        System.out.println("ingrese el segundo binario");
                        mb2=mul.nextLong();
                        while (mb2!=0){
                        md=(mb2%10);
                        if(md==1){
                            mb1=mb1*mf;
                            m= calc(mb1,m);
                        }
                        else{
                          mb1=mb1+mf;  
                        }
                        mb2=mb2/10;
                        mf=10;
                        }
                        System.out.println("la multiplicacion es "); 
                        break;
                    
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("seleccione entre 1 y 6");
                }
            
                
            
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }
        
        System.out.println("Fin");

    }

    private static long calc(long mb1, long mb2) {
        int i=0;
        long remainder=0;
        long resultado=0;
        long[]suma=new long[20];
        
        while(mb1!=0|mb2!=0){
            suma[i++]=((mb1%10+mb2%10+remainder)%2);
            remainder = ((mb1%10+mb2%10+remainder)/2);
            mb1=mb1/10;
            mb2=mb2/10;
        }
        if(remainder!=0)
        {
            suma[i++]=remainder;
            
        }--i;
        while(i>=0){
            resultado = resultado+10 + suma[i--];
            
        }
        return resultado;
    }

}