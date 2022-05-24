import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Contas {
    public static void main(String[] args){
        Cliente cli1 = new Cliente("Douglas",true,50);
        Cliente cli2 = new Cliente("Roberto",true,20);
        Cliente cli3 = new Cliente("Carlos",true,250);
        Cliente cli4 = new Cliente("Ricardo",true,40);
        Cliente cli5 = new Cliente("Gabriela",true,30);
        Cliente cli6 = new Cliente("Daiana",true,570);
        Cliente cli7 = new Cliente("Lilian",false,54);
        Cliente cli8 = new Cliente("Toni",true,2);
        Cliente cli9 = new Cliente("Adriana",true,5);
        Cliente cli10 = new Cliente("Sheila",true,65);
        Cliente cli11 = new Cliente("Jose",false,78);

        List<Cliente> clientes = Arrays.asList(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli9,cli10,cli11);
        clientes.forEach(cli-> System.out.println(cli.getCompras()));
        Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras()<=30);
    }
}
