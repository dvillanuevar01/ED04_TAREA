public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        operativa_cuenta(cuenta1, 1000, 300);
        public static void operativa_cuenta(CCuenta cuenta, float ingresar, float retirar) {
            try {
               
                cuenta.retirar(retirar);
                System.out.println("Retirada en cuenta " + retirar);
            } catch (Exception e) {
               
                System.out.print("Fallo al retirar");
            }
            try {
                
                System.out.println("Ingreso en cuenta " + ingresar);
                cuenta.ingresar(ingresar);
            } catch (Exception e) {
                
                System.out.print("Fallo al ingresar");
            }
            
            System.out.println("El saldo actual es " + cuenta.getSaldo());
            
        }
    }
}
