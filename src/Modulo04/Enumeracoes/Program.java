package Modulo04.Enumeracoes;

import Modulo04.Enumeracoes.Entities.Order;
import Modulo04.Enumeracoes.OrderEnums.OrderStatus;

import java.util.Date;


public class Program {
    public static void main(String[] args) {

        // cria um pedido com status pendente de pagamento
        Order order1 = new Order( 1, new Date(), OrderStatus.PENDING_PAYMENT);

        // cria um pedido com status entregue
        Order order2 = new Order(2, new Date(), OrderStatus.DELIVERED);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println();

        // Transforma uma string em um enum
        OrderStatus orderStatus1 = OrderStatus.valueOf("DELIVERED");

        System.out.println("String -> Enum: " + orderStatus1);
    }
}
