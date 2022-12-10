import java.util.Scanner;
public class SpectroCores {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o comprimento de onda da com (nm): ");
        double cor = sc.nextDouble();
        if (cor<380){
            System.out.println("A cor está no spectro ultravioleta, portanto não visível");
        }else if(cor>=380 && cor<450){
            System.out.println("A cor é violeta.");
        }else if(cor>=450 && cor<495){
            System.out.println("A cor é azul.");
        }else if(cor>=495 && cor<570) {
            System.out.println("A cor é verde.");
        }else if(cor>=570 && cor<590){
            System.out.println("A cor é amarelo.");
        }else if(cor>=590 && cor<620){
            System.out.println("A cor é laranja.");
        }else if(cor>=620 && cor<750){
            System.out.println("A cor é vermelho.");
        }else if (cor>=750){
            System.out.println("A cor está no spectro infravermelho, portanto não visível.");
        }else{
            System.out.println("Erro, insira o valor novamente.");
        }
    }
}
