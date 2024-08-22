# Encapsulamento

O encapsulamento é um dos quatro pilares fundamentais da Programação Orientada a Objetos (POO) em Java. Ele consiste em esconder os detalhes internos de implementação de uma classe, expondo apenas operações seguras que mantenham os objetos em um estado consistente.

Principais aspectos do encapsulamento em Java:

- **Modificadores de acesso:** Java utiliza palavras-chave como `private`, `protected` e `public` para controlar o acesso aos membros da classe.
- **Métodos `getters` e `setters`:** São utilizados para acessar e modificar os atributos privados de uma classe de forma controlada.
- **Consistência de dados:** O encapsulamento permite que a classe mantenha seus dados em um estado válido, implementando lógica de validação nos métodos `setters`.
- **Flexibilidade e manutenção:** Facilita a alteração da implementação interna da classe sem afetar o código que a utiliza.

Exemplo de encapsulamento em Java:

```java
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
```

Neste exemplo, o atributo saldo é privado e só pode ser acessado ou modificado através dos métodos públicos `depositar()`, `sacar()` e `getSaldo()`, garantindo a consistência dos dados e o controle sobre as operações realizadas na conta bancária.

### Padrão para implementação de Getters e Setters

```jsx
private String name;
private double price;

public String getName() {
	return name;
}

public void setName(String name) {
	[this.name](http://this.name/) = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
```

## Modificadores de Acesso

Em Java, existem quatro principais modificadores de acesso que controlam a visibilidade e acessibilidade de classes, métodos e atributos. São eles:

- **`public`:** O modificador mais permissivo. Elementos declarados como public são acessíveis de qualquer lugar, seja dentro da mesma classe, pacote, subclasses ou outras classes em diferentes pacotes.
- **`protected`:** O elemento só pode ser acessado no mesmo pacote, bem como em
subclasses de pacotes diferentes
- **default :** Quando nenhum modificador é especificado, o elemento tem visibilidade de pacote. Isso significa que ele é acessível apenas dentro do mesmo pacote.
- **`private`:** O modificador mais restritivo. Elementos private são acessíveis apenas dentro da própria classe onde foram declarados.

A escolha do modificador de acesso adequado é fundamental para o encapsulamento e a segurança do código, permitindo controlar precisamente quais partes do programa podem interagir com determinados elementos.

```java
public class ExemploModificadores {
    public int varPublica;
    protected int varProtegida;
    int varPacote; // default
    private int varPrivada;

    public void metodoPublico() { }
    protected void metodoProtegido() { }
    void metodoPacote() { } // default
    private void metodoPrivado() { }
}
```

Este exemplo ilustra como os diferentes modificadores de acesso são aplicados em uma classe Java.

![image.png](https://i.sstatic.net/SVk2a.png)
