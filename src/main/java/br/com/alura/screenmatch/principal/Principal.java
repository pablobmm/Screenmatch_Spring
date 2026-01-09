package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=379e5af4";
    private ConsumoApi consumoApi = new ConsumoApi();
    public void exibeMenu(){
        System.out.println("Digite o nome da série: ");
        var nomeSerie = scanner.nextLine();
        var json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        //"https://www.omdbapi.com/?t=&Season="+i+"&apikey=379e5af4"
    }
}
