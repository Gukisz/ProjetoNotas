# Sistema de Avaliação de Notas

Este sistema classifica a nota final de um estudante e gera uma mensagem de feedback personalizada. A classificação pode ser uma das seguintes: "Excelente", "Bom", "Regular", "Insuficiente" ou "Reprovado".

## Funcionalidades

1. **Classificação da Nota**: 
   - A nota do estudante é classificada em cinco categorias:
     - **Excelente**: de 90 a 100
     - **Bom**: de 75 a 89
     - **Regular**: de 50 a 74
     - **Insuficiente**: de 30 a 49
     - **Reprovado**: abaixo de 30

2. **Mensagem de Feedback**: 
   - Dependendo da classificação, uma mensagem de incentivo ou orientação é gerada:
     - **Excelente**: "Parabéns! Você está com desempenho excelente!"
     - **Bom**: "Seu desempenho foi bom! Continue assim!"
     - **Regular**: "Você está no caminho certo, mas pode melhorar!"
     - **Insuficiente**: "Você não passou, precisa melhorar. Não desista!"
     - **Reprovado**: "Você foi reprovado. Busque apoio e estude mais para a próxima!"

## Como Usar

1. **Criar um Estudante**: 
   - Crie um estudante com nome e nota:
     ```java
     Estudante estudante = new Estudante("Nome", 85);
     ```

2. **Avaliar o Estudante**:
   - Utilize o método `avaliarEstudante` para obter a avaliação:
     ```java
     String resultado = AvaliadorDeNotas.avaliarEstudante(estudante);
     ```

3. **Exibir o Resultado**:
   - O resultado pode ser impresso no console:
     ```java
     System.out.println(resultado);
     ```

## Exemplo de Saída

Se o estudante tiver uma nota de 85, a saída seria:

```text
Classificação: Bom
Mensagem: Seu desempenho foi bom! Continue assim!
```
Este é um sistema simples para fornecer feedback com base nas notas dos estudantes. Ele pode ser facilmente expandido para novas funcionalidades ou ajustes conforme necessário.
