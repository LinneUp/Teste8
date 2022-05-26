import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
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
        Cliente cli8 = new Cliente("Toni",true,20);
        Cliente cli9 = new Cliente("Adriana",true,5);
        Cliente cli10 = new Cliente("Sheila",true,65);
        Cliente cli11 = new Cliente("Jose",false,78);
        Cliente cli12 = new Cliente("Josue",false,100);




        List<Cliente> clientes = Arrays.asList(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli10,cli11,cli12);

        List<Cliente> clientesFiltrados = clientes.stream().filter(cliente -> cliente.getCompras()>=0).toList();
            for(Cliente cliente :  clientesFiltrados) {

            }
//Cliente com Menos compras.
        Comparator<Cliente> Menor =Comparator.comparing(Cliente::getCompras);
            List<Cliente> menosCompras = clientesFiltrados.stream().min(Menor).stream().toList();
                System.out.print("Cliente com menos Compras ");
                System.out.println(menosCompras);
                System.out.println("------------------------");

//Cliente com Mais Compras.
        Comparator<Cliente> Maior= Comparator.comparing(Cliente::getCompras);
            List<Cliente>maiorCompras = clientesFiltrados.stream().max(Maior).stream().toList();
                System.out.print("Cliente com mais Compras ");
                System.out.println(maiorCompras);
                System.out.println("------------------------");




//Média de compras dos clientes


        System.out.println("A Média de compras é de : " + clientes.stream().mapToDouble(Cliente::getCompras).average().getAsDouble());

    }
}