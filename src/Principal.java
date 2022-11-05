/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Principal
 * @author      :   Emiliano Costa
 * @date        :   5 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   Estudo de caso de GUIs e imagens gráficas
 * Descrição    :   TestDrive para os aplicativos
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


import C3_Dialog.BemVindo;
import C3_Dialog.Insere;
import C3_Dialog.Soma;
import javax.swing.JOptionPane;

 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Principal {

    /**Procedimento principal que inicia e termina a aplicação*/
    public static void main(String[] args){
        choice(); 
    }/*FIM Método main()*/

    /**Procedimento drive conduz a execução do aplicativo escolhido*/
    public static void drive(int escolha){
        switch(escolha){
        case 31 -> BemVindo.inicio();
        case 32 -> Insere.inicio();
        case 33 -> Soma.inicio();
        default -> JOptionPane.showMessageDialog(null, "Houve erro na escolha");
        }
        
        choice();
        
    }/*FIM Método drive()*/


    public static void choice(){
        
        int seleciona;
        try {
            seleciona = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do exercício\n ou zero para sair"));
        } catch (Exception e) {
            seleciona = 0;
            String msg = String.format("Exception: %s%n", e.getMessage());
            JOptionPane.showMessageDialog(null,msg);
            JOptionPane.showMessageDialog(null,"Encerrando o app");
        }
        
        if(seleciona != 0)
            drive(seleciona);
        
    }/*FIM Método choice()*/

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Principal*/

