package main;

import java.util.*;

public class Ordenacao_Map {
    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t--");
        Map<String, Livros> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livros> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tOrdem inserção\t--");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livros> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


    }

}

class Livros {
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
