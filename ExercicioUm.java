import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String PlacaVeiculo;
        double valorCombustivel, sessentaKm, oitentaKm, CemKm, centoEVinteKm, centoEQuarentaKm;

        System.out.println("Consumo de Gasolina.");
        System.out.println("Kayque dos Santos Almeida / RA: 4231923060");
        System.out.println("");

        System.out.print("Qual a placa do veículo: ");
        PlacaVeiculo = scanner.nextLine();

        System.out.print("Qual o valor da gasolina(L): ");
        valorCombustivel = scanner.nextDouble();

        System.out.print("Quantos KM foram percorridos a uma velocidade de 60KM/h: ");
        sessentaKm = scanner.nextDouble();

        System.out.print("Quantos KM foram percorridos a uma velocidade de 80KM/h: ");
        oitentaKm = scanner.nextDouble();

        System.out.print("Quantos KM foram percorridos a uma velocidade de 100KM/h: ");
        CemKm = scanner.nextDouble();

        System.out.print("Quantos KM foram percorridos a uma velocidade de 120KM/h: ");
        centoEVinteKm = scanner.nextDouble();

        System.out.print("Quantos KM foram percorridos a uma velocidade de 140KM/h: ");
        centoEQuarentaKm = scanner.nextDouble();

        double litro60KM = sessentaKm / 30.7;
        double litro80KM = oitentaKm / 26.8;
        double litro100KM = CemKm / 22.4;
        double litro120KM = centoEVinteKm / 18.1;
        double litro140KM = centoEQuarentaKm / 14.5;

        double LitrosTotais = litro60KM + litro80KM + litro100KM + litro120KM + litro140KM;
        double CustoTotal = LitrosTotais * valorCombustivel;
        double distanciaTotal = sessentaKm + oitentaKm + CemKm + centoEVinteKm + centoEQuarentaKm;
        double VelocidadeMediaPonderada = (sessentaKm * 60 + oitentaKm * 80 + CemKm * 100 + centoEVinteKm * 120
                + centoEQuarentaKm * 140) / distanciaTotal;

        System.out.println("");
        System.out.println("Placa do veículo: " + PlacaVeiculo);
        System.out.printf("Consumo total: %.4f;", LitrosTotais);
        System.out.printf("\nValor total utilizado: R$%.2f;", CustoTotal);
        System.out.printf("\nVelocidade média ponderada do veículo: %.4f;", VelocidadeMediaPonderada);
        System.out.printf("\nDistância total percorrida no processo: %.1f KM/H.", distanciaTotal);

        scanner.close();

    }
}
