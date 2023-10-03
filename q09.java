
class q09{
    public static void main(String[] args) {
        double salario=1523.5;
        double porcentagem,aumento,novoSalario;

        if (salario <= 180) {
            porcentagem = 0.2;
        }else if (salario > 180 && salario < 700) {
            porcentagem = 0.15;
        }else if (salario > 700 && salario < 1500) {
            porcentagem = 0.1;
        }else{
            porcentagem = 0.05;
        } 
        
        aumento = salario * porcentagem;
        novoSalario = salario + aumento;

        System.out.println("\n\nSalário antes do reajuste: " +salario +" R$");
        System.out.println("Percentual de aumento aplicado: "+porcentagem*100+" %");
        System.out.println("Valor do aumento: "+ aumento+" R$");
        System.out.println("Novo Salário: "+novoSalario+" R$");

    }
}