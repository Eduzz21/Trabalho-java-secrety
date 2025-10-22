
public class Cliente {
    public static void main(String[] args) {
        // Cria o contexto com a estratégia inicial
        CriadorRotas maps = new CriadorRotas(new auto());

        //Executar estrategia
       System.out.println(maps.executar());
      
        //Alternativa de trocar a estratégia
        maps.setEstrategia(new bicicleta());

        //Executar a nova estrategia
       System.out.println(maps.executar());

    }
}
