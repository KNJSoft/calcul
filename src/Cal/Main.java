package Cal;
import java.util.Scanner;
import java.math.*;
public class Main {
    public static double Calcul(double a,double b,char op) {
        Scanner n=new Scanner(System.in);
        double s=0;
        if(op=='+') {
            s=a+b;
        }else if(op=='-') {
            s=a-b;
        }else if(op=='*') {
            s=a*b;
        }else if(op=='/') {
            s=a/b;
        }else {
            System.out.println("erreur".toUpperCase());
        }
        return s;
    }
    public static int fact(int f) {
        int i=1;
        int fact=1;
        for(i=1;i<=f;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static double Cosinus(double x) {
        double s = Math.PI;
        s=s/180;
        x = x *s;
        Math.toDegrees(x);
        Math.cos(x);
        if(Math.cos(x)>0.49 &&Math.cos(x)<0.51) {
            return 0.5;
        }else if(Math.cos(x)<0.00001 && Math.cos(x)>-0.0000000000000000000001) {
            return 0;
        }else {
            return Math.cos(x);
        }
    }
    public static double Sinus(double x) {
        double s = Math.PI;
        s=s/180;
        x = x *s;
        Math.toDegrees(x);
        Math.sin(x);
        if(Math.sin(x)>0.49 &&Math.sin(x)<0.51) {
            return 0.5;
        }else if(Math.sin(x)>-0.51 &&Math.sin(x)<-0.49) {
            return -0.5;
        }else if (Math.sin(x)<0.00001 && Math.sin(x)>-0.0000000000000000000001) {
            return 0;
        }else {
            return Math.sin(x);
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (true) {
            String z="_____________________________________________";
            String Menu = "1-calcul simple\n" + "2-factoriel\n" + "3-cosinus\n" + "4-sinus\n" + "5-tangente\n"+"6-log(),ln(),exp()\n"+"7-somme simple et carrée\n"+"8-somme puissance n.\n"
                    +"9-arccosinus\n"+"10-arcsinus\n"+"11-combinaison\n"+"12-n puissance m\n"+"13-racine nieme\n"
                    +"14-arctangente\n"+"15-Quitter\n";
            System.out.println(z);
            System.out.println(Menu);
            System.out.println("👆votre choix:");
            int M = n.nextInt();
            if (M == 1) {
                try {
                    System.out.println("premier nombre:");
                    double a = n.nextDouble();
                    System.out.println("deuxieme nombre:");
                    double b = n.nextDouble();
                    System.out.println("opérateur:");
                    String pp = n.nextLine();
                    while (pp.length()!=1){
                        System.out.println("opérateur:");
                        pp = n.nextLine();
                    }

                    char op = pp.charAt(0);
                    double s = Main.Calcul(a, b, op);
                    System.out.println("Résultat: " + s);
                } catch (Exception e) {
                    System.out.println("ERREUR!");
                }
            } else if (M == 2) {
                try {
                    System.out.println("entrer la valeur du nonbre.");
                    int x = n.nextInt();
                    double s = Main.fact(x);
                    System.out.println("Résultat: " + s);
                } catch (Exception e) {
                    System.out.println("ERREUR!");
                }
            } else if (M == 3) {
                try {
                    System.out.println("entrer la valeur de x");
                    double x=n.nextDouble();
                    double s=Main.Cosinus(x);
                    System.out.println("cos("+x+"°)="+s);
                } catch (Exception e) {
                    System.out.println("ERREUE!");
                }
            } else if (M == 4) {
                try {
                    System.out.println("entrer la valeur de x");
                    double x=n.nextDouble();
                    double s=Main.Sinus(x);
                    System.out.println("sin("+x+"°)="+s);
                } catch (Exception e) {
                    System.out.println("ERREUR!");
                }
            } else if (M == 5) {
                try {
                    System.out.println("entrer la valeur de x");
                    double x=n.nextDouble();
                    double s=Main.Sinus(x)/Main.Cosinus(x);
                    if(s>0.99 &&s<1.1){
                        s=1;
                    }
                    System.out.println("tan("+x+"°)="+s);
                } catch (Exception e) {
                    System.out.println("ERREUR!");
                }
            } else if (M == 6) {
                try {
                    System.out.println("entrer le nombre:");
                    double a=n.nextDouble();
                    double s=Math.log(a);
                    System.out.println("Résultat: log("+a+")="+s);
                    double s2=Math.log10(a);
                    System.out.println("Résultat: ln("+a+")="+s2);
                    double s1=Math.exp(a);
                    System.out.println("Résultat: exp("+a+")="+s1);
                } catch (Exception e) {
                    System.out.println("ERREUR!");
                }
            } else if (M == 7) {
                try {
                    System.out.println("entrer le nombre de nombres:");
                    int i=n.nextInt();
                    double s=0,s2=0,a;
                    int j=1;
                    while (j<=i){
                        System.out.println(j+" nombre");
                        a=n.nextDouble();
                        s=s+a;
                        s2=s2+Math.pow(a,2);
                        j=j+1;
                    }
                    System.out.println("somme simple:"+s);
                    System.out.println("somme carré:"+s2);
                } catch (Exception e) {
                    System.out.println("ERREUR!");
                }
            } else if(M==8){
                try {
                    System.out.println("L'ordre de la somme.");
                    int i = n.nextInt();
                    System.out.println("nombre de vos nombres");
                    int x = n.nextInt();
                    double a, s = 0;
                    int j = 1;
                    while (j <= x) {
                        System.out.println(j + " nombre");
                        a = n.nextDouble();
                        s = s + Math.pow(a, i);
                        j = j + 1;
                        System.out.println("somme d'ordre " + i + ":" + s);
                    }
                }catch (Exception e){
                    System.out.println("ERREUR");
                }
            }else if(M==9) {
                try {
                    System.out.println("entrer la valeur de cos()");
                    double x = n.nextDouble();
                    double s = Math.acos(x);
                    double r = Math.PI / 180;
                    s = s / r;
                    System.out.println("c'est l'angle de " + s + "°");
                }catch (Exception e){
                    System.out.println("ERREUR");
                }
            }else if (M==10){
                try {
                    System.out.println("entrer la valeur de sin()");
                    double x = n.nextDouble();
                    double s = Math.asin(x);
                    double r = Math.PI / 180;
                    s = s / r;
                    System.out.println("c'est l'angle de " + s + "°");
                }catch (Exception e){
                    System.out.println("ERREUR");
                }
            }else if(M==15){
                System.exit(0);
            }else if(M==11) {
                try {
                    System.out.println("entrer la valeur de a et m tel qu'on a C a dans m");
                    int a = n.nextInt();
                    int m = n.nextInt();
                    int C = (Main.fact(m)) / (Main.fact(a) * Main.fact(m - a));
                    System.out.println("combinaison de " + a + " dans " + m + "=" + C);
                }catch (Exception e){
                    System.out.println("ERREUR");
                }
            }else if (M==12){
                try {
                    System.out.println("entrer la valeur de n");
                    double a = n.nextDouble();
                    System.out.println("entrer la valeur de m");
                    double m = n.nextDouble();
                    double s = Math.pow(a, m);
                    System.out.println("S=" + s);
                }catch (Exception e){
                    System.out.println("ERREUR");
                }
            }else if (M==13){
                System.out.println("A racine nieme.");
                System.out.println("entrer la valeur de A .");
                double A=n.nextDouble();
                System.out.println("entrer la valeur de n .");
                double m=n.nextDouble();
                double s=Math.pow(A,1/m);
                System.out.println("S="+s);
            }else if (M==14){
                System.out.println("entrer la valeur de tan().");
                double t=n.nextDouble();
                double s=Math.atan(t);
                double r=Math.PI/180;
                s=s/r;
                System.out.println("c'est l'angle de "+s+"°");
            }else if (M==16){
                continue;

            }
        }
    }
}

