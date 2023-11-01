package Arrays; 

public class Arrays {

    public static void main (String[] args){
        Curso cursos [] = new Curso [10]; 

        for (int i = 0; i < cursos.length; i++){
            cursos[i] = new Curso();
            cursos[i].nomeCurso = "Curso de Java";
        }
    }

    class Curso {
        String nomeCurso;
    }

} 