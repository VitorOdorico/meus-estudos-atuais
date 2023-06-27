import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  cria uma classe com seus atributos publicos
public class App {
    // cria um metodo onde fica o código principal da classe 
    public static void main(String[] args) throws IOException{
        // cria uma vareavel com uma mensagem de bem vindo
        String msgInicio = "Seja bem vindo a calculadora master 2000\n \u2211: Aqui você pode fazer calculos simples como por exemplo: \n";
        String msgOperadores = " \u2022 Use + para acrescimo\n \u2022 Use - para subitrair \n \u2022 Use * para mul10tiplicar \n \u2022 Use / para dividir";
        // chama a vareavel msgInicio
        System.out.println(msgInicio + msgOperadores);
        
       
        // iniciar o input
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // ler o input e atribuir a valueOne o valor escrito
        String valueOne = reader.readLine();

        // transforma a string em objeto do tipo int
        Integer valueOneNumber = Integer.valueOf(valueOne);

        System.out.println("O seu primeiro valor é" + valueOneNumber);
        
        
        
        
    }
}
