package main;

import java.util.Random;
import java.util.Scanner;

import beans.Arma;
import beans.Colete;
import beans.Material;
import beans.Veiculo;

public class Hook {
    
    //classe para pegar informações de objetos 
    
    public Hook(){


    }

    

    public Arma arma(){
        Scanner sc = new Scanner(System.in);
        String marca, local, estadoPatrimonio, modeloArma;

        int nSerie;
        double calibre;
        
        System.out.println("Você está cadastrando uma Arma!");
        System.out.println("===============================");
      
        System.out.println("Digite a marca da arma (Ex: taurus, colt):");
        marca = sc.nextLine(); 
      
        System.out.println("Digite em qual local a arma esta (Ex: 2º dp)");
        local = sc.nextLine(); 
      
        System.out.println("Digite o estado da arma(novo, velho, com defeito)");
        estadoPatrimonio = sc.nextLine();

        System.out.println("Digite o modelo da arma (Ex: ak47, glock 16):");
        modeloArma = sc.nextLine();

        System.out.println("Digite o numero de série da arma:");
        nSerie = sc.nextInt();

        System.out.println("digite o calibre da arma:");
        calibre = sc.nextDouble();

        Arma arma = new Arma(nSerie, modeloArma , calibre);
       
        return arma;

    }
    public Material material(){
        Scanner sc = new Scanner(System.in);
        Random  r = new Random();
        String marca, local, estadoPatrimonio, descricaoMaterial, porte;

        System.out.println("Você está cadastrando um Material!");
        System.out.println("===============================");
        
        System.out.println("Digite a marca do material (Ex: geladeira eletrolux):");
        marca = sc.nextLine(); 

        System.out.println("Digite o local onde o material se encontra (Ex: 2º dp):");
        local = sc.nextLine(); 

        System.out.println("Digite o estado do Material(novo, velho, com defeito):");
        estadoPatrimonio = sc.nextLine();

        System.out.println("Digite a descrição do material (Ex: mesa de madeira, notebook):");
        descricaoMaterial = sc.nextLine();

        System.out.println("Digite o porte do material(pequeno, médio, grande):");
        porte = sc.nextLine();

        Material material = new Material(descricaoMaterial, porte);
        
        return material;
   
    }

    public Veiculo veiculo(){
        Scanner sc = new Scanner(System.in);
        Random  r = new Random();
        String marca, local, estadoPatrimonio, modeloVeiculo, corVeiculo, placaVeiculo;
        int aroVeiculo;

       
        System.out.println("Você está cadastrando um Veiculo!");
        System.out.println("===============================");
        
        System.out.println("Digite a marca do veiculo(Ex: renault, chevrolet):");
        marca = sc.nextLine(); 

        System.out.println("Digite o local onde o veiculo se encontra (Ex: 2º dp):");
        local = sc.nextLine(); 

        System.out.println("Digite o estado do veiculo (Ex: novo, velho, com defeito):");
        estadoPatrimonio = sc.nextLine();
        
        System.out.println("Digite o modelo do veiculo(Ex: clio, astra, x6):");
        modeloVeiculo = sc.nextLine();

        System.out.println("Digite o aro do veiuclo(Ex: aro 16):");
        aroVeiculo = sc.nextInt();

        System.out.println("Digite a cor do veiculo:");
        corVeiculo = sc.nextLine();

        System.out.println("Digite a placa do veiculo:");
        placaVeiculo = sc.nextLine();

        Veiculo veiculo = new Veiculo(modeloVeiculo, aroVeiculo, corVeiculo, placaVeiculo);

        return veiculo;
    }

    public Colete colete(){
        Scanner sc = new Scanner(System.in);
        Random  r = new Random();
        String marca, local, estadoPatrimonio, materialOrigem;
        char tamanho;
        int nivelProtecao;

        System.out.println("Você está cadastrando um Colete!");
        System.out.println("===============================");
        
        System.out.println("Digite a marca do colete (Ex: dupont):");
        marca = sc.nextLine(); 

        System.out.println("Digite o local onde o colete se encontra (Ex: 2º dp):");
        local = sc.nextLine(); 

        System.out.println("Digite o estado do colete(novo, velho, com defeito)");
        estadoPatrimonio = sc.nextLine();

        System.out.println("Digite o material que o colete é feito(Ex: kevlar):");
        materialOrigem = sc.nextLine();

        System.out.println("Digite tamanho do colete(Ex: m, g, p)");
        tamanho = sc.next().charAt(0);

        System.out.println("Digite nivel de proteção do colete(Ex: 1, 2, 3):");
        nivelProtecao = sc.nextInt();

        Colete colete = new Colete(tamanho, nivelProtecao, materialOrigem);
   
        return colete;
    }
}
