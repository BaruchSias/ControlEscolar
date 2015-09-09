import java.util.Scanner;

/**
 *
 * @author Baruch
 */
public class Alumno extends Persona {
  
    private String matricula = "";

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite la matrícula que desea checar:");
        
        String matricula;
        matricula = sc.nextLine();
        
        if(matricula.length() != 7){
          System.out.println("Las matrículas válidas sólo tienen 7 caracteres");
        }
        
        boolean matricula_valida = true;
        
        for(int i=0; i < matricula.length() && matricula_valida; i++){
          if(i == 1){
            if('a' == matricula.charAt(i) || matricula.charAt(i) == 'A') {
              matricula_valida = false;
                System.out.println(""
                + "La matrícula debe de contener una letra al inicio"
                + " y 6 números que le sigan");
            }
          }
          
          if(i > 1 && i<=7){
            if('0' > matricula.charAt(i) || matricula.charAt(i) > '9'){
              matricula_valida = false;
                System.out.println("La matrícula debe de tener números");
            }
          }
        }
        if(matricula_valida){
          System.out.println("Matrícula válida, tu matricula es: "+ matricula);
        }
        else{
          System.out.println("!Matrícula no válida¡");
        }
    }
}
