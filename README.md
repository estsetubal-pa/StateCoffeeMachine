# Coffee Machine – Exemplo do **State Pattern**

## Visão Geral
Este projeto demonstra o **State Design Pattern** utilizando uma simulação simples de uma **Coffee Machine** em Java.  
O comportamento da máquina altera-se consoante o seu estado interno, evitando lógica condicional complexa como múltiplos blocos `if/else` ou `switch`.

A Coffee Machine altera o seu estado de acordo com o diagrama de estados.

![height:70px](images/umlstateDiagram.jpg)

---

## Visão Geral dos Estados

### 1. `NoCoinState`
Representa a Coffee Machine à espera que seja inserida uma moeda.
- Aceita a inserção de uma moeda
- Rejeita comandos de preparação ou distribuição até existir pagamento

### 2. `HasCoinState`
Representa que uma moeda foi inserida e a Coffee Machine está pronta para iniciar a preparação.
- Não aceita moedas adicionais
- Permite iniciar o processo de preparação
- Não permite a distribuição direta sem preparação

### 3. `BrewingState`
Representa que a Coffee Machine está atualmente a preparar o café.
- Não aceita novas moedas
- Não permite pressionar novos botões
- Distribui o café quando a preparação estiver concluída



## Resumo do Padrão

O **State Pattern** permite que um objeto altere o seu comportamento quando o seu estado interno muda.  
É uma alternativa limpa e escalável para substituir lógica condicional extensa, ao delegar o comportamento para classes específicas de estado.

**Principais benefícios:**
- Melhoria de legibilidade e manutenção
- Facilidade em adicionar novos estados
- Elimina o forte acoplamento entre comportamentos dentro de uma única classe

---

## Estrutura de Classes


![height:70px](images/umlClassDiagram.jpg)
---


