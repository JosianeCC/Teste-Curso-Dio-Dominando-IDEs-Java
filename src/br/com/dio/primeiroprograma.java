package br.com.dio;

import model.gato;

public class primeiroprograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Sabedoria",250);
        System.out.println(livro1);

        /*int a = 5;
        int b = 5;
        System.out.println("Hello World!" + (a + b));*/
    }

}

class Livro {
    private String name;
    private Integer numPaginas;

    public Livro(String name, Integer numPaginas) {
        this.name = name;
        this.numPaginas = numPaginas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
