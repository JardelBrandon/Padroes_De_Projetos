package PortaRetratoComAdapter;

public class Cliente {

    
    public static void main(String[] args) {
        ImagemTargetHeranca imagemAlvo = new SimpleGridLayoutImageAdapterHeranca();
        String homePath = System.getProperty("user.home");
        String caminhoImagens = homePath + System.getProperty("file.separator") + "Pictures";
        
        imagemAlvo.carregarImagens(caminhoImagens);
        imagemAlvo.desenharImagens();

        ImagemTargetComposicao imagemAlvoComposicao = new PortaRetratoImageAdapterComposicao();
        imagemAlvoComposicao.carregarImagens(caminhoImagens);
        imagemAlvoComposicao.desenharImagens();

    }
}
