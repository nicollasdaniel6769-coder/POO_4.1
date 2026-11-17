# Respostas das questões teóricas

## Questão 6 - Hierarquia de exceções e ordem dos catch

Se colocarmos `catch (Exception e)` antes de `catch (ArithmeticException e)`, o código **não compila**. O Java mostra um erro dizendo que a exceção `ArithmeticException` já foi capturada por um catch anterior.

Isso acontece porque as exceções formam uma árvore de herança. `ArithmeticException` é filha de `RuntimeException`, que por sua vez é filha de `Exception`. Ou seja, `Exception` é uma classe genérica que engloba todas as específicas.

O Java testa os blocos `catch` de cima para baixo e executa o primeiro que servir. Como `Exception` já aceita qualquer exceção, inclusive a `ArithmeticException`, o segundo catch nunca teria chance de ser executado. Por isso o compilador não deixa.

A regra é sempre colocar as exceções mais específicas primeiro e as mais genéricas por último:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro de divisão por zero");
} catch (Exception e) {
    System.out.println("Erro genérico");
}
```

Assim, se for divisão por zero, cai no catch específico, e qualquer outro erro cai no genérico.

## Questão 10 - Saída do código

```
1. Bloco try externo iniciado.
2. Bloco try interno iniciado.
5. Catch externo capturou: Erro interno proposital
6. Bloco finally externo executado.
```

Justificativa do fluxo:

1. O bloco `try` externo começa e imprime a linha 1.
2. Entra no `try` interno e imprime a linha 2.
3. Logo depois é lançada uma `NullPointerException`.
4. O `catch` interno só trata `ArithmeticException`. Como `NullPointerException` não é uma `ArithmeticException`, esse catch é ignorado e a linha 3 nunca é impressa.
5. Como o erro não foi tratado ali dentro, ele sobe para o bloco externo. A linha 4 também não é impressa, porque o fluxo saiu do `try` interno por causa da exceção.
6. O `catch (NullPointerException e)` externo captura o erro e imprime a linha 5 com a mensagem "Erro interno proposital".
7. Por fim, o `finally` externo sempre é executado e imprime a linha 6.
