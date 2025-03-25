#  Sistema de Fila de Atendimento 

Este projeto implementa um sistema de fila para o atendimento, utilizando a linguagem **Java** e os conceitos de **Pilha e Fila** abordados na disciplina de **Estrutura de Dados**.

---

##  **Regras do Atendimento**
1️ **Ordem de Atendimento:**
   - A cada **3 atendimentos** de pacientes **prioritários**, um paciente **comum** deve ser chamado.  
   - Se não houver pacientes **prioritários**, o atendimento será **100% FIFO (Primeiro a entrar, primeiro a sair).**  
   
2️ **Ordem dentro das filas:**
   - Pacientes **prioritários** seguem a ordem de chegada.  
   - Pacientes **comuns** também seguem a ordem de chegada.  
   - **Nenhuma reclassificação de prioridade** é feita.

---

##  **Tecnologias Utilizadas**
- **Java** (Sem uso de `ArrayList`, `Stack` ou `Queue` da API do Java).
- **Estruturas de Dados:** Implementação manual de **Fila** com **Lista Encadeada**.

---

##  **Funcionalidades**
 **Solicitar nova senha** (prioritária ou comum).  
 **Excluir uma senha** da fila (sem precisar atender).  
 **Listar todas as senhas na fila** (prioritárias e comuns).  
 **Visualizar quem será o próximo a ser atendido**.  
 **Chamar o próximo paciente** de acordo com as regras de prioridade.  

---

##  **Como foi Resolvido**
###  **Estrutura do Código**
1. **Implementamos uma Fila baseada em Lista Encadeada**, sem utilizar estruturas prontas do Java.  
2. **Criamos a Classe `Fila`**, que possui métodos para:
   - `enfileirar()` → Adicionar paciente na fila.
   - `desenfileirar()` → Remover e retornar o próximo paciente a ser atendido.
   - `remover()` → Excluir uma senha específica.
   - `listarTodos()` → Exibir a fila atual.
   - `espiar()` → Ver quem será o próximo a ser atendido.
3. **Criamos a Classe `LaboratorioAtendimento`**, que possui um menu interativo para:
   - Adicionar pacientes (comum ou prioritário).
   - Remover uma senha.
   - Exibir todas as senhas da fila.
   - Mostrar o próximo paciente a ser atendido.
   - Chamar o paciente certo, obedecendo as regras de prioridade.

---

##  **Autor**
Desenvolvido por **[avsxntos](https://github.com/avsxntos)** 🏅  
Se gostou do projeto, **deixe uma estrela ⭐ no repositório!**  

