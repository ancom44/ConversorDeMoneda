import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ConvertirMoneda convertirMoneda=new ConvertirMoneda();
        boolean bandera=true;
        double valorMoneda=0;
        try{
            while(bandera){
                System.out.println("***Conversor de moneda***");
                System.out.println("1) Dolar => Peso argentino");
                System.out.println("2) Peso argentino => Dolar");
                System.out.println("3) Dolar => Real brasileño");
                System.out.println("4) Real brasileño => Dolar");
                System.out.println("5) Dolar => Peso colombiano");
                System.out.println("6) Peso colombiano => Dolar");
                System.out.println("7) Salir");
                System.out.println("Seleccione la conversion que desea realizar: ");
                int conversion=teclado.nextInt();
                if(conversion==7){
                    break;
                }
                else{
                    System.out.println("Ingrese el monto a convertir: ");
                    valorMoneda=teclado.nextDouble();
                }

                switch (conversion){
                    case 1:
                        System.out.println(valorMoneda+" USD -> "+
                                convertirMoneda.convertir("USD","ARS", valorMoneda)+
                                " ARS(Peso Argentino)");
                        break;
                    case 2:
                        System.out.println(valorMoneda+" ARS(Peso Argentino) -> "+
                                convertirMoneda.convertir("ARS","USD", valorMoneda)+
                                " USD");
                        break;
                    case 3:
                        System.out.println(valorMoneda+" USD -> "+
                                convertirMoneda.convertir("USD","BRL", valorMoneda)+
                                " BRL(Peso Brasileño)");
                        break;
                    case 4:
                        System.out.println(valorMoneda+" BRL(Peso Brasileño) -> "+
                                convertirMoneda.convertir("BRL","USD", valorMoneda)+
                                " USD");
                        break;
                    case 5:
                        System.out.println(valorMoneda+" USD -> "+
                                convertirMoneda.convertir("USD","COP", valorMoneda)+
                                " COP(Peso Colombiano)");
                        break;
                    case 6:
                        System.out.println(valorMoneda+" COP(Peso Colombiano) -> "+
                                convertirMoneda.convertir("COP","USD", valorMoneda)+
                                " USD");
                        break;
                    case 7:
                        bandera=false;
                        break;
                    default:
                        break;
                }
            }
        }catch (Exception e){
            System.out.println("Error en el codigo "+ e.getMessage());
        }
    }
}
