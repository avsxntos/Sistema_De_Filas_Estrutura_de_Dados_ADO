class No {
    String nome;
    No proximo;

    public No(String nome) {
        this.nome = nome;
        this.proximo = null;
    }
}

class Fila {
    private No inicio, fim;
    private int tamanho;

    public Fila() {
        this.inicio = this.fim = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void enfileirar(String nome) {
        No novo = new No(nome);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }

    public String desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        String nome = inicio.nome;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return nome;
    }

    public boolean remover(String nome) {
        if (estaVazia()) {
            return false;
        }

        // Se for o primeiro da fila
        if (inicio.nome.equals(nome)) {
            desenfileirar();
            return true;
        }

        // Procurar na fila
        No atual = inicio;
        No anterior = null;

        while (atual != null && !atual.nome.equals(nome)) {
            anterior = atual;
            atual = atual.proximo;
        }

        // Se encontrou o nó a ser removido
        if (atual != null) {
            anterior.proximo = atual.proximo;
            if (atual == fim) {
                fim = anterior;
            }
            tamanho--;
            return true;
        }

        return false;
    }

    public String espiar() {
        return estaVazia() ? null : inicio.nome;
    }

    public void listarTodos() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        No atual = inicio;
        System.out.println("Fila de atendimento:");
        while (atual != null) {
            System.out.println("- " + atual.nome);
            atual = atual.proximo;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
}
