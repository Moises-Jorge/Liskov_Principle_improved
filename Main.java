public class Main {

    public static void main(String[] args) {
        
        // Instanciando eles da forma normal
            Pato pato_normal = new Pato();
            Pinguin pinguin_normal = new Pinguin();

            // Executando os comportamento normais e especificos de cada uma das aves
            pato_normal.comer();    pinguin_normal.comer();
            pato_normal.dormir();   pinguin_normal.dormir();
            pato_normal.nadar();    pinguin_normal.nadar();
            pato_normal.voar();     // pinguin nao pode nadar
        // End

        // Instanciando eles como a classe pai (de onde eles herdaram os comportamentos)
            AveVoadora pato_voador = new Pato();
            AveNadadora pato_Nadador = new Pato();
            AveNadadora pinguin_nadador = new Pinguin();
            // Executando os mesmos comportamentos, porem com algumas diferencas, ja que existem algumas diferencas nas superClasses que  elas implementam
            pato_voador.comer();    pato_Nadador.comer();   pinguin_nadador.comer();
            pato_voador.dormir();   pato_Nadador.dormir();  pinguin_nadador.dormir();
            pato_voador.voar();     pato_Nadador.nadar();   pinguin_nadador.nadar();
        // End    
        
        // Instanciando eles como Avó...
            Ave pato = new Pato();
            Ave pinguin = new Pinguin();
            // Aqui eles terao apenas os Comportamentos comuns de todas as aves, ja que so terao as caracteristicas que as classes pais herdaram da classe avó 
            pato.comer();   pinguin.comer();
            pato.dormir();  pinguin.dormir();
        // End

        // DESSE MODO, O PRINCIPIO DE LISKOV FOI BEM IMPLEMENTADO


    }
}